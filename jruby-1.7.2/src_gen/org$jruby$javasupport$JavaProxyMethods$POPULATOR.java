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
public class org$jruby$javasupport$JavaProxyMethods$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.javasupport.JavaProxyMethods$INVOKER$s$1$0$java_object_set(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "java_object_set", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.javasupport.JavaProxyMethods.class, "java_object_set", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("java_object=", javaMethod);
        javaMethod = new org.jruby.javasupport.JavaProxyMethods$INVOKER$s$0$0$java_class(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "java_class", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.javasupport.JavaProxyMethods.class, "java_class", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("java_class", javaMethod);
        javaMethod = new org.jruby.javasupport.JavaProxyMethods$INVOKER$s$0$0$to_s(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "to_s", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.javasupport.JavaProxyMethods.class, "to_s", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("to_s", javaMethod);
        javaMethod = new org.jruby.javasupport.JavaProxyMethods$INVOKER$s$0$0$rbSynchronized(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "rbSynchronized", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.javasupport.JavaProxyMethods.class, "rbSynchronized", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("synchronized", javaMethod);
        javaMethod = new org.jruby.javasupport.JavaProxyMethods$INVOKER$s$1$0$op_equal(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "op_equal", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.javasupport.JavaProxyMethods.class, "op_equal", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("==", javaMethod);
        javaMethod = new org.jruby.javasupport.JavaProxyMethods$INVOKER$s$0$0$hash(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "hash", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.javasupport.JavaProxyMethods.class, "hash", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("hash", javaMethod);
        javaMethod = new org.jruby.javasupport.JavaProxyMethods$INVOKER$s$0$0$to_java_object(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "to_java_object", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.javasupport.JavaProxyMethods.class, "to_java_object", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("to_java_object", javaMethod);
        javaMethod = new org.jruby.javasupport.JavaProxyMethods$INVOKER$s$0$0$inspect(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "inspect", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.javasupport.JavaProxyMethods.class, "inspect", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("inspect", javaMethod);
        javaMethod = new org.jruby.javasupport.JavaProxyMethods$INVOKER$s$1$0$op_eql(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "op_eql", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.javasupport.JavaProxyMethods.class, "op_eql", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("eql?", javaMethod);
        javaMethod = new org.jruby.javasupport.JavaProxyMethods$INVOKER$s$0$0$java_object(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "java_object", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.javasupport.JavaProxyMethods.class, "java_object", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("java_object", javaMethod);
        runtime.addBoundMethod("org.jruby.javasupport.JavaProxyMethods","java_object_set","java_object=");
        runtime.addBoundMethod("org.jruby.javasupport.JavaProxyMethods","java_class","java_class");
        runtime.addBoundMethod("org.jruby.javasupport.JavaProxyMethods","to_s","to_s");
        runtime.addBoundMethod("org.jruby.javasupport.JavaProxyMethods","rbSynchronized","synchronized");
        runtime.addBoundMethod("org.jruby.javasupport.JavaProxyMethods","op_equal","==");
        runtime.addBoundMethod("org.jruby.javasupport.JavaProxyMethods","hash","hash");
        runtime.addBoundMethod("org.jruby.javasupport.JavaProxyMethods","to_java_object","to_java_object");
        runtime.addBoundMethod("org.jruby.javasupport.JavaProxyMethods","inspect","inspect");
        runtime.addBoundMethod("org.jruby.javasupport.JavaProxyMethods","op_eql","eql?");
        runtime.addBoundMethod("org.jruby.javasupport.JavaProxyMethods","java_object","java_object");
    }
    static {
     }
}
