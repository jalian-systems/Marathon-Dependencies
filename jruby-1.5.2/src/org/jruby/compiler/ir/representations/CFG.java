package org.jruby.compiler.ir.representations;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashSet;
import java.util.HashMap;
import java.util.ListIterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

import org.jruby.compiler.ir.IR_ExecutionScope;
import org.jruby.compiler.ir.IR_Closure;
import org.jruby.compiler.ir.Operation;
import org.jruby.compiler.ir.instructions.BRANCH_Instr;
import org.jruby.compiler.ir.instructions.BREAK_Instr;
import org.jruby.compiler.ir.instructions.BUILD_CLOSURE_Instr;
import org.jruby.compiler.ir.instructions.CASE_Instr;
import org.jruby.compiler.ir.instructions.IR_Instr;
import org.jruby.compiler.ir.instructions.JUMP_Instr;
import org.jruby.compiler.ir.instructions.JUMP_INDIRECT_Instr;
import org.jruby.compiler.ir.instructions.LABEL_Instr;
import org.jruby.compiler.ir.instructions.RESCUED_BODY_START_MARKER_Instr;
import org.jruby.compiler.ir.instructions.RESCUED_BODY_END_MARKER_Instr;
import org.jruby.compiler.ir.instructions.RETURN_Instr;
import org.jruby.compiler.ir.instructions.SET_RETADDR_Instr;
import org.jruby.compiler.ir.instructions.THROW_EXCEPTION_Instr;
import org.jruby.compiler.ir.operands.Label;
import org.jruby.compiler.ir.operands.Variable;

import org.jruby.compiler.ir.dataflow.DataFlowProblem;

import org.jgrapht.*;
import org.jgrapht.graph.*;

public class CFG {
    public enum CFG_Edge_Type { UNKNOWN, DUMMY_EDGE, FALLTHRU_EDGE, FORWARD_EDGE, BACK_EDGE, EXIT_EDGE, EXCEPTION_EDGE }

    public static class CFG_Edge {
        final public BasicBlock _src;
        final public BasicBlock _dst;
        public CFG_Edge_Type _type;

        public CFG_Edge(BasicBlock s, BasicBlock d) {
            _src = s;
            _dst = d;
            _type = CFG_Edge_Type.UNKNOWN;   // Unknown type to start with
        }

        @Override
        public String toString() {
            return "<" + _src.getID() + " --> " + _dst.getID() + ">";
        }
    }

    IR_ExecutionScope _scope;   // Scope (method/closure) to which this cfg belongs
    BasicBlock _entryBB;        // Entry BB -- dummy
    BasicBlock _exitBB;         // Exit BB -- dummy
    int        _nextBBId;       // Next available basic block id
    DirectedGraph<BasicBlock, CFG_Edge> _cfg;           // The actual graph
    LinkedList<BasicBlock>              _postOrderList; // Post order traversal list of the cfg
    Map<String, DataFlowProblem>        _dfProbs;       // Map of name -> dataflow problem
    Map<Label, BasicBlock>              _bbMap;         // Map of label -> basic blocks with that label
    BasicBlock[]                        _bbArray;       // Array indexed by bb id

    public CFG(IR_ExecutionScope s) {
        _nextBBId = 0; // Init before building basic blocks below!
        _scope = s;
        _postOrderList = null;
        _dfProbs = new HashMap<String, DataFlowProblem>();
        _bbMap = new HashMap<Label, BasicBlock>();
    }

    public DirectedGraph getGraph() {
        return _cfg;
    }

    public IR_ExecutionScope getScope() {
        return _scope;
    }

    public BasicBlock getEntryBB() {
        return _entryBB;
    }

    public BasicBlock getExitBB() {
        return _exitBB;
    }

    public int getNextBBID() {
        _nextBBId++;
        return _nextBBId;
    }

    public int getMaxNodeID() {
        return _nextBBId;
    }

    public Set<CFG_Edge> incomingEdgesOf(BasicBlock bb) {
        return _cfg.incomingEdgesOf(bb);
    }

