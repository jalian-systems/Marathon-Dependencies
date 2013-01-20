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
public class org$jruby$javasupport$proxy$JavaProxyClass$ProxyMethodImpl$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.javasupport.proxy.JavaProxyClass$ProxyMethodImpl$INVOKER$i$0$0$arity(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "arity", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.javasupport.proxy.JavaProxyClass.ProxyMethodImpl.class, "arity", org.jruby.RubyFixnum.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("arity", javaMethod);
        javaMethod = new org.jruby.javasupport.proxy.JavaProxyClass$ProxyMethodImpl$INVOKER$i$0$0$getDeclaringClass(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "getDeclaringClass", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.javasupport.proxy.JavaProxyClass.ProxyMethodImpl.class, "getDeclaringClass", org.jruby.javasupport.proxy.JavaProxyClass.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("declaring_class", javaMethod);
        javaMethod = new org.jruby.javasupport.proxy.JavaProxyClass$ProxyMethodImpl$INVOKER$i$0$0$do_invoke(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "do_invoke", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.javasupport.proxy.JavaProxyClass.ProxyMethodImpl.class, "do_invoke", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject[].class});
        cls.addMethodAtBootTimeOnly("invoke", javaMethod);
        javaMethod = new org.jruby.javasupport.proxy.JavaProxyClass$ProxyMethodImpl$INVOKER$i$0$0$inspect(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "inspect", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.javasupport.proxy.JavaProxyClass.ProxyMethodImpl.class, "inspect", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("inspect", javaMethod);
        javaMethod = new org.jruby.javasupport.proxy.JavaProxyClass$ProxyMethodImpl$INVOKER$i$0$0$super_p(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "super_p", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.javasupport.proxy.JavaProxyClass.ProxyMethodImpl.class, "super_p", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("super?", javaMethod);
        javaMethod = new org.jruby.javasupport.proxy.JavaProxyClass$ProxyMethodImpl$INVOKER$i$0$0$argument_types(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "argument_types", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.javasupport.proxy.JavaProxyClass.ProxyMethodImpl.class, "argument_types", org.jruby.RubyArray.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("argument_types", javaMethod);
        runtime.addBoundMethod("org.jruby.javasupport.proxy.JavaProxyClass.ProxyMethodImpl","arity","arity");
        runtime.addBoundMethod("org.jruby.javasupport.proxy.JavaProxyClass.ProxyMethodImpl","getDeclaringClass","declaring_class");
        runtime.addBoundMethod("org.jruby.javasupport.proxy.JavaProxyClass.ProxyMethodImpl","do_invoke","invoke");
        runtime.addBoundMethod("org.jruby.javasupport.proxy.JavaProxyClass.ProxyMethodImpl","inspect","inspect");
        runtime.addBoundMethod("org.jruby.javasupport.proxy.JavaProxyClass.ProxyMethodImpl","super_p","super?");
        runtime.addBoundMethod("org.jruby.javasupport.proxy.JavaProxyClass.ProxyMethodImpl","argument_types","argument_types");
    }
    static {
     }
}
