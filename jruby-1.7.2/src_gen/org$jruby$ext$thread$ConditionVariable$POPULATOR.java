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
public class org$jruby$ext$thread$ConditionVariable$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        RubyClass singletonClass = cls.getSingletonClass();
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.ext.thread.ConditionVariable$INVOKER$s$0$0$newInstance(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "newInstance", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.thread.ConditionVariable.class, "newInstance", org.jruby.ext.thread.ConditionVariable.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class, org.jruby.runtime.Block.class});
        singletonClass.addMethodAtBootTimeOnly("new", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.thread.ConditionVariable","newInstance","new");
        javaMethod = new org.jruby.ext.thread.ConditionVariable$INVOKER$i$0$0$signal(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "signal", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.thread.ConditionVariable.class, "signal", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("signal", javaMethod);
        javaMethod = new org.jruby.ext.thread.ConditionVariable$INVOKER$i$0$0$broadcast(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "broadcast", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.thread.ConditionVariable.class, "broadcast", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("broadcast", javaMethod);
        javaMethod = new org.jruby.ext.thread.ConditionVariable$INVOKER$i$0$1$wait_ruby(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "wait_ruby", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.thread.ConditionVariable.class, "wait_ruby", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject[].class});
        cls.addMethodAtBootTimeOnly("wait", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.thread.ConditionVariable","signal","signal");
        runtime.addBoundMethod("org.jruby.ext.thread.ConditionVariable","broadcast","broadcast");
        runtime.addBoundMethod("org.jruby.ext.thread.ConditionVariable","wait_ruby","wait");
    }
    static {
     }
}
