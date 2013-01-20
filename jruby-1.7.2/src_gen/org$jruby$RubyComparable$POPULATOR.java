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
public class org$jruby$RubyComparable$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        CompatVersion compatVersion = cls.getRuntime().getInstanceConfig().getCompatVersion();
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.RubyComparable$INVOKER$s$1$0$op_le(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "op_le", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyComparable.class, "op_le", org.jruby.RubyBoolean.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("<=", javaMethod);
        javaMethod = new org.jruby.RubyComparable$INVOKER$s$2$0$between_p(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 2, "between_p", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyComparable.class, "between_p", org.jruby.RubyBoolean.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("between?", javaMethod);
        javaMethod = new org.jruby.RubyComparable$INVOKER$s$1$0$op_ge(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "op_ge", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyComparable.class, "op_ge", org.jruby.RubyBoolean.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly(">=", javaMethod);
        javaMethod = new org.jruby.RubyComparable$INVOKER$s$1$0$op_gt(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "op_gt", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyComparable.class, "op_gt", org.jruby.RubyBoolean.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly(">", javaMethod);
        javaMethod = new org.jruby.RubyComparable$INVOKER$s$1$0$op_lt(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "op_lt", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyComparable.class, "op_lt", org.jruby.RubyBoolean.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("<", javaMethod);
        runtime.addBoundMethod("org.jruby.RubyComparable","op_le","<=");
        runtime.addBoundMethod("org.jruby.RubyComparable","between_p","between?");
        runtime.addBoundMethod("org.jruby.RubyComparable","op_ge",">=");
        runtime.addBoundMethod("org.jruby.RubyComparable","op_gt",">");
        runtime.addBoundMethod("org.jruby.RubyComparable","op_lt","<");
        if (compatVersion == CompatVersion.RUBY1_8 || compatVersion == CompatVersion.BOTH) {
        javaMethod = new org.jruby.RubyComparable$INVOKER$s$1$0$op_equal(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "op_equal", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyComparable.class, "op_equal", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("==", javaMethod);
        runtime.addBoundMethod("org.jruby.RubyComparable","op_equal","==");
        }
        if (compatVersion.is1_9() || compatVersion == CompatVersion.BOTH) {
        javaMethod = new org.jruby.RubyComparable$INVOKER$s$1$0$op_equal19(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "op_equal19", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyComparable.class, "op_equal19", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("==", javaMethod);
        runtime.addBoundMethod("org.jruby.RubyComparable","op_equal19","==");
        }
    }
    static {
     }
}
