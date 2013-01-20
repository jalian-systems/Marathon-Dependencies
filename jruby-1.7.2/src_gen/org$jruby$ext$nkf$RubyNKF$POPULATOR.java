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
public class org$jruby$ext$nkf$RubyNKF$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        RubyClass singletonClass = cls.getSingletonClass();
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.ext.nkf.RubyNKF$INVOKER$s$2$0$nkf(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 2, "nkf", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.nkf.RubyNKF.class, "nkf", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("nkf", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("nkf", moduleMethod);
        javaMethod = new org.jruby.ext.nkf.RubyNKF$INVOKER$s$1$0$guess1(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "guess1", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.nkf.RubyNKF.class, "guess1", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("guess1", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("guess1", moduleMethod);
        javaMethod = new org.jruby.ext.nkf.RubyNKF$INVOKER$s$1$0$guess2(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "guess2", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.nkf.RubyNKF.class, "guess2", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("guess2", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("guess2", moduleMethod);
        javaMethod = new org.jruby.ext.nkf.RubyNKF$INVOKER$s$1$0$guess(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "guess", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.nkf.RubyNKF.class, "guess", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("guess", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("guess", moduleMethod);
        runtime.addBoundMethod("org.jruby.ext.nkf.RubyNKF","nkf","nkf");
        runtime.addBoundMethod("org.jruby.ext.nkf.RubyNKF","guess1","guess1");
        runtime.addBoundMethod("org.jruby.ext.nkf.RubyNKF","guess2","guess2");
        runtime.addBoundMethod("org.jruby.ext.nkf.RubyNKF","guess","guess");
    }
    static {
     }
}
