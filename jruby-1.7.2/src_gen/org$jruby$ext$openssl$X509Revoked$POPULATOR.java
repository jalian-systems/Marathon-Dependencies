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
public class org$jruby$ext$openssl$X509Revoked$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.ext.openssl.X509Revoked$INVOKER$i$0$0$extensions(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "extensions", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.X509Revoked.class, "extensions", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("extensions", javaMethod);
        javaMethod = new org.jruby.ext.openssl.X509Revoked$INVOKER$i$0$0$time(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "time", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.X509Revoked.class, "time", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("time", javaMethod);
        javaMethod = new org.jruby.ext.openssl.X509Revoked$INVOKER$i$1$0$set_time(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "set_time", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.X509Revoked.class, "set_time", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("time=", javaMethod);
        javaMethod = new org.jruby.ext.openssl.X509Revoked$INVOKER$i$0$0$serial(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "serial", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.X509Revoked.class, "serial", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("serial", javaMethod);
        javaMethod = new org.jruby.ext.openssl.X509Revoked$INVOKER$i$1$0$set_extensions(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "set_extensions", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.X509Revoked.class, "set_extensions", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("extensions=", javaMethod);
        javaMethod = new org.jruby.ext.openssl.X509Revoked$INVOKER$i$1$0$add_extension(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "add_extension", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.X509Revoked.class, "add_extension", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("add_extension", javaMethod);
        javaMethod = new org.jruby.ext.openssl.X509Revoked$INVOKER$i$1$0$set_serial(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "set_serial", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.X509Revoked.class, "set_serial", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("serial=", javaMethod);
        javaMethod = new org.jruby.ext.openssl.X509Revoked$INVOKER$i$0$0$_initialize(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "_initialize", false, CallConfiguration.FrameFullScopeNone, false, org.jruby.ext.openssl.X509Revoked.class, "_initialize", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject[].class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("initialize", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.openssl.X509Revoked","extensions","extensions");
        runtime.addBoundMethod("org.jruby.ext.openssl.X509Revoked","time","time");
        runtime.addBoundMethod("org.jruby.ext.openssl.X509Revoked","set_time","time=");
        runtime.addBoundMethod("org.jruby.ext.openssl.X509Revoked","serial","serial");
        runtime.addBoundMethod("org.jruby.ext.openssl.X509Revoked","set_extensions","extensions=");
        runtime.addBoundMethod("org.jruby.ext.openssl.X509Revoked","add_extension","add_extension");
        runtime.addBoundMethod("org.jruby.ext.openssl.X509Revoked","set_serial","serial=");
        runtime.addBoundMethod("org.jruby.ext.openssl.X509Revoked","_initialize","initialize");
    }
    static {
        ASTInspector.addFrameAwareMethods("initialize");
     }
}
