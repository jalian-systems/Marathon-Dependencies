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
public class org$jruby$ext$thread$Queue$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        RubyClass singletonClass = cls.getSingletonClass();
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.ext.thread.Queue$INVOKER$s$0$0$newInstance(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "newInstance", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.thread.Queue.class, "newInstance", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class, org.jruby.runtime.Block.class});
        singletonClass.addMethodAtBootTimeOnly("new", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.thread.Queue","newInstance","new");
        javaMethod = new org.jruby.ext.thread.Queue$INVOKER$i$0$0$clear(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "clear", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.thread.Queue.class, "clear", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("clear", javaMethod);
        javaMethod = new org.jruby.ext.thread.Queue$INVOKER$i$0$0$empty_p(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "empty_p", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.thread.Queue.class, "empty_p", org.jruby.RubyBoolean.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("empty?", javaMethod);
        javaMethod = new org.jruby.ext.thread.Queue$INVOKER$i$0$0$shutdown(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "shutdown", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.thread.Queue.class, "shutdown", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("shutdown!", javaMethod);
        javaMethod = new org.jruby.ext.thread.Queue$INVOKER$i$0$0$num_waiting(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "num_waiting", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.thread.Queue.class, "num_waiting", org.jruby.RubyNumeric.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("num_waiting", javaMethod);
        javaMethod = new org.jruby.ext.thread.Queue$INVOKER$i$0$0$length(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "length", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.thread.Queue.class, "length", org.jruby.RubyNumeric.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("length", javaMethod);
        cls.addMethodAtBootTimeOnly("size", javaMethod);
        javaMethod = new org.jruby.ext.thread.Queue$INVOKER$i$pop(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "pop", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.thread.Queue.class, "pop", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("pop", javaMethod);
        cls.addMethodAtBootTimeOnly("deq", javaMethod);
        cls.addMethodAtBootTimeOnly("shift", javaMethod);
        javaMethod = new org.jruby.ext.thread.Queue$INVOKER$i$1$0$push(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "push", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.thread.Queue.class, "push", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("push", javaMethod);
        cls.addMethodAtBootTimeOnly("<<", javaMethod);
        cls.addMethodAtBootTimeOnly("enq", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.thread.Queue","clear","clear");
        runtime.addBoundMethod("org.jruby.ext.thread.Queue","empty_p","empty?");
        runtime.addBoundMethod("org.jruby.ext.thread.Queue","shutdown","shutdown!");
        runtime.addBoundMethod("org.jruby.ext.thread.Queue","num_waiting","num_waiting");
        runtime.addBoundMethod("org.jruby.ext.thread.Queue","length","length");
        runtime.addBoundMethod("org.jruby.ext.thread.Queue","pop","pop");
        runtime.addBoundMethod("org.jruby.ext.thread.Queue","push","push");
    }
    static {
     }
}
