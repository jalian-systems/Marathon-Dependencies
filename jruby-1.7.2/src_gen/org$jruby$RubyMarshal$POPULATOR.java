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
public class org$jruby$RubyMarshal$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        RubyClass singletonClass = cls.getSingletonClass();
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.RubyMarshal$INVOKER$s$0$2$dump(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "dump", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyMarshal.class, "dump", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("dump", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("dump", moduleMethod);
        javaMethod = new org.jruby.RubyMarshal$INVOKER$s$0$1$load(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "load", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyMarshal.class, "load", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("load", javaMethod);
        cls.addMethodAtBootTimeOnly("restore", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("load", moduleMethod);
        singletonClass.addMethodAtBootTimeOnly("restore", moduleMethod);
        runtime.addBoundMethod("org.jruby.RubyMarshal","dump","dump");
        runtime.addBoundMethod("org.jruby.RubyMarshal","load","load");
    }
    static {
     }
}
