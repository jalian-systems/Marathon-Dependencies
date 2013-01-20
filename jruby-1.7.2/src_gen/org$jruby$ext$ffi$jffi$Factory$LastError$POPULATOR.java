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
public class org$jruby$ext$ffi$jffi$Factory$LastError$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        RubyClass singletonClass = cls.getSingletonClass();
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.ext.ffi.jffi.Factory$LastError$INVOKER$s$0$0$error(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "error", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.ffi.jffi.Factory.LastError.class, "error", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("error", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("error", moduleMethod);
        javaMethod = new org.jruby.ext.ffi.jffi.Factory$LastError$INVOKER$s$1$0$error_set(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "error_set", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.ffi.jffi.Factory.LastError.class, "error_set", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("error=", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("error=", moduleMethod);
        runtime.addBoundMethod("org.jruby.ext.ffi.jffi.Factory.LastError","error","error");
        runtime.addBoundMethod("org.jruby.ext.ffi.jffi.Factory.LastError","error_set","error=");
    }
    static {
     }
}
