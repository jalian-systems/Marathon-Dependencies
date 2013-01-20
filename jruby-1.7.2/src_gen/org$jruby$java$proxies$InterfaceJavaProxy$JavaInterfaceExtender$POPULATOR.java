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
public class org$jruby$java$proxies$InterfaceJavaProxy$JavaInterfaceExtender$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.java.proxies.InterfaceJavaProxy$JavaInterfaceExtender$INVOKER$s$1$0$initialize(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "initialize", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.java.proxies.InterfaceJavaProxy.JavaInterfaceExtender.class, "initialize", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("initialize", javaMethod);
        javaMethod = new org.jruby.java.proxies.InterfaceJavaProxy$JavaInterfaceExtender$INVOKER$s$1$0$extend_proxy(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "extend_proxy", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.java.proxies.InterfaceJavaProxy.JavaInterfaceExtender.class, "extend_proxy", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("extend_proxy", javaMethod);
        runtime.addBoundMethod("org.jruby.java.proxies.InterfaceJavaProxy.JavaInterfaceExtender","initialize","initialize");
        runtime.addBoundMethod("org.jruby.java.proxies.InterfaceJavaProxy.JavaInterfaceExtender","extend_proxy","extend_proxy");
    }
    static {
     }
}
