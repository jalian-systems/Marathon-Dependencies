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
public class org$jruby$javasupport$Java$JavaProxyClassMethods$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        RubyClass singletonClass = cls.getSingletonClass();
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.javasupport.Java$JavaProxyClassMethods$INVOKER$s$java_send(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "java_send", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.javasupport.Java.JavaProxyClassMethods.class, "java_send", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        singletonClass.addMethodAtBootTimeOnly("java_send", javaMethod);
        javaMethod = new org.jruby.javasupport.Java$JavaProxyClassMethods$INVOKER$s$java_alias(singletonClass, Visibility.PRIVATE);
        populateMethod(javaMethod, -1, "java_alias", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.javasupport.Java.JavaProxyClassMethods.class, "java_alias", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        singletonClass.addMethodAtBootTimeOnly("java_alias", javaMethod);
        javaMethod = new org.jruby.javasupport.Java$JavaProxyClassMethods$INVOKER$s$java_method(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "java_method", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.javasupport.Java.JavaProxyClassMethods.class, "java_method", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        singletonClass.addMethodAtBootTimeOnly("java_method", javaMethod);
        runtime.addBoundMethod("org.jruby.javasupport.Java.JavaProxyClassMethods","java_send","java_send");
        runtime.addBoundMethod("org.jruby.javasupport.Java.JavaProxyClassMethods","java_alias","java_alias");
        runtime.addBoundMethod("org.jruby.javasupport.Java.JavaProxyClassMethods","java_method","java_method");
    }
    static {
     }
}
