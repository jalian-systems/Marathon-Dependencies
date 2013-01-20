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
public class org$jruby$ext$openssl$ASN1$ObjectId$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        RubyClass singletonClass = cls.getSingletonClass();
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.ext.openssl.ASN1$ObjectId$INVOKER$s$0$0$ln(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "ln", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.ASN1.ObjectId.class, "ln", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("ln", javaMethod);
        cls.addMethodAtBootTimeOnly("long_name", javaMethod);
        javaMethod = new org.jruby.ext.openssl.ASN1$ObjectId$INVOKER$s$0$0$sn(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "sn", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.ASN1.ObjectId.class, "sn", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("sn", javaMethod);
        cls.addMethodAtBootTimeOnly("short_name", javaMethod);
        javaMethod = new org.jruby.ext.openssl.ASN1$ObjectId$INVOKER$s$0$0$register(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "register", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.ASN1.ObjectId.class, "register", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class});
        singletonClass.addMethodAtBootTimeOnly("register", javaMethod);
        javaMethod = new org.jruby.ext.openssl.ASN1$ObjectId$INVOKER$s$0$0$oid(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "oid", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.ASN1.ObjectId.class, "oid", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("oid", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.openssl.ASN1.ObjectId","ln","ln");
        runtime.addBoundMethod("org.jruby.ext.openssl.ASN1.ObjectId","sn","sn");
        runtime.addBoundMethod("org.jruby.ext.openssl.ASN1.ObjectId","register","register");
        runtime.addBoundMethod("org.jruby.ext.openssl.ASN1.ObjectId","oid","oid");
    }
    static {
     }
}
