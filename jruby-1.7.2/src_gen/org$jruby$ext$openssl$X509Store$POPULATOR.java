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
public class org$jruby$ext$openssl$X509Store$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.ext.openssl.X509Store$INVOKER$i$1$0$add_path(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "add_path", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.X509Store.class, "add_path", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("add_path", javaMethod);
        javaMethod = new org.jruby.ext.openssl.X509Store$INVOKER$i$1$0$set_verify_callback(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "set_verify_callback", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.X509Store.class, "set_verify_callback", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("verify_callback=", javaMethod);
        javaMethod = new org.jruby.ext.openssl.X509Store$INVOKER$i$1$0$add_cert(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "add_cert", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.X509Store.class, "add_cert", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("add_cert", javaMethod);
        javaMethod = new org.jruby.ext.openssl.X509Store$INVOKER$i$0$0$verify(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "verify", false, CallConfiguration.FrameFullScopeNone, false, org.jruby.ext.openssl.X509Store.class, "verify", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject[].class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("verify", javaMethod);
        javaMethod = new org.jruby.ext.openssl.X509Store$INVOKER$i$0$0$set_default_paths(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "set_default_paths", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.X509Store.class, "set_default_paths", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("set_default_paths", javaMethod);
        javaMethod = new org.jruby.ext.openssl.X509Store$INVOKER$i$1$0$set_time(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "set_time", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.X509Store.class, "set_time", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("time=", javaMethod);
        javaMethod = new org.jruby.ext.openssl.X509Store$INVOKER$i$1$0$add_crl(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "add_crl", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.X509Store.class, "add_crl", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("add_crl", javaMethod);
        javaMethod = new org.jruby.ext.openssl.X509Store$INVOKER$i$1$0$set_trust(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "set_trust", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.X509Store.class, "set_trust", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("trust=", javaMethod);
        javaMethod = new org.jruby.ext.openssl.X509Store$INVOKER$i$1$0$set_flags(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "set_flags", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.X509Store.class, "set_flags", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("flags=", javaMethod);
        javaMethod = new org.jruby.ext.openssl.X509Store$INVOKER$i$1$0$set_purpose(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "set_purpose", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.X509Store.class, "set_purpose", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("purpose=", javaMethod);
        javaMethod = new org.jruby.ext.openssl.X509Store$INVOKER$i$1$0$add_file(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "add_file", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.X509Store.class, "add_file", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("add_file", javaMethod);
        javaMethod = new org.jruby.ext.openssl.X509Store$INVOKER$i$0$0$_initialize(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "_initialize", false, CallConfiguration.FrameFullScopeNone, false, org.jruby.ext.openssl.X509Store.class, "_initialize", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject[].class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("initialize", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.openssl.X509Store","add_path","add_path");
        runtime.addBoundMethod("org.jruby.ext.openssl.X509Store","set_verify_callback","verify_callback=");
        runtime.addBoundMethod("org.jruby.ext.openssl.X509Store","add_cert","add_cert");
        runtime.addBoundMethod("org.jruby.ext.openssl.X509Store","verify","verify");
        runtime.addBoundMethod("org.jruby.ext.openssl.X509Store","set_default_paths","set_default_paths");
        runtime.addBoundMethod("org.jruby.ext.openssl.X509Store","set_time","time=");
        runtime.addBoundMethod("org.jruby.ext.openssl.X509Store","add_crl","add_crl");
        runtime.addBoundMethod("org.jruby.ext.openssl.X509Store","set_trust","trust=");
        runtime.addBoundMethod("org.jruby.ext.openssl.X509Store","set_flags","flags=");
        runtime.addBoundMethod("org.jruby.ext.openssl.X509Store","set_purpose","purpose=");
        runtime.addBoundMethod("org.jruby.ext.openssl.X509Store","add_file","add_file");
        runtime.addBoundMethod("org.jruby.ext.openssl.X509Store","_initialize","initialize");
    }
    static {
        ASTInspector.addFrameAwareMethods("initialize");
     }
}
