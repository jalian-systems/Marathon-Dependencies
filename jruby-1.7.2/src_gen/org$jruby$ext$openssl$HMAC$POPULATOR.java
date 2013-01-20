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
public class org$jruby$ext$openssl$HMAC$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        RubyClass singletonClass = cls.getSingletonClass();
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.ext.openssl.HMAC$INVOKER$s$3$0$s_digest(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, 3, "s_digest", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.HMAC.class, "s_digest", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        singletonClass.addMethodAtBootTimeOnly("digest", javaMethod);
        javaMethod = new org.jruby.ext.openssl.HMAC$INVOKER$s$3$0$s_hexdigest(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, 3, "s_hexdigest", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.HMAC.class, "s_hexdigest", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        singletonClass.addMethodAtBootTimeOnly("hexdigest", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.openssl.HMAC","s_digest","digest");
        runtime.addBoundMethod("org.jruby.ext.openssl.HMAC","s_hexdigest","hexdigest");
        javaMethod = new org.jruby.ext.openssl.HMAC$INVOKER$i$1$0$update(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "update", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.HMAC.class, "update", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("update", javaMethod);
        cls.addMethodAtBootTimeOnly("<<", javaMethod);
        javaMethod = new org.jruby.ext.openssl.HMAC$INVOKER$i$2$0$initialize(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 2, "initialize", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.HMAC.class, "initialize", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("initialize", javaMethod);
        javaMethod = new org.jruby.ext.openssl.HMAC$INVOKER$i$1$0$initialize_copy(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "initialize_copy", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.HMAC.class, "initialize_copy", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("initialize_copy", javaMethod);
        javaMethod = new org.jruby.ext.openssl.HMAC$INVOKER$i$0$0$digest(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "digest", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.HMAC.class, "digest", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("digest", javaMethod);
        javaMethod = new org.jruby.ext.openssl.HMAC$INVOKER$i$0$0$reset(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "reset", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.HMAC.class, "reset", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("reset", javaMethod);
        javaMethod = new org.jruby.ext.openssl.HMAC$INVOKER$i$0$0$hexdigest(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "hexdigest", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.HMAC.class, "hexdigest", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("hexdigest", javaMethod);
        cls.addMethodAtBootTimeOnly("inspect", javaMethod);
        cls.addMethodAtBootTimeOnly("to_s", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.openssl.HMAC","update","update");
        runtime.addBoundMethod("org.jruby.ext.openssl.HMAC","initialize","initialize");
        runtime.addBoundMethod("org.jruby.ext.openssl.HMAC","initialize_copy","initialize_copy");
        runtime.addBoundMethod("org.jruby.ext.openssl.HMAC","digest","digest");
        runtime.addBoundMethod("org.jruby.ext.openssl.HMAC","reset","reset");
        runtime.addBoundMethod("org.jruby.ext.openssl.HMAC","hexdigest","hexdigest");
    }
    static {
     }
}
