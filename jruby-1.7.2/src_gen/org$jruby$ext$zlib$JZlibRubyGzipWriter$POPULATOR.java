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
public class org$jruby$ext$zlib$JZlibRubyGzipWriter$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        RubyClass singletonClass = cls.getSingletonClass();
        CompatVersion compatVersion = cls.getRuntime().getInstanceConfig().getCompatVersion();
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.ext.zlib.JZlibRubyGzipWriter$INVOKER$s$0$0$newInstance(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "newInstance", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.zlib.JZlibRubyGzipWriter.class, "newInstance", org.jruby.ext.zlib.JZlibRubyGzipWriter.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class, org.jruby.runtime.Block.class});
        singletonClass.addMethodAtBootTimeOnly("new", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.zlib.JZlibRubyGzipWriter","newInstance","new");
        if (compatVersion == CompatVersion.RUBY1_8 || compatVersion == CompatVersion.BOTH) {
        javaMethod = new org.jruby.ext.zlib.JZlibRubyGzipWriter$INVOKER$s$0$2$open18(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "open18", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.zlib.JZlibRubyGzipWriter.class, "open18", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class, org.jruby.runtime.Block.class});
        singletonClass.addMethodAtBootTimeOnly("open", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.zlib.JZlibRubyGzipWriter","open18","open");
        }
        if (compatVersion.is1_9() || compatVersion == CompatVersion.BOTH) {
        javaMethod = new org.jruby.ext.zlib.JZlibRubyGzipWriter$INVOKER$s$0$3$open19(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "open19", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.zlib.JZlibRubyGzipWriter.class, "open19", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class, org.jruby.runtime.Block.class});
        singletonClass.addMethodAtBootTimeOnly("open", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.zlib.JZlibRubyGzipWriter","open19","open");
        }
        javaMethod = new org.jruby.ext.zlib.JZlibRubyGzipWriter$INVOKER$i$0$0$printf(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "printf", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.zlib.JZlibRubyGzipWriter.class, "printf", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject[].class});
        cls.addMethodAtBootTimeOnly("printf", javaMethod);
        javaMethod = new org.jruby.ext.zlib.JZlibRubyGzipWriter$INVOKER$i$1$0$append(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "append", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.zlib.JZlibRubyGzipWriter.class, "append", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("append", javaMethod);
        cls.addMethodAtBootTimeOnly("<<", javaMethod);
        javaMethod = new org.jruby.ext.zlib.JZlibRubyGzipWriter$INVOKER$i$1$0$putc(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "putc", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.zlib.JZlibRubyGzipWriter.class, "putc", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("putc", javaMethod);
        javaMethod = new org.jruby.ext.zlib.JZlibRubyGzipWriter$INVOKER$i$1$0$set_orig_name(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "set_orig_name", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.zlib.JZlibRubyGzipWriter.class, "set_orig_name", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("orig_name=", javaMethod);
        javaMethod = new org.jruby.ext.zlib.JZlibRubyGzipWriter$INVOKER$i$0$0$print(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "print", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.zlib.JZlibRubyGzipWriter.class, "print", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject[].class});
        cls.addMethodAtBootTimeOnly("print", javaMethod);
        javaMethod = new org.jruby.ext.zlib.JZlibRubyGzipWriter$INVOKER$i$0$0$close(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "close", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.zlib.JZlibRubyGzipWriter.class, "close", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("close", javaMethod);
        javaMethod = new org.jruby.ext.zlib.JZlibRubyGzipWriter$INVOKER$i$0$0$pos(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "pos", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.zlib.JZlibRubyGzipWriter.class, "pos", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("pos", javaMethod);
        cls.addMethodAtBootTimeOnly("tell", javaMethod);
        javaMethod = new org.jruby.ext.zlib.JZlibRubyGzipWriter$INVOKER$i$1$0$set_comment(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "set_comment", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.zlib.JZlibRubyGzipWriter.class, "set_comment", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("comment=", javaMethod);
        javaMethod = new org.jruby.ext.zlib.JZlibRubyGzipWriter$INVOKER$i$0$1$flush(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "flush", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.zlib.JZlibRubyGzipWriter.class, "flush", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject[].class});
        cls.addMethodAtBootTimeOnly("flush", javaMethod);
        javaMethod = new org.jruby.ext.zlib.JZlibRubyGzipWriter$INVOKER$i$0$0$crc(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "crc", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.zlib.JZlibRubyGzipWriter.class, "crc", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("crc", javaMethod);
        javaMethod = new org.jruby.ext.zlib.JZlibRubyGzipWriter$INVOKER$i$0$0$puts(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "puts", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.zlib.JZlibRubyGzipWriter.class, "puts", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject[].class});
        cls.addMethodAtBootTimeOnly("puts", javaMethod);
        javaMethod = new org.jruby.ext.zlib.JZlibRubyGzipWriter$INVOKER$i$1$0$write(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "write", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.zlib.JZlibRubyGzipWriter.class, "write", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("write", javaMethod);
        javaMethod = new org.jruby.ext.zlib.JZlibRubyGzipWriter$INVOKER$i$1$0$set_sync(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "set_sync", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.zlib.JZlibRubyGzipWriter.class, "set_sync", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("set_sync", javaMethod);
        javaMethod = new org.jruby.ext.zlib.JZlibRubyGzipWriter$INVOKER$i$1$0$set_mtime(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "set_mtime", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.zlib.JZlibRubyGzipWriter.class, "set_mtime", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("mtime=", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.zlib.JZlibRubyGzipWriter","printf","printf");
        runtime.addBoundMethod("org.jruby.ext.zlib.JZlibRubyGzipWriter","append","append");
        runtime.addBoundMethod("org.jruby.ext.zlib.JZlibRubyGzipWriter","putc","putc");
        runtime.addBoundMethod("org.jruby.ext.zlib.JZlibRubyGzipWriter","set_orig_name","orig_name=");
        runtime.addBoundMethod("org.jruby.ext.zlib.JZlibRubyGzipWriter","print","print");
        runtime.addBoundMethod("org.jruby.ext.zlib.JZlibRubyGzipWriter","close","close");
        runtime.addBoundMethod("org.jruby.ext.zlib.JZlibRubyGzipWriter","pos","pos");
        runtime.addBoundMethod("org.jruby.ext.zlib.JZlibRubyGzipWriter","set_comment","comment=");
        runtime.addBoundMethod("org.jruby.ext.zlib.JZlibRubyGzipWriter","flush","flush");
        runtime.addBoundMethod("org.jruby.ext.zlib.JZlibRubyGzipWriter","crc","crc");
        runtime.addBoundMethod("org.jruby.ext.zlib.JZlibRubyGzipWriter","puts","puts");
        runtime.addBoundMethod("org.jruby.ext.zlib.JZlibRubyGzipWriter","write","write");
        runtime.addBoundMethod("org.jruby.ext.zlib.JZlibRubyGzipWriter","set_sync","set_sync");
        runtime.addBoundMethod("org.jruby.ext.zlib.JZlibRubyGzipWriter","set_mtime","mtime=");
        if (compatVersion == CompatVersion.RUBY1_8 || compatVersion == CompatVersion.BOTH) {
        javaMethod = new org.jruby.ext.zlib.JZlibRubyGzipWriter$INVOKER$i$0$0$initialize(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, -1, "initialize", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.zlib.JZlibRubyGzipWriter.class, "initialize", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject[].class});
        cls.addMethodAtBootTimeOnly("initialize", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.zlib.JZlibRubyGzipWriter","initialize","initialize");
        }
        if (compatVersion.is1_9() || compatVersion == CompatVersion.BOTH) {
        javaMethod = new org.jruby.ext.zlib.JZlibRubyGzipWriter$INVOKER$i$0$0$initialize19(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, -1, "initialize19", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.zlib.JZlibRubyGzipWriter.class, "initialize19", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject[].class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("initialize", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.zlib.JZlibRubyGzipWriter","initialize19","initialize");
        }
    }
    static {
     }
}
