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
public class org$jruby$java$addons$IOJavaAddons$AnyIO$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.java.addons.IOJavaAddons$AnyIO$INVOKER$s$0$0$any_to_channel(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "any_to_channel", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.java.addons.IOJavaAddons.AnyIO.class, "any_to_channel", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("to_channel", javaMethod);
        javaMethod = new org.jruby.java.addons.IOJavaAddons$AnyIO$INVOKER$s$0$0$any_to_inputstream(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "any_to_inputstream", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.java.addons.IOJavaAddons.AnyIO.class, "any_to_inputstream", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("to_inputstream", javaMethod);
        javaMethod = new org.jruby.java.addons.IOJavaAddons$AnyIO$INVOKER$s$0$0$any_to_outputstream(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "any_to_outputstream", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.java.addons.IOJavaAddons.AnyIO.class, "any_to_outputstream", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("to_outputstream", javaMethod);
        runtime.addBoundMethod("org.jruby.java.addons.IOJavaAddons.AnyIO","any_to_channel","to_channel");
        runtime.addBoundMethod("org.jruby.java.addons.IOJavaAddons.AnyIO","any_to_inputstream","to_inputstream");
        runtime.addBoundMethod("org.jruby.java.addons.IOJavaAddons.AnyIO","any_to_outputstream","to_outputstream");
    }
    static {
     }
}
