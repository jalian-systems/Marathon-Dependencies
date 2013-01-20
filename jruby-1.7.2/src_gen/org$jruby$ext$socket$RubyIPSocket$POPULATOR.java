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
public class org$jruby$ext$socket$RubyIPSocket$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        RubyClass singletonClass = cls.getSingletonClass();
        CompatVersion compatVersion = cls.getRuntime().getInstanceConfig().getCompatVersion();
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.ext.socket.RubyIPSocket$INVOKER$s$1$0$getaddress(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "getaddress", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.socket.RubyIPSocket.class, "getaddress", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        singletonClass.addMethodAtBootTimeOnly("getaddress", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.socket.RubyIPSocket","getaddress","getaddress");
        javaMethod = new org.jruby.ext.socket.RubyIPSocket$INVOKER$i$0$0$addr(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "addr", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.socket.RubyIPSocket.class, "addr", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("addr", javaMethod);
        javaMethod = new org.jruby.ext.socket.RubyIPSocket$INVOKER$i$0$0$peeraddr(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "peeraddr", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.socket.RubyIPSocket.class, "peeraddr", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("peeraddr", javaMethod);
        javaMethod = new org.jruby.ext.socket.RubyIPSocket$INVOKER$i$recvfrom(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "recvfrom", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.socket.RubyIPSocket.class, "recvfrom", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("recvfrom", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.socket.RubyIPSocket","addr","addr");
        runtime.addBoundMethod("org.jruby.ext.socket.RubyIPSocket","peeraddr","peeraddr");
        runtime.addBoundMethod("org.jruby.ext.socket.RubyIPSocket","recvfrom","recvfrom");
        if (compatVersion.is1_9() || compatVersion == CompatVersion.BOTH) {
        javaMethod = new org.jruby.ext.socket.RubyIPSocket$INVOKER$i$peeraddr19(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "peeraddr19", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.socket.RubyIPSocket.class, "peeraddr19", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("peeraddr", javaMethod);
        javaMethod = new org.jruby.ext.socket.RubyIPSocket$INVOKER$i$0$0$getpeereid(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "getpeereid", false, CallConfiguration.FrameNoneScopeNone, true, org.jruby.ext.socket.RubyIPSocket.class, "getpeereid", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("getpeereid", javaMethod);
        javaMethod = new org.jruby.ext.socket.RubyIPSocket$INVOKER$i$addr19(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "addr19", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.socket.RubyIPSocket.class, "addr19", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("addr", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.socket.RubyIPSocket","peeraddr19","peeraddr");
        runtime.addBoundMethod("org.jruby.ext.socket.RubyIPSocket","getpeereid","getpeereid");
        runtime.addBoundMethod("org.jruby.ext.socket.RubyIPSocket","addr19","addr");
        }
    }
    static {
     }
}
