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
public class org$jruby$ext$ffi$jffi$VariadicInvoker$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        RubyClass singletonClass = cls.getSingletonClass();
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.ext.ffi.jffi.VariadicInvoker$INVOKER$s$0$1$newInvoker(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "newInvoker", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.ffi.jffi.VariadicInvoker.class, "newInvoker", org.jruby.ext.ffi.jffi.VariadicInvoker.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class});
        singletonClass.addMethodAtBootTimeOnly("__new", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.ffi.jffi.VariadicInvoker","newInvoker","__new");
        javaMethod = new org.jruby.ext.ffi.jffi.VariadicInvoker$INVOKER$i$2$0$invoke(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 2, "invoke", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.ffi.jffi.VariadicInvoker.class, "invoke", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("invoke", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.ffi.jffi.VariadicInvoker","invoke","invoke");
    }
    static {
     }
}
