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
public class org$jruby$ext$coverage$CoverageModule$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        RubyClass singletonClass = cls.getSingletonClass();
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.ext.coverage.CoverageModule$INVOKER$s$0$0$result(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "result", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.coverage.CoverageModule.class, "result", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("result", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("result", moduleMethod);
        javaMethod = new org.jruby.ext.coverage.CoverageModule$INVOKER$s$0$0$start(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "start", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.coverage.CoverageModule.class, "start", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("start", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("start", moduleMethod);
        runtime.addBoundMethod("org.jruby.ext.coverage.CoverageModule","result","result");
        runtime.addBoundMethod("org.jruby.ext.coverage.CoverageModule","start","start");
    }
    static {
     }
}
