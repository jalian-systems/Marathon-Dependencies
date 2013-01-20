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
public class org$jruby$ext$openssl$X509Extensions$Extension$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.ext.openssl.X509Extensions$Extension$INVOKER$i$1$0$set_value(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "set_value", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.X509Extensions.Extension.class, "set_value", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("value=", javaMethod);
        javaMethod = new org.jruby.ext.openssl.X509Extensions$Extension$INVOKER$i$0$0$critical_p(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "critical_p", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.X509Extensions.Extension.class, "critical_p", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("critical?", javaMethod);
        javaMethod = new org.jruby.ext.openssl.X509Extensions$Extension$INVOKER$i$1$0$set_critical(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "set_critical", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.X509Extensions.Extension.class, "set_critical", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("critical=", javaMethod);
        javaMethod = new org.jruby.ext.openssl.X509Extensions$Extension$INVOKER$i$0$0$value(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "value", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.X509Extensions.Extension.class, "value", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("value", javaMethod);
        javaMethod = new org.jruby.ext.openssl.X509Extensions$Extension$INVOKER$i$0$0$to_der(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "to_der", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.X509Extensions.Extension.class, "to_der", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("to_der", javaMethod);
        javaMethod = new org.jruby.ext.openssl.X509Extensions$Extension$INVOKER$i$1$0$set_oid(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "set_oid", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.X509Extensions.Extension.class, "set_oid", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("oid=", javaMethod);
        javaMethod = new org.jruby.ext.openssl.X509Extensions$Extension$INVOKER$i$0$0$oid(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "oid", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.X509Extensions.Extension.class, "oid", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("oid", javaMethod);
        javaMethod = new org.jruby.ext.openssl.X509Extensions$Extension$INVOKER$i$0$0$_initialize(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "_initialize", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.X509Extensions.Extension.class, "_initialize", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject[].class});
        cls.addMethodAtBootTimeOnly("initialize", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.openssl.X509Extensions.Extension","set_value","value=");
        runtime.addBoundMethod("org.jruby.ext.openssl.X509Extensions.Extension","critical_p","critical?");
        runtime.addBoundMethod("org.jruby.ext.openssl.X509Extensions.Extension","set_critical","critical=");
        runtime.addBoundMethod("org.jruby.ext.openssl.X509Extensions.Extension","value","value");
        runtime.addBoundMethod("org.jruby.ext.openssl.X509Extensions.Extension","to_der","to_der");
        runtime.addBoundMethod("org.jruby.ext.openssl.X509Extensions.Extension","set_oid","oid=");
        runtime.addBoundMethod("org.jruby.ext.openssl.X509Extensions.Extension","oid","oid");
        runtime.addBoundMethod("org.jruby.ext.openssl.X509Extensions.Extension","_initialize","initialize");
    }
    static {
     }
}
