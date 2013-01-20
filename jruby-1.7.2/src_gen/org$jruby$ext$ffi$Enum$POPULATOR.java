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
public class org$jruby$ext$ffi$Enum$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.ext.ffi.Enum$INVOKER$i$0$0$native_type(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "native_type", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.ffi.Enum.class, "native_type", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("native_type", javaMethod);
        javaMethod = new org.jruby.ext.ffi.Enum$INVOKER$i$1$0$find(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "find", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.ffi.Enum.class, "find", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("[]", javaMethod);
        cls.addMethodAtBootTimeOnly("find", javaMethod);
        javaMethod = new org.jruby.ext.ffi.Enum$INVOKER$i$0$0$symbols(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "symbols", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.ffi.Enum.class, "symbols", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("symbols", javaMethod);
        javaMethod = new org.jruby.ext.ffi.Enum$INVOKER$i$2$0$to_native(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 2, "to_native", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.ffi.Enum.class, "to_native", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("to_native", javaMethod);
        javaMethod = new org.jruby.ext.ffi.Enum$INVOKER$i$0$0$tag(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "tag", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.ffi.Enum.class, "tag", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("tag", javaMethod);
        javaMethod = new org.jruby.ext.ffi.Enum$INVOKER$i$2$0$from_native(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 2, "from_native", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.ffi.Enum.class, "from_native", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("from_native", javaMethod);
        javaMethod = new org.jruby.ext.ffi.Enum$INVOKER$i$0$0$symbol_map(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "symbol_map", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.ffi.Enum.class, "symbol_map", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("symbol_map", javaMethod);
        cls.addMethodAtBootTimeOnly("to_h", javaMethod);
        cls.addMethodAtBootTimeOnly("to_hash", javaMethod);
        javaMethod = new org.jruby.ext.ffi.Enum$INVOKER$i$0$0$reference_required_p(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "reference_required_p", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.ffi.Enum.class, "reference_required_p", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("reference_required?", javaMethod);
        javaMethod = new org.jruby.ext.ffi.Enum$INVOKER$i$initialize(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "initialize", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.ffi.Enum.class, "initialize", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("initialize", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.ffi.Enum","native_type","native_type");
        runtime.addBoundMethod("org.jruby.ext.ffi.Enum","find","[]");
        runtime.addBoundMethod("org.jruby.ext.ffi.Enum","symbols","symbols");
        runtime.addBoundMethod("org.jruby.ext.ffi.Enum","to_native","to_native");
        runtime.addBoundMethod("org.jruby.ext.ffi.Enum","tag","tag");
        runtime.addBoundMethod("org.jruby.ext.ffi.Enum","from_native","from_native");
        runtime.addBoundMethod("org.jruby.ext.ffi.Enum","symbol_map","symbol_map");
        runtime.addBoundMethod("org.jruby.ext.ffi.Enum","reference_required_p","reference_required?");
        runtime.addBoundMethod("org.jruby.ext.ffi.Enum","initialize","initialize");
    }
    static {
     }
}
