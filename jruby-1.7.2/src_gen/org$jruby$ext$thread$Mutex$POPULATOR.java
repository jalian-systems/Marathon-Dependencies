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
public class org$jruby$ext$thread$Mutex$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        RubyClass singletonClass = cls.getSingletonClass();
        CompatVersion compatVersion = cls.getRuntime().getInstanceConfig().getCompatVersion();
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.ext.thread.Mutex$INVOKER$s$0$0$newInstance(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "newInstance", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.thread.Mutex.class, "newInstance", org.jruby.ext.thread.Mutex.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class, org.jruby.runtime.Block.class});
        singletonClass.addMethodAtBootTimeOnly("new", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.thread.Mutex","newInstance","new");
        javaMethod = new org.jruby.ext.thread.Mutex$INVOKER$i$0$0$lock(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "lock", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.thread.Mutex.class, "lock", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("lock", javaMethod);
        javaMethod = new org.jruby.ext.thread.Mutex$INVOKER$i$0$0$try_lock(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "try_lock", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.thread.Mutex.class, "try_lock", org.jruby.RubyBoolean.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("try_lock", javaMethod);
        javaMethod = new org.jruby.ext.thread.Mutex$INVOKER$i$0$0$unlock(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "unlock", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.thread.Mutex.class, "unlock", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("unlock", javaMethod);
        javaMethod = new org.jruby.ext.thread.Mutex$INVOKER$i$0$0$synchronize(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "synchronize", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.thread.Mutex.class, "synchronize", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("synchronize", javaMethod);
        javaMethod = new org.jruby.ext.thread.Mutex$INVOKER$i$0$0$locked_p(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "locked_p", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.thread.Mutex.class, "locked_p", org.jruby.RubyBoolean.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("locked?", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.thread.Mutex","lock","lock");
        runtime.addBoundMethod("org.jruby.ext.thread.Mutex","try_lock","try_lock");
        runtime.addBoundMethod("org.jruby.ext.thread.Mutex","unlock","unlock");
        runtime.addBoundMethod("org.jruby.ext.thread.Mutex","synchronize","synchronize");
        runtime.addBoundMethod("org.jruby.ext.thread.Mutex","locked_p","locked?");
        if (compatVersion.is1_9() || compatVersion == CompatVersion.BOTH) {
        javaMethod = new org.jruby.ext.thread.Mutex$INVOKER$i$sleep(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "sleep", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.thread.Mutex.class, "sleep", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("sleep", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.thread.Mutex","sleep","sleep");
        }
    }
    static {
     }
}
