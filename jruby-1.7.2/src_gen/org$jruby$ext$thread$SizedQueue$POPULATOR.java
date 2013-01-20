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
public class org$jruby$ext$thread$SizedQueue$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        RubyClass singletonClass = cls.getSingletonClass();
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.ext.thread.SizedQueue$INVOKER$s$0$0$newInstance(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "newInstance", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.thread.SizedQueue.class, "newInstance", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class, org.jruby.runtime.Block.class});
        singletonClass.addMethodAtBootTimeOnly("new", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.thread.SizedQueue","newInstance","new");
        javaMethod = new org.jruby.ext.thread.SizedQueue$INVOKER$i$0$0$clear(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "clear", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.thread.SizedQueue.class, "clear", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("clear", javaMethod);
        javaMethod = new org.jruby.ext.thread.SizedQueue$INVOKER$i$1$0$max_set(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "max_set", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.thread.SizedQueue.class, "max_set", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("max=", javaMethod);
        cls.addMethodAtBootTimeOnly("initialize", javaMethod);
        javaMethod = new org.jruby.ext.thread.SizedQueue$INVOKER$i$0$0$max(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "max", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.thread.SizedQueue.class, "max", org.jruby.RubyNumeric.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("max", javaMethod);
        javaMethod = new org.jruby.ext.thread.SizedQueue$INVOKER$i$pop(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "pop", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.thread.SizedQueue.class, "pop", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("pop", javaMethod);
        cls.addMethodAtBootTimeOnly("deq", javaMethod);
        cls.addMethodAtBootTimeOnly("shift", javaMethod);
        javaMethod = new org.jruby.ext.thread.SizedQueue$INVOKER$i$1$0$push(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "push", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.thread.SizedQueue.class, "push", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("push", javaMethod);
        cls.addMethodAtBootTimeOnly("<<", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.thread.SizedQueue","clear","clear");
        runtime.addBoundMethod("org.jruby.ext.thread.SizedQueue","max_set","max=");
        runtime.addBoundMethod("org.jruby.ext.thread.SizedQueue","max","max");
        runtime.addBoundMethod("org.jruby.ext.thread.SizedQueue","pop","pop");
        runtime.addBoundMethod("org.jruby.ext.thread.SizedQueue","push","push");
    }
    static {
     }
}
