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
public class org$jruby$RubyProcess$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        RubyClass singletonClass = cls.getSingletonClass();
        CompatVersion compatVersion = cls.getRuntime().getInstanceConfig().getCompatVersion();
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.RubyProcess$INVOKER$s$0$0$uid(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, 0, "uid", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyProcess.class, "uid", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("uid", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("uid", moduleMethod);
        javaMethod = new org.jruby.RubyProcess$INVOKER$s$0$0$egid(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, 0, "egid", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyProcess.class, "egid", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("egid", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("egid", moduleMethod);
        javaMethod = new org.jruby.RubyProcess$INVOKER$s$0$0$kill(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, -1, "kill", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyProcess.class, "kill", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class});
        cls.addMethodAtBootTimeOnly("kill", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("kill", moduleMethod);
        javaMethod = new org.jruby.RubyProcess$INVOKER$s$0$0$wait(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, -1, "wait", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyProcess.class, "wait", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class});
        cls.addMethodAtBootTimeOnly("wait", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("wait", moduleMethod);
        javaMethod = new org.jruby.RubyProcess$INVOKER$s$2$0$setpgid(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, 2, "setpgid", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyProcess.class, "setpgid", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("setpgid", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("setpgid", moduleMethod);
        javaMethod = new org.jruby.RubyProcess$INVOKER$s$0$0$setrlimit(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, -1, "setrlimit", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyProcess.class, "setrlimit", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class});
        cls.addMethodAtBootTimeOnly("setrlimit", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("setrlimit", moduleMethod);
        javaMethod = new org.jruby.RubyProcess$INVOKER$s$0$0$waitall(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, 0, "waitall", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyProcess.class, "waitall", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("waitall", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("waitall", moduleMethod);
        javaMethod = new org.jruby.RubyProcess$INVOKER$s$1$0$gid_set(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, 1, "gid_set", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyProcess.class, "gid_set", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("gid=", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("gid=", moduleMethod);
        javaMethod = new org.jruby.RubyProcess$INVOKER$s$0$0$waitpid2(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, -1, "waitpid2", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyProcess.class, "waitpid2", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class});
        cls.addMethodAtBootTimeOnly("waitpid2", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("waitpid2", moduleMethod);
        javaMethod = new org.jruby.RubyProcess$INVOKER$s$0$0$wait2(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, -1, "wait2", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyProcess.class, "wait2", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class});
        cls.addMethodAtBootTimeOnly("wait2", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("wait2", moduleMethod);
        javaMethod = new org.jruby.RubyProcess$INVOKER$s$1$0$getrlimit(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, 1, "getrlimit", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyProcess.class, "getrlimit", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("getrlimit", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("getrlimit", moduleMethod);
        javaMethod = new org.jruby.RubyProcess$INVOKER$s$0$0$euid(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, 0, "euid", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyProcess.class, "euid", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("euid", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("euid", moduleMethod);
        javaMethod = new org.jruby.RubyProcess$INVOKER$s$0$0$groups(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, 0, "groups", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyProcess.class, "groups", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("groups", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("groups", moduleMethod);
        javaMethod = new org.jruby.RubyProcess$INVOKER$s$0$0$getpgrp(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, 0, "getpgrp", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyProcess.class, "getpgrp", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("getpgrp", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("getpgrp", moduleMethod);
        javaMethod = new org.jruby.RubyProcess$INVOKER$s$2$0$initgroups(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, 2, "initgroups", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyProcess.class, "initgroups", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("initgroups", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("initgroups", moduleMethod);
        javaMethod = new org.jruby.RubyProcess$INVOKER$s$1$0$detach(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, 1, "detach", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyProcess.class, "detach", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("detach", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("detach", moduleMethod);
        javaMethod = new org.jruby.RubyProcess$INVOKER$s$0$0$setsid(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, 0, "setsid", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyProcess.class, "setsid", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("setsid", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("setsid", moduleMethod);
        javaMethod = new org.jruby.RubyProcess$INVOKER$s$0$0$ppid(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, 0, "ppid", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyProcess.class, "ppid", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("ppid", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("ppid", moduleMethod);
        javaMethod = new org.jruby.RubyProcess$INVOKER$s$1$0$groups_set(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, 1, "groups_set", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyProcess.class, "groups_set", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("groups=", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("groups=", moduleMethod);
        javaMethod = new org.jruby.RubyProcess$INVOKER$s$1$0$uid_set(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, 1, "uid_set", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyProcess.class, "uid_set", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("uid=", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("uid=", moduleMethod);
        javaMethod = new org.jruby.RubyProcess$INVOKER$s$0$0$times(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, 0, "times", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyProcess.class, "times", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("times", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("times", moduleMethod);
        javaMethod = new org.jruby.RubyProcess$INVOKER$s$0$0$maxgroups(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, 0, "maxgroups", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyProcess.class, "maxgroups", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("maxgroups", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("maxgroups", moduleMethod);
        javaMethod = new org.jruby.RubyProcess$INVOKER$s$0$0$pid(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, 0, "pid", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyProcess.class, "pid", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("pid", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("pid", moduleMethod);
        javaMethod = new org.jruby.RubyProcess$INVOKER$s$0$1$exit_bang(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, -1, "exit_bang", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyProcess.class, "exit_bang", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class});
        cls.addMethodAtBootTimeOnly("exit!", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("exit!", moduleMethod);
        javaMethod = new org.jruby.RubyProcess$INVOKER$s$0$1$exit(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, -1, "exit", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyProcess.class, "exit", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class});
        cls.addMethodAtBootTimeOnly("exit", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("exit", moduleMethod);
        javaMethod = new org.jruby.RubyProcess$INVOKER$s$2$0$getpriority(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, 2, "getpriority", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyProcess.class, "getpriority", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("getpriority", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("getpriority", moduleMethod);
        javaMethod = new org.jruby.RubyProcess$INVOKER$s$3$0$setpriority(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, 3, "setpriority", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyProcess.class, "setpriority", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("setpriority", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("setpriority", moduleMethod);
        javaMethod = new org.jruby.RubyProcess$INVOKER$s$1$0$getpgid(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, 1, "getpgid", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyProcess.class, "getpgid", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("getpgid", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("getpgid", moduleMethod);
        javaMethod = new org.jruby.RubyProcess$INVOKER$s$0$0$waitpid(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, -1, "waitpid", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyProcess.class, "waitpid", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class});
        cls.addMethodAtBootTimeOnly("waitpid", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("waitpid", moduleMethod);
        javaMethod = new org.jruby.RubyProcess$INVOKER$s$0$0$gid(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, 0, "gid", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyProcess.class, "gid", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("gid", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("gid", moduleMethod);
        javaMethod = new org.jruby.RubyProcess$INVOKER$s$0$0$setpgrp(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, 0, "setpgrp", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyProcess.class, "setpgrp", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("setpgrp", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("setpgrp", moduleMethod);
        javaMethod = new org.jruby.RubyProcess$INVOKER$s$1$0$maxgroups_set(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, 1, "maxgroups_set", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyProcess.class, "maxgroups_set", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("maxgroups=", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("maxgroups=", moduleMethod);
        javaMethod = new org.jruby.RubyProcess$INVOKER$s$1$0$egid_set(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, 1, "egid_set", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyProcess.class, "egid_set", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("egid=", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("egid=", moduleMethod);
        javaMethod = new org.jruby.RubyProcess$INVOKER$s$0$1$abort(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, -1, "abort", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyProcess.class, "abort", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class});
        cls.addMethodAtBootTimeOnly("abort", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("abort", moduleMethod);
        javaMethod = new org.jruby.RubyProcess$INVOKER$s$1$0$euid_set(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, 1, "euid_set", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyProcess.class, "euid_set", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("euid=", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("euid=", moduleMethod);
        runtime.addBoundMethod("org.jruby.RubyProcess","uid","uid");
        runtime.addBoundMethod("org.jruby.RubyProcess","egid","egid");
        runtime.addBoundMethod("org.jruby.RubyProcess","kill","kill");
        runtime.addBoundMethod("org.jruby.RubyProcess","wait","wait");
        runtime.addBoundMethod("org.jruby.RubyProcess","setpgid","setpgid");
        runtime.addBoundMethod("org.jruby.RubyProcess","setrlimit","setrlimit");
        runtime.addBoundMethod("org.jruby.RubyProcess","waitall","waitall");
        runtime.addBoundMethod("org.jruby.RubyProcess","gid_set","gid=");
        runtime.addBoundMethod("org.jruby.RubyProcess","waitpid2","waitpid2");
        runtime.addBoundMethod("org.jruby.RubyProcess","wait2","wait2");
        runtime.addBoundMethod("org.jruby.RubyProcess","getrlimit","getrlimit");
        runtime.addBoundMethod("org.jruby.RubyProcess","euid","euid");
        runtime.addBoundMethod("org.jruby.RubyProcess","groups","groups");
        runtime.addBoundMethod("org.jruby.RubyProcess","getpgrp","getpgrp");
        runtime.addBoundMethod("org.jruby.RubyProcess","initgroups","initgroups");
        runtime.addBoundMethod("org.jruby.RubyProcess","detach","detach");
        runtime.addBoundMethod("org.jruby.RubyProcess","setsid","setsid");
        runtime.addBoundMethod("org.jruby.RubyProcess","ppid","ppid");
        runtime.addBoundMethod("org.jruby.RubyProcess","groups_set","groups=");
        runtime.addBoundMethod("org.jruby.RubyProcess","uid_set","uid=");
        runtime.addBoundMethod("org.jruby.RubyProcess","times","times");
        runtime.addBoundMethod("org.jruby.RubyProcess","maxgroups","maxgroups");
        runtime.addBoundMethod("org.jruby.RubyProcess","pid","pid");
        runtime.addBoundMethod("org.jruby.RubyProcess","exit_bang","exit!");
        runtime.addBoundMethod("org.jruby.RubyProcess","exit","exit");
        runtime.addBoundMethod("org.jruby.RubyProcess","getpriority","getpriority");
        runtime.addBoundMethod("org.jruby.RubyProcess","setpriority","setpriority");
        runtime.addBoundMethod("org.jruby.RubyProcess","getpgid","getpgid");
        runtime.addBoundMethod("org.jruby.RubyProcess","waitpid","waitpid");
        runtime.addBoundMethod("org.jruby.RubyProcess","gid","gid");
        runtime.addBoundMethod("org.jruby.RubyProcess","setpgrp","setpgrp");
        runtime.addBoundMethod("org.jruby.RubyProcess","maxgroups_set","maxgroups=");
        runtime.addBoundMethod("org.jruby.RubyProcess","egid_set","egid=");
        runtime.addBoundMethod("org.jruby.RubyProcess","abort","abort");
        runtime.addBoundMethod("org.jruby.RubyProcess","euid_set","euid=");
        if (compatVersion == CompatVersion.RUBY1_8 || compatVersion == CompatVersion.BOTH) {
        javaMethod = new org.jruby.RubyProcess$INVOKER$s$0$0$fork(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, 0, "fork", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyProcess.class, "fork", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("fork", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("fork", moduleMethod);
        runtime.addBoundMethod("org.jruby.RubyProcess","fork","fork");
        }
        if (compatVersion.is1_9() || compatVersion == CompatVersion.BOTH) {
        javaMethod = new org.jruby.RubyProcess$INVOKER$s$0$0$fork19(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, 0, "fork19", true, CallConfiguration.FrameNoneScopeNone, true, org.jruby.RubyProcess.class, "fork19", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("fork", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("fork", moduleMethod);
        javaMethod = new org.jruby.RubyProcess$INVOKER$s$1$0$_spawn_internal(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, 1, "_spawn_internal", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyProcess.class, "_spawn_internal", org.jruby.RubyFixnum.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class});
        cls.addMethodAtBootTimeOnly("_spawn_internal", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("_spawn_internal", moduleMethod);
        runtime.addBoundMethod("org.jruby.RubyProcess","fork19","fork");
        runtime.addBoundMethod("org.jruby.RubyProcess","_spawn_internal","_spawn_internal");
        }
    }
    static {
     }
}
