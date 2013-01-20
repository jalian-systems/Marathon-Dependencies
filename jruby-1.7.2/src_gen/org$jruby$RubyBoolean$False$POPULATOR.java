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
public class org$jruby$RubyBoolean$False$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.RubyBoolean$False$INVOKER$s$1$0$false_and(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "false_and", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyBoolean.False.class, "false_and", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("&", javaMethod);
        javaMethod = new org.jruby.RubyBoolean$False$INVOKER$s$1$0$false_xor(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "false_xor", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyBoolean.False.class, "false_xor", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("^", javaMethod);
        javaMethod = new org.jruby.RubyBoolean$False$INVOKER$s$1$0$false_or(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "false_or", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyBoolean.False.class, "false_or", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("|", javaMethod);
        javaMethod = new org.jruby.RubyBoolean$False$INVOKER$s$0$0$false_to_s(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "false_to_s", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyBoolean.False.class, "false_to_s", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("to_s", javaMethod);
        runtime.addBoundMethod("org.jruby.RubyBoolean.False","false_and","&");
        runtime.addBoundMethod("org.jruby.RubyBoolean.False","false_xor","^");
        runtime.addBoundMethod("org.jruby.RubyBoolean.False","false_or","|");
        runtime.addBoundMethod("org.jruby.RubyBoolean.False","false_to_s","to_s");
    }
    static {
     }
}
