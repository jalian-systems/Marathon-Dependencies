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
public class org$jruby$ext$ffi$Type$Array$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        RubyClass singletonClass = cls.getSingletonClass();
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.ext.ffi.Type$Array$INVOKER$s$2$0$newInstance(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, 2, "newInstance", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.ffi.Type.Array.class, "newInstance", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        singletonClass.addMethodAtBootTimeOnly("new", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.ffi.Type.Array","newInstance","new");
        javaMethod = new org.jruby.ext.ffi.Type$Array$INVOKER$i$0$0$elem_type(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "elem_type", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.ffi.Type.Array.class, "elem_type", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("elem_type", javaMethod);
        javaMethod = new org.jruby.ext.ffi.Type$Array$INVOKER$i$0$0$length(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "length", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.ffi.Type.Array.class, "length", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("length", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.ffi.Type.Array","elem_type","elem_type");
        runtime.addBoundMethod("org.jruby.ext.ffi.Type.Array","length","length");
    }
    static {
     }
}
