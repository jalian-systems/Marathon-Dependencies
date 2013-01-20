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
public class org$jruby$javasupport$proxy$JavaProxyReflectionObject$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.javasupport.proxy.JavaProxyReflectionObject$INVOKER$i$1$0$aref(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "aref", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.javasupport.proxy.JavaProxyReflectionObject.class, "aref", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("[]", javaMethod);
        javaMethod = new org.jruby.javasupport.proxy.JavaProxyReflectionObject$INVOKER$i$0$0$java_class(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "java_class", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.javasupport.proxy.JavaProxyReflectionObject.class, "java_class", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("java_class", javaMethod);
        javaMethod = new org.jruby.javasupport.proxy.JavaProxyReflectionObject$INVOKER$i$1$0$same(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "same", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.javasupport.proxy.JavaProxyReflectionObject.class, "same", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("equal?", javaMethod);
        javaMethod = new org.jruby.javasupport.proxy.JavaProxyReflectionObject$INVOKER$i$0$0$to_s(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "to_s", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.javasupport.proxy.JavaProxyReflectionObject.class, "to_s", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("to_s", javaMethod);
        javaMethod = new org.jruby.javasupport.proxy.JavaProxyReflectionObject$INVOKER$i$1$0$op_equal(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "op_equal", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.javasupport.proxy.JavaProxyReflectionObject.class, "op_equal", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("==", javaMethod);
        cls.addMethodAtBootTimeOnly("eql?", javaMethod);
        javaMethod = new org.jruby.javasupport.proxy.JavaProxyReflectionObject$INVOKER$i$0$0$is_java_proxy(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "is_java_proxy", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.javasupport.proxy.JavaProxyReflectionObject.class, "is_java_proxy", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("java_proxy?", javaMethod);
        javaMethod = new org.jruby.javasupport.proxy.JavaProxyReflectionObject$INVOKER$i$0$0$hash(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "hash", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.javasupport.proxy.JavaProxyReflectionObject.class, "hash", org.jruby.RubyFixnum.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("hash", javaMethod);
        javaMethod = new org.jruby.javasupport.proxy.JavaProxyReflectionObject$INVOKER$i$0$0$length(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "length", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.javasupport.proxy.JavaProxyReflectionObject.class, "length", org.jruby.RubyFixnum.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("length", javaMethod);
        javaMethod = new org.jruby.javasupport.proxy.JavaProxyReflectionObject$INVOKER$i$0$0$java_type(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "java_type", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.javasupport.proxy.JavaProxyReflectionObject.class, "java_type", org.jruby.RubyString.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("java_type", javaMethod);
        javaMethod = new org.jruby.javasupport.proxy.JavaProxyReflectionObject$INVOKER$i$2$0$aset(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 2, "aset", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.javasupport.proxy.JavaProxyReflectionObject.class, "aset", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("[]=", javaMethod);
        runtime.addBoundMethod("org.jruby.javasupport.proxy.JavaProxyReflectionObject","aref","[]");
        runtime.addBoundMethod("org.jruby.javasupport.proxy.JavaProxyReflectionObject","java_class","java_class");
        runtime.addBoundMethod("org.jruby.javasupport.proxy.JavaProxyReflectionObject","same","equal?");
        runtime.addBoundMethod("org.jruby.javasupport.proxy.JavaProxyReflectionObject","to_s","to_s");
        runtime.addBoundMethod("org.jruby.javasupport.proxy.JavaProxyReflectionObject","op_equal","==");
        runtime.addBoundMethod("org.jruby.javasupport.proxy.JavaProxyReflectionObject","is_java_proxy","java_proxy?");
        runtime.addBoundMethod("org.jruby.javasupport.proxy.JavaProxyReflectionObject","hash","hash");
        runtime.addBoundMethod("org.jruby.javasupport.proxy.JavaProxyReflectionObject","length","length");
        runtime.addBoundMethod("org.jruby.javasupport.proxy.JavaProxyReflectionObject","java_type","java_type");
        runtime.addBoundMethod("org.jruby.javasupport.proxy.JavaProxyReflectionObject","aset","[]=");
    }
    static {
     }
}
