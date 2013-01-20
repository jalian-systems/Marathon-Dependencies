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
public class org$jruby$java$addons$IOJavaAddons$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.java.addons.IOJavaAddons$INVOKER$s$0$0$to_channel(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "to_channel", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.java.addons.IOJavaAddons.class, "to_channel", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("to_channel", javaMethod);
        javaMethod = new org.jruby.java.addons.IOJavaAddons$INVOKER$s$0$0$to_outputstream(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "to_outputstream", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.java.addons.IOJavaAddons.class, "to_outputstream", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("to_outputstream", javaMethod);
        javaMethod = new org.jruby.java.addons.IOJavaAddons$INVOKER$s$0$0$to_inputstream(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "to_inputstream", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.java.addons.IOJavaAddons.class, "to_inputstream", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("to_inputstream", javaMethod);
        runtime.addBoundMethod("org.jruby.java.addons.IOJavaAddons","to_channel","to_channel");
        runtime.addBoundMethod("org.jruby.java.addons.IOJavaAddons","to_outputstream","to_outputstream");
        runtime.addBoundMethod("org.jruby.java.addons.IOJavaAddons","to_inputstream","to_inputstream");
    }
    static {
     }
}
