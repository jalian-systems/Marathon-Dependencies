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
public class org$jruby$ext$ffi$StructLayout$VariableLengthArrayProxy$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.ext.ffi.StructLayout$VariableLengthArrayProxy$INVOKER$i$1$0$get(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "get", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.ffi.StructLayout.VariableLengthArrayProxy.class, "get", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("[]", javaMethod);
        javaMethod = new org.jruby.ext.ffi.StructLayout$VariableLengthArrayProxy$INVOKER$i$0$0$to_ptr(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "to_ptr", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.ffi.StructLayout.VariableLengthArrayProxy.class, "to_ptr", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("to_ptr", javaMethod);
        javaMethod = new org.jruby.ext.ffi.StructLayout$VariableLengthArrayProxy$INVOKER$i$2$0$put(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 2, "put", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.ffi.StructLayout.VariableLengthArrayProxy.class, "put", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("[]=", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.ffi.StructLayout.VariableLengthArrayProxy","get","[]");
        runtime.addBoundMethod("org.jruby.ext.ffi.StructLayout.VariableLengthArrayProxy","to_ptr","to_ptr");
        runtime.addBoundMethod("org.jruby.ext.ffi.StructLayout.VariableLengthArrayProxy","put","[]=");
    }
    static {
     }
}
