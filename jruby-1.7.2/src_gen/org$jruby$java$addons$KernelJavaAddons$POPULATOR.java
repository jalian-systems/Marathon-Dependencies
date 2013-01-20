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
public class org$jruby$java$addons$KernelJavaAddons$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        RubyClass singletonClass = cls.getSingletonClass();
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.java.addons.KernelJavaAddons$INVOKER$s$0$0$java_package(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "java_package", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.java.addons.KernelJavaAddons.class, "java_package", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class});
        cls.addMethodAtBootTimeOnly("java_package", javaMethod);
        javaMethod = new org.jruby.java.addons.KernelJavaAddons$INVOKER$s$0$0$java_name(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "java_name", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.java.addons.KernelJavaAddons.class, "java_name", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class});
        cls.addMethodAtBootTimeOnly("java_name", javaMethod);
        javaMethod = new org.jruby.java.addons.KernelJavaAddons$INVOKER$s$0$3$rbRaise(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, -1, "rbRaise", true, CallConfiguration.FrameFullScopeNone, false, org.jruby.java.addons.KernelJavaAddons.class, "rbRaise", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("raise", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("raise", moduleMethod);
        javaMethod = new org.jruby.java.addons.KernelJavaAddons$INVOKER$s$0$0$java_require(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "java_require", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.java.addons.KernelJavaAddons.class, "java_require", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class});
        cls.addMethodAtBootTimeOnly("java_require", javaMethod);
        javaMethod = new org.jruby.java.addons.KernelJavaAddons$INVOKER$s$0$0$java_signature(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "java_signature", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.java.addons.KernelJavaAddons.class, "java_signature", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class});
        cls.addMethodAtBootTimeOnly("java_signature", javaMethod);
        javaMethod = new org.jruby.java.addons.KernelJavaAddons$INVOKER$s$0$0$java_annotation(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "java_annotation", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.java.addons.KernelJavaAddons.class, "java_annotation", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class});
        cls.addMethodAtBootTimeOnly("java_annotation", javaMethod);
        javaMethod = new org.jruby.java.addons.KernelJavaAddons$INVOKER$s$0$0$java_implements(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "java_implements", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.java.addons.KernelJavaAddons.class, "java_implements", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class});
        cls.addMethodAtBootTimeOnly("java_implements", javaMethod);
        javaMethod = new org.jruby.java.addons.KernelJavaAddons$INVOKER$s$to_java(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "to_java", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.java.addons.KernelJavaAddons.class, "to_java", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("to_java", javaMethod);
        runtime.addBoundMethod("org.jruby.java.addons.KernelJavaAddons","java_package","java_package");
        runtime.addBoundMethod("org.jruby.java.addons.KernelJavaAddons","java_name","java_name");
        runtime.addBoundMethod("org.jruby.java.addons.KernelJavaAddons","java_require","java_require");
        runtime.addBoundMethod("org.jruby.java.addons.KernelJavaAddons","java_signature","java_signature");
        runtime.addBoundMethod("org.jruby.java.addons.KernelJavaAddons","java_annotation","java_annotation");
        runtime.addBoundMethod("org.jruby.java.addons.KernelJavaAddons","java_implements","java_implements");
        runtime.addBoundMethod("org.jruby.java.addons.KernelJavaAddons","to_java","to_java");
    }
    static {
        ASTInspector.addFrameAwareMethods("raise");
     }
}
