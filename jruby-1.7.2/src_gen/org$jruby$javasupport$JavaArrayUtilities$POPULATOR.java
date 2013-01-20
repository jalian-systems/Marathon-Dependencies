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
public class org$jruby$javasupport$JavaArrayUtilities$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        RubyClass singletonClass = cls.getSingletonClass();
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.javasupport.JavaArrayUtilities$INVOKER$s$1$0$bytes_to_ruby_string(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, 1, "bytes_to_ruby_string", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.javasupport.JavaArrayUtilities.class, "bytes_to_ruby_string", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("bytes_to_ruby_string", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("bytes_to_ruby_string", moduleMethod);
        javaMethod = new org.jruby.javasupport.JavaArrayUtilities$INVOKER$s$1$0$java_to_ruby(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "java_to_ruby", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.javasupport.JavaArrayUtilities.class, "java_to_ruby", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("java_to_ruby", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("java_to_ruby", moduleMethod);
        javaMethod = new org.jruby.javasupport.JavaArrayUtilities$INVOKER$s$1$0$ruby_string_to_bytes(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, 1, "ruby_string_to_bytes", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.javasupport.JavaArrayUtilities.class, "ruby_string_to_bytes", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("ruby_string_to_bytes", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("ruby_string_to_bytes", moduleMethod);
        runtime.addBoundMethod("org.jruby.javasupport.JavaArrayUtilities","bytes_to_ruby_string","bytes_to_ruby_string");
        runtime.addBoundMethod("org.jruby.javasupport.JavaArrayUtilities","java_to_ruby","java_to_ruby");
        runtime.addBoundMethod("org.jruby.javasupport.JavaArrayUtilities","ruby_string_to_bytes","ruby_string_to_bytes");
    }
    static {
     }
}
