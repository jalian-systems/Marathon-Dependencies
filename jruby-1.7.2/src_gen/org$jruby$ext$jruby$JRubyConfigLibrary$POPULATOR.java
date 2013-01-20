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
public class org$jruby$ext$jruby$JRubyConfigLibrary$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.ext.jruby.JRubyConfigLibrary$INVOKER$s$0$0$rubygems_disabled_p(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "rubygems_disabled_p", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.jruby.JRubyConfigLibrary.class, "rubygems_disabled_p", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("rubygems_disabled?", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.jruby.JRubyConfigLibrary","rubygems_disabled_p","rubygems_disabled?");
    }
    static {
     }
}
