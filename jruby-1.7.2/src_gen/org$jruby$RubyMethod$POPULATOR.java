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
public class org$jruby$RubyMethod$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        CompatVersion compatVersion = cls.getRuntime().getInstanceConfig().getCompatVersion();
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.RubyMethod$INVOKER$i$0$0$arity(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "arity", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyMethod.class, "arity", org.jruby.RubyFixnum.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("arity", javaMethod);
        javaMethod = new org.jruby.RubyMethod$INVOKER$i$0$0$rbClone(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "rbClone", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyMethod.class, "rbClone", org.jruby.RubyMethod.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("clone", javaMethod);
        javaMethod = new org.jruby.RubyMethod$INVOKER$i$call(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "call", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyMethod.class, "call", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("call", javaMethod);
        cls.addMethodAtBootTimeOnly("[]", javaMethod);
        javaMethod = new org.jruby.RubyMethod$INVOKER$i$0$0$receiver(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "receiver", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyMethod.class, "receiver", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("receiver", javaMethod);
        javaMethod = new org.jruby.RubyMethod$INVOKER$i$0$0$to_proc(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "to_proc", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyMethod.class, "to_proc", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("to_proc", javaMethod);
        javaMethod = new org.jruby.RubyMethod$INVOKER$i$1$0$op_equal(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "op_equal", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyMethod.class, "op_equal", org.jruby.RubyBoolean.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("==", javaMethod);
        javaMethod = new org.jruby.RubyMethod$INVOKER$i$0$0$owner(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "owner", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyMethod.class, "owner", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("owner", javaMethod);
        javaMethod = new org.jruby.RubyMethod$INVOKER$i$0$0$unbind(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "unbind", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyMethod.class, "unbind", org.jruby.RubyUnboundMethod.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("unbind", javaMethod);
        javaMethod = new org.jruby.RubyMethod$INVOKER$i$0$0$inspect(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "inspect", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyMethod.class, "inspect", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("inspect", javaMethod);
        cls.addMethodAtBootTimeOnly("to_s", javaMethod);
        runtime.addBoundMethod("org.jruby.RubyMethod","arity","arity");
        runtime.addBoundMethod("org.jruby.RubyMethod","rbClone","clone");
        runtime.addBoundMethod("org.jruby.RubyMethod","call","call");
        runtime.addBoundMethod("org.jruby.RubyMethod","receiver","receiver");
        runtime.addBoundMethod("org.jruby.RubyMethod","to_proc","to_proc");
        runtime.addBoundMethod("org.jruby.RubyMethod","op_equal","==");
        runtime.addBoundMethod("org.jruby.RubyMethod","owner","owner");
        runtime.addBoundMethod("org.jruby.RubyMethod","unbind","unbind");
        runtime.addBoundMethod("org.jruby.RubyMethod","inspect","inspect");
        if (compatVersion == CompatVersion.RUBY1_8 || compatVersion == CompatVersion.BOTH) {
        javaMethod = new org.jruby.RubyMethod$INVOKER$i$0$0$name(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "name", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyMethod.class, "name", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("name", javaMethod);
        runtime.addBoundMethod("org.jruby.RubyMethod","name","name");
        }
        if (compatVersion.is1_9() || compatVersion == CompatVersion.BOTH) {
        javaMethod = new org.jruby.RubyMethod$INVOKER$i$0$0$name19(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "name19", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyMethod.class, "name19", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("name", javaMethod);
        javaMethod = new org.jruby.RubyMethod$INVOKER$i$0$0$source_location(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "source_location", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyMethod.class, "source_location", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("source_location", javaMethod);
        javaMethod = new org.jruby.RubyMethod$INVOKER$i$0$0$parameters(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "parameters", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyMethod.class, "parameters", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("parameters", javaMethod);
        javaMethod = new org.jruby.RubyMethod$INVOKER$i$1$0$op_eql19(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "op_eql19", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyMethod.class, "op_eql19", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("eql?", javaMethod);
        runtime.addBoundMethod("org.jruby.RubyMethod","name19","name");
        runtime.addBoundMethod("org.jruby.RubyMethod","source_location","source_location");
        runtime.addBoundMethod("org.jruby.RubyMethod","parameters","parameters");
        runtime.addBoundMethod("org.jruby.RubyMethod","op_eql19","eql?");
        }
    }
    static {
     }
}
