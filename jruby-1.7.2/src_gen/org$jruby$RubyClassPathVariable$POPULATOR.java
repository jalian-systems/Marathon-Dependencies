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
public class org$jruby$RubyClassPathVariable$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.RubyClassPathVariable$INVOKER$i$1$0$append(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "append", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyClassPathVariable.class, "append", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("append", javaMethod);
        cls.addMethodAtBootTimeOnly("<<", javaMethod);
        javaMethod = new org.jruby.RubyClassPathVariable$INVOKER$i$0$0$to_s(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "to_s", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyClassPathVariable.class, "to_s", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("to_s", javaMethod);
        javaMethod = new org.jruby.RubyClassPathVariable$INVOKER$i$0$0$each(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "each", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyClassPathVariable.class, "each", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("each", javaMethod);
        javaMethod = new org.jruby.RubyClassPathVariable$INVOKER$i$0$0$inspect(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "inspect", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyClassPathVariable.class, "inspect", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("inspect", javaMethod);
        javaMethod = new org.jruby.RubyClassPathVariable$INVOKER$i$0$0$size(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "size", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyClassPathVariable.class, "size", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("size", javaMethod);
        cls.addMethodAtBootTimeOnly("length", javaMethod);
        runtime.addBoundMethod("org.jruby.RubyClassPathVariable","append","append");
        runtime.addBoundMethod("org.jruby.RubyClassPathVariable","to_s","to_s");
        runtime.addBoundMethod("org.jruby.RubyClassPathVariable","each","each");
        runtime.addBoundMethod("org.jruby.RubyClassPathVariable","inspect","inspect");
        runtime.addBoundMethod("org.jruby.RubyClassPathVariable","size","size");
    }
    static {
     }
}
