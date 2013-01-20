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
public class org$jruby$java$proxies$ArrayJavaProxy$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.java.proxies.ArrayJavaProxy$INVOKER$i$op_aref(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "op_aref", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.java.proxies.ArrayJavaProxy.class, "op_aref", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("[]", javaMethod);
        javaMethod = new org.jruby.java.proxies.ArrayJavaProxy$INVOKER$i$0$0$empty(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "empty", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.java.proxies.ArrayJavaProxy.class, "empty", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("empty?", javaMethod);
        javaMethod = new org.jruby.java.proxies.ArrayJavaProxy$INVOKER$i$0$0$each(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "each", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.java.proxies.ArrayJavaProxy.class, "each", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("each", javaMethod);
        javaMethod = new org.jruby.java.proxies.ArrayJavaProxy$INVOKER$i$0$0$inspect(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "inspect", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.java.proxies.ArrayJavaProxy.class, "inspect", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("inspect", javaMethod);
        javaMethod = new org.jruby.java.proxies.ArrayJavaProxy$INVOKER$i$0$0$length(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "length", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.java.proxies.ArrayJavaProxy.class, "length", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("length", javaMethod);
        cls.addMethodAtBootTimeOnly("size", javaMethod);
        javaMethod = new org.jruby.java.proxies.ArrayJavaProxy$INVOKER$i$1$0$op_plus(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "op_plus", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.java.proxies.ArrayJavaProxy.class, "op_plus", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("+", javaMethod);
        javaMethod = new org.jruby.java.proxies.ArrayJavaProxy$INVOKER$i$1$0$at(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "at", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.java.proxies.ArrayJavaProxy.class, "at", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("at", javaMethod);
        javaMethod = new org.jruby.java.proxies.ArrayJavaProxy$INVOKER$i$0$0$to_a(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "to_a", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.java.proxies.ArrayJavaProxy.class, "to_a", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("to_a", javaMethod);
        cls.addMethodAtBootTimeOnly("to_ary", javaMethod);
        javaMethod = new org.jruby.java.proxies.ArrayJavaProxy$INVOKER$i$2$0$op_aset(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 2, "op_aset", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.java.proxies.ArrayJavaProxy.class, "op_aset", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("[]=", javaMethod);
        runtime.addBoundMethod("org.jruby.java.proxies.ArrayJavaProxy","op_aref","[]");
        runtime.addBoundMethod("org.jruby.java.proxies.ArrayJavaProxy","empty","empty?");
        runtime.addBoundMethod("org.jruby.java.proxies.ArrayJavaProxy","each","each");
        runtime.addBoundMethod("org.jruby.java.proxies.ArrayJavaProxy","inspect","inspect");
        runtime.addBoundMethod("org.jruby.java.proxies.ArrayJavaProxy","length","length");
        runtime.addBoundMethod("org.jruby.java.proxies.ArrayJavaProxy","op_plus","+");
        runtime.addBoundMethod("org.jruby.java.proxies.ArrayJavaProxy","at","at");
        runtime.addBoundMethod("org.jruby.java.proxies.ArrayJavaProxy","to_a","to_a");
        runtime.addBoundMethod("org.jruby.java.proxies.ArrayJavaProxy","op_aset","[]=");
    }
    static {
     }
}
