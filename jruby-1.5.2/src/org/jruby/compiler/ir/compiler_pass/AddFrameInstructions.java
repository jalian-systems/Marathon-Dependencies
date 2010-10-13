package org.jruby.compiler.ir.compiler_pass;

import org.jruby.compiler.ir.IRMethod;
import org.jruby.compiler.ir.IR_Scope;
import org.jruby.compiler.ir.dataflow.analyses.FrameStorePlacementProblem;
import org.jruby.compiler.ir.dataflow.analyses.FrameLoadPlacementProblem;
import org.jruby.compiler.ir.representations.CFG;

public class AddFrameInstructions implements CompilerPass {
    public boolean isPreOrder() {
        return false;
    }

    public void run(IR_Scope s) {
        if (!(s instanceof IRMethod)) return;

        IRMethod m = (IRMethod) s;
        //        if (m.requiresFrame()) {
        CFG c = m.getCFG();
        FrameStorePlacementProblem fsp = new FrameStorePlacementProblem();
        fsp.setup(c);
        fsp.compute_MOP_Solution();
        fsp.addStoreAndFrameAllocInstructions();

        FrameLoadPlacementProblem frp = new FrameLoadPlacementProblem();
        frp.setup(c);
        frp.compute_MOP_Solution();
        frp.addLoads();
        //       }
    }
}
