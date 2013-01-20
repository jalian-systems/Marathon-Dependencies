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
public class org$jruby$RubyRandom$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        RubyClass singletonClass = cls.getSingletonClass();
        CompatVersion compatVersion = cls.getRuntime().getInstanceConfig().getCompatVersion();
        Ruby runtime = cls.getRuntime();
        if (compatVersion.is1_9() || compatVersion == CompatVersion.BOTH) {
        javaMethod = new org.jruby.RubyRandom$INVOKER$s$0$0$state(singletonClass, Visibility.PRIVATE);
        populateMethod(javaMethod, 0, "state", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyRandom.class, "state", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        singletonClass.addMethodAtBootTimeOnly("state", javaMethod);
        javaMethod = new org.jruby.RubyRandom$INVOKER$s$0$0$newSeed(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "newSeed", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyRandom.class, "newSeed", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        singletonClass.addMethodAtBootTimeOnly("new_seed", javaMethod);
        javaMethod = new org.jruby.RubyRandom$INVOKER$s$0$0$left(singletonClass, Visibility.PRIVATE);
        populateMethod(javaMethod, 0, "left", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyRandom.class, "left", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        singletonClass.addMethodAtBootTimeOnly("left", javaMethod);
        javaMethod = new org.jruby.RubyRandom$INVOKER$s$0$1$rand(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "rand", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyRandom.class, "rand", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class});
        singletonClass.addMethodAtBootTimeOnly("rand", javaMethod);
        javaMethod = new org.jruby.RubyRandom$INVOKER$s$srand(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "srand", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyRandom.class, "srand", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        singletonClass.addMethodAtBootTimeOnly("srand", javaMethod);
        runtime.addBoundMethod("org.jruby.RubyRandom","state","state");
        runtime.addBoundMethod("org.jruby.RubyRandom","newSeed","new_seed");
        runtime.addBoundMethod("org.jruby.RubyRandom","left","left");
        runtime.addBoundMethod("org.jruby.RubyRandom","rand","rand");
        runtime.addBoundMethod("org.jruby.RubyRandom","srand","srand");
        }
        javaMethod = new org.jruby.RubyRandom$INVOKER$i$1$0$initialize_copy(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, 1, "initialize_copy", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyRandom.class, "initialize_copy", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("initialize_copy", javaMethod);
        runtime.addBoundMethod("org.jruby.RubyRandom","initialize_copy","initialize_copy");
        if (compatVersion.is1_9() || compatVersion == CompatVersion.BOTH) {
        javaMethod = new org.jruby.RubyRandom$INVOKER$i$1$0$marshal_load(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "marshal_load", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyRandom.class, "marshal_load", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("marshal_load", javaMethod);
        javaMethod = new org.jruby.RubyRandom$INVOKER$i$0$1$initialize(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, -1, "initialize", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyRandom.class, "initialize", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject[].class});
        cls.addMethodAtBootTimeOnly("initialize", javaMethod);
        javaMethod = new org.jruby.RubyRandom$INVOKER$i$1$0$bytes(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "bytes", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyRandom.class, "bytes", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("bytes", javaMethod);
        javaMethod = new org.jruby.RubyRandom$INVOKER$i$1$0$op_equal_19(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "op_equal_19", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyRandom.class, "op_equal_19", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("==", javaMethod);
        javaMethod = new org.jruby.RubyRandom$INVOKER$i$0$0$seed(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "seed", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyRandom.class, "seed", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("seed", javaMethod);
        javaMethod = new org.jruby.RubyRandom$INVOKER$i$0$0$stateObj(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, 0, "stateObj", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyRandom.class, "stateObj", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("state", javaMethod);
        javaMethod = new org.jruby.RubyRandom$INVOKER$i$0$0$marshal_dump(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "marshal_dump", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyRandom.class, "marshal_dump", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("marshal_dump", javaMethod);
        javaMethod = new org.jruby.RubyRandom$INVOKER$i$0$0$leftObj(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, 0, "leftObj", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyRandom.class, "leftObj", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("left", javaMethod);
        javaMethod = new org.jruby.RubyRandom$INVOKER$i$0$1$randObj(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "randObj", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyRandom.class, "randObj", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject[].class});
        cls.addMethodAtBootTimeOnly("rand", javaMethod);
        runtime.addBoundMethod("org.jruby.RubyRandom","marshal_load","marshal_load");
        runtime.addBoundMethod("org.jruby.RubyRandom","initialize","initialize");
        runtime.addBoundMethod("org.jruby.RubyRandom","bytes","bytes");
        runtime.addBoundMethod("org.jruby.RubyRandom","op_equal_19","==");
        runtime.addBoundMethod("org.jruby.RubyRandom","seed","seed");
        runtime.addBoundMethod("org.jruby.RubyRandom","stateObj","state");
        runtime.addBoundMethod("org.jruby.RubyRandom","marshal_dump","marshal_dump");
        runtime.addBoundMethod("org.jruby.RubyRandom","leftObj","left");
        runtime.addBoundMethod("org.jruby.RubyRandom","randObj","rand");
        }
    }
    static {
     }
}
