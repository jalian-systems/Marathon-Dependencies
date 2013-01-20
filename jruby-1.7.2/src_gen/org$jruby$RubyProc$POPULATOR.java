/* THIS FILE IS GENERATED. DO NOT EDIT */
package org.jruby.gen;
import org.jruby.Ruby;
import org.jruby.RubyModule;
import org.jruby.RubyClass;
import org.jruby.CompatVersion;
import org.jruby.anno.TypePopulator;
import org.jruby.internal.runtime.methods.CallConfiguration;
import org.jruby.internal.runtime.methods.JavaMethod;
import org.jruby.internal.runtime.methods.DynamicMethod;
import org.jruby.runtime.Arity;
import org.jruby.runtime.Visibility;
import org.jruby.compiler.ASTInspector;
import java.util.Arrays;
import java.util.List;
public class org$jruby$RubyProc$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        RubyClass singletonClass = cls.getSingletonClass();
        CompatVersion compatVersion = cls.getRuntime().getInstanceConfig().getCompatVersion();
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.RubyProc$INVOKER$s$0$0$newInstance(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "newInstance", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyProc.class, "newInstance", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class, org.jruby.runtime.Block.class});
        singletonClass.addMethodAtBootTimeOnly("new", javaMethod);
        runtime.addBoundMethod("org.jruby.RubyProc","newInstance","new");
        javaMethod = new org.jruby.RubyProc$INVOKER$i$0$0$arity(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "arity", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyProc.class, "arity", org.jruby.RubyFixnum.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("arity", javaMethod);
        javaMethod = new org.jruby.RubyProc$INVOKER$i$0$0$rbClone(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "rbClone", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyProc.class, "rbClone", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("clone", javaMethod);
        javaMethod = new org.jruby.RubyProc$INVOKER$i$0$0$dup(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "dup", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyProc.class, "dup", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("dup", javaMethod);
        javaMethod = new org.jruby.RubyProc$INVOKER$i$0$0$to_proc(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "to_proc", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyProc.class, "to_proc", org.jruby.RubyProc.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("to_proc", javaMethod);
        javaMethod = new org.jruby.RubyProc$INVOKER$i$1$0$op_equal(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "op_equal", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyProc.class, "op_equal", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("==", javaMethod);
        javaMethod = new org.jruby.RubyProc$INVOKER$i$0$0$binding(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "binding", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyProc.class, "binding", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("binding", javaMethod);
        runtime.addBoundMethod("org.jruby.RubyProc","arity","arity");
        runtime.addBoundMethod("org.jruby.RubyProc","rbClone","clone");
        runtime.addBoundMethod("org.jruby.RubyProc","dup","dup");
        runtime.addBoundMethod("org.jruby.RubyProc","to_proc","to_proc");
        runtime.addBoundMethod("org.jruby.RubyProc","op_equal","==");
        runtime.addBoundMethod("org.jruby.RubyProc","binding","binding");
        if (compatVersion == CompatVersion.RUBY1_8 || compatVersion == CompatVersion.BOTH) {
        javaMethod = new org.jruby.RubyProc$INVOKER$i$0$0$call(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "call", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyProc.class, "call", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject[].class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("call", javaMethod);
        cls.addMethodAtBootTimeOnly("[]", javaMethod);
        javaMethod = new org.jruby.RubyProc$INVOKER$i$0$0$to_s(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "to_s", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyProc.class, "to_s", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("to_s", javaMethod);
        runtime.addBoundMethod("org.jruby.RubyProc","call","call");
        runtime.addBoundMethod("org.jruby.RubyProc","to_s","to_s");
        }
        if (compatVersion.is1_9() || compatVersion == CompatVersion.BOTH) {
        javaMethod = new org.jruby.RubyProc$INVOKER$i$0$0$call19(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "call19", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyProc.class, "call19", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject[].class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("call", javaMethod);
        cls.addMethodAtBootTimeOnly("[]", javaMethod);
        cls.addMethodAtBootTimeOnly("yield", javaMethod);
        cls.addMethodAtBootTimeOnly("===", javaMethod);
        javaMethod = new org.jruby.RubyProc$INVOKER$i$0$0$lambda_p(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "lambda_p", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyProc.class, "lambda_p", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("lambda?", javaMethod);
        javaMethod = new org.jruby.RubyProc$INVOKER$i$0$0$source_location(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "source_location", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyProc.class, "source_location", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("source_location", javaMethod);
        javaMethod = new org.jruby.RubyProc$INVOKER$i$0$0$parameters(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "parameters", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyProc.class, "parameters", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("parameters", javaMethod);
        javaMethod = new org.jruby.RubyProc$INVOKER$i$0$0$to_s19(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "to_s19", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyProc.class, "to_s19", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("to_s", javaMethod);
        runtime.addBoundMethod("org.jruby.RubyProc","call19","call");
        runtime.addBoundMethod("org.jruby.RubyProc","lambda_p","lambda?");
        runtime.addBoundMethod("org.jruby.RubyProc","source_location","source_location");
        runtime.addBoundMethod("org.jruby.RubyProc","parameters","parameters");
        runtime.addBoundMethod("org.jruby.RubyProc","to_s19","to_s");
        }
    }
    static {
     }
}
