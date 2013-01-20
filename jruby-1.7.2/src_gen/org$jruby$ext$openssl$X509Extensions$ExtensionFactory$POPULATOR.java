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
public class org$jruby$ext$openssl$X509Extensions$ExtensionFactory$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.ext.openssl.X509Extensions$ExtensionFactory$INVOKER$i$1$0$set_issuer_cert(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "set_issuer_cert", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.X509Extensions.ExtensionFactory.class, "set_issuer_cert", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("issuer_certificate=", javaMethod);
        javaMethod = new org.jruby.ext.openssl.X509Extensions$ExtensionFactory$INVOKER$i$1$0$set_subject_cert(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "set_subject_cert", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.X509Extensions.ExtensionFactory.class, "set_subject_cert", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("subject_certificate=", javaMethod);
        javaMethod = new org.jruby.ext.openssl.X509Extensions$ExtensionFactory$INVOKER$i$0$0$initialize(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "initialize", false, CallConfiguration.FrameFullScopeNone, false, org.jruby.ext.openssl.X509Extensions.ExtensionFactory.class, "initialize", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject[].class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("initialize", javaMethod);
        javaMethod = new org.jruby.ext.openssl.X509Extensions$ExtensionFactory$INVOKER$i$0$0$create_ext(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "create_ext", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.X509Extensions.ExtensionFactory.class, "create_ext", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject[].class});
        cls.addMethodAtBootTimeOnly("create_ext", javaMethod);
        javaMethod = new org.jruby.ext.openssl.X509Extensions$ExtensionFactory$INVOKER$i$1$0$set_crl(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "set_crl", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.X509Extensions.ExtensionFactory.class, "set_crl", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("crl=", javaMethod);
        javaMethod = new org.jruby.ext.openssl.X509Extensions$ExtensionFactory$INVOKER$i$1$0$set_config(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "set_config", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.X509Extensions.ExtensionFactory.class, "set_config", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("config=", javaMethod);
        javaMethod = new org.jruby.ext.openssl.X509Extensions$ExtensionFactory$INVOKER$i$1$0$set_subject_req(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "set_subject_req", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.X509Extensions.ExtensionFactory.class, "set_subject_req", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("subject_request=", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.openssl.X509Extensions.ExtensionFactory","set_issuer_cert","issuer_certificate=");
        runtime.addBoundMethod("org.jruby.ext.openssl.X509Extensions.ExtensionFactory","set_subject_cert","subject_certificate=");
        runtime.addBoundMethod("org.jruby.ext.openssl.X509Extensions.ExtensionFactory","initialize","initialize");
        runtime.addBoundMethod("org.jruby.ext.openssl.X509Extensions.ExtensionFactory","create_ext","create_ext");
        runtime.addBoundMethod("org.jruby.ext.openssl.X509Extensions.ExtensionFactory","set_crl","crl=");
        runtime.addBoundMethod("org.jruby.ext.openssl.X509Extensions.ExtensionFactory","set_config","config=");
        runtime.addBoundMethod("org.jruby.ext.openssl.X509Extensions.ExtensionFactory","set_subject_req","subject_request=");
    }
    static {
     }
}
