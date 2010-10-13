/*
 ***** BEGIN LICENSE BLOCK *****
 * Version: CPL 1.0/GPL 2.0/LGPL 2.1
 *
 * The contents of this file are subject to the Common Public
 * License Version 1.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a copy of
 * the License at http://www.eclipse.org/legal/cpl-v10.html
 *
 * Software distributed under the License is distributed on an "AS
 * IS" basis, WITHOUT WARRANTY OF ANY KIND, either express or
 * implied. See the License for the specific language governing
 * rights and limitations under the License.
 *
 * Copyright (C) 2001 Chad Fowler <chadfowler@chadfowler.com>
 * Copyright (C) 2001-2002 Benoit Cerrina <b.cerrina@wanadoo.fr>
 * Copyright (C) 2001-2002 Jan Arne Petersen <jpetersen@uni-bonn.de>
 * Copyright (C) 2002 Anders Bengtsson <ndrsbngtssn@yahoo.se>
 * Copyright (C) 2004 Thomas E Enebo <enebo@acm.org>
 * Copyright (C) 2007 Mirko Stocker <me@misto.ch>
 * 
 * Alternatively, the contents of this file may be used under the terms of
 * either of the GNU General Public License Version 2 or later (the "GPL"),
 * or the GNU Lesser General Public License Version 2.1 or later (the "LGPL"),
 * in which case the provisions of the GPL or the LGPL are applicable instead
 * of those above. If you wish to allow use of your version of this file only
 * under the terms of either the GPL or the LGPL, and not to allow others to
 * use your version of this file under the terms of the CPL, indicate your
 * decision by deleting the provisions above and replace them with the notice
 * and other provisions required by the GPL or the LGPL. If you do not delete
 * the provisions above, a recipient may use your version of this file under
 * the terms of any one of the CPL, the GPL or the LGPL.
 ***** END LICENSE BLOCK *****/


////////////////////////////////////////////////////////////////////////////////
// NOTE: THIS FILE IS GENERATED! DO NOT EDIT THIS FILE!
// generated from: src/org/jruby/ast/ArgsNode.erb
// using arities: src/org/jruby/ast/ArgsNode.arities.erb
////////////////////////////////////////////////////////////////////////////////


package org.jruby.ast;

import java.util.List;

import org.jruby.Ruby;
import org.jruby.RubyArray;
import org.jruby.ast.visitor.NodeVisitor;
import org.jruby.javasupport.util.RuntimeHelpers;
import org.jruby.lexer.yacc.ISourcePosition;
import org.jruby.runtime.Arity;
import org.jruby.runtime.Block;
import org.jruby.runtime.DynamicScope;
import org.jruby.runtime.ThreadContext;
import org.jruby.runtime.builtin.IRubyObject;

/**
 * Represents the argument declarations of a method.  The fields:
 * foo(p1, ..., pn, o1 = v1, ..., on = v2, *r, q1, ..., qn)
 *
 * p1...pn = pre arguments
 * o1...on = optional arguments
 * r       = rest argument
 * q1...qn = post arguments (only in 1.9)
 */
public class ArgsNode extends Node {
    private final ListNode pre;
    private final int preCount;
    private final ListNode optArgs;
    protected final ArgumentNode restArgNode;
    protected final int restArg;
    private final BlockArgNode blockArgNode;
    protected Arity arity;
    private final int requiredArgsCount;
    protected final boolean hasOptArgs;
    protected final boolean hasMasgnArgs;
    protected int maxArgsCount;
    protected final boolean isSimple;

    // Only in ruby 1.9 methods
    private final ListNode post;
    private final int postCount;
    private final int postIndex;
    /**
     *
     * @param optionalArguments  Node describing the optional arguments
     * 				This Block will contain assignments to locals (LAsgnNode)
     * @param restArguments  index of the rest argument in the local table
     * 				(the array argument prefixed by a * which collects
     * 				all additional params)
     * 				or -1 if there is none.
     * @param argsCount number of regular arguments
     * @param restArgNode The rest argument (*args).
     * @param blockArgNode An optional block argument (&amp;arg).
     **/
    public ArgsNode(ISourcePosition position, ListNode pre, ListNode optionalArguments,
            RestArgNode rest, ListNode post, BlockArgNode blockArgNode) {
        super(position);

        this.pre = pre;
        this.preCount = pre == null ? 0 : pre.size();
        this.post = post;
        this.postCount = post == null ? 0 : post.size();
        int optArgCount = optionalArguments == null ? 0 : optionalArguments.size();
        this.postIndex = getPostCount(preCount, optArgCount, rest);
        this.optArgs = optionalArguments;
        this.restArg = rest == null ? -1 : rest.getIndex();
        this.restArgNode = rest;
        this.blockArgNode = blockArgNode;
        this.requiredArgsCount = preCount + postCount;
        this.hasOptArgs = getOptArgs() != null;
        this.hasMasgnArgs = hasMasgnArgs();
        this.maxArgsCount = getRestArg() >= 0 ? -1 : getRequiredArgsCount() + getOptionalArgsCount();
        this.arity = calculateArity();

        this.isSimple = !(hasMasgnArgs || hasOptArgs || restArg >= 0 || postCount > 0);
    }

