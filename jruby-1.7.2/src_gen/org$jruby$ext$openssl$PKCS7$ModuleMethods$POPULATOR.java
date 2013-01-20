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
public class org$jruby$ext$openssl$PKCS7$ModuleMethods$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        RubyClass singletonClass = cls.getSingletonClass();
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.ext.openssl.PKCS7$ModuleMethods$INVOKER$s$0$0$encrypt(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "encrypt", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.PKCS7.ModuleMethods.class, "encrypt", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class});
        singletonClass.addMethodAtBootTimeOnly("encrypt", javaMethod);
        javaMethod = new org.jruby.ext.openssl.PKCS7$ModuleMethods$INVOKER$s$0$0$sign(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "sign", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.PKCS7.ModuleMethods.class, "sign", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class});
        singletonClass.addMethodAtBootTimeOnly("sign", javaMethod);
        javaMethod = new org.jruby.ext.openssl.PKCS7$ModuleMethods$INVOKER$s$0$0$write_smime(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "write_smime", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.PKCS7.ModuleMethods.class, "write_smime", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class});
        singletonClass.addMethodAtBootTimeOnly("write_smime", javaMethod);
        javaMethod = new org.jruby.ext.openssl.PKCS7$ModuleMethods$INVOKER$s$1$0$read_smime(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "read_smime", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.PKCS7.ModuleMethods.class, "read_smime", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        singletonClass.addMethodAtBootTimeOnly("read_smime", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.openssl.PKCS7.ModuleMethods","encrypt","encrypt");
        runtime.addBoundMethod("org.jruby.ext.openssl.PKCS7.ModuleMethods","sign","sign");
        runtime.addBoundMethod("org.jruby.ext.openssl.PKCS7.ModuleMethods","write_smime","write_smime");
        runtime.addBoundMethod("org.jruby.ext.openssl.PKCS7.ModuleMethods","read_smime","read_smime");
    }
    static {
     }
}
