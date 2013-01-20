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
public class org$jruby$ext$openssl$X509Name$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.ext.openssl.X509Name$INVOKER$i$add_entry(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "add_entry", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.X509Name.class, "add_entry", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("add_entry", javaMethod);
        javaMethod = new org.jruby.ext.openssl.X509Name$INVOKER$i$initialize(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "initialize", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.X509Name.class, "initialize", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("initialize", javaMethod);
        javaMethod = new org.jruby.ext.openssl.X509Name$INVOKER$i$0$0$hash(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "hash", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.X509Name.class, "hash", org.jruby.RubyFixnum.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("hash", javaMethod);
        javaMethod = new org.jruby.ext.openssl.X509Name$INVOKER$i$1$0$cmp(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "cmp", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.X509Name.class, "cmp", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("cmp", javaMethod);
        cls.addMethodAtBootTimeOnly("<=>", javaMethod);
        javaMethod = new org.jruby.ext.openssl.X509Name$INVOKER$i$0$0$to_der(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "to_der", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.X509Name.class, "to_der", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("to_der", javaMethod);
        javaMethod = new org.jruby.ext.openssl.X509Name$INVOKER$i$1$0$eql_p(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "eql_p", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.X509Name.class, "eql_p", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("eql?", javaMethod);
        javaMethod = new org.jruby.ext.openssl.X509Name$INVOKER$i$0$0$to_a(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "to_a", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.X509Name.class, "to_a", org.jruby.RubyArray.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("to_a", javaMethod);
        javaMethod = new org.jruby.ext.openssl.X509Name$INVOKER$i$0$0$_to_s(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "_to_s", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.X509Name.class, "_to_s", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject[].class});
        cls.addMethodAtBootTimeOnly("to_s", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.openssl.X509Name","add_entry","add_entry");
        runtime.addBoundMethod("org.jruby.ext.openssl.X509Name","initialize","initialize");
        runtime.addBoundMethod("org.jruby.ext.openssl.X509Name","hash","hash");
        runtime.addBoundMethod("org.jruby.ext.openssl.X509Name","cmp","cmp");
        runtime.addBoundMethod("org.jruby.ext.openssl.X509Name","to_der","to_der");
        runtime.addBoundMethod("org.jruby.ext.openssl.X509Name","eql_p","eql?");
        runtime.addBoundMethod("org.jruby.ext.openssl.X509Name","to_a","to_a");
        runtime.addBoundMethod("org.jruby.ext.openssl.X509Name","_to_s","to_s");
    }
    static {
     }
}
