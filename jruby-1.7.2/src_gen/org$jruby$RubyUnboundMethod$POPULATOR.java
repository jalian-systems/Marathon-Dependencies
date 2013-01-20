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
public class org$jruby$RubyUnboundMethod$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        CompatVersion compatVersion = cls.getRuntime().getInstanceConfig().getCompatVersion();
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.RubyUnboundMethod$INVOKER$i$0$0$rbClone(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "rbClone", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyUnboundMethod.class, "rbClone", org.jruby.RubyMethod.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("clone", javaMethod);
        javaMethod = new org.jruby.RubyUnboundMethod$INVOKER$i$0$0$call(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "call", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyUnboundMethod.class, "call", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject[].class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("call", javaMethod);
        cls.addMethodAtBootTimeOnly("[]", javaMethod);
        javaMethod = new org.jruby.RubyUnboundMethod$INVOKER$i$0$0$to_proc(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "to_proc", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyUnboundMethod.class, "to_proc", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("to_proc", javaMethod);
        javaMethod = new org.jruby.RubyUnboundMethod$INVOKER$i$0$0$owner(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "owner", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyUnboundMethod.class, "owner", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("owner", javaMethod);
        javaMethod = new org.jruby.RubyUnboundMethod$INVOKER$i$0$0$unbind(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "unbind", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyUnboundMethod.class, "unbind", org.jruby.RubyUnboundMethod.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("unbind", javaMethod);
        javaMethod = new org.jruby.RubyUnboundMethod$INVOKER$i$1$0$bind(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "bind", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyUnboundMethod.class, "bind", org.jruby.RubyMethod.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("bind", javaMethod);
        runtime.addBoundMethod("org.jruby.RubyUnboundMethod","rbClone","clone");
        runtime.addBoundMethod("org.jruby.RubyUnboundMethod","call","call");
        runtime.addBoundMethod("org.jruby.RubyUnboundMethod","to_proc","to_proc");
        runtime.addBoundMethod("org.jruby.RubyUnboundMethod","owner","owner");
        runtime.addBoundMethod("org.jruby.RubyUnboundMethod","unbind","unbind");
        runtime.addBoundMethod("org.jruby.RubyUnboundMethod","bind","bind");
        if (compatVersion == CompatVersion.RUBY1_8 || compatVersion == CompatVersion.BOTH) {
        javaMethod = new org.jruby.RubyUnboundMethod$INVOKER$i$0$0$name(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "name", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyUnboundMethod.class, "name", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("name", javaMethod);
        runtime.addBoundMethod("org.jruby.RubyUnboundMethod","name","name");
        }
        if (compatVersion.is1_9() || compatVersion == CompatVersion.BOTH) {
        javaMethod = new org.jruby.RubyUnboundMethod$INVOKER$i$0$0$name19(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "name19", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyUnboundMethod.class, "name19", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("name", javaMethod);
        runtime.addBoundMethod("org.jruby.RubyUnboundMethod","name19","name");
        }
    }
    static {
     }
}
