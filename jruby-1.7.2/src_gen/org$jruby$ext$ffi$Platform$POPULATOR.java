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
public class org$jruby$ext$ffi$Platform$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        RubyClass singletonClass = cls.getSingletonClass();
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.ext.ffi.Platform$INVOKER$s$0$0$mac_p(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "mac_p", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.ffi.Platform.class, "mac_p", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("mac?", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("mac?", moduleMethod);
        javaMethod = new org.jruby.ext.ffi.Platform$INVOKER$s$0$0$linux_p(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "linux_p", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.ffi.Platform.class, "linux_p", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("linux?", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("linux?", moduleMethod);
        javaMethod = new org.jruby.ext.ffi.Platform$INVOKER$s$0$0$solaris_p(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "solaris_p", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.ffi.Platform.class, "solaris_p", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("solaris?", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("solaris?", moduleMethod);
        javaMethod = new org.jruby.ext.ffi.Platform$INVOKER$s$0$0$bsd_p(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "bsd_p", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.ffi.Platform.class, "bsd_p", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("bsd?", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("bsd?", moduleMethod);
        javaMethod = new org.jruby.ext.ffi.Platform$INVOKER$s$0$0$unix_p(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "unix_p", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.ffi.Platform.class, "unix_p", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("unix?", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("unix?", moduleMethod);
        javaMethod = new org.jruby.ext.ffi.Platform$INVOKER$s$0$0$windows_p(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "windows_p", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.ffi.Platform.class, "windows_p", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("windows?", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("windows?", moduleMethod);
        runtime.addBoundMethod("org.jruby.ext.ffi.Platform","mac_p","mac?");
        runtime.addBoundMethod("org.jruby.ext.ffi.Platform","linux_p","linux?");
        runtime.addBoundMethod("org.jruby.ext.ffi.Platform","solaris_p","solaris?");
        runtime.addBoundMethod("org.jruby.ext.ffi.Platform","bsd_p","bsd?");
        runtime.addBoundMethod("org.jruby.ext.ffi.Platform","unix_p","unix?");
        runtime.addBoundMethod("org.jruby.ext.ffi.Platform","windows_p","windows?");
    }
    static {
     }
}
