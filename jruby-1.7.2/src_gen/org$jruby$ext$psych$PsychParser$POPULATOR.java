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
public class org$jruby$ext$psych$PsychParser$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.ext.psych.PsychParser$INVOKER$i$parse(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "parse", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.psych.PsychParser.class, "parse", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("parse", javaMethod);
        javaMethod = new org.jruby.ext.psych.PsychParser$INVOKER$i$0$0$mark(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "mark", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.psych.PsychParser.class, "mark", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("mark", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.psych.PsychParser","parse","parse");
        runtime.addBoundMethod("org.jruby.ext.psych.PsychParser","mark","mark");
    }
    static {
     }
}
