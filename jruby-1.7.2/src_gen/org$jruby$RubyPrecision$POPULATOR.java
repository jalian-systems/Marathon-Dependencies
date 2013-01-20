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
public class org$jruby$RubyPrecision$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        RubyClass singletonClass = cls.getSingletonClass();
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.RubyPrecision$INVOKER$s$0$0$prec_i(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "prec_i", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyPrecision.class, "prec_i", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("prec_i", javaMethod);
        javaMethod = new org.jruby.RubyPrecision$INVOKER$s$1$0$append_features(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "append_features", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyPrecision.class, "append_features", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("append_features", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("append_features", moduleMethod);
        javaMethod = new org.jruby.RubyPrecision$INVOKER$s$1$0$prec(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "prec", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyPrecision.class, "prec", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("prec", javaMethod);
        javaMethod = new org.jruby.RubyPrecision$INVOKER$s$0$0$prec_f(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "prec_f", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyPrecision.class, "prec_f", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("prec_f", javaMethod);
        runtime.addBoundMethod("org.jruby.RubyPrecision","prec_i","prec_i");
        runtime.addBoundMethod("org.jruby.RubyPrecision","append_features","append_features");
        runtime.addBoundMethod("org.jruby.RubyPrecision","prec","prec");
        runtime.addBoundMethod("org.jruby.RubyPrecision","prec_f","prec_f");
    }
    static {
     }
}
