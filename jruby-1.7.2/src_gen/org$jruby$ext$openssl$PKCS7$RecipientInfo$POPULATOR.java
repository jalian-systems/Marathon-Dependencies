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
public class org$jruby$ext$openssl$PKCS7$RecipientInfo$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.ext.openssl.PKCS7$RecipientInfo$INVOKER$i$0$0$issuer(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "issuer", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.PKCS7.RecipientInfo.class, "issuer", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("issuer", javaMethod);
        javaMethod = new org.jruby.ext.openssl.PKCS7$RecipientInfo$INVOKER$i$1$0$initialize(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "initialize", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.PKCS7.RecipientInfo.class, "initialize", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("initialize", javaMethod);
        javaMethod = new org.jruby.ext.openssl.PKCS7$RecipientInfo$INVOKER$i$0$0$serial(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "serial", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.PKCS7.RecipientInfo.class, "serial", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("serial", javaMethod);
        javaMethod = new org.jruby.ext.openssl.PKCS7$RecipientInfo$INVOKER$i$0$0$enc_key(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "enc_key", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.PKCS7.RecipientInfo.class, "enc_key", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("enc_key", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.openssl.PKCS7.RecipientInfo","issuer","issuer");
        runtime.addBoundMethod("org.jruby.ext.openssl.PKCS7.RecipientInfo","initialize","initialize");
        runtime.addBoundMethod("org.jruby.ext.openssl.PKCS7.RecipientInfo","serial","serial");
        runtime.addBoundMethod("org.jruby.ext.openssl.PKCS7.RecipientInfo","enc_key","enc_key");
    }
    static {
     }
}
