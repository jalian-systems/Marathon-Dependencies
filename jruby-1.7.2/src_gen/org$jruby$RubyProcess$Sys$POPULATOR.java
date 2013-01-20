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
public class org$jruby$RubyProcess$Sys$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        RubyClass singletonClass = cls.getSingletonClass();
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.RubyProcess$Sys$INVOKER$s$1$0$setegid(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, 1, "setegid", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyProcess.Sys.class, "setegid", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("setegid", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("setegid", moduleMethod);
        javaMethod = new org.jruby.RubyProcess$Sys$INVOKER$s$1$0$seteuid(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, 1, "seteuid", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyProcess.Sys.class, "seteuid", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("seteuid", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("seteuid", moduleMethod);
        javaMethod = new org.jruby.RubyProcess$Sys$INVOKER$s$0$0$getegid(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, 0, "getegid", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyProcess.Sys.class, "getegid", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("getegid", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("getegid", moduleMethod);
        javaMethod = new org.jruby.RubyProcess$Sys$INVOKER$s$1$0$setuid(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, 1, "setuid", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyProcess.Sys.class, "setuid", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("setuid", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("setuid", moduleMethod);
        javaMethod = new org.jruby.RubyProcess$Sys$INVOKER$s$1$0$setgid(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, 1, "setgid", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyProcess.Sys.class, "setgid", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("setgid", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("setgid", moduleMethod);
        javaMethod = new org.jruby.RubyProcess$Sys$INVOKER$s$0$0$geteuid(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, 0, "geteuid", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyProcess.Sys.class, "geteuid", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("geteuid", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("geteuid", moduleMethod);
        javaMethod = new org.jruby.RubyProcess$Sys$INVOKER$s$0$0$getgid(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, 0, "getgid", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyProcess.Sys.class, "getgid", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("getgid", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("getgid", moduleMethod);
        javaMethod = new org.jruby.RubyProcess$Sys$INVOKER$s$0$0$getuid(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, 0, "getuid", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyProcess.Sys.class, "getuid", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("getuid", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("getuid", moduleMethod);
        runtime.addBoundMethod("org.jruby.RubyProcess.Sys","setegid","setegid");
        runtime.addBoundMethod("org.jruby.RubyProcess.Sys","seteuid","seteuid");
        runtime.addBoundMethod("org.jruby.RubyProcess.Sys","getegid","getegid");
        runtime.addBoundMethod("org.jruby.RubyProcess.Sys","setuid","setuid");
        runtime.addBoundMethod("org.jruby.RubyProcess.Sys","setgid","setgid");
        runtime.addBoundMethod("org.jruby.RubyProcess.Sys","geteuid","geteuid");
        runtime.addBoundMethod("org.jruby.RubyProcess.Sys","getgid","getgid");
        runtime.addBoundMethod("org.jruby.RubyProcess.Sys","getuid","getuid");
    }
    static {
     }
}