    public Set<CFG_Edge> outgoingEdgesOf(BasicBlock bb) {
        return _cfg.outgoingEdgesOf(bb);
    }

    public Set<BasicBlock> getNodes() {
        return _cfg.vertexSet();
    }

    // SSS FIXME: This is only valid temporarily while the cfg blocks
    // haven't been reordered around.  This code is there temporarily
    // to get Tom & Charlie started on the IR interpreter.
    public BasicBlock getFallThroughBB(BasicBlock bb) {
        return _bbArray[bb.getID()];
    }

    public BasicBlock getTargetBB(Label l) {
        return _bbMap.get(l);
    }

    private Label getNewLabel() {
        return _scope.getNewLabel();
    }

    private BasicBlock createNewBB(Label l, DirectedGraph<BasicBlock, CFG_Edge> g, Map<Label, BasicBlock> bbMap) {
        BasicBlock b = new BasicBlock(this, l);
        bbMap.put(b._label, b);
        g.addVertex(b);
        return b;
    }

    private BasicBlock createNewBB(DirectedGraph<BasicBlock, CFG_Edge> g, Map<Label, BasicBlock> bbMap) {
        return createNewBB(getNewLabel(), g, bbMap);
    }

    private void addEdge(DirectedGraph<BasicBlock, CFG_Edge> g, BasicBlock src, Label tgt, Map<Label, BasicBlock> bbMap, Map<Label, List<BasicBlock>> forwardRefs) {
        BasicBlock tgtBB = bbMap.get(tgt);
        if (tgtBB != null) {
            g.addEdge(src, tgtBB);
        } else {
            // Add a forward reference from tgt -> src
            List<BasicBlock> frefs = forwardRefs.get(tgt);
            if (frefs == null) {
                frefs = new ArrayList<BasicBlock>();
                forwardRefs.put(tgt, frefs);
            }
            frefs.add(src);
        }
    }

