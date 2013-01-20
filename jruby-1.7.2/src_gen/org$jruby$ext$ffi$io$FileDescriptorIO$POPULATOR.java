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
public class org$jruby$ext$ffi$io$FileDescriptorIO$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        RubyClass singletonClass = cls.getSingletonClass();
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.ext.ffi.io.FileDescriptorIO$INVOKER$s$1$0$wrap(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "wrap", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.ffi.io.FileDescriptorIO.class, "wrap", org.jruby.RubyIO.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        singletonClass.addMethodAtBootTimeOnly("wrap", javaMethod);
        javaMethod = new org.jruby.ext.ffi.io.FileDescriptorIO$INVOKER$s$1$0$newInstance(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "newInstance", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.ffi.io.FileDescriptorIO.class, "newInstance", org.jruby.ext.ffi.io.FileDescriptorIO.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        singletonClass.addMethodAtBootTimeOnly("new", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.ffi.io.FileDescriptorIO","wrap","wrap");
        runtime.addBoundMethod("org.jruby.ext.ffi.io.FileDescriptorIO","newInstance","new");
    }
    static {
     }
}