    private int getPostCount(int preCount, int optArgCount, RestArgNode rest) {
        // Simple-case: If we have a rest we know where it is
        if (rest != null) return rest.getIndex() + 1;

        return preCount + optArgCount;
    }

    public NodeType getNodeType() {
        return NodeType.ARGSNODE;
    }

    protected Arity calculateArity() {
        if (restArgNode instanceof UnnamedRestArgNode) return Arity.optional();
        if (getOptArgs() != null || getRestArg() >= 0) return Arity.required(getRequiredArgsCount());

        return Arity.createArity(getRequiredArgsCount());
    }

    protected boolean hasMasgnArgs() {
        if (preCount > 0) for (Node node : pre.childNodes()) {
            if (node instanceof AssignableNode) return true;
        }
        if (postCount > 0) for (Node node : post.childNodes()) {
            if (node instanceof AssignableNode) return true;
        }
        return false;
    }

    /**
     * Accept for the visitor pattern.
     * @param iVisitor the visitor
     **/
    public Object accept(NodeVisitor iVisitor) {
        return iVisitor.visitArgsNode(this);
    }

    /**
     * Gets the required arguments at the beginning of the argument definition
     */
    public ListNode getPre() {
        return pre;
    }

    @Deprecated
    public ListNode getArgs() {
        return pre;
    }

    public Arity getArity() {
        return arity;
    }

    public int getRequiredArgsCount() {
        return requiredArgsCount;
    }

    public int getOptionalArgsCount() {
        return optArgs == null ? 0 : optArgs.size();
    }

    public ListNode getPost() {
        return post;
    }

    public int getMaxArgumentsCount() {
        return maxArgsCount;
    }

    /**
     * Gets the optArgs.
     * @return Returns a ListNode
     */
    public ListNode getOptArgs() {
        return optArgs;
    }

    /**
     * Gets the restArg.
     * @return Returns a int
     */
    public int getRestArg() {
        return restArg;
    }

    /**
     * Gets the restArgNode.
     * @return Returns an ArgumentNode
     */
    public ArgumentNode getRestArgNode() {
        return restArgNode;
    }

    @Deprecated
    public BlockArgNode getBlockArgNode() {
        return blockArgNode;
    }

    /**
     * Gets the explicit block argument of the parameter list (&block).
     *
     * @return Returns a BlockArgNode
     */
    public BlockArgNode getBlock() {
        return blockArgNode;
    }

    public int getPostCount() {
        return postCount;
    }

    public int getPostIndex() {
        return postIndex;
    }

    public int getPreCount() {
        return preCount;
    }

    public void prepare(ThreadContext context, Ruby runtime, IRubyObject self, IRubyObject[] args, Block block) {
        DynamicScope scope = context.getCurrentScope();

        // Bind 'normal' parameter values to the local scope for this method.
        if (!hasMasgnArgs) {
            // no arg grouping, just use bulk assignment methods
            if (preCount > 0) scope.setArgValues(args, Math.min(args.length, preCount));
            if (postCount > 0) scope.setEndArgValues(args, postIndex, postCount);
        } else {
            masgnAwareArgAssign(context, runtime, self, args, block, scope);
        }

        // optArgs and restArgs require more work, so isolate them and ArrayList creation here
        if (hasOptArgs || restArg != -1) prepareOptOrRestArgs(context, runtime, scope, self, args);
        if (getBlock() != null) processBlockArg(scope, runtime, block);
    }

