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
public class org$jruby$ext$openssl$Random$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        RubyClass singletonClass = cls.getSingletonClass();
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.ext.openssl.Random$INVOKER$s$1$0$load_random_file(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "load_random_file", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.Random.class, "load_random_file", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        singletonClass.addMethodAtBootTimeOnly("load_random_file", javaMethod);
        javaMethod = new org.jruby.ext.openssl.Random$INVOKER$s$1$0$egd(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "egd", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.Random.class, "egd", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        singletonClass.addMethodAtBootTimeOnly("egd", javaMethod);
        javaMethod = new org.jruby.ext.openssl.Random$INVOKER$s$1$0$seed(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "seed", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.Random.class, "seed", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        singletonClass.addMethodAtBootTimeOnly("seed", javaMethod);
        javaMethod = new org.jruby.ext.openssl.Random$INVOKER$s$2$0$egd_bytes(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, 2, "egd_bytes", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.Random.class, "egd_bytes", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        singletonClass.addMethodAtBootTimeOnly("egd_bytes", javaMethod);
        javaMethod = new org.jruby.ext.openssl.Random$INVOKER$s$1$0$pseudo_bytes(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "pseudo_bytes", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.Random.class, "pseudo_bytes", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        singletonClass.addMethodAtBootTimeOnly("pseudo_bytes", javaMethod);
        javaMethod = new org.jruby.ext.openssl.Random$INVOKER$s$1$0$random_bytes(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "random_bytes", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.Random.class, "random_bytes", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        singletonClass.addMethodAtBootTimeOnly("random_bytes", javaMethod);
        javaMethod = new org.jruby.ext.openssl.Random$INVOKER$s$1$0$write_random_file(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "write_random_file", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.Random.class, "write_random_file", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        singletonClass.addMethodAtBootTimeOnly("write_random_file", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.openssl.Random","load_random_file","load_random_file");
        runtime.addBoundMethod("org.jruby.ext.openssl.Random","egd","egd");
        runtime.addBoundMethod("org.jruby.ext.openssl.Random","seed","seed");
        runtime.addBoundMethod("org.jruby.ext.openssl.Random","egd_bytes","egd_bytes");
        runtime.addBoundMethod("org.jruby.ext.openssl.Random","pseudo_bytes","pseudo_bytes");
        runtime.addBoundMethod("org.jruby.ext.openssl.Random","random_bytes","random_bytes");
        runtime.addBoundMethod("org.jruby.ext.openssl.Random","write_random_file","write_random_file");
    }
    static {
     }
}
