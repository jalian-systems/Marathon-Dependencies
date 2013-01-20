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
public class org$jruby$ext$ffi$CallbackInfo$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        RubyClass singletonClass = cls.getSingletonClass();
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.ext.ffi.CallbackInfo$INVOKER$s$0$1$newCallbackInfo(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "newCallbackInfo", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.ffi.CallbackInfo.class, "newCallbackInfo", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class});
        singletonClass.addMethodAtBootTimeOnly("new", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.ffi.CallbackInfo","newCallbackInfo","new");
        javaMethod = new org.jruby.ext.ffi.CallbackInfo$INVOKER$i$0$0$result_type(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "result_type", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.ffi.CallbackInfo.class, "result_type", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("result_type", javaMethod);
        javaMethod = new org.jruby.ext.ffi.CallbackInfo$INVOKER$i$0$0$param_types(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "param_types", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.ffi.CallbackInfo.class, "param_types", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("param_types", javaMethod);
        javaMethod = new org.jruby.ext.ffi.CallbackInfo$INVOKER$i$0$0$to_s(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "to_s", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.ffi.CallbackInfo.class, "to_s", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("to_s", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.ffi.CallbackInfo","result_type","result_type");
        runtime.addBoundMethod("org.jruby.ext.ffi.CallbackInfo","param_types","param_types");
        runtime.addBoundMethod("org.jruby.ext.ffi.CallbackInfo","to_s","to_s");
    }
    static {
     }
}
