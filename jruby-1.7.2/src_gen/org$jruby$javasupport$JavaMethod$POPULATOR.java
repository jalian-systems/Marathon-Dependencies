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
public class org$jruby$javasupport$JavaMethod$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.javasupport.JavaMethod$INVOKER$i$0$0$invoke_static(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "invoke_static", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.javasupport.JavaMethod.class, "invoke_static", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject[].class});
        cls.addMethodAtBootTimeOnly("invoke_static", javaMethod);
        javaMethod = new org.jruby.javasupport.JavaMethod$INVOKER$i$0$0$public_p(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "public_p", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.javasupport.JavaMethod.class, "public_p", org.jruby.RubyBoolean.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("public?", javaMethod);
        javaMethod = new org.jruby.javasupport.JavaMethod$INVOKER$i$0$0$return_type(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "return_type", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.javasupport.JavaMethod.class, "return_type", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("return_type", javaMethod);
        javaMethod = new org.jruby.javasupport.JavaMethod$INVOKER$i$0$0$final_p(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "final_p", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.javasupport.JavaMethod.class, "final_p", org.jruby.RubyBoolean.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("final?", javaMethod);
        javaMethod = new org.jruby.javasupport.JavaMethod$INVOKER$i$0$0$name(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "name", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.javasupport.JavaMethod.class, "name", org.jruby.RubyString.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("name", javaMethod);
        javaMethod = new org.jruby.javasupport.JavaMethod$INVOKER$i$0$0$type_parameters(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "type_parameters", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.javasupport.JavaMethod.class, "type_parameters", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("type_parameters", javaMethod);
        javaMethod = new org.jruby.javasupport.JavaMethod$INVOKER$i$0$0$invoke(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "invoke", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.javasupport.JavaMethod.class, "invoke", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject[].class});
        cls.addMethodAtBootTimeOnly("invoke", javaMethod);
        javaMethod = new org.jruby.javasupport.JavaMethod$INVOKER$i$0$0$static_p(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "static_p", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.javasupport.JavaMethod.class, "static_p", org.jruby.RubyBoolean.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("static?", javaMethod);
        runtime.addBoundMethod("org.jruby.javasupport.JavaMethod","invoke_static","invoke_static");
        runtime.addBoundMethod("org.jruby.javasupport.JavaMethod","public_p","public?");
        runtime.addBoundMethod("org.jruby.javasupport.JavaMethod","return_type","return_type");
        runtime.addBoundMethod("org.jruby.javasupport.JavaMethod","final_p","final?");
        runtime.addBoundMethod("org.jruby.javasupport.JavaMethod","name","name");
        runtime.addBoundMethod("org.jruby.javasupport.JavaMethod","type_parameters","type_parameters");
        runtime.addBoundMethod("org.jruby.javasupport.JavaMethod","invoke","invoke");
        runtime.addBoundMethod("org.jruby.javasupport.JavaMethod","static_p","static?");
    }
    static {
     }
}
