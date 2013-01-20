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
public class org$jruby$RubyException$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        RubyClass singletonClass = cls.getSingletonClass();
        CompatVersion compatVersion = cls.getRuntime().getInstanceConfig().getCompatVersion();
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.RubyException$INVOKER$s$1$0$op_eqq(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "op_eqq", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyException.class, "op_eqq", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        singletonClass.addMethodAtBootTimeOnly("===", javaMethod);
        javaMethod = new org.jruby.RubyException$INVOKER$s$0$1$exception(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "exception", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyException.class, "exception", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class, org.jruby.runtime.Block.class});
        singletonClass.addMethodAtBootTimeOnly("exception", javaMethod);
        runtime.addBoundMethod("org.jruby.RubyException","op_eqq","===");
        runtime.addBoundMethod("org.jruby.RubyException","exception","exception");
        javaMethod = new org.jruby.RubyException$INVOKER$i$0$0$message(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "message", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyException.class, "message", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("message", javaMethod);
        javaMethod = new org.jruby.RubyException$INVOKER$i$1$0$set_backtrace(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "set_backtrace", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyException.class, "set_backtrace", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("set_backtrace", javaMethod);
        javaMethod = new org.jruby.RubyException$INVOKER$i$0$2$initialize(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, -1, "initialize", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyException.class, "initialize", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject[].class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("initialize", javaMethod);
        javaMethod = new org.jruby.RubyException$INVOKER$i$0$1$exception(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "exception", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyException.class, "exception", org.jruby.RubyException.class, new Class[] {org.jruby.runtime.builtin.IRubyObject[].class});
        cls.addMethodAtBootTimeOnly("exception", javaMethod);
        javaMethod = new org.jruby.RubyException$INVOKER$i$0$0$backtrace(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "backtrace", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyException.class, "backtrace", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("backtrace", javaMethod);
        javaMethod = new org.jruby.RubyException$INVOKER$i$0$0$inspect(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "inspect", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyException.class, "inspect", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("inspect", javaMethod);
        runtime.addBoundMethod("org.jruby.RubyException","message","message");
        runtime.addBoundMethod("org.jruby.RubyException","set_backtrace","set_backtrace");
        runtime.addBoundMethod("org.jruby.RubyException","initialize","initialize");
        runtime.addBoundMethod("org.jruby.RubyException","exception","exception");
        runtime.addBoundMethod("org.jruby.RubyException","backtrace","backtrace");
        runtime.addBoundMethod("org.jruby.RubyException","inspect","inspect");
        if (compatVersion == CompatVersion.RUBY1_8 || compatVersion == CompatVersion.BOTH) {
        javaMethod = new org.jruby.RubyException$INVOKER$i$0$0$to_str(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "to_str", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyException.class, "to_str", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("to_str", javaMethod);
        javaMethod = new org.jruby.RubyException$INVOKER$i$0$0$to_s(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "to_s", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyException.class, "to_s", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("to_s", javaMethod);
        runtime.addBoundMethod("org.jruby.RubyException","to_str","to_str");
        runtime.addBoundMethod("org.jruby.RubyException","to_s","to_s");
        }
        if (compatVersion.is1_9() || compatVersion == CompatVersion.BOTH) {
        javaMethod = new org.jruby.RubyException$INVOKER$i$1$0$op_equal(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "op_equal", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyException.class, "op_equal", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("==", javaMethod);
        javaMethod = new org.jruby.RubyException$INVOKER$i$0$0$to_s19(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "to_s19", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyException.class, "to_s19", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("to_s", javaMethod);
        runtime.addBoundMethod("org.jruby.RubyException","op_equal","==");
        runtime.addBoundMethod("org.jruby.RubyException","to_s19","to_s");
        }
    }
    static {
     }
}
