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
public class org$jruby$ext$openssl$ASN1$ASN1Data$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.ext.openssl.ASN1$ASN1Data$INVOKER$i$3$0$initialize(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 3, "initialize", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.ASN1.ASN1Data.class, "initialize", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("initialize", javaMethod);
        javaMethod = new org.jruby.ext.openssl.ASN1$ASN1Data$INVOKER$i$0$0$to_der(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "to_der", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.openssl.ASN1.ASN1Data.class, "to_der", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("to_der", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.openssl.ASN1.ASN1Data","initialize","initialize");
        runtime.addBoundMethod("org.jruby.ext.openssl.ASN1.ASN1Data","to_der","to_der");
    }
    static {
     }
}
