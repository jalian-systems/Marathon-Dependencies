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
public class org$jruby$ext$iconv$RubyIconv$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        RubyClass singletonClass = cls.getSingletonClass();
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.ext.iconv.RubyIconv$INVOKER$s$2$0$open(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, 2, "open", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.iconv.RubyIconv.class, "open", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.Block.class});
        singletonClass.addMethodAtBootTimeOnly("open", javaMethod);
        javaMethod = new org.jruby.ext.iconv.RubyIconv$INVOKER$s$0$0$charset_map_get(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "charset_map_get", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.iconv.RubyIconv.class, "charset_map_get", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        singletonClass.addMethodAtBootTimeOnly("charset_map", javaMethod);
        javaMethod = new org.jruby.ext.iconv.RubyIconv$INVOKER$s$0$0$conv(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "conv", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.iconv.RubyIconv.class, "conv", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class, org.jruby.runtime.Block.class});
        singletonClass.addMethodAtBootTimeOnly("conv", javaMethod);
        javaMethod = new org.jruby.ext.iconv.RubyIconv$INVOKER$s$0$0$iconv(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "iconv", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.iconv.RubyIconv.class, "iconv", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class, org.jruby.runtime.Block.class});
        singletonClass.addMethodAtBootTimeOnly("iconv", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.iconv.RubyIconv","open","open");
        runtime.addBoundMethod("org.jruby.ext.iconv.RubyIconv","charset_map_get","charset_map");
        runtime.addBoundMethod("org.jruby.ext.iconv.RubyIconv","conv","conv");
        runtime.addBoundMethod("org.jruby.ext.iconv.RubyIconv","iconv","iconv");
        javaMethod = new org.jruby.ext.iconv.RubyIconv$INVOKER$i$iconv(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "iconv", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.iconv.RubyIconv.class, "iconv", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("iconv", javaMethod);
        javaMethod = new org.jruby.ext.iconv.RubyIconv$INVOKER$i$2$0$initialize(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 2, "initialize", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.iconv.RubyIconv.class, "initialize", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("initialize", javaMethod);
        javaMethod = new org.jruby.ext.iconv.RubyIconv$INVOKER$i$0$0$close(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "close", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.iconv.RubyIconv.class, "close", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("close", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.iconv.RubyIconv","iconv","iconv");
        runtime.addBoundMethod("org.jruby.ext.iconv.RubyIconv","initialize","initialize");
        runtime.addBoundMethod("org.jruby.ext.iconv.RubyIconv","close","close");
    }
    static {
     }
}
