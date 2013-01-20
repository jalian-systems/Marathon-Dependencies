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
public class org$jruby$ext$openssl$NetscapeSPKI$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.ext.openssl.NetscapeSPKI$INVOKER$i$0$0$challenge(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "challenge", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.NetscapeSPKI.class, "challenge", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("challenge", javaMethod);
        javaMethod = new org.jruby.ext.openssl.NetscapeSPKI$INVOKER$i$1$0$verify(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "verify", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.NetscapeSPKI.class, "verify", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("verify", javaMethod);
        javaMethod = new org.jruby.ext.openssl.NetscapeSPKI$INVOKER$i$2$0$sign(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 2, "sign", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.NetscapeSPKI.class, "sign", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("sign", javaMethod);
        javaMethod = new org.jruby.ext.openssl.NetscapeSPKI$INVOKER$i$0$0$to_text(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "to_text", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.NetscapeSPKI.class, "to_text", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("to_text", javaMethod);
        javaMethod = new org.jruby.ext.openssl.NetscapeSPKI$INVOKER$i$0$0$public_key(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "public_key", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.NetscapeSPKI.class, "public_key", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("public_key", javaMethod);
        javaMethod = new org.jruby.ext.openssl.NetscapeSPKI$INVOKER$i$0$0$to_pem(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "to_pem", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.NetscapeSPKI.class, "to_pem", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("to_pem", javaMethod);
        cls.addMethodAtBootTimeOnly("to_s", javaMethod);
        javaMethod = new org.jruby.ext.openssl.NetscapeSPKI$INVOKER$i$1$0$set_challenge(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "set_challenge", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.NetscapeSPKI.class, "set_challenge", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("challenge=", javaMethod);
        javaMethod = new org.jruby.ext.openssl.NetscapeSPKI$INVOKER$i$0$0$to_der(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "to_der", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.NetscapeSPKI.class, "to_der", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("to_der", javaMethod);
        javaMethod = new org.jruby.ext.openssl.NetscapeSPKI$INVOKER$i$1$0$set_public_key(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "set_public_key", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.NetscapeSPKI.class, "set_public_key", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("public_key=", javaMethod);
        javaMethod = new org.jruby.ext.openssl.NetscapeSPKI$INVOKER$i$0$0$_initialize(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "_initialize", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.NetscapeSPKI.class, "_initialize", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject[].class});
        cls.addMethodAtBootTimeOnly("initialize", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.openssl.NetscapeSPKI","challenge","challenge");
        runtime.addBoundMethod("org.jruby.ext.openssl.NetscapeSPKI","verify","verify");
        runtime.addBoundMethod("org.jruby.ext.openssl.NetscapeSPKI","sign","sign");
        runtime.addBoundMethod("org.jruby.ext.openssl.NetscapeSPKI","to_text","to_text");
        runtime.addBoundMethod("org.jruby.ext.openssl.NetscapeSPKI","public_key","public_key");
        runtime.addBoundMethod("org.jruby.ext.openssl.NetscapeSPKI","to_pem","to_pem");
        runtime.addBoundMethod("org.jruby.ext.openssl.NetscapeSPKI","set_challenge","challenge=");
        runtime.addBoundMethod("org.jruby.ext.openssl.NetscapeSPKI","to_der","to_der");
        runtime.addBoundMethod("org.jruby.ext.openssl.NetscapeSPKI","set_public_key","public_key=");
        runtime.addBoundMethod("org.jruby.ext.openssl.NetscapeSPKI","_initialize","initialize");
    }
    static {
     }
}
