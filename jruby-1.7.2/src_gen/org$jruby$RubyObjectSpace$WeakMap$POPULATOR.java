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
public class org$jruby$RubyObjectSpace$WeakMap$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.RubyObjectSpace$WeakMap$INVOKER$i$1$0$op_aref(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "op_aref", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyObjectSpace.WeakMap.class, "op_aref", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("[]", javaMethod);
        javaMethod = new org.jruby.RubyObjectSpace$WeakMap$INVOKER$i$2$0$op_aref(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 2, "op_aref", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyObjectSpace.WeakMap.class, "op_aref", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("[]=", javaMethod);
        runtime.addBoundMethod("org.jruby.RubyObjectSpace.WeakMap","op_aref","[]");
        runtime.addBoundMethod("org.jruby.RubyObjectSpace.WeakMap","op_aref","[]=");
    }
    static {
     }
}
