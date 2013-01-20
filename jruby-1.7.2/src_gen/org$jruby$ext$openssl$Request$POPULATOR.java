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
public class org$jruby$ext$openssl$Request$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.ext.openssl.Request$INVOKER$i$1$0$set_version(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "set_version", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.Request.class, "set_version", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("version=", javaMethod);
        javaMethod = new org.jruby.ext.openssl.Request$INVOKER$i$1$0$verify(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "verify", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.Request.class, "verify", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("verify", javaMethod);
        javaMethod = new org.jruby.ext.openssl.Request$INVOKER$i$2$0$sign(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 2, "sign", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.Request.class, "sign", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("sign", javaMethod);
        javaMethod = new org.jruby.ext.openssl.Request$INVOKER$i$0$0$to_text(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "to_text", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.Request.class, "to_text", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("to_text", javaMethod);
        javaMethod = new org.jruby.ext.openssl.Request$INVOKER$i$0$0$to_pem(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "to_pem", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.Request.class, "to_pem", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("to_pem", javaMethod);
        cls.addMethodAtBootTimeOnly("to_s", javaMethod);
        javaMethod = new org.jruby.ext.openssl.Request$INVOKER$i$0$0$subject(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "subject", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.Request.class, "subject", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("subject", javaMethod);
        javaMethod = new org.jruby.ext.openssl.Request$INVOKER$i$0$0$signature_algorithm(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "signature_algorithm", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.Request.class, "signature_algorithm", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("signature_algorithm", javaMethod);
        javaMethod = new org.jruby.ext.openssl.Request$INVOKER$i$0$0$version(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "version", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.Request.class, "version", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("version", javaMethod);
        javaMethod = new org.jruby.ext.openssl.Request$INVOKER$i$0$0$attributes(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "attributes", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.Request.class, "attributes", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("attributes", javaMethod);
        javaMethod = new org.jruby.ext.openssl.Request$INVOKER$i$1$0$initialize_copy(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "initialize_copy", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.Request.class, "initialize_copy", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("initialize_copy", javaMethod);
        javaMethod = new org.jruby.ext.openssl.Request$INVOKER$i$1$0$set_subject(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "set_subject", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.Request.class, "set_subject", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("subject=", javaMethod);
        javaMethod = new org.jruby.ext.openssl.Request$INVOKER$i$0$0$public_key(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "public_key", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.Request.class, "public_key", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("public_key", javaMethod);
        javaMethod = new org.jruby.ext.openssl.Request$INVOKER$i$1$0$add_attribute(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "add_attribute", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.Request.class, "add_attribute", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("add_attribute", javaMethod);
        javaMethod = new org.jruby.ext.openssl.Request$INVOKER$i$0$0$to_der(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "to_der", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.Request.class, "to_der", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("to_der", javaMethod);
        javaMethod = new org.jruby.ext.openssl.Request$INVOKER$i$1$0$set_attributes(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "set_attributes", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.Request.class, "set_attributes", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("attributes=", javaMethod);
        javaMethod = new org.jruby.ext.openssl.Request$INVOKER$i$0$0$_initialize(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "_initialize", false, CallConfiguration.FrameFullScopeNone, false, org.jruby.ext.openssl.Request.class, "_initialize", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject[].class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("initialize", javaMethod);
        javaMethod = new org.jruby.ext.openssl.Request$INVOKER$i$1$0$set_public_key(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "set_public_key", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.Request.class, "set_public_key", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("public_key=", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.openssl.Request","set_version","version=");
        runtime.addBoundMethod("org.jruby.ext.openssl.Request","verify","verify");
        runtime.addBoundMethod("org.jruby.ext.openssl.Request","sign","sign");
        runtime.addBoundMethod("org.jruby.ext.openssl.Request","to_text","to_text");
        runtime.addBoundMethod("org.jruby.ext.openssl.Request","to_pem","to_pem");
        runtime.addBoundMethod("org.jruby.ext.openssl.Request","subject","subject");
        runtime.addBoundMethod("org.jruby.ext.openssl.Request","signature_algorithm","signature_algorithm");
        runtime.addBoundMethod("org.jruby.ext.openssl.Request","version","version");
        runtime.addBoundMethod("org.jruby.ext.openssl.Request","attributes","attributes");
        runtime.addBoundMethod("org.jruby.ext.openssl.Request","initialize_copy","initialize_copy");
        runtime.addBoundMethod("org.jruby.ext.openssl.Request","set_subject","subject=");
        runtime.addBoundMethod("org.jruby.ext.openssl.Request","public_key","public_key");
        runtime.addBoundMethod("org.jruby.ext.openssl.Request","add_attribute","add_attribute");
        runtime.addBoundMethod("org.jruby.ext.openssl.Request","to_der","to_der");
        runtime.addBoundMethod("org.jruby.ext.openssl.Request","set_attributes","attributes=");
        runtime.addBoundMethod("org.jruby.ext.openssl.Request","_initialize","initialize");
        runtime.addBoundMethod("org.jruby.ext.openssl.Request","set_public_key","public_key=");
    }
    static {
        ASTInspector.addFrameAwareMethods("initialize");
     }
}
