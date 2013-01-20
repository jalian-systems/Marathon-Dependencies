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
public class org$jruby$ext$socket$RubyTCPServer$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        RubyClass singletonClass = cls.getSingletonClass();
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.ext.socket.RubyTCPServer$INVOKER$s$0$0$open(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "open", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.socket.RubyTCPServer.class, "open", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class, org.jruby.runtime.Block.class});
        singletonClass.addMethodAtBootTimeOnly("open", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.socket.RubyTCPServer","open","open");
        javaMethod = new org.jruby.ext.socket.RubyTCPServer$INVOKER$i$0$0$peeraddr(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "peeraddr", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.socket.RubyTCPServer.class, "peeraddr", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject[].class});
        cls.addMethodAtBootTimeOnly("peeraddr", javaMethod);
        javaMethod = new org.jruby.ext.socket.RubyTCPServer$INVOKER$i$0$0$getpeername(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "getpeername", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.socket.RubyTCPServer.class, "getpeername", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject[].class});
        cls.addMethodAtBootTimeOnly("getpeername", javaMethod);
        javaMethod = new org.jruby.ext.socket.RubyTCPServer$INVOKER$i$0$0$accept_nonblock(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "accept_nonblock", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.socket.RubyTCPServer.class, "accept_nonblock", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("accept_nonblock", javaMethod);
        javaMethod = new org.jruby.ext.socket.RubyTCPServer$INVOKER$i$0$0$accept(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "accept", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.socket.RubyTCPServer.class, "accept", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("accept", javaMethod);
        javaMethod = new org.jruby.ext.socket.RubyTCPServer$INVOKER$i$1$0$listen(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "listen", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.socket.RubyTCPServer.class, "listen", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("listen", javaMethod);
        javaMethod = new org.jruby.ext.socket.RubyTCPServer$INVOKER$i$0$1$initialize(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, -1, "initialize", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.socket.RubyTCPServer.class, "initialize", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject[].class});
        cls.addMethodAtBootTimeOnly("initialize", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.socket.RubyTCPServer","peeraddr","peeraddr");
        runtime.addBoundMethod("org.jruby.ext.socket.RubyTCPServer","getpeername","getpeername");
        runtime.addBoundMethod("org.jruby.ext.socket.RubyTCPServer","accept_nonblock","accept_nonblock");
        runtime.addBoundMethod("org.jruby.ext.socket.RubyTCPServer","accept","accept");
        runtime.addBoundMethod("org.jruby.ext.socket.RubyTCPServer","listen","listen");
        runtime.addBoundMethod("org.jruby.ext.socket.RubyTCPServer","initialize","initialize");
    }
    static {
     }
}
