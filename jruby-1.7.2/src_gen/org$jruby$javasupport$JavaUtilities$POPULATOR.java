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
public class org$jruby$javasupport$JavaUtilities$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        RubyClass singletonClass = cls.getSingletonClass();
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.javasupport.JavaUtilities$INVOKER$s$1$0$get_java_class(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, 1, "get_java_class", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.javasupport.JavaUtilities.class, "get_java_class", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("get_java_class", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("get_java_class", moduleMethod);
        javaMethod = new org.jruby.javasupport.JavaUtilities$INVOKER$s$1$0$get_proxy_class(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, 1, "get_proxy_class", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.javasupport.JavaUtilities.class, "get_proxy_class", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("get_proxy_class", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("get_proxy_class", moduleMethod);
        javaMethod = new org.jruby.javasupport.JavaUtilities$INVOKER$s$1$0$get_top_level_proxy_or_package(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, 1, "get_top_level_proxy_or_package", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.javasupport.JavaUtilities.class, "get_top_level_proxy_or_package", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("get_top_level_proxy_or_package", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("get_top_level_proxy_or_package", moduleMethod);
        javaMethod = new org.jruby.javasupport.JavaUtilities$INVOKER$s$1$0$get_interface_module(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, 1, "get_interface_module", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.javasupport.JavaUtilities.class, "get_interface_module", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("get_interface_module", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("get_interface_module", moduleMethod);
        javaMethod = new org.jruby.javasupport.JavaUtilities$INVOKER$s$1$0$get_package_module(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, 1, "get_package_module", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.javasupport.JavaUtilities.class, "get_package_module", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("get_package_module", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("get_package_module", moduleMethod);
        javaMethod = new org.jruby.javasupport.JavaUtilities$INVOKER$s$2$0$get_proxy_or_package_under_package(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, 2, "get_proxy_or_package_under_package", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.javasupport.JavaUtilities.class, "get_proxy_or_package_under_package", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("get_proxy_or_package_under_package", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("get_proxy_or_package_under_package", moduleMethod);
        javaMethod = new org.jruby.javasupport.JavaUtilities$INVOKER$s$2$0$set_java_object(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, 2, "set_java_object", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.javasupport.JavaUtilities.class, "set_java_object", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("set_java_object", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("set_java_object", moduleMethod);
        javaMethod = new org.jruby.javasupport.JavaUtilities$INVOKER$s$1$0$get_package_module_dot_format(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, 1, "get_package_module_dot_format", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.javasupport.JavaUtilities.class, "get_package_module_dot_format", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("get_package_module_dot_format", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("get_package_module_dot_format", moduleMethod);
        javaMethod = new org.jruby.javasupport.JavaUtilities$INVOKER$s$3$0$create_proxy_class(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, 3, "create_proxy_class", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.javasupport.JavaUtilities.class, "create_proxy_class", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("create_proxy_class", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("create_proxy_class", moduleMethod);
        runtime.addBoundMethod("org.jruby.javasupport.JavaUtilities","get_java_class","get_java_class");
        runtime.addBoundMethod("org.jruby.javasupport.JavaUtilities","get_proxy_class","get_proxy_class");
        runtime.addBoundMethod("org.jruby.javasupport.JavaUtilities","get_top_level_proxy_or_package","get_top_level_proxy_or_package");
        runtime.addBoundMethod("org.jruby.javasupport.JavaUtilities","get_interface_module","get_interface_module");
        runtime.addBoundMethod("org.jruby.javasupport.JavaUtilities","get_package_module","get_package_module");
        runtime.addBoundMethod("org.jruby.javasupport.JavaUtilities","get_proxy_or_package_under_package","get_proxy_or_package_under_package");
        runtime.addBoundMethod("org.jruby.javasupport.JavaUtilities","set_java_object","set_java_object");
        runtime.addBoundMethod("org.jruby.javasupport.JavaUtilities","get_package_module_dot_format","get_package_module_dot_format");
        runtime.addBoundMethod("org.jruby.javasupport.JavaUtilities","create_proxy_class","create_proxy_class");
    }
    static {
     }
}
