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
public class org$jruby$RubyBasicObject$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        RubyClass singletonClass = cls.getSingletonClass();
        CompatVersion compatVersion = cls.getRuntime().getInstanceConfig().getCompatVersion();
        Ruby runtime = cls.getRuntime();
        if (compatVersion.is1_9() || compatVersion == CompatVersion.BOTH) {
        javaMethod = new org.jruby.RubyBasicObject$INVOKER$s$1$0$singleton_method_undefined19(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, 1, "singleton_method_undefined19", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyBasicObject.class, "singleton_method_undefined19", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("singleton_method_undefined", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("singleton_method_undefined", moduleMethod);
        javaMethod = new org.jruby.RubyBasicObject$INVOKER$s$1$0$singleton_method_removed19(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, 1, "singleton_method_removed19", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyBasicObject.class, "singleton_method_removed19", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("singleton_method_removed", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("singleton_method_removed", moduleMethod);
        javaMethod = new org.jruby.RubyBasicObject$INVOKER$s$0$0$method_missing19(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, -1, "method_missing19", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyBasicObject.class, "method_missing19", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("method_missing", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("method_missing", moduleMethod);
        javaMethod = new org.jruby.RubyBasicObject$INVOKER$s$1$0$singleton_method_added19(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, 1, "singleton_method_added19", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyBasicObject.class, "singleton_method_added19", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("singleton_method_added", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("singleton_method_added", moduleMethod);
        runtime.addBoundMethod("org.jruby.RubyBasicObject","singleton_method_undefined19","singleton_method_undefined");
        runtime.addBoundMethod("org.jruby.RubyBasicObject","singleton_method_removed19","singleton_method_removed");
        runtime.addBoundMethod("org.jruby.RubyBasicObject","method_missing19","method_missing");
        runtime.addBoundMethod("org.jruby.RubyBasicObject","singleton_method_added19","singleton_method_added");
        }
        if (compatVersion.is1_9() || compatVersion == CompatVersion.BOTH) {
        javaMethod = new org.jruby.RubyBasicObject$INVOKER$i$0$3$instance_exec19(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "instance_exec19", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyBasicObject.class, "instance_exec19", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject[].class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("instance_exec", javaMethod);
        javaMethod = new org.jruby.RubyBasicObject$INVOKER$i$1$0$equal_p19(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "equal_p19", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyBasicObject.class, "equal_p19", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("equal?", javaMethod);
        javaMethod = new org.jruby.RubyBasicObject$INVOKER$i$0$0$op_not(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "op_not", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyBasicObject.class, "op_not", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("!", javaMethod);
        javaMethod = new org.jruby.RubyBasicObject$INVOKER$i$instance_eval19(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "instance_eval19", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyBasicObject.class, "instance_eval19", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("instance_eval", javaMethod);
        javaMethod = new org.jruby.RubyBasicObject$INVOKER$i$1$0$op_equal_19(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "op_equal_19", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyBasicObject.class, "op_equal_19", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("==", javaMethod);
        javaMethod = new org.jruby.RubyBasicObject$INVOKER$i$1$0$op_not_equal(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "op_not_equal", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyBasicObject.class, "op_not_equal", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("!=", javaMethod);
        javaMethod = new org.jruby.RubyBasicObject$INVOKER$i$0$0$id(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "id", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyBasicObject.class, "id", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("object_id", javaMethod);
        cls.addMethodAtBootTimeOnly("__id__", javaMethod);
        javaMethod = new org.jruby.RubyBasicObject$INVOKER$i$send19(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "send19", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyBasicObject.class, "send19", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("__send__", javaMethod);
        javaMethod = new org.jruby.RubyBasicObject$INVOKER$i$0$0$initialize19(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, 0, "initialize19", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyBasicObject.class, "initialize19", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("initialize", javaMethod);
        runtime.addBoundMethod("org.jruby.RubyBasicObject","instance_exec19","instance_exec");
        runtime.addBoundMethod("org.jruby.RubyBasicObject","equal_p19","equal?");
        runtime.addBoundMethod("org.jruby.RubyBasicObject","op_not","!");
        runtime.addBoundMethod("org.jruby.RubyBasicObject","instance_eval19","instance_eval");
        runtime.addBoundMethod("org.jruby.RubyBasicObject","op_equal_19","==");
        runtime.addBoundMethod("org.jruby.RubyBasicObject","op_not_equal","!=");
        runtime.addBoundMethod("org.jruby.RubyBasicObject","id","object_id");
        runtime.addBoundMethod("org.jruby.RubyBasicObject","send19","__send__");
        runtime.addBoundMethod("org.jruby.RubyBasicObject","initialize19","initialize");
        }
    }
    static {
     }
}
