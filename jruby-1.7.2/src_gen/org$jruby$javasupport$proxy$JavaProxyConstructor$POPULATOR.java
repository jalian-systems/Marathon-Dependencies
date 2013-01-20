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
public class org$jruby$javasupport$proxy$JavaProxyConstructor$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.javasupport.proxy.JavaProxyConstructor$INVOKER$i$0$0$new_instance2(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "new_instance2", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.javasupport.proxy.JavaProxyConstructor.class, "new_instance2", org.jruby.RubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject[].class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("new_instance2", javaMethod);
        javaMethod = new org.jruby.javasupport.proxy.JavaProxyConstructor$INVOKER$i$0$0$arity(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "arity", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.javasupport.proxy.JavaProxyConstructor.class, "arity", org.jruby.RubyFixnum.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("arity", javaMethod);
        javaMethod = new org.jruby.javasupport.proxy.JavaProxyConstructor$INVOKER$i$0$0$getDeclaringClass(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "getDeclaringClass", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.javasupport.proxy.JavaProxyConstructor.class, "getDeclaringClass", org.jruby.javasupport.proxy.JavaProxyClass.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("declaring_class", javaMethod);
        javaMethod = new org.jruby.javasupport.proxy.JavaProxyConstructor$INVOKER$i$0$1$new_instance(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "new_instance", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.javasupport.proxy.JavaProxyConstructor.class, "new_instance", org.jruby.RubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject[].class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("new_instance", javaMethod);
        javaMethod = new org.jruby.javasupport.proxy.JavaProxyConstructor$INVOKER$i$0$0$argument_types(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "argument_types", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.javasupport.proxy.JavaProxyConstructor.class, "argument_types", org.jruby.RubyArray.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("argument_types", javaMethod);
        runtime.addBoundMethod("org.jruby.javasupport.proxy.JavaProxyConstructor","new_instance2","new_instance2");
        runtime.addBoundMethod("org.jruby.javasupport.proxy.JavaProxyConstructor","arity","arity");
        runtime.addBoundMethod("org.jruby.javasupport.proxy.JavaProxyConstructor","getDeclaringClass","declaring_class");
        runtime.addBoundMethod("org.jruby.javasupport.proxy.JavaProxyConstructor","new_instance","new_instance");
        runtime.addBoundMethod("org.jruby.javasupport.proxy.JavaProxyConstructor","argument_types","argument_types");
    }
    static {
     }
}
