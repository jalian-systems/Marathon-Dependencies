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
public class org$jruby$ext$ffi$StructLayout$Field$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.ext.ffi.StructLayout$Field$INVOKER$i$0$0$offset(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "offset", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.ffi.StructLayout.Field.class, "offset", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("offset", javaMethod);
        javaMethod = new org.jruby.ext.ffi.StructLayout$Field$INVOKER$i$0$0$size(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "size", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.ffi.StructLayout.Field.class, "size", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("size", javaMethod);
        javaMethod = new org.jruby.ext.ffi.StructLayout$Field$INVOKER$i$0$0$name(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "name", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.ffi.StructLayout.Field.class, "name", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("name", javaMethod);
        javaMethod = new org.jruby.ext.ffi.StructLayout$Field$INVOKER$i$0$0$type(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "type", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.ffi.StructLayout.Field.class, "type", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("type", javaMethod);
        cls.addMethodAtBootTimeOnly("ffi_type", javaMethod);
        javaMethod = new org.jruby.ext.ffi.StructLayout$Field$INVOKER$i$0$0$alignment(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "alignment", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.ffi.StructLayout.Field.class, "alignment", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("alignment", javaMethod);
        javaMethod = new org.jruby.ext.ffi.StructLayout$Field$INVOKER$i$0$1$initialize(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, -1, "initialize", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.ffi.StructLayout.Field.class, "initialize", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject[].class});
        cls.addMethodAtBootTimeOnly("initialize", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.ffi.StructLayout.Field","offset","offset");
        runtime.addBoundMethod("org.jruby.ext.ffi.StructLayout.Field","size","size");
        runtime.addBoundMethod("org.jruby.ext.ffi.StructLayout.Field","name","name");
        runtime.addBoundMethod("org.jruby.ext.ffi.StructLayout.Field","type","type");
        runtime.addBoundMethod("org.jruby.ext.ffi.StructLayout.Field","alignment","alignment");
        runtime.addBoundMethod("org.jruby.ext.ffi.StructLayout.Field","initialize","initialize");
    }
    static {
     }
}
