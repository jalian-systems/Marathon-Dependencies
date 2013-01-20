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
public class org$jruby$ext$ffi$Type$Builtin$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.ext.ffi.Type$Builtin$INVOKER$i$1$0$equal_p(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "equal_p", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.ffi.Type.Builtin.class, "equal_p", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("equal?", javaMethod);
        javaMethod = new org.jruby.ext.ffi.Type$Builtin$INVOKER$i$1$0$op_equal(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "op_equal", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.ffi.Type.Builtin.class, "op_equal", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("==", javaMethod);
        javaMethod = new org.jruby.ext.ffi.Type$Builtin$INVOKER$i$0$0$to_sym(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "to_sym", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.ffi.Type.Builtin.class, "to_sym", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("to_sym", javaMethod);
        javaMethod = new org.jruby.ext.ffi.Type$Builtin$INVOKER$i$1$0$eql_p(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "eql_p", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.ffi.Type.Builtin.class, "eql_p", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("eql?", javaMethod);
        javaMethod = new org.jruby.ext.ffi.Type$Builtin$INVOKER$i$0$0$to_s(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "to_s", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.ffi.Type.Builtin.class, "to_s", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("to_s", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.ffi.Type.Builtin","equal_p","equal?");
        runtime.addBoundMethod("org.jruby.ext.ffi.Type.Builtin","op_equal","==");
        runtime.addBoundMethod("org.jruby.ext.ffi.Type.Builtin","to_sym","to_sym");
        runtime.addBoundMethod("org.jruby.ext.ffi.Type.Builtin","eql_p","eql?");
        runtime.addBoundMethod("org.jruby.ext.ffi.Type.Builtin","to_s","to_s");
    }
    static {
     }
}
