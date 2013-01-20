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
public class org$jruby$RubyNil$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        CompatVersion compatVersion = cls.getRuntime().getInstanceConfig().getCompatVersion();
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.RubyNil$INVOKER$s$0$0$to_f(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "to_f", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyNil.class, "to_f", org.jruby.RubyFloat.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("to_f", javaMethod);
        javaMethod = new org.jruby.RubyNil$INVOKER$s$1$0$op_and(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "op_and", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyNil.class, "op_and", org.jruby.RubyBoolean.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("&", javaMethod);
        javaMethod = new org.jruby.RubyNil$INVOKER$s$0$0$to_i(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "to_i", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyNil.class, "to_i", org.jruby.RubyFixnum.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("to_i", javaMethod);
        javaMethod = new org.jruby.RubyNil$INVOKER$s$1$0$op_xor(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "op_xor", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyNil.class, "op_xor", org.jruby.RubyBoolean.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("^", javaMethod);
        javaMethod = new org.jruby.RubyNil$INVOKER$s$1$0$op_or(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "op_or", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyNil.class, "op_or", org.jruby.RubyBoolean.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("|", javaMethod);
        javaMethod = new org.jruby.RubyNil$INVOKER$s$0$0$inspect(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "inspect", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyNil.class, "inspect", org.jruby.RubyString.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("inspect", javaMethod);
        javaMethod = new org.jruby.RubyNil$INVOKER$s$0$0$to_a(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "to_a", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyNil.class, "to_a", org.jruby.RubyArray.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("to_a", javaMethod);
        javaMethod = new org.jruby.RubyNil$INVOKER$s$0$0$to_s(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "to_s", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyNil.class, "to_s", org.jruby.RubyString.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("to_s", javaMethod);
        runtime.addBoundMethod("org.jruby.RubyNil","to_f","to_f");
        runtime.addBoundMethod("org.jruby.RubyNil","op_and","&");
        runtime.addBoundMethod("org.jruby.RubyNil","to_i","to_i");
        runtime.addBoundMethod("org.jruby.RubyNil","op_xor","^");
        runtime.addBoundMethod("org.jruby.RubyNil","op_or","|");
        runtime.addBoundMethod("org.jruby.RubyNil","inspect","inspect");
        runtime.addBoundMethod("org.jruby.RubyNil","to_a","to_a");
        runtime.addBoundMethod("org.jruby.RubyNil","to_s","to_s");
        if (compatVersion == CompatVersion.RUBY1_8 || compatVersion == CompatVersion.BOTH) {
        javaMethod = new org.jruby.RubyNil$INVOKER$s$0$0$type(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "type", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyNil.class, "type", org.jruby.RubyClass.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("type", javaMethod);
        runtime.addBoundMethod("org.jruby.RubyNil","type","type");
        }
        if (compatVersion.is1_9() || compatVersion == CompatVersion.BOTH) {
        javaMethod = new org.jruby.RubyNil$INVOKER$s$0$1$rationalize(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "rationalize", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyNil.class, "rationalize", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class});
        cls.addMethodAtBootTimeOnly("rationalize", javaMethod);
        javaMethod = new org.jruby.RubyNil$INVOKER$s$0$0$to_c(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "to_c", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyNil.class, "to_c", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("to_c", javaMethod);
        javaMethod = new org.jruby.RubyNil$INVOKER$s$0$0$to_r(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "to_r", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyNil.class, "to_r", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("to_r", javaMethod);
        runtime.addBoundMethod("org.jruby.RubyNil","rationalize","rationalize");
        runtime.addBoundMethod("org.jruby.RubyNil","to_c","to_c");
        runtime.addBoundMethod("org.jruby.RubyNil","to_r","to_r");
        }
        javaMethod = new org.jruby.RubyNil$INVOKER$i$0$0$nil_p(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "nil_p", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyNil.class, "nil_p", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("nil?", javaMethod);
        runtime.addBoundMethod("org.jruby.RubyNil","nil_p","nil?");
    }
    static {
     }
}
