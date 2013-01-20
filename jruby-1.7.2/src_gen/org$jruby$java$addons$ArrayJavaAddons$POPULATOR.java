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
public class org$jruby$java$addons$ArrayJavaAddons$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.java.addons.ArrayJavaAddons$INVOKER$s$dimensions(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "dimensions", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.java.addons.ArrayJavaAddons.class, "dimensions", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("dimensions", javaMethod);
        javaMethod = new org.jruby.java.addons.ArrayJavaAddons$INVOKER$s$1$0$copy_data_simple(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "copy_data_simple", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.java.addons.ArrayJavaAddons.class, "copy_data_simple", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("copy_data_simple", javaMethod);
        javaMethod = new org.jruby.java.addons.ArrayJavaAddons$INVOKER$s$2$0$copy_data(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 2, "copy_data", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.java.addons.ArrayJavaAddons.class, "copy_data", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("copy_data", javaMethod);
        runtime.addBoundMethod("org.jruby.java.addons.ArrayJavaAddons","dimensions","dimensions");
        runtime.addBoundMethod("org.jruby.java.addons.ArrayJavaAddons","copy_data_simple","copy_data_simple");
        runtime.addBoundMethod("org.jruby.java.addons.ArrayJavaAddons","copy_data","copy_data");
    }
    static {
     }
}