    public void build(List<IR_Instr> instrs) {
        // Map of label & basic blocks which are waiting for a bb with that label
        Map<Label, List<BasicBlock>> forwardRefs = new HashMap<Label, List<BasicBlock>>();

        // Map of return address variable and all possible targets (required to connect up ensure blocks with their targets)
        Map<Variable, Set<Label>> retAddrMap = new HashMap<Variable, Set<Label>>();

        // List of bbs that have a 'return' instruction
        List<BasicBlock> retBBs = new ArrayList<BasicBlock>();

        // Rescue body end marker instructions are mapped to the bbs that end the rescued bodies
        Map<RESCUED_BODY_END_MARKER_Instr, BasicBlock> rbeMarkers = new HashMap<RESCUED_BODY_END_MARKER_Instr, BasicBlock>();

        DirectedGraph<BasicBlock, CFG_Edge> g = new DefaultDirectedGraph<BasicBlock, CFG_Edge>(
                new EdgeFactory<BasicBlock, CFG_Edge>() {

                    public CFG_Edge createEdge(BasicBlock s, BasicBlock d) {
                        return new CFG_Edge(s, d);
                    }
                });

        // Dummy entry basic block (see note at end to see why)
        _entryBB = createNewBB(g, _bbMap);

        // First real bb
        BasicBlock firstBB = createNewBB(g, _bbMap);

        // Build the rest!
        BasicBlock prevBB = null;
        BasicBlock currBB = firstBB;
        BasicBlock newBB = null;
        boolean bbEnded = false;
        boolean bbEndedWithControlXfer = false;
        for (IR_Instr i : instrs) {
            Operation iop = i._op;
            if (iop == Operation.LABEL) {
                Label l = ((LABEL_Instr) i)._lbl;
                prevBB = currBB;
                newBB = createNewBB(l, g, _bbMap);
                if (!bbEndedWithControlXfer) // Jump instruction bbs dont add an edge to the succeeding bb by default
                {
                    g.addEdge(currBB, newBB);
                }
                currBB = newBB;

                // Add forward reference edges
                List<BasicBlock> frefs = forwardRefs.get(l);
                if (frefs != null) {
                    for (BasicBlock b : frefs) {
                        g.addEdge(b, newBB);
                    }
                }
                bbEnded = false;
                bbEndedWithControlXfer = false;
            } else if (bbEnded && (iop != Operation.RESCUE_BODY_END)) {
                prevBB = currBB;
                newBB = createNewBB(g, _bbMap);
                if (!bbEndedWithControlXfer) // Jump instruction bbs dont add an edge to the succeeding bb by default
                {
                    g.addEdge(currBB, newBB); // currBB cannot be null!
                }
                currBB = newBB;
                bbEnded = false;
                bbEndedWithControlXfer = false;
            }

            if (i instanceof RESCUED_BODY_START_MARKER_Instr) {
                ((RESCUED_BODY_START_MARKER_Instr) i).setRescuedBodyStartBB(currBB);
            } else if (i instanceof RESCUED_BODY_END_MARKER_Instr) {
                currBB.addInstr(i);
                rbeMarkers.put((RESCUED_BODY_END_MARKER_Instr) i, currBB);
            } else if (iop.endsBasicBlock()) {
                bbEnded = true;
                currBB.addInstr(i);
                Label tgt;
                if (i instanceof BRANCH_Instr) {
                    tgt = ((BRANCH_Instr) i).getJumpTarget();
                } else if (i instanceof JUMP_Instr) {
                    tgt = ((JUMP_Instr) i).getJumpTarget();
                    bbEndedWithControlXfer = true;
                } // CASE IR instructions are dummy instructions
                // -- all when/then clauses have been converted into if-then-else blocks
                else if (i instanceof CASE_Instr) {
                    tgt = null;
                } // SSS FIXME: To be done
                else if (i instanceof BREAK_Instr) {
                    tgt = null;
                    bbEndedWithControlXfer = true;
                } else if (i instanceof RETURN_Instr) {
                    tgt = null;
                    retBBs.add(currBB);
                    bbEndedWithControlXfer = true;
                } else if (i instanceof THROW_EXCEPTION_Instr) {
                    tgt = null;
                    retBBs.add(currBB);
                    bbEndedWithControlXfer = true;
                } else if (i instanceof JUMP_INDIRECT_Instr) {
                    tgt = null;
                    bbEndedWithControlXfer = true;
                    Set<Label> retAddrs = retAddrMap.get(((JUMP_INDIRECT_Instr) i)._target);
                    for (Label l : retAddrs) {
                        addEdge(g, currBB, l, _bbMap, forwardRefs);
                    }
                } else {
                    tgt = null;
                }

                if (tgt != null) {
                    addEdge(g, currBB, tgt, _bbMap, forwardRefs);
                }
            } else if (iop != Operation.LABEL) {
                currBB.addInstr(i);
            }

            if (i instanceof SET_RETADDR_Instr) {
                Variable v = i.getResult();
                Set<Label> addrs = retAddrMap.get(v);
                if (addrs == null) {
                    addrs = new HashSet<Label>();
                    retAddrMap.put(v, addrs);
                }
                addrs.add(((SET_RETADDR_Instr) i).getReturnAddr());
            } else if (i instanceof BUILD_CLOSURE_Instr) { // Build CFG for the closure!
                ((BUILD_CLOSURE_Instr) i).getClosure().buildCFG();
            }
        }

        // Hook up the first bb of all the rescue blocks with the last bb of the rescued body
        for (RESCUED_BODY_END_MARKER_Instr rbEnd : rbeMarkers.keySet()) {
            BasicBlock rbEndBB = rbeMarkers.get(rbEnd);
            RESCUED_BODY_START_MARKER_Instr rbStart = rbEnd._rbStartInstr;
            rbStart.setRescuedBodyEndBB(rbEndBB);
            for (Label l : rbStart._rescueBlockLabels) {
                BasicBlock rescueBlockStartBB = getTargetBB(l);
                rescueBlockStartBB.setRescuedBodyEndBB(rbEndBB);
                g.addEdge(rbEndBB, rescueBlockStartBB)._type = CFG_Edge_Type.EXCEPTION_EDGE;
            }
        }

        // Dummy entry and exit basic blocks and other dummy edges are needed to maintain the CFG 
        // in a canonical form with certain invariants:
        // 1. all control begins with a single entry bb (and it dominates all other bbs in the cfg)
        // 2. all control ends with a single exit bb (and it post-dominates all other bbs in the cfg)
        //
        // So, add dummy edges from:
        // * dummy entry -> dummy exit
        // * dummy entry -> first basic block (real entry)
        // * all return bbs to the exit bb
        // * last bb     -> dummy exit (only if the last bb didn't end with a control transfer!
        _exitBB = createNewBB(g, _bbMap);
        g.addEdge(_entryBB, _exitBB)._type = CFG_Edge_Type.DUMMY_EDGE;
        g.addEdge(_entryBB, firstBB)._type = CFG_Edge_Type.DUMMY_EDGE;
        for (BasicBlock rb : retBBs) {
            g.addEdge(rb, _exitBB)._type = CFG_Edge_Type.DUMMY_EDGE;
        }
        if (!bbEndedWithControlXfer) {
            g.addEdge(currBB, _exitBB)._type = CFG_Edge_Type.DUMMY_EDGE;
        }

        // Set up the bb array
        int n = getMaxNodeID();
        _bbArray = new BasicBlock[n];
        for (BasicBlock x : _bbMap.values()) {
            _bbArray[x.getID() - 1] = x;
        }

        _cfg = g;
    }

