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
public class org$jruby$ext$ffi$jffi$DynamicLibrary$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        RubyClass singletonClass = cls.getSingletonClass();
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.ext.ffi.jffi.DynamicLibrary$INVOKER$s$2$0$open(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, 2, "open", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.ffi.jffi.DynamicLibrary.class, "open", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        singletonClass.addMethodAtBootTimeOnly("open", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.ffi.jffi.DynamicLibrary","open","open");
        javaMethod = new org.jruby.ext.ffi.jffi.DynamicLibrary$INVOKER$i$1$0$findVariable(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "findVariable", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.ffi.jffi.DynamicLibrary.class, "findVariable", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("find_variable", javaMethod);
        cls.addMethodAtBootTimeOnly("find_symbol", javaMethod);
        javaMethod = new org.jruby.ext.ffi.jffi.DynamicLibrary$INVOKER$i$0$0$name(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "name", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.ffi.jffi.DynamicLibrary.class, "name", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("name", javaMethod);
        javaMethod = new org.jruby.ext.ffi.jffi.DynamicLibrary$INVOKER$i$1$0$findFunction(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "findFunction", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.ffi.jffi.DynamicLibrary.class, "findFunction", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("find_function", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.ffi.jffi.DynamicLibrary","findVariable","find_variable");
        runtime.addBoundMethod("org.jruby.ext.ffi.jffi.DynamicLibrary","name","name");
        runtime.addBoundMethod("org.jruby.ext.ffi.jffi.DynamicLibrary","findFunction","find_function");
    }
    static {
     }
}
