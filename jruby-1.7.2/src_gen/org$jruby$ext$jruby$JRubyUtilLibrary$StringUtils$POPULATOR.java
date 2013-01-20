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
public class org$jruby$ext$jruby$JRubyUtilLibrary$StringUtils$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.ext.jruby.JRubyUtilLibrary$StringUtils$INVOKER$s$0$0$unseeded_hash(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "unseeded_hash", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.jruby.JRubyUtilLibrary.StringUtils.class, "unseeded_hash", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("unseeded_hash", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.jruby.JRubyUtilLibrary.StringUtils","unseeded_hash","unseeded_hash");
    }
    static {
     }
}
