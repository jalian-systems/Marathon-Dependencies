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
public class org$jruby$ext$fiber$Fiber$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.ext.fiber.Fiber$INVOKER$i$0$0$initialize(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, 0, "initialize", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.fiber.Fiber.class, "initialize", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("initialize", javaMethod);
        javaMethod = new org.jruby.ext.fiber.Fiber$INVOKER$i$transfer(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "transfer", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.fiber.Fiber.class, "transfer", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("transfer", javaMethod);
        javaMethod = new org.jruby.ext.fiber.Fiber$INVOKER$i$resume(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "resume", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.fiber.Fiber.class, "resume", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("resume", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.fiber.Fiber","initialize","initialize");
        runtime.addBoundMethod("org.jruby.ext.fiber.Fiber","transfer","transfer");
        runtime.addBoundMethod("org.jruby.ext.fiber.Fiber","resume","resume");
    }
    static {
     }
}
