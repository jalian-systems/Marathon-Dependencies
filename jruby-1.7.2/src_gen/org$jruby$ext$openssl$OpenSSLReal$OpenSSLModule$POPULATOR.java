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
public class org$jruby$ext$openssl$OpenSSLReal$OpenSSLModule$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        RubyClass singletonClass = cls.getSingletonClass();
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.ext.openssl.OpenSSLReal$OpenSSLModule$INVOKER$s$0$0$errors(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "errors", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.OpenSSLReal.OpenSSLModule.class, "errors", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        singletonClass.addMethodAtBootTimeOnly("errors", javaMethod);
        javaMethod = new org.jruby.ext.openssl.OpenSSLReal$OpenSSLModule$INVOKER$s$1$0$setDebug(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "setDebug", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.OpenSSLReal.OpenSSLModule.class, "setDebug", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        singletonClass.addMethodAtBootTimeOnly("debug=", javaMethod);
        javaMethod = new org.jruby.ext.openssl.OpenSSLReal$OpenSSLModule$INVOKER$s$0$0$getDebug(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "getDebug", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.OpenSSLReal.OpenSSLModule.class, "getDebug", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        singletonClass.addMethodAtBootTimeOnly("debug", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.openssl.OpenSSLReal.OpenSSLModule","errors","errors");
        runtime.addBoundMethod("org.jruby.ext.openssl.OpenSSLReal.OpenSSLModule","setDebug","debug=");
        runtime.addBoundMethod("org.jruby.ext.openssl.OpenSSLReal.OpenSSLModule","getDebug","debug");
    }
    static {
     }
}
