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
public class org$jruby$ext$socket$RubyUDPSocket$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        RubyClass singletonClass = cls.getSingletonClass();
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.ext.socket.RubyUDPSocket$INVOKER$s$0$0$open(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "open", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.socket.RubyUDPSocket.class, "open", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class, org.jruby.runtime.Block.class});
        singletonClass.addMethodAtBootTimeOnly("open", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.socket.RubyUDPSocket","open","open");
        javaMethod = new org.jruby.ext.socket.RubyUDPSocket$INVOKER$i$initialize(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, -1, "initialize", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.socket.RubyUDPSocket.class, "initialize", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("initialize", javaMethod);
        javaMethod = new org.jruby.ext.socket.RubyUDPSocket$INVOKER$i$send(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "send", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.socket.RubyUDPSocket.class, "send", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("send", javaMethod);
        javaMethod = new org.jruby.ext.socket.RubyUDPSocket$INVOKER$i$recvfrom_nonblock(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "recvfrom_nonblock", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.socket.RubyUDPSocket.class, "recvfrom_nonblock", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("recvfrom_nonblock", javaMethod);
        javaMethod = new org.jruby.ext.socket.RubyUDPSocket$INVOKER$i$2$0$connect(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 2, "connect", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.socket.RubyUDPSocket.class, "connect", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("connect", javaMethod);
        javaMethod = new org.jruby.ext.socket.RubyUDPSocket$INVOKER$i$2$0$bind(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 2, "bind", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.socket.RubyUDPSocket.class, "bind", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("bind", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.socket.RubyUDPSocket","initialize","initialize");
        runtime.addBoundMethod("org.jruby.ext.socket.RubyUDPSocket","send","send");
        runtime.addBoundMethod("org.jruby.ext.socket.RubyUDPSocket","recvfrom_nonblock","recvfrom_nonblock");
        runtime.addBoundMethod("org.jruby.ext.socket.RubyUDPSocket","connect","connect");
        runtime.addBoundMethod("org.jruby.ext.socket.RubyUDPSocket","bind","bind");
    }
    static {
     }
}
