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
public class org$jruby$ext$jruby$JRubyFiberLocal$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.ext.jruby.JRubyFiberLocal$INVOKER$i$1$0$withValue(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "withValue", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.jruby.JRubyFiberLocal.class, "withValue", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("with_value", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.jruby.JRubyFiberLocal","withValue","with_value");
    }
    static {
     }
}
