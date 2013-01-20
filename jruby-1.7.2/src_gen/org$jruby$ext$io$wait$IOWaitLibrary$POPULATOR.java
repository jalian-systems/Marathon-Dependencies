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
public class org$jruby$ext$io$wait$IOWaitLibrary$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.ext.io.wait.IOWaitLibrary$INVOKER$s$0$0$io_wait(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "io_wait", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.io.wait.IOWaitLibrary.class, "io_wait", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("io_wait", javaMethod);
        javaMethod = new org.jruby.ext.io.wait.IOWaitLibrary$INVOKER$s$0$0$ready(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "ready", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.io.wait.IOWaitLibrary.class, "ready", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("ready?", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.io.wait.IOWaitLibrary","io_wait","io_wait");
        runtime.addBoundMethod("org.jruby.ext.io.wait.IOWaitLibrary","ready","ready?");
    }
    static {
     }
}
