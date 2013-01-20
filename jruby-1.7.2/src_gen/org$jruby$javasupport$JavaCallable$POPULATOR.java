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
public class org$jruby$javasupport$JavaCallable$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.javasupport.JavaCallable$INVOKER$i$0$0$generic_exception_types(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "generic_exception_types", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.javasupport.JavaCallable.class, "generic_exception_types", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("generic_exception_types", javaMethod);
        javaMethod = new org.jruby.javasupport.JavaCallable$INVOKER$i$0$0$public_p(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "public_p", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.javasupport.JavaCallable.class, "public_p", org.jruby.RubyBoolean.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("public?", javaMethod);
        javaMethod = new org.jruby.javasupport.JavaCallable$INVOKER$i$0$0$arity(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "arity", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.javasupport.JavaCallable.class, "arity", org.jruby.RubyFixnum.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("arity", javaMethod);
        javaMethod = new org.jruby.javasupport.JavaCallable$INVOKER$i$0$0$to_generic_string(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "to_generic_string", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.javasupport.JavaCallable.class, "to_generic_string", org.jruby.RubyString.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("to_generic_string", javaMethod);
        javaMethod = new org.jruby.javasupport.JavaCallable$INVOKER$i$0$0$varargs_p(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "varargs_p", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.javasupport.JavaCallable.class, "varargs_p", org.jruby.RubyBoolean.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("varargs?", javaMethod);
        javaMethod = new org.jruby.javasupport.JavaCallable$INVOKER$i$0$0$inspect(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "inspect", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.javasupport.JavaCallable.class, "inspect", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("inspect", javaMethod);
        javaMethod = new org.jruby.javasupport.JavaCallable$INVOKER$i$0$0$parameter_annotations(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "parameter_annotations", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.javasupport.JavaCallable.class, "parameter_annotations", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("parameter_annotations", javaMethod);
        javaMethod = new org.jruby.javasupport.JavaCallable$INVOKER$i$0$0$parameter_types(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "parameter_types", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.javasupport.JavaCallable.class, "parameter_types", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("parameter_types", javaMethod);
        javaMethod = new org.jruby.javasupport.JavaCallable$INVOKER$i$0$0$generic_parameter_types(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "generic_parameter_types", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.javasupport.JavaCallable.class, "generic_parameter_types", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("generic_parameter_types", javaMethod);
        javaMethod = new org.jruby.javasupport.JavaCallable$INVOKER$i$0$0$exception_types(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "exception_types", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.javasupport.JavaCallable.class, "exception_types", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("exception_types", javaMethod);
        javaMethod = new org.jruby.javasupport.JavaCallable$INVOKER$i$0$0$argument_types(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "argument_types", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.javasupport.JavaCallable.class, "argument_types", org.jruby.RubyArray.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("argument_types", javaMethod);
        runtime.addBoundMethod("org.jruby.javasupport.JavaCallable","generic_exception_types","generic_exception_types");
        runtime.addBoundMethod("org.jruby.javasupport.JavaCallable","public_p","public?");
        runtime.addBoundMethod("org.jruby.javasupport.JavaCallable","arity","arity");
        runtime.addBoundMethod("org.jruby.javasupport.JavaCallable","to_generic_string","to_generic_string");
        runtime.addBoundMethod("org.jruby.javasupport.JavaCallable","varargs_p","varargs?");
        runtime.addBoundMethod("org.jruby.javasupport.JavaCallable","inspect","inspect");
        runtime.addBoundMethod("org.jruby.javasupport.JavaCallable","parameter_annotations","parameter_annotations");
        runtime.addBoundMethod("org.jruby.javasupport.JavaCallable","parameter_types","parameter_types");
        runtime.addBoundMethod("org.jruby.javasupport.JavaCallable","generic_parameter_types","generic_parameter_types");
        runtime.addBoundMethod("org.jruby.javasupport.JavaCallable","exception_types","exception_types");
        runtime.addBoundMethod("org.jruby.javasupport.JavaCallable","argument_types","argument_types");
    }
    static {
     }
}
