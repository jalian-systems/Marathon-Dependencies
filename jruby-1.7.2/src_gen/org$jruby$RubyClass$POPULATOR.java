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
public class org$jruby$RubyClass$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        CompatVersion compatVersion = cls.getRuntime().getInstanceConfig().getCompatVersion();
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.RubyClass$INVOKER$i$newInstance(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "newInstance", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyClass.class, "newInstance", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("new", javaMethod);
        javaMethod = new org.jruby.RubyClass$INVOKER$i$0$0$superclass(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "superclass", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyClass.class, "superclass", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("superclass", javaMethod);
        javaMethod = new org.jruby.RubyClass$INVOKER$i$0$0$allocate(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "allocate", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyClass.class, "allocate", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("allocate", javaMethod);
        javaMethod = new org.jruby.RubyClass$INVOKER$i$1$0$inherited(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, 1, "inherited", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyClass.class, "inherited", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("inherited", javaMethod);
        javaMethod = new org.jruby.RubyClass$INVOKER$i$1$0$initialize_copy(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, 1, "initialize_copy", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyClass.class, "initialize_copy", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("initialize_copy", javaMethod);
        runtime.addBoundMethod("org.jruby.RubyClass","superclass","superclass");
        runtime.addBoundMethod("org.jruby.RubyClass","allocate","allocate");
        runtime.addBoundMethod("org.jruby.RubyClass","inherited","inherited");
        runtime.addBoundMethod("org.jruby.RubyClass","initialize_copy","initialize_copy");
        if (compatVersion == CompatVersion.RUBY1_8 || compatVersion == CompatVersion.BOTH) {
        javaMethod = new org.jruby.RubyClass$INVOKER$i$initialize(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, -1, "initialize", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyClass.class, "initialize", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("initialize", javaMethod);
        runtime.addBoundMethod("org.jruby.RubyClass","initialize","initialize");
        }
        if (compatVersion.is1_9() || compatVersion == CompatVersion.BOTH) {
        javaMethod = new org.jruby.RubyClass$INVOKER$i$initialize19(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, -1, "initialize19", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyClass.class, "initialize19", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("initialize", javaMethod);
        runtime.addBoundMethod("org.jruby.RubyClass","initialize19","initialize");
        }
    }
    static {
     }
}
