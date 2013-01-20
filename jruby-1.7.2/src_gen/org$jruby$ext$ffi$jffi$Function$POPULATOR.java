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
public class org$jruby$ext$ffi$jffi$Function$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        RubyClass singletonClass = cls.getSingletonClass();
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.ext.ffi.jffi.Function$INVOKER$s$0$2$newInstance(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "newInstance", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.ffi.jffi.Function.class, "newInstance", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class, org.jruby.runtime.Block.class});
        singletonClass.addMethodAtBootTimeOnly("new", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.ffi.jffi.Function","newInstance","new");
        javaMethod = new org.jruby.ext.ffi.jffi.Function$INVOKER$i$0$0$free(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "free", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.ffi.jffi.Function.class, "free", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("free", javaMethod);
        javaMethod = new org.jruby.ext.ffi.jffi.Function$INVOKER$i$0$0$autorelease_p(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "autorelease_p", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.ffi.jffi.Function.class, "autorelease_p", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("autorelease?", javaMethod);
        cls.addMethodAtBootTimeOnly("autorelease", javaMethod);
        javaMethod = new org.jruby.ext.ffi.jffi.Function$INVOKER$i$1$0$autorelease(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "autorelease", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.ffi.jffi.Function.class, "autorelease", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("autorelease=", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.ffi.jffi.Function","free","free");
        runtime.addBoundMethod("org.jruby.ext.ffi.jffi.Function","autorelease_p","autorelease?");
        runtime.addBoundMethod("org.jruby.ext.ffi.jffi.Function","autorelease","autorelease=");
    }
    static {
     }
}
