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
public class org$jruby$RubyEnumerator$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        CompatVersion compatVersion = cls.getRuntime().getInstanceConfig().getCompatVersion();
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.RubyEnumerator$INVOKER$s$0$0$each_with_index(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "each_with_index", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyEnumerator.class, "each_with_index", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("each_with_index", javaMethod);
        runtime.addBoundMethod("org.jruby.RubyEnumerator","each_with_index","each_with_index");
        if (compatVersion == CompatVersion.RUBY1_8 || compatVersion == CompatVersion.BOTH) {
        javaMethod = new org.jruby.RubyEnumerator$INVOKER$s$0$0$with_index(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "with_index", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyEnumerator.class, "with_index", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("with_index", javaMethod);
        runtime.addBoundMethod("org.jruby.RubyEnumerator","with_index","with_index");
        }
        if (compatVersion.is1_9() || compatVersion == CompatVersion.BOTH) {
        javaMethod = new org.jruby.RubyEnumerator$INVOKER$s$with_index19(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "with_index19", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyEnumerator.class, "with_index19", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("with_index", javaMethod);
        runtime.addBoundMethod("org.jruby.RubyEnumerator","with_index19","with_index");
        }
        javaMethod = new org.jruby.RubyEnumerator$INVOKER$i$0$0$dup(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "dup", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyEnumerator.class, "dup", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("dup", javaMethod);
        javaMethod = new org.jruby.RubyEnumerator$INVOKER$i$0$0$each(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "each", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyEnumerator.class, "each", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("each", javaMethod);
        runtime.addBoundMethod("org.jruby.RubyEnumerator","dup","dup");
        runtime.addBoundMethod("org.jruby.RubyEnumerator","each","each");
        if (compatVersion == CompatVersion.RUBY1_8 || compatVersion == CompatVersion.BOTH) {
        javaMethod = new org.jruby.RubyEnumerator$INVOKER$i$initialize(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, -1, "initialize", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyEnumerator.class, "initialize", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("initialize", javaMethod);
        runtime.addBoundMethod("org.jruby.RubyEnumerator","initialize","initialize");
        }
        if (compatVersion.is1_9() || compatVersion == CompatVersion.BOTH) {
        javaMethod = new org.jruby.RubyEnumerator$INVOKER$i$0$0$inspect19(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "inspect19", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyEnumerator.class, "inspect19", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("inspect", javaMethod);
        javaMethod = new org.jruby.RubyEnumerator$INVOKER$i$initialize19(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, -1, "initialize19", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyEnumerator.class, "initialize19", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("initialize", javaMethod);
        runtime.addBoundMethod("org.jruby.RubyEnumerator","inspect19","inspect");
        runtime.addBoundMethod("org.jruby.RubyEnumerator","initialize19","initialize");
        }
    }
    static {
     }
}
