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
public class org$jruby$javasupport$Java$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        RubyClass singletonClass = cls.getSingletonClass();
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.javasupport.Java$INVOKER$s$1$0$java_to_ruby(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, 1, "java_to_ruby", true, CallConfiguration.FrameFullScopeNone, false, org.jruby.javasupport.Java.class, "java_to_ruby", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("java_to_ruby", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("java_to_ruby", moduleMethod);
        javaMethod = new org.jruby.javasupport.Java$INVOKER$s$1$0$ruby_to_java(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, 1, "ruby_to_java", true, CallConfiguration.FrameFullScopeNone, false, org.jruby.javasupport.Java.class, "ruby_to_java", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("ruby_to_java", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("ruby_to_java", moduleMethod);
        javaMethod = new org.jruby.javasupport.Java$INVOKER$s$2$0$new_proxy_instance2(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, 2, "new_proxy_instance2", true, CallConfiguration.FrameFullScopeNone, false, org.jruby.javasupport.Java.class, "new_proxy_instance2", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("new_proxy_instance2", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("new_proxy_instance2", moduleMethod);
        javaMethod = new org.jruby.javasupport.Java$INVOKER$s$1$0$java_to_primitive(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, 1, "java_to_primitive", true, CallConfiguration.FrameFullScopeNone, false, org.jruby.javasupport.Java.class, "java_to_primitive", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("java_to_primitive", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("java_to_primitive", moduleMethod);
        runtime.addBoundMethod("org.jruby.javasupport.Java","java_to_ruby","java_to_ruby");
        runtime.addBoundMethod("org.jruby.javasupport.Java","ruby_to_java","ruby_to_java");
        runtime.addBoundMethod("org.jruby.javasupport.Java","new_proxy_instance2","new_proxy_instance2");
        runtime.addBoundMethod("org.jruby.javasupport.Java","java_to_primitive","java_to_primitive");
    }
    static {
     }
}
