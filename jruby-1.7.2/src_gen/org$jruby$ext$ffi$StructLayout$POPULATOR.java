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
public class org$jruby$ext$ffi$StructLayout$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        RubyClass singletonClass = cls.getSingletonClass();
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.ext.ffi.StructLayout$INVOKER$s$0$1$newStructLayout(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "newStructLayout", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.ffi.StructLayout.class, "newStructLayout", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class});
        singletonClass.addMethodAtBootTimeOnly("new", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.ffi.StructLayout","newStructLayout","new");
        javaMethod = new org.jruby.ext.ffi.StructLayout$INVOKER$i$1$0$aref(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "aref", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.ffi.StructLayout.class, "aref", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("[]", javaMethod);
        javaMethod = new org.jruby.ext.ffi.StructLayout$INVOKER$i$3$0$put(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 3, "put", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.ffi.StructLayout.class, "put", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("put", javaMethod);
        javaMethod = new org.jruby.ext.ffi.StructLayout$INVOKER$i$2$0$get(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 2, "get", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.ffi.StructLayout.class, "get", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("get", javaMethod);
        javaMethod = new org.jruby.ext.ffi.StructLayout$INVOKER$i$0$0$offsets(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "offsets", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.ffi.StructLayout.class, "offsets", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("offsets", javaMethod);
        javaMethod = new org.jruby.ext.ffi.StructLayout$INVOKER$i$1$0$offset_of(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "offset_of", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.ffi.StructLayout.class, "offset_of", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("offset_of", javaMethod);
        javaMethod = new org.jruby.ext.ffi.StructLayout$INVOKER$i$0$0$members(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "members", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.ffi.StructLayout.class, "members", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("members", javaMethod);
        javaMethod = new org.jruby.ext.ffi.StructLayout$INVOKER$i$0$0$fields(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "fields", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.ffi.StructLayout.class, "fields", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("fields", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.ffi.StructLayout","aref","[]");
        runtime.addBoundMethod("org.jruby.ext.ffi.StructLayout","put","put");
        runtime.addBoundMethod("org.jruby.ext.ffi.StructLayout","get","get");
        runtime.addBoundMethod("org.jruby.ext.ffi.StructLayout","offsets","offsets");
        runtime.addBoundMethod("org.jruby.ext.ffi.StructLayout","offset_of","offset_of");
        runtime.addBoundMethod("org.jruby.ext.ffi.StructLayout","members","members");
        runtime.addBoundMethod("org.jruby.ext.ffi.StructLayout","fields","fields");
    }
    static {
     }
}
