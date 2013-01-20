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
public class org$jruby$javasupport$JavaConstructor$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.javasupport.JavaConstructor$INVOKER$i$0$0$return_type(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "return_type", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.javasupport.JavaConstructor.class, "return_type", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("return_type", javaMethod);
        javaMethod = new org.jruby.javasupport.JavaConstructor$INVOKER$i$0$0$new_instance(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "new_instance", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.javasupport.JavaConstructor.class, "new_instance", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject[].class});
        cls.addMethodAtBootTimeOnly("new_instance", javaMethod);
        javaMethod = new org.jruby.javasupport.JavaConstructor$INVOKER$i$0$0$type_parameters(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "type_parameters", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.javasupport.JavaConstructor.class, "type_parameters", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("type_parameters", javaMethod);
        runtime.addBoundMethod("org.jruby.javasupport.JavaConstructor","return_type","return_type");
        runtime.addBoundMethod("org.jruby.javasupport.JavaConstructor","new_instance","new_instance");
        runtime.addBoundMethod("org.jruby.javasupport.JavaConstructor","type_parameters","type_parameters");
    }
    static {
     }
}
