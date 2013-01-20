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
public class org$jruby$ext$socket$RubyUNIXSocket$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        RubyClass singletonClass = cls.getSingletonClass();
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.ext.socket.RubyUNIXSocket$INVOKER$s$0$2$socketpair(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "socketpair", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.socket.RubyUNIXSocket.class, "socketpair", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class});
        singletonClass.addMethodAtBootTimeOnly("socketpair", javaMethod);
        singletonClass.addMethodAtBootTimeOnly("pair", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.socket.RubyUNIXSocket","socketpair","socketpair");
        javaMethod = new org.jruby.ext.socket.RubyUNIXSocket$INVOKER$i$0$0$addr(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "addr", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.socket.RubyUNIXSocket.class, "addr", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("addr", javaMethod);
        javaMethod = new org.jruby.ext.socket.RubyUNIXSocket$INVOKER$i$0$0$path(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "path", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.socket.RubyUNIXSocket.class, "path", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("path", javaMethod);
        javaMethod = new org.jruby.ext.socket.RubyUNIXSocket$INVOKER$i$1$0$initialize(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, 1, "initialize", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.socket.RubyUNIXSocket.class, "initialize", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("initialize", javaMethod);
        javaMethod = new org.jruby.ext.socket.RubyUNIXSocket$INVOKER$i$0$0$peeraddr(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "peeraddr", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.socket.RubyUNIXSocket.class, "peeraddr", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("peeraddr", javaMethod);
        javaMethod = new org.jruby.ext.socket.RubyUNIXSocket$INVOKER$i$0$1$recvfrom(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "recvfrom", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.socket.RubyUNIXSocket.class, "recvfrom", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject[].class});
        cls.addMethodAtBootTimeOnly("recvfrom", javaMethod);
        javaMethod = new org.jruby.ext.socket.RubyUNIXSocket$INVOKER$i$0$0$recv_io(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "recv_io", false, CallConfiguration.FrameNoneScopeNone, true, org.jruby.ext.socket.RubyUNIXSocket.class, "recv_io", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject[].class});
        cls.addMethodAtBootTimeOnly("recv_io", javaMethod);
        javaMethod = new org.jruby.ext.socket.RubyUNIXSocket$INVOKER$i$1$0$send_io(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "send_io", false, CallConfiguration.FrameNoneScopeNone, true, org.jruby.ext.socket.RubyUNIXSocket.class, "send_io", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("send_io", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.socket.RubyUNIXSocket","addr","addr");
        runtime.addBoundMethod("org.jruby.ext.socket.RubyUNIXSocket","path","path");
        runtime.addBoundMethod("org.jruby.ext.socket.RubyUNIXSocket","initialize","initialize");
        runtime.addBoundMethod("org.jruby.ext.socket.RubyUNIXSocket","peeraddr","peeraddr");
        runtime.addBoundMethod("org.jruby.ext.socket.RubyUNIXSocket","recvfrom","recvfrom");
        runtime.addBoundMethod("org.jruby.ext.socket.RubyUNIXSocket","recv_io","recv_io");
        runtime.addBoundMethod("org.jruby.ext.socket.RubyUNIXSocket","send_io","send_io");
    }
    static {
     }
}
