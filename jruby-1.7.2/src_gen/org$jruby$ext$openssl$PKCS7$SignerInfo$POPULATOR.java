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
public class org$jruby$ext$openssl$PKCS7$SignerInfo$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.ext.openssl.PKCS7$SignerInfo$INVOKER$i$3$0$initialize(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 3, "initialize", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.PKCS7.SignerInfo.class, "initialize", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("initialize", javaMethod);
        javaMethod = new org.jruby.ext.openssl.PKCS7$SignerInfo$INVOKER$i$0$0$signed_time(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "signed_time", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.PKCS7.SignerInfo.class, "signed_time", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("signed_time", javaMethod);
        javaMethod = new org.jruby.ext.openssl.PKCS7$SignerInfo$INVOKER$i$0$0$issuer(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "issuer", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.PKCS7.SignerInfo.class, "issuer", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("issuer", javaMethod);
        cls.addMethodAtBootTimeOnly("name", javaMethod);
        javaMethod = new org.jruby.ext.openssl.PKCS7$SignerInfo$INVOKER$i$0$0$serial(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "serial", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.PKCS7.SignerInfo.class, "serial", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("serial", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.openssl.PKCS7.SignerInfo","initialize","initialize");
        runtime.addBoundMethod("org.jruby.ext.openssl.PKCS7.SignerInfo","signed_time","signed_time");
        runtime.addBoundMethod("org.jruby.ext.openssl.PKCS7.SignerInfo","issuer","issuer");
        runtime.addBoundMethod("org.jruby.ext.openssl.PKCS7.SignerInfo","serial","serial");
    }
    static {
     }
}
