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
public class org$jruby$RubyConverter$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        CompatVersion compatVersion = cls.getRuntime().getInstanceConfig().getCompatVersion();
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.RubyConverter$INVOKER$i$initialize(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, -1, "initialize", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyConverter.class, "initialize", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("initialize", javaMethod);
        javaMethod = new org.jruby.RubyConverter$INVOKER$i$1$0$convert(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "convert", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyConverter.class, "convert", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("convert", javaMethod);
        javaMethod = new org.jruby.RubyConverter$INVOKER$i$2$0$primitive_convert(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 2, "primitive_convert", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyConverter.class, "primitive_convert", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("primitive_convert", javaMethod);
        javaMethod = new org.jruby.RubyConverter$INVOKER$i$0$0$source_encoding(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "source_encoding", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyConverter.class, "source_encoding", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("source_encoding", javaMethod);
        javaMethod = new org.jruby.RubyConverter$INVOKER$i$0$0$inspect(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "inspect", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyConverter.class, "inspect", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("inspect", javaMethod);
        javaMethod = new org.jruby.RubyConverter$INVOKER$i$0$0$destination_encoding(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "destination_encoding", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyConverter.class, "destination_encoding", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("destination_encoding", javaMethod);
        javaMethod = new org.jruby.RubyConverter$INVOKER$i$0$0$convpath(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "convpath", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyConverter.class, "convpath", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("convpath", javaMethod);
        runtime.addBoundMethod("org.jruby.RubyConverter","initialize","initialize");
        runtime.addBoundMethod("org.jruby.RubyConverter","convert","convert");
        runtime.addBoundMethod("org.jruby.RubyConverter","primitive_convert","primitive_convert");
        runtime.addBoundMethod("org.jruby.RubyConverter","source_encoding","source_encoding");
        runtime.addBoundMethod("org.jruby.RubyConverter","inspect","inspect");
        runtime.addBoundMethod("org.jruby.RubyConverter","destination_encoding","destination_encoding");
        runtime.addBoundMethod("org.jruby.RubyConverter","convpath","convpath");
        if (compatVersion.is1_9() || compatVersion == CompatVersion.BOTH) {
        javaMethod = new org.jruby.RubyConverter$INVOKER$i$1$0$replacement_set(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "replacement_set", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyConverter.class, "replacement_set", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("replacement=", javaMethod);
        javaMethod = new org.jruby.RubyConverter$INVOKER$i$0$0$replacement(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "replacement", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyConverter.class, "replacement", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("replacement", javaMethod);
        runtime.addBoundMethod("org.jruby.RubyConverter","replacement_set","replacement=");
        runtime.addBoundMethod("org.jruby.RubyConverter","replacement","replacement");
        }
    }
    static {
     }
}
