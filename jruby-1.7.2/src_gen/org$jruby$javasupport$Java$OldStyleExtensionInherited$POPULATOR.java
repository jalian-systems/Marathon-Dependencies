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
public class org$jruby$javasupport$Java$OldStyleExtensionInherited$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.javasupport.Java$OldStyleExtensionInherited$INVOKER$s$1$0$inherited(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "inherited", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.javasupport.Java.OldStyleExtensionInherited.class, "inherited", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("inherited", javaMethod);
        runtime.addBoundMethod("org.jruby.javasupport.Java.OldStyleExtensionInherited","inherited","inherited");
    }
    static {
     }
}
