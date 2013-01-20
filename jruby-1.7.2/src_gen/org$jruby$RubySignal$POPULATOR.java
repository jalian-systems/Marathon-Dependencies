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
public class org$jruby$RubySignal$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        RubyClass singletonClass = cls.getSingletonClass();
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.RubySignal$INVOKER$s$2$0$__jtrap_kernel(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 2, "__jtrap_kernel", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubySignal.class, "__jtrap_kernel", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("__jtrap_kernel", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("__jtrap_kernel", moduleMethod);
        javaMethod = new org.jruby.RubySignal$INVOKER$s$1$0$__jtrap_osdefault_kernel(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "__jtrap_osdefault_kernel", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubySignal.class, "__jtrap_osdefault_kernel", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("__jtrap_osdefault_kernel", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("__jtrap_osdefault_kernel", moduleMethod);
        javaMethod = new org.jruby.RubySignal$INVOKER$s$1$0$__jtrap_platform_kernel(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "__jtrap_platform_kernel", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubySignal.class, "__jtrap_platform_kernel", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("__jtrap_platform_kernel", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("__jtrap_platform_kernel", moduleMethod);
        javaMethod = new org.jruby.RubySignal$INVOKER$s$0$0$list(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "list", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubySignal.class, "list", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("list", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("list", moduleMethod);
        javaMethod = new org.jruby.RubySignal$INVOKER$s$1$0$__jtrap_restore_kernel(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "__jtrap_restore_kernel", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubySignal.class, "__jtrap_restore_kernel", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("__jtrap_ignore_kernel", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("__jtrap_ignore_kernel", moduleMethod);
        runtime.addBoundMethod("org.jruby.RubySignal","__jtrap_kernel","__jtrap_kernel");
        runtime.addBoundMethod("org.jruby.RubySignal","__jtrap_osdefault_kernel","__jtrap_osdefault_kernel");
        runtime.addBoundMethod("org.jruby.RubySignal","__jtrap_platform_kernel","__jtrap_platform_kernel");
        runtime.addBoundMethod("org.jruby.RubySignal","list","list");
        runtime.addBoundMethod("org.jruby.RubySignal","__jtrap_restore_kernel","__jtrap_ignore_kernel");
    }
    static {
     }
}
