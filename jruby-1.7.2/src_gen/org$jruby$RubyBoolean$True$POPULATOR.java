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
public class org$jruby$RubyBoolean$True$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.RubyBoolean$True$INVOKER$s$1$0$true_and(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "true_and", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyBoolean.True.class, "true_and", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("&", javaMethod);
        javaMethod = new org.jruby.RubyBoolean$True$INVOKER$s$1$0$true_xor(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "true_xor", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyBoolean.True.class, "true_xor", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("^", javaMethod);
        javaMethod = new org.jruby.RubyBoolean$True$INVOKER$s$1$0$true_or(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "true_or", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyBoolean.True.class, "true_or", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("|", javaMethod);
        javaMethod = new org.jruby.RubyBoolean$True$INVOKER$s$0$0$true_to_s(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "true_to_s", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyBoolean.True.class, "true_to_s", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("to_s", javaMethod);
        runtime.addBoundMethod("org.jruby.RubyBoolean.True","true_and","&");
        runtime.addBoundMethod("org.jruby.RubyBoolean.True","true_xor","^");
        runtime.addBoundMethod("org.jruby.RubyBoolean.True","true_or","|");
        runtime.addBoundMethod("org.jruby.RubyBoolean.True","true_to_s","to_s");
    }
    static {
     }
}
