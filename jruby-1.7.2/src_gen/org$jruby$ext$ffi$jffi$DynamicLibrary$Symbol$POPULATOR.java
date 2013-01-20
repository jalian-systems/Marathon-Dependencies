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
public class org$jruby$ext$ffi$jffi$DynamicLibrary$Symbol$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.ext.ffi.jffi.DynamicLibrary$Symbol$INVOKER$i$0$0$library(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "library", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.ffi.jffi.DynamicLibrary.Symbol.class, "library", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("library", javaMethod);
        javaMethod = new org.jruby.ext.ffi.jffi.DynamicLibrary$Symbol$INVOKER$i$0$0$inspect(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "inspect", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.ffi.jffi.DynamicLibrary.Symbol.class, "inspect", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("inspect", javaMethod);
        javaMethod = new org.jruby.ext.ffi.jffi.DynamicLibrary$Symbol$INVOKER$i$0$1$to_s(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "to_s", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.ffi.jffi.DynamicLibrary.Symbol.class, "to_s", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject[].class});
        cls.addMethodAtBootTimeOnly("to_s", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.ffi.jffi.DynamicLibrary.Symbol","library","library");
        runtime.addBoundMethod("org.jruby.ext.ffi.jffi.DynamicLibrary.Symbol","inspect","inspect");
        runtime.addBoundMethod("org.jruby.ext.ffi.jffi.DynamicLibrary.Symbol","to_s","to_s");
    }
    static {
     }
}
