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
public class org$jruby$ext$openssl$Cipher$CipherModule$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        RubyClass singletonClass = cls.getSingletonClass();
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.ext.openssl.Cipher$CipherModule$INVOKER$s$0$0$ciphers(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "ciphers", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.Cipher.CipherModule.class, "ciphers", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        singletonClass.addMethodAtBootTimeOnly("ciphers", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.openssl.Cipher.CipherModule","ciphers","ciphers");
    }
    static {
     }
}
