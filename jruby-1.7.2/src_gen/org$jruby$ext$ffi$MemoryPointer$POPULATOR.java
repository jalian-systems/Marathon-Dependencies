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
public class org$jruby$ext$ffi$MemoryPointer$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        RubyClass singletonClass = cls.getSingletonClass();
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.ext.ffi.MemoryPointer$INVOKER$s$newInstance(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "newInstance", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.ffi.MemoryPointer.class, "newInstance", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        singletonClass.addMethodAtBootTimeOnly("new", javaMethod);
        javaMethod = new org.jruby.ext.ffi.MemoryPointer$INVOKER$s$1$0$from_string(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "from_string", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.ffi.MemoryPointer.class, "from_string", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        singletonClass.addMethodAtBootTimeOnly("from_string", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.ffi.MemoryPointer","newInstance","new");
        runtime.addBoundMethod("org.jruby.ext.ffi.MemoryPointer","from_string","from_string");
        javaMethod = new org.jruby.ext.ffi.MemoryPointer$INVOKER$i$0$0$free(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "free", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.ffi.MemoryPointer.class, "free", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("free", javaMethod);
        javaMethod = new org.jruby.ext.ffi.MemoryPointer$INVOKER$i$1$0$op_equal(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "op_equal", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.ffi.MemoryPointer.class, "op_equal", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("==", javaMethod);
        javaMethod = new org.jruby.ext.ffi.MemoryPointer$INVOKER$i$0$0$autorelease_p(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "autorelease_p", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.ffi.MemoryPointer.class, "autorelease_p", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("autorelease?", javaMethod);
        javaMethod = new org.jruby.ext.ffi.MemoryPointer$INVOKER$i$1$0$autorelease(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "autorelease", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.ffi.MemoryPointer.class, "autorelease", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("autorelease=", javaMethod);
        javaMethod = new org.jruby.ext.ffi.MemoryPointer$INVOKER$i$initialize(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, -1, "initialize", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.ffi.MemoryPointer.class, "initialize", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("initialize", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.ffi.MemoryPointer","free","free");
        runtime.addBoundMethod("org.jruby.ext.ffi.MemoryPointer","op_equal","==");
        runtime.addBoundMethod("org.jruby.ext.ffi.MemoryPointer","autorelease_p","autorelease?");
        runtime.addBoundMethod("org.jruby.ext.ffi.MemoryPointer","autorelease","autorelease=");
        runtime.addBoundMethod("org.jruby.ext.ffi.MemoryPointer","initialize","initialize");
    }
    static {
     }
}
