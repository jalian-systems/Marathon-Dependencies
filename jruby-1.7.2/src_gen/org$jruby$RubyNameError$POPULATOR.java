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
public class org$jruby$RubyNameError$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        RubyClass singletonClass = cls.getSingletonClass();
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.RubyNameError$INVOKER$s$0$0$newRubyNameError(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "newRubyNameError", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyNameError.class, "newRubyNameError", org.jruby.RubyException.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class});
        singletonClass.addMethodAtBootTimeOnly("exception", javaMethod);
        runtime.addBoundMethod("org.jruby.RubyNameError","newRubyNameError","exception");
        javaMethod = new org.jruby.RubyNameError$INVOKER$i$0$0$name(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "name", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyNameError.class, "name", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("name", javaMethod);
        javaMethod = new org.jruby.RubyNameError$INVOKER$i$0$0$to_s(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "to_s", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyNameError.class, "to_s", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("to_s", javaMethod);
        javaMethod = new org.jruby.RubyNameError$INVOKER$i$0$2$initialize(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "initialize", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyNameError.class, "initialize", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject[].class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("initialize", javaMethod);
        runtime.addBoundMethod("org.jruby.RubyNameError","name","name");
        runtime.addBoundMethod("org.jruby.RubyNameError","to_s","to_s");
        runtime.addBoundMethod("org.jruby.RubyNameError","initialize","initialize");
    }
    static {
     }
}
