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
public class org$jruby$ext$ffi$Buffer$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        RubyClass singletonClass = cls.getSingletonClass();
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.ext.ffi.Buffer$INVOKER$s$newInstance(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "newInstance", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.ffi.Buffer.class, "newInstance", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        singletonClass.addMethodAtBootTimeOnly("new", javaMethod);
        javaMethod = new org.jruby.ext.ffi.Buffer$INVOKER$s$allocateInOut(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "allocateInOut", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.ffi.Buffer.class, "allocateInOut", org.jruby.ext.ffi.Buffer.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        singletonClass.addMethodAtBootTimeOnly("alloc_inout", javaMethod);
        singletonClass.addMethodAtBootTimeOnly("__alloc_inout", javaMethod);
        javaMethod = new org.jruby.ext.ffi.Buffer$INVOKER$s$allocateOutput(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "allocateOutput", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.ffi.Buffer.class, "allocateOutput", org.jruby.ext.ffi.Buffer.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        singletonClass.addMethodAtBootTimeOnly("new_out", javaMethod);
        singletonClass.addMethodAtBootTimeOnly("alloc_out", javaMethod);
        singletonClass.addMethodAtBootTimeOnly("__alloc_out", javaMethod);
        javaMethod = new org.jruby.ext.ffi.Buffer$INVOKER$s$allocateInput(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "allocateInput", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.ffi.Buffer.class, "allocateInput", org.jruby.ext.ffi.Buffer.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        singletonClass.addMethodAtBootTimeOnly("new_in", javaMethod);
        singletonClass.addMethodAtBootTimeOnly("alloc_in", javaMethod);
        singletonClass.addMethodAtBootTimeOnly("__alloc_in", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.ffi.Buffer","newInstance","new");
        runtime.addBoundMethod("org.jruby.ext.ffi.Buffer","allocateInOut","alloc_inout");
        runtime.addBoundMethod("org.jruby.ext.ffi.Buffer","allocateOutput","new_out");
        runtime.addBoundMethod("org.jruby.ext.ffi.Buffer","allocateInput","new_in");
        javaMethod = new org.jruby.ext.ffi.Buffer$INVOKER$i$1$0$initialize_copy(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, 1, "initialize_copy", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.ffi.Buffer.class, "initialize_copy", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("initialize_copy", javaMethod);
        javaMethod = new org.jruby.ext.ffi.Buffer$INVOKER$i$0$0$inspect(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "inspect", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.ffi.Buffer.class, "inspect", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("inspect", javaMethod);
        javaMethod = new org.jruby.ext.ffi.Buffer$INVOKER$i$initialize(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, -1, "initialize", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.ffi.Buffer.class, "initialize", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("initialize", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.ffi.Buffer","initialize_copy","initialize_copy");
        runtime.addBoundMethod("org.jruby.ext.ffi.Buffer","inspect","inspect");
        runtime.addBoundMethod("org.jruby.ext.ffi.Buffer","initialize","initialize");
    }
    static {
     }
}
