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
public class org$jruby$ext$digest$RubyDigest$DigestBase$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.ext.digest.RubyDigest$DigestBase$INVOKER$i$1$0$update(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "update", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.digest.RubyDigest.DigestBase.class, "update", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("update", javaMethod);
        cls.addMethodAtBootTimeOnly("<<", javaMethod);
        javaMethod = new org.jruby.ext.digest.RubyDigest$DigestBase$INVOKER$i$0$0$finish(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "finish", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.digest.RubyDigest.DigestBase.class, "finish", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("finish", javaMethod);
        javaMethod = new org.jruby.ext.digest.RubyDigest$DigestBase$INVOKER$i$1$0$initialize_copy(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "initialize_copy", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.digest.RubyDigest.DigestBase.class, "initialize_copy", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("initialize_copy", javaMethod);
        javaMethod = new org.jruby.ext.digest.RubyDigest$DigestBase$INVOKER$i$0$0$reset(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "reset", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.digest.RubyDigest.DigestBase.class, "reset", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("reset", javaMethod);
        javaMethod = new org.jruby.ext.digest.RubyDigest$DigestBase$INVOKER$i$0$0$digest_length(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "digest_length", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.digest.RubyDigest.DigestBase.class, "digest_length", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("digest_length", javaMethod);
        javaMethod = new org.jruby.ext.digest.RubyDigest$DigestBase$INVOKER$i$0$0$block_length(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "block_length", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.digest.RubyDigest.DigestBase.class, "block_length", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("block_length", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.digest.RubyDigest.DigestBase","update","update");
        runtime.addBoundMethod("org.jruby.ext.digest.RubyDigest.DigestBase","finish","finish");
        runtime.addBoundMethod("org.jruby.ext.digest.RubyDigest.DigestBase","initialize_copy","initialize_copy");
        runtime.addBoundMethod("org.jruby.ext.digest.RubyDigest.DigestBase","reset","reset");
        runtime.addBoundMethod("org.jruby.ext.digest.RubyDigest.DigestBase","digest_length","digest_length");
        runtime.addBoundMethod("org.jruby.ext.digest.RubyDigest.DigestBase","block_length","block_length");
    }
    static {
     }
}
