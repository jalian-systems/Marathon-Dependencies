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
public class org$jruby$RubyNameError$RubyNameErrorMessage$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        RubyClass singletonClass = cls.getSingletonClass();
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.RubyNameError$RubyNameErrorMessage$INVOKER$s$1$0$load(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "load", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyNameError.RubyNameErrorMessage.class, "load", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        singletonClass.addMethodAtBootTimeOnly("_load", javaMethod);
        runtime.addBoundMethod("org.jruby.RubyNameError.RubyNameErrorMessage","load","_load");
        javaMethod = new org.jruby.RubyNameError$RubyNameErrorMessage$INVOKER$i$1$0$dump(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "dump", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyNameError.RubyNameErrorMessage.class, "dump", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("_dump", javaMethod);
        javaMethod = new org.jruby.RubyNameError$RubyNameErrorMessage$INVOKER$i$0$0$to_str(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "to_str", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyNameError.RubyNameErrorMessage.class, "to_str", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("to_str", javaMethod);
        runtime.addBoundMethod("org.jruby.RubyNameError.RubyNameErrorMessage","dump","_dump");
        runtime.addBoundMethod("org.jruby.RubyNameError.RubyNameErrorMessage","to_str","to_str");
    }
    static {
     }
}
