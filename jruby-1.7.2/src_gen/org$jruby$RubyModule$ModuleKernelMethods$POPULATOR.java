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
public class org$jruby$RubyModule$ModuleKernelMethods$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.RubyModule$ModuleKernelMethods$INVOKER$s$1$0$autoload_p(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "autoload_p", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyModule.ModuleKernelMethods.class, "autoload_p", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("autoload?", javaMethod);
        javaMethod = new org.jruby.RubyModule$ModuleKernelMethods$INVOKER$s$2$0$autoload(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 2, "autoload", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyModule.ModuleKernelMethods.class, "autoload", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("autoload", javaMethod);
        runtime.addBoundMethod("org.jruby.RubyModule.ModuleKernelMethods","autoload_p","autoload?");
        runtime.addBoundMethod("org.jruby.RubyModule.ModuleKernelMethods","autoload","autoload");
    }
    static {
     }
}
