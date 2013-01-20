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
public class org$jruby$java$proxies$ArrayJavaProxyCreator$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.java.proxies.ArrayJavaProxyCreator$INVOKER$i$0$0$op_aref(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "op_aref", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.java.proxies.ArrayJavaProxyCreator.class, "op_aref", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject[].class});
        cls.addMethodAtBootTimeOnly("op_aref", javaMethod);
        javaMethod = new org.jruby.java.proxies.ArrayJavaProxyCreator$INVOKER$i$0$0$_new(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "_new", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.java.proxies.ArrayJavaProxyCreator.class, "_new", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("new", javaMethod);
        runtime.addBoundMethod("org.jruby.java.proxies.ArrayJavaProxyCreator","op_aref","op_aref");
        runtime.addBoundMethod("org.jruby.java.proxies.ArrayJavaProxyCreator","_new","new");
    }
    static {
     }
}
