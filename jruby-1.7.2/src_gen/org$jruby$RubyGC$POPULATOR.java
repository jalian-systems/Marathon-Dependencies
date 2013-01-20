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
public class org$jruby$RubyGC$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        RubyClass singletonClass = cls.getSingletonClass();
        CompatVersion compatVersion = cls.getRuntime().getInstanceConfig().getCompatVersion();
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.RubyGC$INVOKER$s$1$0$stress_set(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, 1, "stress_set", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyGC.class, "stress_set", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("stress=", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("stress=", moduleMethod);
        javaMethod = new org.jruby.RubyGC$INVOKER$s$0$0$enable(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, 0, "enable", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyGC.class, "enable", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("enable", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("enable", moduleMethod);
        javaMethod = new org.jruby.RubyGC$INVOKER$s$0$0$garbage_collect(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "garbage_collect", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyGC.class, "garbage_collect", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("garbage_collect", javaMethod);
        javaMethod = new org.jruby.RubyGC$INVOKER$s$0$0$stress(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, 0, "stress", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyGC.class, "stress", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("stress", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("stress", moduleMethod);
        javaMethod = new org.jruby.RubyGC$INVOKER$s$0$0$disable(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, 0, "disable", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyGC.class, "disable", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("disable", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("disable", moduleMethod);
        javaMethod = new org.jruby.RubyGC$INVOKER$s$0$0$start(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, 0, "start", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyGC.class, "start", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("start", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("start", moduleMethod);
        runtime.addBoundMethod("org.jruby.RubyGC","stress_set","stress=");
        runtime.addBoundMethod("org.jruby.RubyGC","enable","enable");
        runtime.addBoundMethod("org.jruby.RubyGC","garbage_collect","garbage_collect");
        runtime.addBoundMethod("org.jruby.RubyGC","stress","stress");
        runtime.addBoundMethod("org.jruby.RubyGC","disable","disable");
        runtime.addBoundMethod("org.jruby.RubyGC","start","start");
        if (compatVersion.is1_9() || compatVersion == CompatVersion.BOTH) {
        javaMethod = new org.jruby.RubyGC$INVOKER$s$0$0$count(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, 0, "count", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyGC.class, "count", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("count", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("count", moduleMethod);
        runtime.addBoundMethod("org.jruby.RubyGC","count","count");
        }
    }
    static {
     }
}
