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
public class org$jruby$java$addons$StringJavaAddons$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        RubyClass singletonClass = cls.getSingletonClass();
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.java.addons.StringJavaAddons$INVOKER$s$1$0$from_java_bytes(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "from_java_bytes", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.java.addons.StringJavaAddons.class, "from_java_bytes", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        singletonClass.addMethodAtBootTimeOnly("from_java_bytes", javaMethod);
        javaMethod = new org.jruby.java.addons.StringJavaAddons$INVOKER$s$0$0$to_java_string(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "to_java_string", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.java.addons.StringJavaAddons.class, "to_java_string", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("to_java_string", javaMethod);
        javaMethod = new org.jruby.java.addons.StringJavaAddons$INVOKER$s$0$0$to_java_bytes(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "to_java_bytes", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.java.addons.StringJavaAddons.class, "to_java_bytes", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("to_java_bytes", javaMethod);
        runtime.addBoundMethod("org.jruby.java.addons.StringJavaAddons","from_java_bytes","from_java_bytes");
        runtime.addBoundMethod("org.jruby.java.addons.StringJavaAddons","to_java_string","to_java_string");
        runtime.addBoundMethod("org.jruby.java.addons.StringJavaAddons","to_java_bytes","to_java_bytes");
    }
    static {
     }
}
