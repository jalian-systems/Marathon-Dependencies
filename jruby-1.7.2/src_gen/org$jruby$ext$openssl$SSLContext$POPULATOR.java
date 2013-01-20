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
public class org$jruby$ext$openssl$SSLContext$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.ext.openssl.SSLContext$INVOKER$i$0$0$ciphers(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "ciphers", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.SSLContext.class, "ciphers", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("ciphers", javaMethod);
        javaMethod = new org.jruby.ext.openssl.SSLContext$INVOKER$i$0$0$initialize(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "initialize", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.SSLContext.class, "initialize", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject[].class});
        cls.addMethodAtBootTimeOnly("initialize", javaMethod);
        javaMethod = new org.jruby.ext.openssl.SSLContext$INVOKER$i$1$0$set_ssl_version(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "set_ssl_version", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.SSLContext.class, "set_ssl_version", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("ssl_version=", javaMethod);
        javaMethod = new org.jruby.ext.openssl.SSLContext$INVOKER$i$1$0$set_ciphers(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "set_ciphers", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.SSLContext.class, "set_ciphers", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("ciphers=", javaMethod);
        javaMethod = new org.jruby.ext.openssl.SSLContext$INVOKER$i$0$0$setup(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "setup", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.SSLContext.class, "setup", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("setup", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.openssl.SSLContext","ciphers","ciphers");
        runtime.addBoundMethod("org.jruby.ext.openssl.SSLContext","initialize","initialize");
        runtime.addBoundMethod("org.jruby.ext.openssl.SSLContext","set_ssl_version","ssl_version=");
        runtime.addBoundMethod("org.jruby.ext.openssl.SSLContext","set_ciphers","ciphers=");
        runtime.addBoundMethod("org.jruby.ext.openssl.SSLContext","setup","setup");
    }
    static {
     }
}
