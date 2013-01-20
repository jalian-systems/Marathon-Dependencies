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
public class org$jruby$RubyYielder$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.RubyYielder$INVOKER$i$0$0$yield(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "yield", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyYielder.class, "yield", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject[].class});
        cls.addMethodAtBootTimeOnly("yield", javaMethod);
        javaMethod = new org.jruby.RubyYielder$INVOKER$i$0$0$initialize(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, 0, "initialize", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyYielder.class, "initialize", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("initialize", javaMethod);
        javaMethod = new org.jruby.RubyYielder$INVOKER$i$0$0$op_lshift(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "op_lshift", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyYielder.class, "op_lshift", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject[].class});
        cls.addMethodAtBootTimeOnly("<<", javaMethod);
        runtime.addBoundMethod("org.jruby.RubyYielder","yield","yield");
        runtime.addBoundMethod("org.jruby.RubyYielder","initialize","initialize");
        runtime.addBoundMethod("org.jruby.RubyYielder","op_lshift","<<");
    }
    static {
     }
}
