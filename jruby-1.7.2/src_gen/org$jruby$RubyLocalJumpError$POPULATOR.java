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
public class org$jruby$RubyLocalJumpError$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.RubyLocalJumpError$INVOKER$i$0$0$exit_value(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "exit_value", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyLocalJumpError.class, "exit_value", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("exit_value", javaMethod);
        javaMethod = new org.jruby.RubyLocalJumpError$INVOKER$i$0$0$reason(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "reason", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyLocalJumpError.class, "reason", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("reason", javaMethod);
        runtime.addBoundMethod("org.jruby.RubyLocalJumpError","exit_value","exit_value");
        runtime.addBoundMethod("org.jruby.RubyLocalJumpError","reason","reason");
    }
    static {
     }
}