    private void buildPostOrderTraversal() {
        _postOrderList = new LinkedList<BasicBlock>();
        BasicBlock root = getEntryBB();
        Stack<BasicBlock> stack = new Stack<BasicBlock>();
        stack.push(root);
        BitSet bbSet = new BitSet(1 + getMaxNodeID());
        bbSet.set(root.getID());

        // Non-recursive post-order traversal (the added flag is required to handle cycles and common ancestors)
        while (!stack.empty()) {
            // Check if all children of the top of the stack have been added
            BasicBlock b = stack.peek();
            boolean allChildrenDone = true;
            for (CFG_Edge e : _cfg.outgoingEdgesOf(b)) {
                BasicBlock dst = e._dst;
                int dstID = dst.getID();
                if (!bbSet.get(dstID)) {
                    allChildrenDone = false;
                    stack.push(dst);
                    bbSet.set(dstID);
                }
            }

            // If all children have been added previously, we are ready with 'b' in this round!
            if (allChildrenDone) {
                stack.pop();
                _postOrderList.add(b);
            }
        }
    }

    public ListIterator<BasicBlock> getPostOrderTraverser() {
        if (_postOrderList == null) {
            buildPostOrderTraversal();
        }

        return _postOrderList.listIterator();
    }

    public ListIterator<BasicBlock> getReversePostOrderTraverser() {
        if (_postOrderList == null) {
            buildPostOrderTraversal();
        }

        return _postOrderList.listIterator(getMaxNodeID());
    }

    private Integer intersectDomSets(Integer[] idomMap, Integer nb1, Integer nb2) {
        while (nb1 != nb2) {
            while (nb1 < nb2) {
                nb1 = idomMap[nb1];
            }
            while (nb2 < nb1) {
                nb2 = idomMap[nb2];
            }
        }

        return nb1;
    }

