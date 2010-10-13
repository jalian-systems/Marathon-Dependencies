package org.jruby.compiler.ir;

enum OpType { dont_care, debug_op, obj_op, alu_op, call_op, recv_arg_op, ret_op, eval_op, branch_op, exc_op, load_op, store_op, declare_type_op, guard_op };

public enum Operation
{
// ------ Define the operations below ----

// value copy and type conversion operations
    COPY(OpType.dont_care), SET_RETADDR(OpType.dont_care),

// debugging / stacktrace info
    LINE_NUM(OpType.debug_op), FILE_NAME(OpType.debug_op),

// alu operations
    NOT(OpType.alu_op),

// method handle, arg receive, return value, and  call instructions
    RETURN(OpType.ret_op), CLOSURE_RETURN(OpType.ret_op),
    RECV_ARG(OpType.recv_arg_op), RECV_CLOSURE(OpType.recv_arg_op), RECV_OPT_ARG(OpType.recv_arg_op), RECV_CLOSURE_ARG(OpType.recv_arg_op),
	 RECV_EXCEPTION(OpType.recv_arg_op),
    CALL(OpType.call_op), JRUBY_IMPL(OpType.call_op), RUBY_INTERNALS(OpType.call_op),
    DECLARE_TYPE(OpType.declare_type_op),

// closure instructions
    YIELD(OpType.dont_care),

// def instructions
    DEF_INST_METH(OpType.dont_care), DEF_CLASS_METH(OpType.dont_care),

// exception instructions
    THROW(OpType.exc_op), RESCUE_BODY_START(OpType.dont_care), RESCUE_BODY_END(OpType.dont_care), RETRY(OpType.dont_care),

// Loads
    GET_CONST(OpType.load_op), GET_GLOBAL_VAR(OpType.load_op), GET_FIELD(OpType.load_op), GET_CVAR(OpType.load_op), GET_ARRAY(OpType.load_op),
    FRAME_LOAD(OpType.load_op),

// Stores
    PUT_CONST(OpType.store_op), PUT_GLOBAL_VAR(OpType.store_op), PUT_FIELD(OpType.store_op), PUT_ARRAY(OpType.store_op), PUT_CVAR(OpType.store_op),
    FRAME_STORE(OpType.store_op),

// jump and branch operations
    BREAK(OpType.branch_op), JUMP(OpType.branch_op), JUMP_INDIRECT(OpType.branch_op), BEQ(OpType.branch_op),

// others
    ATTR_ASSIGN(OpType.dont_care),
    BUILD_CLOSURE(OpType.dont_care), ALLOC_FRAME(OpType.dont_care), LABEL(OpType.dont_care), THREAD_POLL(OpType.dont_care),

// comparisons & checks
    IS_TRUE(OpType.dont_care), // checks if the operand is non-null and non-false
    EQQ(OpType.dont_care), // EQQ a === call used only for its conditional results, as in case/when, begin/rescue, ...

// a case/when branch
    CASE(OpType.dont_care),
    
// optimization guards
    ASSERT_METHOD_VERSION(OpType.guard_op);

    private OpType _type;

    Operation(OpType t) { _type = t; }

    public boolean isALU()        { return _type == OpType.alu_op; }
    public boolean isBranch()     { return _type == OpType.branch_op; }
    public boolean isLoad()       { return _type == OpType.load_op; }
    public boolean isStore()      { return _type == OpType.store_op; }
    public boolean isCall()       { return _type == OpType.call_op; }
    public boolean isEval()       { return _type == OpType.eval_op; }
    public boolean isReturn()     { return _type == OpType.ret_op; }
    public boolean isException()  { return _type == OpType.exc_op; }
    public boolean isArgReceive() { return _type == OpType.recv_arg_op; }

    public boolean startsBasicBlock() { return this == LABEL; }
    public boolean endsBasicBlock() { return isBranch() || isReturn() || isException(); }

    // By default, call instructions cannot be deleted even if their results aren't used by anyone
    // unless we know more about what the call is, what it does, etc.
    // Similarly for evals, stores, returns.
    public boolean hasSideEffects() 
    {
        return isCall() || isEval() || isStore() || isReturn();
    }
}
