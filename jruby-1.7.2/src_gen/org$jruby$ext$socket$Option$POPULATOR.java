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
public class org$jruby$ext$socket$Option$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        RubyClass singletonClass = cls.getSingletonClass();
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.ext.socket.Option$INVOKER$i$1$0$unpack(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "unpack", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.socket.Option.class, "unpack", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("unpack", javaMethod);
        javaMethod = new org.jruby.ext.socket.Option$INVOKER$i$1$0$initialize(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "initialize", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.socket.Option.class, "initialize", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject[].class});
        cls.addMethodAtBootTimeOnly("initialize", javaMethod);
        javaMethod = new org.jruby.ext.socket.Option$INVOKER$i$0$0$to_s(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "to_s", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.socket.Option.class, "to_s", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("to_s", javaMethod);
        javaMethod = new org.jruby.ext.socket.Option$INVOKER$i$rb_int(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "rb_int", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.socket.Option.class, "rb_int", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        singletonClass.addMethodAtBootTimeOnly("rb_int", javaMethod);
        javaMethod = new org.jruby.ext.socket.Option$INVOKER$i$0$0$data(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "data", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.socket.Option.class, "data", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("data", javaMethod);
        javaMethod = new org.jruby.ext.socket.Option$INVOKER$i$0$0$optname(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "optname", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.socket.Option.class, "optname", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("optname", javaMethod);
        javaMethod = new org.jruby.ext.socket.Option$INVOKER$i$0$0$family(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "family", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.socket.Option.class, "family", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("family", javaMethod);
        javaMethod = new org.jruby.ext.socket.Option$INVOKER$i$0$0$inspect(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "inspect", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.socket.Option.class, "inspect", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("inspect", javaMethod);
        javaMethod = new org.jruby.ext.socket.Option$INVOKER$i$bool(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "bool", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.socket.Option.class, "bool", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        singletonClass.addMethodAtBootTimeOnly("bool", javaMethod);
        javaMethod = new org.jruby.ext.socket.Option$INVOKER$i$0$0$level(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "level", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.socket.Option.class, "level", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("level", javaMethod);
        javaMethod = new org.jruby.ext.socket.Option$INVOKER$i$linger(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "linger", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.socket.Option.class, "linger", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        singletonClass.addMethodAtBootTimeOnly("linger", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.socket.Option","unpack","unpack");
        runtime.addBoundMethod("org.jruby.ext.socket.Option","initialize","initialize");
        runtime.addBoundMethod("org.jruby.ext.socket.Option","to_s","to_s");
        runtime.addBoundMethod("org.jruby.ext.socket.Option","rb_int","rb_int");
        runtime.addBoundMethod("org.jruby.ext.socket.Option","data","data");
        runtime.addBoundMethod("org.jruby.ext.socket.Option","optname","optname");
        runtime.addBoundMethod("org.jruby.ext.socket.Option","family","family");
        runtime.addBoundMethod("org.jruby.ext.socket.Option","inspect","inspect");
        runtime.addBoundMethod("org.jruby.ext.socket.Option","bool","bool");
        runtime.addBoundMethod("org.jruby.ext.socket.Option","level","level");
        runtime.addBoundMethod("org.jruby.ext.socket.Option","linger","linger");
    }
    static {
     }
}