    public void buildDominatorTree() {
        int maxNodeId = getMaxNodeID();

        // Set up a map of bbid -> post order numbering
        Integer[] bbToPoNumbers = new Integer[maxNodeId + 1];
        BasicBlock[] poNumbersToBB = new BasicBlock[maxNodeId + 1];
        ListIterator<BasicBlock> it = getPostOrderTraverser();
        int n = 0;
        while (it.hasNext()) {
            BasicBlock b = it.next();
            bbToPoNumbers[b.getID()] = n;
            poNumbersToBB[n] = b;
            n++;
        }

        // Construct the dominator sets using the fast dominance algorithm by
        // Keith D. Cooper, Timothy J. Harvey, and Ken Kennedy.
        // http://www.cs.rice.edu/~keith/EMBED/dom.pdf (tip courtesy Slava Pestov)
        //
        // Faster than the standard iterative data-flow algorithm
        //
        // This maps a bb's post-order number to the bb's idom post-order number.
        // We convert this po-number -> po-number map to a bb -> bb map later on!
        Integer[] idoms = new Integer[maxNodeId + 1];

        BasicBlock root = getEntryBB();
        Integer rootPoNumber = bbToPoNumbers[root.getID()];
        idoms[rootPoNumber] = rootPoNumber;
        boolean changed = true;
        while (changed) {
            changed = false;
            it = getReversePostOrderTraverser();
            while (it.hasPrevious()) {
                BasicBlock b = it.previous();
                if (b == root) {
                    continue;
                }

                // Non-root -- process it
                Integer bPoNumber = bbToPoNumbers[b.getID()];
                Integer oldBIdom = idoms[bPoNumber];
                Integer newBIdom = null;

                // newBIdom is initialized to be some (first-encountered, for ex.) processed predecessor of 'b'.
                for (CFG_Edge e : _cfg.incomingEdgesOf(b)) {
                    BasicBlock src = e._src;
                    Integer srcPoNumber = bbToPoNumbers[src.getID()];
                    if (idoms[srcPoNumber] != null) {
//                        System.out.println("Initialized idom(" + bPoNumber + ")=" + srcPoNumber);
                        newBIdom = srcPoNumber;
                        break;
                    }
                }

                // newBIdom should not be null
                assert newBIdom != null;

                // Now, intersect dom sets of all of b's predecessors 
                Integer processedPred = newBIdom;
                for (CFG_Edge e : _cfg.incomingEdgesOf(b)) {
                    // Process b's predecessors except the initialized bidom value
                    BasicBlock src = e._src;
                    Integer srcPoNumber = bbToPoNumbers[src.getID()];
                    Integer srcIdom = idoms[srcPoNumber];
                    if ((srcIdom != null) && (srcPoNumber != processedPred)) {
//                        Integer old = newBIdom;
                        newBIdom = intersectDomSets(idoms, srcPoNumber, newBIdom);
//                        System.out.println("Intersect " + srcIdom + " & " + old + " = " + newBIdom);
                    }
                }

                // Has something changed?
                if (oldBIdom != newBIdom) {
                    changed = true;
                    idoms[bPoNumber] = newBIdom;
//                    System.out.println("Changed: idom(" + bPoNumber + ")= " + newBIdom);
                }
            }
        }

        // Convert the idom map based on post order numbers to one based on basic blocks
        Map<BasicBlock, BasicBlock> idomMap = new HashMap<BasicBlock, BasicBlock>();
        for (Integer i = 0; i < maxNodeId; i++) {
            idomMap.put(poNumbersToBB[i], poNumbersToBB[idoms[i]]);
//            System.out.println("IDOM(" + poNumbersToBB[i].getID() + ") = " + poNumbersToBB[idoms[i]].getID());
        }
    }

    public String toStringInstrs() {
        StringBuffer buf = new StringBuffer();
        for (BasicBlock b : getNodes()) {
            buf.append(b.toStringInstrs());
        }

        List<IR_Closure> closures = _scope.getClosures();
        if (!closures.isEmpty()) {
            buf.append("\n\n------ Closures encountered in this scope ------\n");
            for (IR_Closure c : closures) {
                buf.append(c.toStringBody());
            }
            buf.append("------------------------------------------------\n");
        }

        return buf.toString();
    }

    public void setDataFlowSolution(String name, DataFlowProblem p) {
        _dfProbs.put(name, p);
    }

    public DataFlowProblem getDataFlowSolution(String name) {
        return _dfProbs.get(name);
    }
}
