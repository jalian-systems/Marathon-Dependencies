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
public class org$jruby$ext$psych$PsychToRuby$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.ext.psych.PsychToRuby$INVOKER$s$1$0$path2class(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, 1, "path2class", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.psych.PsychToRuby.class, "path2class", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("path2class", javaMethod);
        javaMethod = new org.jruby.ext.psych.PsychToRuby$INVOKER$s$2$0$build_exception(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, 2, "build_exception", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.psych.PsychToRuby.class, "build_exception", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("build_exception", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.psych.PsychToRuby","path2class","path2class");
        runtime.addBoundMethod("org.jruby.ext.psych.PsychToRuby","build_exception","build_exception");
    }
    static {
     }
}
