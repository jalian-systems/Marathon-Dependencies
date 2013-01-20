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
public class org$jruby$javasupport$JavaObject$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        RubyClass singletonClass = cls.getSingletonClass();
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.javasupport.JavaObject$INVOKER$s$1$0$wrap(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "wrap", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.javasupport.JavaObject.class, "wrap", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        singletonClass.addMethodAtBootTimeOnly("wrap", javaMethod);
        runtime.addBoundMethod("org.jruby.javasupport.JavaObject","wrap","wrap");
        javaMethod = new org.jruby.javasupport.JavaObject$INVOKER$i$1$0$marshal_load(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "marshal_load", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.javasupport.JavaObject.class, "marshal_load", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("marshal_load", javaMethod);
        javaMethod = new org.jruby.javasupport.JavaObject$INVOKER$i$0$0$java_class(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "java_class", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.javasupport.JavaObject.class, "java_class", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("java_class", javaMethod);
        javaMethod = new org.jruby.javasupport.JavaObject$INVOKER$i$1$0$same(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "same", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.javasupport.JavaObject.class, "same", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("equal?", javaMethod);
        javaMethod = new org.jruby.javasupport.JavaObject$INVOKER$i$0$0$to_s(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "to_s", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.javasupport.JavaObject.class, "to_s", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("to_s", javaMethod);
        javaMethod = new org.jruby.javasupport.JavaObject$INVOKER$i$0$0$ruby_synchronized(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "ruby_synchronized", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.javasupport.JavaObject.class, "ruby_synchronized", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("synchronized", javaMethod);
        javaMethod = new org.jruby.javasupport.JavaObject$INVOKER$i$1$0$op_equal(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "op_equal", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.javasupport.JavaObject.class, "op_equal", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("==", javaMethod);
        cls.addMethodAtBootTimeOnly("eql?", javaMethod);
        javaMethod = new org.jruby.javasupport.JavaObject$INVOKER$i$0$0$is_java_proxy(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "is_java_proxy", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.javasupport.JavaObject.class, "is_java_proxy", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("java_proxy?", javaMethod);
        javaMethod = new org.jruby.javasupport.JavaObject$INVOKER$i$0$0$hash(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "hash", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.javasupport.JavaObject.class, "hash", org.jruby.RubyFixnum.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("hash", javaMethod);
        javaMethod = new org.jruby.javasupport.JavaObject$INVOKER$i$0$0$marshal_dump(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "marshal_dump", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.javasupport.JavaObject.class, "marshal_dump", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("marshal_dump", javaMethod);
        javaMethod = new org.jruby.javasupport.JavaObject$INVOKER$i$0$0$length(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "length", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.javasupport.JavaObject.class, "length", org.jruby.RubyFixnum.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("length", javaMethod);
        javaMethod = new org.jruby.javasupport.JavaObject$INVOKER$i$0$0$java_type(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "java_type", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.javasupport.JavaObject.class, "java_type", org.jruby.RubyString.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("java_type", javaMethod);
        runtime.addBoundMethod("org.jruby.javasupport.JavaObject","marshal_load","marshal_load");
        runtime.addBoundMethod("org.jruby.javasupport.JavaObject","java_class","java_class");
        runtime.addBoundMethod("org.jruby.javasupport.JavaObject","same","equal?");
        runtime.addBoundMethod("org.jruby.javasupport.JavaObject","to_s","to_s");
        runtime.addBoundMethod("org.jruby.javasupport.JavaObject","ruby_synchronized","synchronized");
        runtime.addBoundMethod("org.jruby.javasupport.JavaObject","op_equal","==");
        runtime.addBoundMethod("org.jruby.javasupport.JavaObject","is_java_proxy","java_proxy?");
        runtime.addBoundMethod("org.jruby.javasupport.JavaObject","hash","hash");
        runtime.addBoundMethod("org.jruby.javasupport.JavaObject","marshal_dump","marshal_dump");
        runtime.addBoundMethod("org.jruby.javasupport.JavaObject","length","length");
        runtime.addBoundMethod("org.jruby.javasupport.JavaObject","java_type","java_type");
    }
    static {
     }
}
