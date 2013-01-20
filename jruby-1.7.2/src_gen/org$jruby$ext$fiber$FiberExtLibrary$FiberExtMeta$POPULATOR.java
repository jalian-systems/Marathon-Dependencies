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
public class org$jruby$ext$fiber$FiberExtLibrary$FiberExtMeta$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        RubyClass singletonClass = cls.getSingletonClass();
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.ext.fiber.FiberExtLibrary$FiberExtMeta$INVOKER$s$0$0$alive_p(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "alive_p", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.fiber.FiberExtLibrary.FiberExtMeta.class, "alive_p", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("alive?", javaMethod);
        javaMethod = new org.jruby.ext.fiber.FiberExtLibrary$FiberExtMeta$INVOKER$s$0$0$current(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "current", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.fiber.FiberExtLibrary.FiberExtMeta.class, "current", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        singletonClass.addMethodAtBootTimeOnly("current", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.fiber.FiberExtLibrary.FiberExtMeta","alive_p","alive?");
        runtime.addBoundMethod("org.jruby.ext.fiber.FiberExtLibrary.FiberExtMeta","current","current");
    }
    static {
     }
}
