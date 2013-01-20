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
public class org$jruby$ext$jruby$JRubyUtilLibrary$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        RubyClass singletonClass = cls.getSingletonClass();
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.ext.jruby.JRubyUtilLibrary$INVOKER$s$1$0$getClassLoaderResources(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "getClassLoaderResources", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.jruby.JRubyUtilLibrary.class, "getClassLoaderResources", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("classloader_resources", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("classloader_resources", moduleMethod);
        javaMethod = new org.jruby.ext.jruby.JRubyUtilLibrary$INVOKER$s$1$0$setObjectSpaceEnabled(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "setObjectSpaceEnabled", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.jruby.JRubyUtilLibrary.class, "setObjectSpaceEnabled", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("objectspace=", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("objectspace=", moduleMethod);
        javaMethod = new org.jruby.ext.jruby.JRubyUtilLibrary$INVOKER$s$0$0$getObjectSpaceEnabled(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "getObjectSpaceEnabled", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.jruby.JRubyUtilLibrary.class, "getObjectSpaceEnabled", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("objectspace", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("objectspace", moduleMethod);
        javaMethod = new org.jruby.ext.jruby.JRubyUtilLibrary$INVOKER$s$0$0$gc(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "gc", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.jruby.JRubyUtilLibrary.class, "gc", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("gc", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("gc", moduleMethod);
        runtime.addBoundMethod("org.jruby.ext.jruby.JRubyUtilLibrary","getClassLoaderResources","classloader_resources");
        runtime.addBoundMethod("org.jruby.ext.jruby.JRubyUtilLibrary","setObjectSpaceEnabled","objectspace=");
        runtime.addBoundMethod("org.jruby.ext.jruby.JRubyUtilLibrary","getObjectSpaceEnabled","objectspace");
        runtime.addBoundMethod("org.jruby.ext.jruby.JRubyUtilLibrary","gc","gc");
    }
    static {
     }
}
