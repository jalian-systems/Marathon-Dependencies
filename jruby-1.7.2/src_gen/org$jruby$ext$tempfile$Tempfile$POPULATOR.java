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
public class org$jruby$ext$tempfile$Tempfile$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        RubyClass singletonClass = cls.getSingletonClass();
        CompatVersion compatVersion = cls.getRuntime().getInstanceConfig().getCompatVersion();
        Ruby runtime = cls.getRuntime();
        if (compatVersion == CompatVersion.RUBY1_8 || compatVersion == CompatVersion.BOTH) {
        javaMethod = new org.jruby.ext.tempfile.Tempfile$INVOKER$s$0$1$open(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "open", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.tempfile.Tempfile.class, "open", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class, org.jruby.runtime.Block.class});
        singletonClass.addMethodAtBootTimeOnly("open", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.tempfile.Tempfile","open","open");
        }
        if (compatVersion.is1_9() || compatVersion == CompatVersion.BOTH) {
        javaMethod = new org.jruby.ext.tempfile.Tempfile$INVOKER$s$0$1$open19(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "open19", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.tempfile.Tempfile.class, "open19", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class, org.jruby.runtime.Block.class});
        singletonClass.addMethodAtBootTimeOnly("open19", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.tempfile.Tempfile","open19","open19");
        }
        javaMethod = new org.jruby.ext.tempfile.Tempfile$INVOKER$i$0$1$close(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "close", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.tempfile.Tempfile.class, "close", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject[].class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("close", javaMethod);
        javaMethod = new org.jruby.ext.tempfile.Tempfile$INVOKER$i$0$0$open(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "open", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.tempfile.Tempfile.class, "open", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("open", javaMethod);
        javaMethod = new org.jruby.ext.tempfile.Tempfile$INVOKER$i$0$0$inspect(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "inspect", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.tempfile.Tempfile.class, "inspect", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("inspect", javaMethod);
        javaMethod = new org.jruby.ext.tempfile.Tempfile$INVOKER$i$0$0$_close(cls, Visibility.PROTECTED);
        populateMethod(javaMethod, 0, "_close", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.tempfile.Tempfile.class, "_close", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("_close", javaMethod);
        javaMethod = new org.jruby.ext.tempfile.Tempfile$INVOKER$i$0$0$unlink(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "unlink", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.tempfile.Tempfile.class, "unlink", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("unlink", javaMethod);
        cls.addMethodAtBootTimeOnly("delete", javaMethod);
        javaMethod = new org.jruby.ext.tempfile.Tempfile$INVOKER$i$0$0$close_bang(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "close_bang", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.tempfile.Tempfile.class, "close_bang", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("close!", javaMethod);
        javaMethod = new org.jruby.ext.tempfile.Tempfile$INVOKER$i$2$0$make_tmpname(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, 2, "make_tmpname", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.tempfile.Tempfile.class, "make_tmpname", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("make_tmpname", javaMethod);
        javaMethod = new org.jruby.ext.tempfile.Tempfile$INVOKER$i$0$0$size(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "size", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.tempfile.Tempfile.class, "size", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("size", javaMethod);
        cls.addMethodAtBootTimeOnly("length", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.tempfile.Tempfile","close","close");
        runtime.addBoundMethod("org.jruby.ext.tempfile.Tempfile","open","open");
        runtime.addBoundMethod("org.jruby.ext.tempfile.Tempfile","inspect","inspect");
        runtime.addBoundMethod("org.jruby.ext.tempfile.Tempfile","_close","_close");
        runtime.addBoundMethod("org.jruby.ext.tempfile.Tempfile","unlink","unlink");
        runtime.addBoundMethod("org.jruby.ext.tempfile.Tempfile","close_bang","close!");
        runtime.addBoundMethod("org.jruby.ext.tempfile.Tempfile","make_tmpname","make_tmpname");
        runtime.addBoundMethod("org.jruby.ext.tempfile.Tempfile","size","size");
        if (compatVersion == CompatVersion.RUBY1_8 || compatVersion == CompatVersion.BOTH) {
        javaMethod = new org.jruby.ext.tempfile.Tempfile$INVOKER$i$0$1$initialize(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, -1, "initialize", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.tempfile.Tempfile.class, "initialize", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject[].class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("initialize", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.tempfile.Tempfile","initialize","initialize");
        }
        if (compatVersion.is1_9() || compatVersion == CompatVersion.BOTH) {
        javaMethod = new org.jruby.ext.tempfile.Tempfile$INVOKER$i$0$2$initialize19(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, -1, "initialize19", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.tempfile.Tempfile.class, "initialize19", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject[].class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("initialize19", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.tempfile.Tempfile","initialize19","initialize19");
        }
    }
    static {
     }
}
