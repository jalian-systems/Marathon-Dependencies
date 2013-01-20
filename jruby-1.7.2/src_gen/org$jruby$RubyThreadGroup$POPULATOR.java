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
public class org$jruby$RubyThreadGroup$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.RubyThreadGroup$INVOKER$i$0$0$list(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "list", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyThreadGroup.class, "list", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("list", javaMethod);
        javaMethod = new org.jruby.RubyThreadGroup$INVOKER$i$0$0$enclosed_p(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "enclosed_p", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyThreadGroup.class, "enclosed_p", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("enclosed?", javaMethod);
        javaMethod = new org.jruby.RubyThreadGroup$INVOKER$i$1$0$add(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "add", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyThreadGroup.class, "add", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("add", javaMethod);
        javaMethod = new org.jruby.RubyThreadGroup$INVOKER$i$0$0$enclose(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "enclose", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyThreadGroup.class, "enclose", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("enclose", javaMethod);
        runtime.addBoundMethod("org.jruby.RubyThreadGroup","list","list");
        runtime.addBoundMethod("org.jruby.RubyThreadGroup","enclosed_p","enclosed?");
        runtime.addBoundMethod("org.jruby.RubyThreadGroup","add","add");
        runtime.addBoundMethod("org.jruby.RubyThreadGroup","enclose","enclose");
    }
    static {
     }
}
