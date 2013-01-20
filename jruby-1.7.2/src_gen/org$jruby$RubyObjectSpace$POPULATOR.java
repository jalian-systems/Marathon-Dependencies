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
public class org$jruby$RubyObjectSpace$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        RubyClass singletonClass = cls.getSingletonClass();
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.RubyObjectSpace$INVOKER$s$1$0$undefine_finalizer(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, 1, "undefine_finalizer", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyObjectSpace.class, "undefine_finalizer", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("undefine_finalizer", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("undefine_finalizer", moduleMethod);
        javaMethod = new org.jruby.RubyObjectSpace$INVOKER$s$0$0$garbage_collect(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, 0, "garbage_collect", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyObjectSpace.class, "garbage_collect", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("garbage_collect", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("garbage_collect", moduleMethod);
        javaMethod = new org.jruby.RubyObjectSpace$INVOKER$s$0$1$define_finalizer(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, -1, "define_finalizer", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyObjectSpace.class, "define_finalizer", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("define_finalizer", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("define_finalizer", moduleMethod);
        javaMethod = new org.jruby.RubyObjectSpace$INVOKER$s$0$1$each_object(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, -1, "each_object", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyObjectSpace.class, "each_object", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("each_object", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("each_object", moduleMethod);
        javaMethod = new org.jruby.RubyObjectSpace$INVOKER$s$1$0$id2ref(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, 1, "id2ref", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyObjectSpace.class, "id2ref", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("_id2ref", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("_id2ref", moduleMethod);
        runtime.addBoundMethod("org.jruby.RubyObjectSpace","undefine_finalizer","undefine_finalizer");
        runtime.addBoundMethod("org.jruby.RubyObjectSpace","garbage_collect","garbage_collect");
        runtime.addBoundMethod("org.jruby.RubyObjectSpace","define_finalizer","define_finalizer");
        runtime.addBoundMethod("org.jruby.RubyObjectSpace","each_object","each_object");
        runtime.addBoundMethod("org.jruby.RubyObjectSpace","id2ref","_id2ref");
    }
    static {
     }
}
