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
public class org$jruby$javasupport$proxy$JavaProxyClass$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        RubyClass singletonClass = cls.getSingletonClass();
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.javasupport.proxy.JavaProxyClass$INVOKER$s$1$0$get(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "get", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.javasupport.proxy.JavaProxyClass.class, "get", org.jruby.RubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        singletonClass.addMethodAtBootTimeOnly("get", javaMethod);
        javaMethod = new org.jruby.javasupport.proxy.JavaProxyClass$INVOKER$s$1$0$get_with_class(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "get_with_class", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.javasupport.proxy.JavaProxyClass.class, "get_with_class", org.jruby.RubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        singletonClass.addMethodAtBootTimeOnly("get_with_class", javaMethod);
        runtime.addBoundMethod("org.jruby.javasupport.proxy.JavaProxyClass","get","get");
        runtime.addBoundMethod("org.jruby.javasupport.proxy.JavaProxyClass","get_with_class","get_with_class");
        javaMethod = new org.jruby.javasupport.proxy.JavaProxyClass$INVOKER$i$0$0$constructors(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "constructors", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.javasupport.proxy.JavaProxyClass.class, "constructors", org.jruby.RubyArray.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("constructors", javaMethod);
        javaMethod = new org.jruby.javasupport.proxy.JavaProxyClass$INVOKER$i$0$0$methods(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "methods", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.javasupport.proxy.JavaProxyClass.class, "methods", org.jruby.RubyArray.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("methods", javaMethod);
        javaMethod = new org.jruby.javasupport.proxy.JavaProxyClass$INVOKER$i$0$0$interfaces(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "interfaces", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.javasupport.proxy.JavaProxyClass.class, "interfaces", org.jruby.RubyArray.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("interfaces", javaMethod);
        javaMethod = new org.jruby.javasupport.proxy.JavaProxyClass$INVOKER$i$0$0$superclass(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "superclass", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.javasupport.proxy.JavaProxyClass.class, "superclass", org.jruby.RubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("superclass", javaMethod);
        runtime.addBoundMethod("org.jruby.javasupport.proxy.JavaProxyClass","constructors","constructors");
        runtime.addBoundMethod("org.jruby.javasupport.proxy.JavaProxyClass","methods","methods");
        runtime.addBoundMethod("org.jruby.javasupport.proxy.JavaProxyClass","interfaces","interfaces");
        runtime.addBoundMethod("org.jruby.javasupport.proxy.JavaProxyClass","superclass","superclass");
    }
    static {
     }
}
