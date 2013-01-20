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
public class org$jruby$javasupport$JavaField$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.javasupport.JavaField$INVOKER$i$0$0$to_generic_string(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "to_generic_string", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.javasupport.JavaField.class, "to_generic_string", org.jruby.RubyString.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("to_generic_string", javaMethod);
        javaMethod = new org.jruby.javasupport.JavaField$INVOKER$i$2$0$set_value(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 2, "set_value", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.javasupport.JavaField.class, "set_value", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("set_value", javaMethod);
        javaMethod = new org.jruby.javasupport.JavaField$INVOKER$i$0$0$name(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "name", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.javasupport.JavaField.class, "name", org.jruby.RubyString.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("name", javaMethod);
        javaMethod = new org.jruby.javasupport.JavaField$INVOKER$i$1$0$value(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "value", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.javasupport.JavaField.class, "value", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("value", javaMethod);
        javaMethod = new org.jruby.javasupport.JavaField$INVOKER$i$0$0$field_type(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "field_type", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.javasupport.JavaField.class, "field_type", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("type", javaMethod);
        javaMethod = new org.jruby.javasupport.JavaField$INVOKER$i$0$0$static_p(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "static_p", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.javasupport.JavaField.class, "static_p", org.jruby.RubyBoolean.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("static?", javaMethod);
        javaMethod = new org.jruby.javasupport.JavaField$INVOKER$i$0$0$public_p(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "public_p", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.javasupport.JavaField.class, "public_p", org.jruby.RubyBoolean.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("public?", javaMethod);
        javaMethod = new org.jruby.javasupport.JavaField$INVOKER$i$0$0$static_value(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "static_value", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.javasupport.JavaField.class, "static_value", org.jruby.javasupport.JavaObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("static_value", javaMethod);
        javaMethod = new org.jruby.javasupport.JavaField$INVOKER$i$1$0$op_equal(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "op_equal", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.javasupport.JavaField.class, "op_equal", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("==", javaMethod);
        cls.addMethodAtBootTimeOnly("===", javaMethod);
        javaMethod = new org.jruby.javasupport.JavaField$INVOKER$i$0$0$final_p(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "final_p", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.javasupport.JavaField.class, "final_p", org.jruby.RubyBoolean.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("final?", javaMethod);
        javaMethod = new org.jruby.javasupport.JavaField$INVOKER$i$0$0$value_type(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "value_type", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.javasupport.JavaField.class, "value_type", org.jruby.RubyString.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("value_type", javaMethod);
        javaMethod = new org.jruby.javasupport.JavaField$INVOKER$i$0$0$enum_constant_p(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "enum_constant_p", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.javasupport.JavaField.class, "enum_constant_p", org.jruby.RubyBoolean.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("enum_constant?", javaMethod);
        javaMethod = new org.jruby.javasupport.JavaField$INVOKER$i$1$0$set_static_value(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "set_static_value", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.javasupport.JavaField.class, "set_static_value", org.jruby.javasupport.JavaObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("set_static_value", javaMethod);
        runtime.addBoundMethod("org.jruby.javasupport.JavaField","to_generic_string","to_generic_string");
        runtime.addBoundMethod("org.jruby.javasupport.JavaField","set_value","set_value");
        runtime.addBoundMethod("org.jruby.javasupport.JavaField","name","name");
        runtime.addBoundMethod("org.jruby.javasupport.JavaField","value","value");
        runtime.addBoundMethod("org.jruby.javasupport.JavaField","field_type","type");
        runtime.addBoundMethod("org.jruby.javasupport.JavaField","static_p","static?");
        runtime.addBoundMethod("org.jruby.javasupport.JavaField","public_p","public?");
        runtime.addBoundMethod("org.jruby.javasupport.JavaField","static_value","static_value");
        runtime.addBoundMethod("org.jruby.javasupport.JavaField","op_equal","==");
        runtime.addBoundMethod("org.jruby.javasupport.JavaField","final_p","final?");
        runtime.addBoundMethod("org.jruby.javasupport.JavaField","value_type","value_type");
        runtime.addBoundMethod("org.jruby.javasupport.JavaField","enum_constant_p","enum_constant?");
        runtime.addBoundMethod("org.jruby.javasupport.JavaField","set_static_value","set_static_value");
    }
    static {
     }
}
