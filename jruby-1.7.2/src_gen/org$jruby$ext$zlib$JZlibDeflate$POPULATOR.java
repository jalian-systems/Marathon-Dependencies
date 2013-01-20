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
public class org$jruby$ext$zlib$JZlibDeflate$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        RubyClass singletonClass = cls.getSingletonClass();
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.ext.zlib.JZlibDeflate$INVOKER$s$0$1$s_deflate(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "s_deflate", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.zlib.JZlibDeflate.class, "s_deflate", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class});
        singletonClass.addMethodAtBootTimeOnly("deflate", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.zlib.JZlibDeflate","s_deflate","deflate");
        javaMethod = new org.jruby.ext.zlib.JZlibDeflate$INVOKER$i$0$1$flush(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "flush", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.zlib.JZlibDeflate.class, "flush", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject[].class});
        cls.addMethodAtBootTimeOnly("flush", javaMethod);
        javaMethod = new org.jruby.ext.zlib.JZlibDeflate$INVOKER$i$1$0$initialize_copy(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, 1, "initialize_copy", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.zlib.JZlibDeflate.class, "initialize_copy", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("initialize_copy", javaMethod);
        javaMethod = new org.jruby.ext.zlib.JZlibDeflate$INVOKER$i$0$1$deflate(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "deflate", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.zlib.JZlibDeflate.class, "deflate", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject[].class});
        cls.addMethodAtBootTimeOnly("deflate", javaMethod);
        javaMethod = new org.jruby.ext.zlib.JZlibDeflate$INVOKER$i$1$0$append(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "append", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.zlib.JZlibDeflate.class, "append", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("<<", javaMethod);
        javaMethod = new org.jruby.ext.zlib.JZlibDeflate$INVOKER$i$1$0$set_dictionary(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "set_dictionary", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.zlib.JZlibDeflate.class, "set_dictionary", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("set_dictionary", javaMethod);
        javaMethod = new org.jruby.ext.zlib.JZlibDeflate$INVOKER$i$2$0$params(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 2, "params", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.zlib.JZlibDeflate.class, "params", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("params", javaMethod);
        javaMethod = new org.jruby.ext.zlib.JZlibDeflate$INVOKER$i$0$4$_initialize(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, -1, "_initialize", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.zlib.JZlibDeflate.class, "_initialize", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject[].class});
        cls.addMethodAtBootTimeOnly("initialize", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.zlib.JZlibDeflate","flush","flush");
        runtime.addBoundMethod("org.jruby.ext.zlib.JZlibDeflate","initialize_copy","initialize_copy");
        runtime.addBoundMethod("org.jruby.ext.zlib.JZlibDeflate","deflate","deflate");
        runtime.addBoundMethod("org.jruby.ext.zlib.JZlibDeflate","append","<<");
        runtime.addBoundMethod("org.jruby.ext.zlib.JZlibDeflate","set_dictionary","set_dictionary");
        runtime.addBoundMethod("org.jruby.ext.zlib.JZlibDeflate","params","params");
        runtime.addBoundMethod("org.jruby.ext.zlib.JZlibDeflate","_initialize","initialize");
    }
    static {
     }
}
