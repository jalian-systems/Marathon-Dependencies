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
public class org$jruby$ext$ffi$DataConverter$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        RubyClass singletonClass = cls.getSingletonClass();
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.ext.ffi.DataConverter$INVOKER$s$0$1$native_type(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "native_type", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.ffi.DataConverter.class, "native_type", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class});
        cls.addMethodAtBootTimeOnly("native_type", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("native_type", moduleMethod);
        javaMethod = new org.jruby.ext.ffi.DataConverter$INVOKER$s$2$0$to_native(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 2, "to_native", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.ffi.DataConverter.class, "to_native", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("to_native", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("to_native", moduleMethod);
        javaMethod = new org.jruby.ext.ffi.DataConverter$INVOKER$s$0$1$reference_required(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "reference_required", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.ffi.DataConverter.class, "reference_required", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class});
        cls.addMethodAtBootTimeOnly("reference_required", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("reference_required", moduleMethod);
        javaMethod = new org.jruby.ext.ffi.DataConverter$INVOKER$s$2$0$from_native(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 2, "from_native", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.ffi.DataConverter.class, "from_native", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("from_native", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("from_native", moduleMethod);
        javaMethod = new org.jruby.ext.ffi.DataConverter$INVOKER$s$0$0$reference_required_p(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "reference_required_p", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.ffi.DataConverter.class, "reference_required_p", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("reference_required?", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("reference_required?", moduleMethod);
        runtime.addBoundMethod("org.jruby.ext.ffi.DataConverter","native_type","native_type");
        runtime.addBoundMethod("org.jruby.ext.ffi.DataConverter","to_native","to_native");
        runtime.addBoundMethod("org.jruby.ext.ffi.DataConverter","reference_required","reference_required");
        runtime.addBoundMethod("org.jruby.ext.ffi.DataConverter","from_native","from_native");
        runtime.addBoundMethod("org.jruby.ext.ffi.DataConverter","reference_required_p","reference_required?");
    }
    static {
     }
}