    private void masgnAwareArgAssign(ThreadContext context, Ruby runtime, IRubyObject self, IRubyObject[] args, Block block, DynamicScope scope) {
        // arg grouping, use slower arg walking logic
        if (preCount > 0) {
            int size = pre.size();
            for (int i = 0; i < size; i++) {
                Node next = pre.get(i);
                if (next instanceof AssignableNode) {
                    ((AssignableNode)next).assign(runtime, context, self, args[i], block, false);
                } else {
                    scope.setValue(i, args[i], 0);
                }
            }
        }
        if (postCount > 0) {
            int size = post.size();
            int argsLength = args.length;
            for (int i = 0; i < size; i++) {
                Node next = post.get(i);
                if (next instanceof AssignableNode) {
                    ((AssignableNode)next).assign(runtime, context, self, args[argsLength - postCount + i], block, false);
                } else {
                    scope.setValue(i + postIndex, args[argsLength - postCount + i], 0);
                }
            }
        }
    }

    public void prepare(ThreadContext context, Ruby runtime, IRubyObject self, Block block) {
        DynamicScope scope = context.getCurrentScope();

        if (isSimple) {
            scope.setArgValues();
        } else {
            prepare(context, runtime, self, IRubyObject.NULL_ARRAY, block);
        }
        if (getBlock() != null) processBlockArg(scope, runtime, block);
    }
    public void prepare(ThreadContext context, Ruby runtime, IRubyObject self, IRubyObject arg0, Block block) {
        DynamicScope scope = context.getCurrentScope();

        if (isSimple) {
            scope.setArgValues(arg0);
        } else {
            prepare(context, runtime, self, new IRubyObject[] {arg0}, block);
        }
        if (getBlock() != null) processBlockArg(scope, runtime, block);
    }
    public void prepare(ThreadContext context, Ruby runtime, IRubyObject self, IRubyObject arg0, IRubyObject arg1, Block block) {
        DynamicScope scope = context.getCurrentScope();

        if (isSimple) {
            scope.setArgValues(arg0, arg1);
        } else {
            prepare(context, runtime, self, new IRubyObject[] {arg0, arg1}, block);
        }
        if (getBlock() != null) processBlockArg(scope, runtime, block);
    }
    public void prepare(ThreadContext context, Ruby runtime, IRubyObject self, IRubyObject arg0, IRubyObject arg1, IRubyObject arg2, Block block) {
        DynamicScope scope = context.getCurrentScope();

        if (isSimple) {
            scope.setArgValues(arg0, arg1, arg2);
        } else {
            prepare(context, runtime, self, new IRubyObject[] {arg0, arg1, arg2}, block);
        }
        if (getBlock() != null) processBlockArg(scope, runtime, block);
    }
    public void prepare(ThreadContext context, Ruby runtime, IRubyObject self, IRubyObject arg0, IRubyObject arg1, IRubyObject arg2, IRubyObject arg3, Block block) {
        DynamicScope scope = context.getCurrentScope();

        if (isSimple) {
            scope.setArgValues(arg0, arg1, arg2, arg3);
        } else {
            prepare(context, runtime, self, new IRubyObject[] {arg0, arg1, arg2, arg3}, block);
        }
        if (getBlock() != null) processBlockArg(scope, runtime, block);
    }
    public void prepare(ThreadContext context, Ruby runtime, IRubyObject self, IRubyObject arg0, IRubyObject arg1, IRubyObject arg2, IRubyObject arg3, IRubyObject arg4, Block block) {
        DynamicScope scope = context.getCurrentScope();

        if (isSimple) {
            scope.setArgValues(arg0, arg1, arg2, arg3, arg4);
        } else {
            prepare(context, runtime, self, new IRubyObject[] {arg0, arg1, arg2, arg3, arg4}, block);
        }
        if (getBlock() != null) processBlockArg(scope, runtime, block);
    }
    public void prepare(ThreadContext context, Ruby runtime, IRubyObject self, IRubyObject arg0, IRubyObject arg1, IRubyObject arg2, IRubyObject arg3, IRubyObject arg4, IRubyObject arg5, Block block) {
        DynamicScope scope = context.getCurrentScope();

        if (isSimple) {
            scope.setArgValues(arg0, arg1, arg2, arg3, arg4, arg5);
        } else {
            prepare(context, runtime, self, new IRubyObject[] {arg0, arg1, arg2, arg3, arg4, arg5}, block);
        }
        if (getBlock() != null) processBlockArg(scope, runtime, block);
    }
    public void prepare(ThreadContext context, Ruby runtime, IRubyObject self, IRubyObject arg0, IRubyObject arg1, IRubyObject arg2, IRubyObject arg3, IRubyObject arg4, IRubyObject arg5, IRubyObject arg6, Block block) {
        DynamicScope scope = context.getCurrentScope();

        if (isSimple) {
            scope.setArgValues(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
        } else {
            prepare(context, runtime, self, new IRubyObject[] {arg0, arg1, arg2, arg3, arg4, arg5, arg6}, block);
        }
        if (getBlock() != null) processBlockArg(scope, runtime, block);
    }
    public void prepare(ThreadContext context, Ruby runtime, IRubyObject self, IRubyObject arg0, IRubyObject arg1, IRubyObject arg2, IRubyObject arg3, IRubyObject arg4, IRubyObject arg5, IRubyObject arg6, IRubyObject arg7, Block block) {
        DynamicScope scope = context.getCurrentScope();

        if (isSimple) {
            scope.setArgValues(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
        } else {
            prepare(context, runtime, self, new IRubyObject[] {arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7}, block);
        }
        if (getBlock() != null) processBlockArg(scope, runtime, block);
    }
    public void prepare(ThreadContext context, Ruby runtime, IRubyObject self, IRubyObject arg0, IRubyObject arg1, IRubyObject arg2, IRubyObject arg3, IRubyObject arg4, IRubyObject arg5, IRubyObject arg6, IRubyObject arg7, IRubyObject arg8, Block block) {
        DynamicScope scope = context.getCurrentScope();

        if (isSimple) {
            scope.setArgValues(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        } else {
            prepare(context, runtime, self, new IRubyObject[] {arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8}, block);
        }
        if (getBlock() != null) processBlockArg(scope, runtime, block);
    }
    public void prepare(ThreadContext context, Ruby runtime, IRubyObject self, IRubyObject arg0, IRubyObject arg1, IRubyObject arg2, IRubyObject arg3, IRubyObject arg4, IRubyObject arg5, IRubyObject arg6, IRubyObject arg7, IRubyObject arg8, IRubyObject arg9, Block block) {
        DynamicScope scope = context.getCurrentScope();

        if (isSimple) {
            scope.setArgValues(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
        } else {
            prepare(context, runtime, self, new IRubyObject[] {arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9}, block);
        }
        if (getBlock() != null) processBlockArg(scope, runtime, block);
    }


    public void checkArgCount(Ruby runtime, int argsLength) {
//        arity.checkArity(runtime, argsLength);
        Arity.checkArgumentCount(runtime, argsLength, requiredArgsCount, maxArgsCount);
    }

    protected void prepareOptOrRestArgs(ThreadContext context, Ruby runtime, DynamicScope scope,
            IRubyObject self, IRubyObject[] args) {
        prepareRestArg(context, runtime, scope, args, prepareOptionalArguments(context, runtime, self, args));
    }

    protected int prepareOptionalArguments(ThreadContext context, Ruby runtime, IRubyObject self, IRubyObject[] args) {
        return hasOptArgs ? assignOptArgs(args, runtime, context, self, preCount) : preCount;
    }

    protected void prepareRestArg(ThreadContext context, Ruby runtime, DynamicScope scope,
            IRubyObject[] args, int givenArgsCount) {
        if (restArg >= 0) {
            int sizeOfRestArg = args.length - postCount - givenArgsCount;
            if (sizeOfRestArg <= 0) { // no more values to stick in rest arg
                scope.setValue(restArg, RubyArray.newArray(runtime), 0);
            } else {
                scope.setValue(restArg, RubyArray.newArrayNoCopy(runtime, args, givenArgsCount, sizeOfRestArg), 0);
            }
        }
    }

    protected int assignOptArgs(IRubyObject[] args, Ruby runtime, ThreadContext context, IRubyObject self, int givenArgsCount) {
        // assign given optional arguments to their variables
        int j = 0;
        for (int i = preCount; i < args.length - postCount && j < optArgs.size(); i++, j++) {
            // in-frame EvalState should already have receiver set as self, continue to use it
            optArgs.get(j).assign(runtime, context, self, args[i], Block.NULL_BLOCK, true);
            givenArgsCount++;
        }

        // assign the default values, adding to the end of allArgs
        for (int i = 0; j < optArgs.size(); i++, j++) {
            optArgs.get(j).interpret(runtime, context, self, Block.NULL_BLOCK);
        }

        return givenArgsCount;
    }

    protected void processBlockArg(DynamicScope scope, Ruby runtime, Block block) {
        scope.setValue(getBlock().getCount(), RuntimeHelpers.processBlockArgument(runtime, block), 0);
    }

    public List<Node> childNodes() {
        if (post != null) return Node.createList(pre, optArgs, restArgNode, post, blockArgNode);

        return Node.createList(pre, optArgs, restArgNode, blockArgNode);
    }
}
