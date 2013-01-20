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
public class org$jruby$ext$socket$RubyServerSocket$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.ext.socket.RubyServerSocket$INVOKER$i$1$0$connect_nonblock(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "connect_nonblock", false, CallConfiguration.FrameNoneScopeNone, true, org.jruby.ext.socket.RubyServerSocket.class, "connect_nonblock", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("connect_nonblock", javaMethod);
        javaMethod = new org.jruby.ext.socket.RubyServerSocket$INVOKER$i$1$0$connect(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "connect", false, CallConfiguration.FrameNoneScopeNone, true, org.jruby.ext.socket.RubyServerSocket.class, "connect", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("connect", javaMethod);
        javaMethod = new org.jruby.ext.socket.RubyServerSocket$INVOKER$i$1$0$listen(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "listen", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.socket.RubyServerSocket.class, "listen", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("listen", javaMethod);
        javaMethod = new org.jruby.ext.socket.RubyServerSocket$INVOKER$i$bind(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "bind", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.socket.RubyServerSocket.class, "bind", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("bind", javaMethod);
        javaMethod = new org.jruby.ext.socket.RubyServerSocket$INVOKER$i$0$0$accept_nonblock(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "accept_nonblock", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.socket.RubyServerSocket.class, "accept_nonblock", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("accept_nonblock", javaMethod);
        javaMethod = new org.jruby.ext.socket.RubyServerSocket$INVOKER$i$0$0$accept(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "accept", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.socket.RubyServerSocket.class, "accept", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("accept", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.socket.RubyServerSocket","connect_nonblock","connect_nonblock");
        runtime.addBoundMethod("org.jruby.ext.socket.RubyServerSocket","connect","connect");
        runtime.addBoundMethod("org.jruby.ext.socket.RubyServerSocket","listen","listen");
        runtime.addBoundMethod("org.jruby.ext.socket.RubyServerSocket","bind","bind");
        runtime.addBoundMethod("org.jruby.ext.socket.RubyServerSocket","accept_nonblock","accept_nonblock");
        runtime.addBoundMethod("org.jruby.ext.socket.RubyServerSocket","accept","accept");
    }
    static {
     }
}
