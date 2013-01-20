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
public class org$jruby$java$proxies$JavaInterfaceTemplate$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.java.proxies.JavaInterfaceTemplate$INVOKER$s$0$0$rbNew(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "rbNew", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.java.proxies.JavaInterfaceTemplate.class, "rbNew", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("new", javaMethod);
        javaMethod = new org.jruby.java.proxies.JavaInterfaceTemplate$INVOKER$s$0$0$op_aref(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "op_aref", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.java.proxies.JavaInterfaceTemplate.class, "op_aref", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class});
        cls.addMethodAtBootTimeOnly("[]", javaMethod);
        javaMethod = new org.jruby.java.proxies.JavaInterfaceTemplate$INVOKER$s$1$0$append_features(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "append_features", true, CallConfiguration.FrameFullScopeNone, false, org.jruby.java.proxies.JavaInterfaceTemplate.class, "append_features", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("append_features", javaMethod);
        javaMethod = new org.jruby.java.proxies.JavaInterfaceTemplate$INVOKER$s$1$0$extended(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "extended", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.java.proxies.JavaInterfaceTemplate.class, "extended", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("extended", javaMethod);
        javaMethod = new org.jruby.java.proxies.JavaInterfaceTemplate$INVOKER$s$0$0$impl(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "impl", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.java.proxies.JavaInterfaceTemplate.class, "impl", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("impl", javaMethod);
        javaMethod = new org.jruby.java.proxies.JavaInterfaceTemplate$INVOKER$s$1$0$implement(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, 1, "implement", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.java.proxies.JavaInterfaceTemplate.class, "implement", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("implement", javaMethod);
        runtime.addBoundMethod("org.jruby.java.proxies.JavaInterfaceTemplate","rbNew","new");
        runtime.addBoundMethod("org.jruby.java.proxies.JavaInterfaceTemplate","op_aref","[]");
        runtime.addBoundMethod("org.jruby.java.proxies.JavaInterfaceTemplate","append_features","append_features");
        runtime.addBoundMethod("org.jruby.java.proxies.JavaInterfaceTemplate","extended","extended");
        runtime.addBoundMethod("org.jruby.java.proxies.JavaInterfaceTemplate","impl","impl");
        runtime.addBoundMethod("org.jruby.java.proxies.JavaInterfaceTemplate","implement","implement");
    }
    static {
     }
}
