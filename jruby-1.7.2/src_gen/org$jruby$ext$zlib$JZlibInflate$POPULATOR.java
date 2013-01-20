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
public class org$jruby$ext$zlib$JZlibInflate$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        RubyClass singletonClass = cls.getSingletonClass();
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.ext.zlib.JZlibInflate$INVOKER$s$1$0$s_inflate(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "s_inflate", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.zlib.JZlibInflate.class, "s_inflate", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        singletonClass.addMethodAtBootTimeOnly("inflate", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.zlib.JZlibInflate","s_inflate","inflate");
        javaMethod = new org.jruby.ext.zlib.JZlibInflate$INVOKER$i$0$0$sync_point_p(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "sync_point_p", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.zlib.JZlibInflate.class, "sync_point_p", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("sync_point?", javaMethod);
        javaMethod = new org.jruby.ext.zlib.JZlibInflate$INVOKER$i$0$0$flush_next_out(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "flush_next_out", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.zlib.JZlibInflate.class, "flush_next_out", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("flush_next_out", javaMethod);
        javaMethod = new org.jruby.ext.zlib.JZlibInflate$INVOKER$i$1$0$sync(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "sync", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.zlib.JZlibInflate.class, "sync", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("sync", javaMethod);
        javaMethod = new org.jruby.ext.zlib.JZlibInflate$INVOKER$i$1$0$append(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "append", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.zlib.JZlibInflate.class, "append", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("<<", javaMethod);
        javaMethod = new org.jruby.ext.zlib.JZlibInflate$INVOKER$i$1$0$inflate(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "inflate", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.zlib.JZlibInflate.class, "inflate", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("inflate", javaMethod);
        javaMethod = new org.jruby.ext.zlib.JZlibInflate$INVOKER$i$1$0$set_dictionary(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "set_dictionary", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.zlib.JZlibInflate.class, "set_dictionary", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("set_dictionary", javaMethod);
        javaMethod = new org.jruby.ext.zlib.JZlibInflate$INVOKER$i$0$1$_initialize(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, -1, "_initialize", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.zlib.JZlibInflate.class, "_initialize", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject[].class});
        cls.addMethodAtBootTimeOnly("initialize", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.zlib.JZlibInflate","sync_point_p","sync_point?");
        runtime.addBoundMethod("org.jruby.ext.zlib.JZlibInflate","flush_next_out","flush_next_out");
        runtime.addBoundMethod("org.jruby.ext.zlib.JZlibInflate","sync","sync");
        runtime.addBoundMethod("org.jruby.ext.zlib.JZlibInflate","append","<<");
        runtime.addBoundMethod("org.jruby.ext.zlib.JZlibInflate","inflate","inflate");
        runtime.addBoundMethod("org.jruby.ext.zlib.JZlibInflate","set_dictionary","set_dictionary");
        runtime.addBoundMethod("org.jruby.ext.zlib.JZlibInflate","_initialize","initialize");
    }
    static {
     }
}
