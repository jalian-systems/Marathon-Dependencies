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
public class org$jruby$demo$ext$MethodMissing$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.demo.ext.MethodMissing$INVOKER$i$0$0$method_missing(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "method_missing", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.demo.ext.MethodMissing.class, "method_missing", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject[].class});
        cls.addMethodAtBootTimeOnly("method_missing", javaMethod);
        runtime.addBoundMethod("org.jruby.demo.ext.MethodMissing","method_missing","method_missing");
    }
    static {
     }
}
