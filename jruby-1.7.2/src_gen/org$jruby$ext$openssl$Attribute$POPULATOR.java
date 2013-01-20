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
public class org$jruby$ext$openssl$Attribute$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.ext.openssl.Attribute$INVOKER$i$1$0$set_value(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "set_value", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.Attribute.class, "set_value", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("value=", javaMethod);
        javaMethod = new org.jruby.ext.openssl.Attribute$INVOKER$i$0$0$value(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "value", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.Attribute.class, "value", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("value", javaMethod);
        javaMethod = new org.jruby.ext.openssl.Attribute$INVOKER$i$0$0$to_der(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "to_der", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.Attribute.class, "to_der", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("to_der", javaMethod);
        javaMethod = new org.jruby.ext.openssl.Attribute$INVOKER$i$1$0$set_oid(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "set_oid", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.Attribute.class, "set_oid", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("oid=", javaMethod);
        javaMethod = new org.jruby.ext.openssl.Attribute$INVOKER$i$0$0$oid(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "oid", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.Attribute.class, "oid", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("oid", javaMethod);
        javaMethod = new org.jruby.ext.openssl.Attribute$INVOKER$i$0$1$_initialize(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "_initialize", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.Attribute.class, "_initialize", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject[].class});
        cls.addMethodAtBootTimeOnly("initialize", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.openssl.Attribute","set_value","value=");
        runtime.addBoundMethod("org.jruby.ext.openssl.Attribute","value","value");
        runtime.addBoundMethod("org.jruby.ext.openssl.Attribute","to_der","to_der");
        runtime.addBoundMethod("org.jruby.ext.openssl.Attribute","set_oid","oid=");
        runtime.addBoundMethod("org.jruby.ext.openssl.Attribute","oid","oid");
        runtime.addBoundMethod("org.jruby.ext.openssl.Attribute","_initialize","initialize");
    }
    static {
     }
}
