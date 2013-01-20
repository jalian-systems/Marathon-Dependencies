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
public class org$jruby$RubyEnumerator$RubyEnumeratorEnumerable$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        CompatVersion compatVersion = cls.getRuntime().getInstanceConfig().getCompatVersion();
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.RubyEnumerator$RubyEnumeratorEnumerable$INVOKER$s$1$0$each_slice19(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "each_slice19", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyEnumerator.RubyEnumeratorEnumerable.class, "each_slice19", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("each_slice", javaMethod);
        javaMethod = new org.jruby.RubyEnumerator$RubyEnumeratorEnumerable$INVOKER$s$1$0$each_cons19(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "each_cons19", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyEnumerator.RubyEnumeratorEnumerable.class, "each_cons19", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("each_cons", javaMethod);
        javaMethod = new org.jruby.RubyEnumerator$RubyEnumeratorEnumerable$INVOKER$s$1$0$enum_cons19(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "enum_cons19", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyEnumerator.RubyEnumeratorEnumerable.class, "enum_cons19", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("enum_cons", javaMethod);
        javaMethod = new org.jruby.RubyEnumerator$RubyEnumeratorEnumerable$INVOKER$s$1$0$enum_slice19(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "enum_slice19", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyEnumerator.RubyEnumeratorEnumerable.class, "enum_slice19", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("enum_slice", javaMethod);
        runtime.addBoundMethod("org.jruby.RubyEnumerator.RubyEnumeratorEnumerable","each_slice19","each_slice");
        runtime.addBoundMethod("org.jruby.RubyEnumerator.RubyEnumeratorEnumerable","each_cons19","each_cons");
        runtime.addBoundMethod("org.jruby.RubyEnumerator.RubyEnumeratorEnumerable","enum_cons19","enum_cons");
        runtime.addBoundMethod("org.jruby.RubyEnumerator.RubyEnumeratorEnumerable","enum_slice19","enum_slice");
        if (compatVersion.is1_9() || compatVersion == CompatVersion.BOTH) {
        javaMethod = new org.jruby.RubyEnumerator$RubyEnumeratorEnumerable$INVOKER$s$1$0$with_object(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "with_object", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyEnumerator.RubyEnumeratorEnumerable.class, "with_object", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("with_object", javaMethod);
        javaMethod = new org.jruby.RubyEnumerator$RubyEnumeratorEnumerable$INVOKER$s$1$0$each_with_object(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "each_with_object", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyEnumerator.RubyEnumeratorEnumerable.class, "each_with_object", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("each_with_object", javaMethod);
        runtime.addBoundMethod("org.jruby.RubyEnumerator.RubyEnumeratorEnumerable","with_object","with_object");
        runtime.addBoundMethod("org.jruby.RubyEnumerator.RubyEnumeratorEnumerable","each_with_object","each_with_object");
        }
    }
    static {
     }
}
