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
public class org$jruby$ext$openssl$PKey$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.ext.openssl.PKey$INVOKER$i$2$0$sign(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 2, "sign", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.PKey.class, "sign", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("sign", javaMethod);
        javaMethod = new org.jruby.ext.openssl.PKey$INVOKER$i$0$0$initialize(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "initialize", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.PKey.class, "initialize", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("initialize", javaMethod);
        javaMethod = new org.jruby.ext.openssl.PKey$INVOKER$i$3$0$verify(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 3, "verify", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.PKey.class, "verify", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("verify", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.openssl.PKey","sign","sign");
        runtime.addBoundMethod("org.jruby.ext.openssl.PKey","initialize","initialize");
        runtime.addBoundMethod("org.jruby.ext.openssl.PKey","verify","verify");
    }
    static {
     }
}
