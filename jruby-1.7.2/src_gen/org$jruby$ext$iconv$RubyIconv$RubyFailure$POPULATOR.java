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
public class org$jruby$ext$iconv$RubyIconv$RubyFailure$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.ext.iconv.RubyIconv$RubyFailure$INVOKER$i$0$2$initialize(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "initialize", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.iconv.RubyIconv.RubyFailure.class, "initialize", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject[].class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("initialize", javaMethod);
        javaMethod = new org.jruby.ext.iconv.RubyIconv$RubyFailure$INVOKER$i$0$0$failed(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "failed", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.iconv.RubyIconv.RubyFailure.class, "failed", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("failed", javaMethod);
        javaMethod = new org.jruby.ext.iconv.RubyIconv$RubyFailure$INVOKER$i$0$0$success(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "success", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.iconv.RubyIconv.RubyFailure.class, "success", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("success", javaMethod);
        javaMethod = new org.jruby.ext.iconv.RubyIconv$RubyFailure$INVOKER$i$0$0$inspect(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "inspect", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.iconv.RubyIconv.RubyFailure.class, "inspect", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("inspect", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.iconv.RubyIconv.RubyFailure","initialize","initialize");
        runtime.addBoundMethod("org.jruby.ext.iconv.RubyIconv.RubyFailure","failed","failed");
        runtime.addBoundMethod("org.jruby.ext.iconv.RubyIconv.RubyFailure","success","success");
        runtime.addBoundMethod("org.jruby.ext.iconv.RubyIconv.RubyFailure","inspect","inspect");
    }
    static {
     }
}
