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
public class org$jruby$ext$zlib$RubyZlib$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        RubyClass singletonClass = cls.getSingletonClass();
        CompatVersion compatVersion = cls.getRuntime().getInstanceConfig().getCompatVersion();
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.ext.zlib.RubyZlib$INVOKER$s$0$2$crc32(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, -1, "crc32", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.zlib.RubyZlib.class, "crc32", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class});
        cls.addMethodAtBootTimeOnly("crc32", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("crc32", moduleMethod);
        javaMethod = new org.jruby.ext.zlib.RubyZlib$INVOKER$s$0$0$zlib_version(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, 0, "zlib_version", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.zlib.RubyZlib.class, "zlib_version", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("zlib_version", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("zlib_version", moduleMethod);
        javaMethod = new org.jruby.ext.zlib.RubyZlib$INVOKER$s$0$2$adler32(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, -1, "adler32", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.zlib.RubyZlib.class, "adler32", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class});
        cls.addMethodAtBootTimeOnly("adler32", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("adler32", moduleMethod);
        javaMethod = new org.jruby.ext.zlib.RubyZlib$INVOKER$s$0$0$crc_table(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, 0, "crc_table", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.zlib.RubyZlib.class, "crc_table", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("crc_table", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("crc_table", moduleMethod);
        javaMethod = new org.jruby.ext.zlib.RubyZlib$INVOKER$s$3$0$adler32_combine(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, 3, "adler32_combine", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.zlib.RubyZlib.class, "adler32_combine", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("adler32_combine", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("adler32_combine", moduleMethod);
        javaMethod = new org.jruby.ext.zlib.RubyZlib$INVOKER$s$3$0$crc32_combine(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, 3, "crc32_combine", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.zlib.RubyZlib.class, "crc32_combine", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("crc32_combine", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("crc32_combine", moduleMethod);
        runtime.addBoundMethod("org.jruby.ext.zlib.RubyZlib","crc32","crc32");
        runtime.addBoundMethod("org.jruby.ext.zlib.RubyZlib","zlib_version","zlib_version");
        runtime.addBoundMethod("org.jruby.ext.zlib.RubyZlib","adler32","adler32");
        runtime.addBoundMethod("org.jruby.ext.zlib.RubyZlib","crc_table","crc_table");
        runtime.addBoundMethod("org.jruby.ext.zlib.RubyZlib","adler32_combine","adler32_combine");
        runtime.addBoundMethod("org.jruby.ext.zlib.RubyZlib","crc32_combine","crc32_combine");
        if (compatVersion.is1_9() || compatVersion == CompatVersion.BOTH) {
        javaMethod = new org.jruby.ext.zlib.RubyZlib$INVOKER$s$0$1$deflate(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "deflate", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.zlib.RubyZlib.class, "deflate", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class});
        cls.addMethodAtBootTimeOnly("deflate", javaMethod);
        javaMethod = new org.jruby.ext.zlib.RubyZlib$INVOKER$s$1$0$inflate(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "inflate", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.zlib.RubyZlib.class, "inflate", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("inflate", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.zlib.RubyZlib","deflate","deflate");
        runtime.addBoundMethod("org.jruby.ext.zlib.RubyZlib","inflate","inflate");
        }
    }
    static {
     }
}
