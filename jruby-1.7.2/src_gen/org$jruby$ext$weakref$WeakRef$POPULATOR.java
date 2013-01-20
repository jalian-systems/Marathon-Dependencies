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
public class org$jruby$ext$weakref$WeakRef$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        RubyClass singletonClass = cls.getSingletonClass();
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.ext.weakref.WeakRef$INVOKER$s$1$0$newInstance(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "newInstance", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.weakref.WeakRef.class, "newInstance", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        singletonClass.addMethodAtBootTimeOnly("new", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.weakref.WeakRef","newInstance","new");
        javaMethod = new org.jruby.ext.weakref.WeakRef$INVOKER$i$1$0$initialize(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, 1, "initialize", false, CallConfiguration.FrameFullScopeNone, false, org.jruby.ext.weakref.WeakRef.class, "initialize", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("initialize", javaMethod);
        javaMethod = new org.jruby.ext.weakref.WeakRef$INVOKER$i$1$0$setobj(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "setobj", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.weakref.WeakRef.class, "setobj", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("__setobj__", javaMethod);
        javaMethod = new org.jruby.ext.weakref.WeakRef$INVOKER$i$0$0$weakref_alive_p(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "weakref_alive_p", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.weakref.WeakRef.class, "weakref_alive_p", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("weakref_alive?", javaMethod);
        javaMethod = new org.jruby.ext.weakref.WeakRef$INVOKER$i$0$0$getobj(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "getobj", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.weakref.WeakRef.class, "getobj", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("__getobj__", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.weakref.WeakRef","initialize","initialize");
        runtime.addBoundMethod("org.jruby.ext.weakref.WeakRef","setobj","__setobj__");
        runtime.addBoundMethod("org.jruby.ext.weakref.WeakRef","weakref_alive_p","weakref_alive?");
        runtime.addBoundMethod("org.jruby.ext.weakref.WeakRef","getobj","__getobj__");
    }
    static {
     }
}
