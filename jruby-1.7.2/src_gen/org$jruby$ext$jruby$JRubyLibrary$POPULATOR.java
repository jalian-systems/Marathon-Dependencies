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
public class org$jruby$ext$jruby$JRubyLibrary$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        RubyClass singletonClass = cls.getSingletonClass();
        CompatVersion compatVersion = cls.getRuntime().getInstanceConfig().getCompatVersion();
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.ext.jruby.JRubyLibrary$INVOKER$s$1$0$dereference(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "dereference", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.jruby.JRubyLibrary.class, "dereference", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("dereference", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("dereference", moduleMethod);
        javaMethod = new org.jruby.ext.jruby.JRubyLibrary$INVOKER$s$1$0$reference(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "reference", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.jruby.JRubyLibrary.class, "reference", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("reference", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("reference", moduleMethod);
        javaMethod = new org.jruby.ext.jruby.JRubyLibrary$INVOKER$s$1$0$reference0(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "reference0", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.jruby.JRubyLibrary.class, "reference0", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("reference0", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("reference0", moduleMethod);
        javaMethod = new org.jruby.ext.jruby.JRubyLibrary$INVOKER$s$1$0$identity_hash(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "identity_hash", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.jruby.JRubyLibrary.class, "identity_hash", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("identity_hash", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("identity_hash", moduleMethod);
        runtime.addBoundMethod("org.jruby.ext.jruby.JRubyLibrary","dereference","dereference");
        runtime.addBoundMethod("org.jruby.ext.jruby.JRubyLibrary","reference","reference");
        runtime.addBoundMethod("org.jruby.ext.jruby.JRubyLibrary","reference0","reference0");
        runtime.addBoundMethod("org.jruby.ext.jruby.JRubyLibrary","identity_hash","identity_hash");
        if (compatVersion.is2_0() || compatVersion == CompatVersion.BOTH) {
        javaMethod = new org.jruby.ext.jruby.JRubyLibrary$INVOKER$s$0$0$ruby2_0(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "ruby2_0", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.jruby.JRubyLibrary.class, "ruby2_0", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("ruby2_0", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("ruby2_0", moduleMethod);
        runtime.addBoundMethod("org.jruby.ext.jruby.JRubyLibrary","ruby2_0","ruby2_0");
        }
    }
    static {
     }
}
