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
public class org$jruby$ext$ffi$Pointer$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.ext.ffi.Pointer$INVOKER$i$1$0$initialize_copy(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, 1, "initialize_copy", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.ffi.Pointer.class, "initialize_copy", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("initialize_copy", javaMethod);
        javaMethod = new org.jruby.ext.ffi.Pointer$INVOKER$i$1$0$op_equal(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "op_equal", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.ffi.Pointer.class, "op_equal", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("==", javaMethod);
        javaMethod = new org.jruby.ext.ffi.Pointer$INVOKER$i$0$0$address(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "address", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.ffi.Pointer.class, "address", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("address", javaMethod);
        cls.addMethodAtBootTimeOnly("to_i", javaMethod);
        javaMethod = new org.jruby.ext.ffi.Pointer$INVOKER$i$0$0$null_p(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "null_p", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.ffi.Pointer.class, "null_p", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("null?", javaMethod);
        javaMethod = new org.jruby.ext.ffi.Pointer$INVOKER$i$0$1$to_s(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "to_s", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.ffi.Pointer.class, "to_s", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject[].class});
        cls.addMethodAtBootTimeOnly("to_s", javaMethod);
        cls.addMethodAtBootTimeOnly("inspect", javaMethod);
        javaMethod = new org.jruby.ext.ffi.Pointer$INVOKER$i$initialize(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, -1, "initialize", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.ffi.Pointer.class, "initialize", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("initialize", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.ffi.Pointer","initialize_copy","initialize_copy");
        runtime.addBoundMethod("org.jruby.ext.ffi.Pointer","op_equal","==");
        runtime.addBoundMethod("org.jruby.ext.ffi.Pointer","address","address");
        runtime.addBoundMethod("org.jruby.ext.ffi.Pointer","null_p","null?");
        runtime.addBoundMethod("org.jruby.ext.ffi.Pointer","to_s","to_s");
        runtime.addBoundMethod("org.jruby.ext.ffi.Pointer","initialize","initialize");
    }
    static {
     }
}
