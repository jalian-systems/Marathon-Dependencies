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
public class org$jruby$RubySystemExit$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.RubySystemExit$INVOKER$i$0$0$status(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "status", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubySystemExit.class, "status", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("status", javaMethod);
        javaMethod = new org.jruby.RubySystemExit$INVOKER$i$0$2$initialize(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, -1, "initialize", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubySystemExit.class, "initialize", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject[].class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("initialize", javaMethod);
        javaMethod = new org.jruby.RubySystemExit$INVOKER$i$0$0$success_p(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "success_p", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubySystemExit.class, "success_p", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("success?", javaMethod);
        runtime.addBoundMethod("org.jruby.RubySystemExit","status","status");
        runtime.addBoundMethod("org.jruby.RubySystemExit","initialize","initialize");
        runtime.addBoundMethod("org.jruby.RubySystemExit","success_p","success?");
    }
    static {
     }
}
