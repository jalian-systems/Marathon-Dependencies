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
public class org$jruby$ext$ffi$StructByReference$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        RubyClass singletonClass = cls.getSingletonClass();
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.ext.ffi.StructByReference$INVOKER$s$1$0$newStructByReference(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "newStructByReference", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.ffi.StructByReference.class, "newStructByReference", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        singletonClass.addMethodAtBootTimeOnly("new", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.ffi.StructByReference","newStructByReference","new");
        javaMethod = new org.jruby.ext.ffi.StructByReference$INVOKER$i$0$0$struct_class(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "struct_class", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.ffi.StructByReference.class, "struct_class", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("struct_class", javaMethod);
        javaMethod = new org.jruby.ext.ffi.StructByReference$INVOKER$i$0$0$native_type(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "native_type", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.ffi.StructByReference.class, "native_type", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("native_type", javaMethod);
        javaMethod = new org.jruby.ext.ffi.StructByReference$INVOKER$i$2$0$to_native(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 2, "to_native", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.ffi.StructByReference.class, "to_native", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("to_native", javaMethod);
        javaMethod = new org.jruby.ext.ffi.StructByReference$INVOKER$i$0$0$layout(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "layout", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.ffi.StructByReference.class, "layout", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("layout", javaMethod);
        javaMethod = new org.jruby.ext.ffi.StructByReference$INVOKER$i$2$0$from_native(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 2, "from_native", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.ffi.StructByReference.class, "from_native", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("from_native", javaMethod);
        javaMethod = new org.jruby.ext.ffi.StructByReference$INVOKER$i$0$0$reference_required_p(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "reference_required_p", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.ffi.StructByReference.class, "reference_required_p", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("reference_required?", javaMethod);
        javaMethod = new org.jruby.ext.ffi.StructByReference$INVOKER$i$0$0$to_s(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "to_s", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.ffi.StructByReference.class, "to_s", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("to_s", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.ffi.StructByReference","struct_class","struct_class");
        runtime.addBoundMethod("org.jruby.ext.ffi.StructByReference","native_type","native_type");
        runtime.addBoundMethod("org.jruby.ext.ffi.StructByReference","to_native","to_native");
        runtime.addBoundMethod("org.jruby.ext.ffi.StructByReference","layout","layout");
        runtime.addBoundMethod("org.jruby.ext.ffi.StructByReference","from_native","from_native");
        runtime.addBoundMethod("org.jruby.ext.ffi.StructByReference","reference_required_p","reference_required?");
        runtime.addBoundMethod("org.jruby.ext.ffi.StructByReference","to_s","to_s");
    }
    static {
     }
}
