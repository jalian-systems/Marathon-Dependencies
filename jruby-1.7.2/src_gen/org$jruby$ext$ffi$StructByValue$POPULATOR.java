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
public class org$jruby$ext$ffi$StructByValue$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        RubyClass singletonClass = cls.getSingletonClass();
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.ext.ffi.StructByValue$INVOKER$s$1$0$newStructByValue(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "newStructByValue", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.ffi.StructByValue.class, "newStructByValue", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        singletonClass.addMethodAtBootTimeOnly("new", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.ffi.StructByValue","newStructByValue","new");
        javaMethod = new org.jruby.ext.ffi.StructByValue$INVOKER$i$0$0$struct_class(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "struct_class", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.ffi.StructByValue.class, "struct_class", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("struct_class", javaMethod);
        javaMethod = new org.jruby.ext.ffi.StructByValue$INVOKER$i$0$0$layout(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "layout", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.ffi.StructByValue.class, "layout", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("layout", javaMethod);
        javaMethod = new org.jruby.ext.ffi.StructByValue$INVOKER$i$0$0$to_s(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "to_s", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.ffi.StructByValue.class, "to_s", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("to_s", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.ffi.StructByValue","struct_class","struct_class");
        runtime.addBoundMethod("org.jruby.ext.ffi.StructByValue","layout","layout");
        runtime.addBoundMethod("org.jruby.ext.ffi.StructByValue","to_s","to_s");
    }
    static {
     }
}
