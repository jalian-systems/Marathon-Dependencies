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
public class org$jruby$ext$socket$RubySocket$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        RubyClass singletonClass = cls.getSingletonClass();
        CompatVersion compatVersion = cls.getRuntime().getInstanceConfig().getCompatVersion();
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.ext.socket.RubySocket$INVOKER$s$0$4$getaddrinfo(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "getaddrinfo", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.socket.RubySocket.class, "getaddrinfo", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class});
        singletonClass.addMethodAtBootTimeOnly("getaddrinfo", javaMethod);
        javaMethod = new org.jruby.ext.socket.RubySocket$INVOKER$s$1$0$gethostbyname(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "gethostbyname", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.socket.RubySocket.class, "gethostbyname", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        singletonClass.addMethodAtBootTimeOnly("gethostbyname", javaMethod);
        javaMethod = new org.jruby.ext.socket.RubySocket$INVOKER$s$1$0$unpack_sockaddr_in(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "unpack_sockaddr_in", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.socket.RubySocket.class, "unpack_sockaddr_in", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        singletonClass.addMethodAtBootTimeOnly("unpack_sockaddr_in", javaMethod);
        javaMethod = new org.jruby.ext.socket.RubySocket$INVOKER$s$0$0$gethostbyaddr(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "gethostbyaddr", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.socket.RubySocket.class, "gethostbyaddr", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class});
        singletonClass.addMethodAtBootTimeOnly("gethostbyaddr", javaMethod);
        javaMethod = new org.jruby.ext.socket.RubySocket$INVOKER$s$0$1$getnameinfo(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "getnameinfo", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.socket.RubySocket.class, "getnameinfo", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class});
        singletonClass.addMethodAtBootTimeOnly("getnameinfo", javaMethod);
        javaMethod = new org.jruby.ext.socket.RubySocket$INVOKER$s$0$1$getservbyname(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "getservbyname", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.socket.RubySocket.class, "getservbyname", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class});
        singletonClass.addMethodAtBootTimeOnly("getservbyname", javaMethod);
        javaMethod = new org.jruby.ext.socket.RubySocket$INVOKER$s$2$0$pack_sockaddr_in(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, 2, "pack_sockaddr_in", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.socket.RubySocket.class, "pack_sockaddr_in", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        singletonClass.addMethodAtBootTimeOnly("pack_sockaddr_in", javaMethod);
        singletonClass.addMethodAtBootTimeOnly("sockaddr_in", javaMethod);
        javaMethod = new org.jruby.ext.socket.RubySocket$INVOKER$s$1$0$for_fd(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "for_fd", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.socket.RubySocket.class, "for_fd", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        singletonClass.addMethodAtBootTimeOnly("for_fd", javaMethod);
        javaMethod = new org.jruby.ext.socket.RubySocket$INVOKER$s$1$0$pack_sockaddr_un(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "pack_sockaddr_un", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.socket.RubySocket.class, "pack_sockaddr_un", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        singletonClass.addMethodAtBootTimeOnly("pack_sockaddr_un", javaMethod);
        singletonClass.addMethodAtBootTimeOnly("sockaddr_un", javaMethod);
        javaMethod = new org.jruby.ext.socket.RubySocket$INVOKER$s$0$0$gethostname(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "gethostname", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.socket.RubySocket.class, "gethostname", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        singletonClass.addMethodAtBootTimeOnly("gethostname", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.socket.RubySocket","getaddrinfo","getaddrinfo");
        runtime.addBoundMethod("org.jruby.ext.socket.RubySocket","gethostbyname","gethostbyname");
        runtime.addBoundMethod("org.jruby.ext.socket.RubySocket","unpack_sockaddr_in","unpack_sockaddr_in");
        runtime.addBoundMethod("org.jruby.ext.socket.RubySocket","gethostbyaddr","gethostbyaddr");
        runtime.addBoundMethod("org.jruby.ext.socket.RubySocket","getnameinfo","getnameinfo");
        runtime.addBoundMethod("org.jruby.ext.socket.RubySocket","getservbyname","getservbyname");
        runtime.addBoundMethod("org.jruby.ext.socket.RubySocket","pack_sockaddr_in","pack_sockaddr_in");
        runtime.addBoundMethod("org.jruby.ext.socket.RubySocket","for_fd","for_fd");
        runtime.addBoundMethod("org.jruby.ext.socket.RubySocket","pack_sockaddr_un","pack_sockaddr_un");
        runtime.addBoundMethod("org.jruby.ext.socket.RubySocket","gethostname","gethostname");
        if (compatVersion.is1_9() || compatVersion == CompatVersion.BOTH) {
        javaMethod = new org.jruby.ext.socket.RubySocket$INVOKER$s$0$0$ip_address_list(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "ip_address_list", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.socket.RubySocket.class, "ip_address_list", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        singletonClass.addMethodAtBootTimeOnly("ip_address_list", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.socket.RubySocket","ip_address_list","ip_address_list");
        }
        javaMethod = new org.jruby.ext.socket.RubySocket$INVOKER$i$1$0$connect_nonblock(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "connect_nonblock", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.socket.RubySocket.class, "connect_nonblock", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("connect_nonblock", javaMethod);
        javaMethod = new org.jruby.ext.socket.RubySocket$INVOKER$i$1$0$listen(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "listen", false, CallConfiguration.FrameNoneScopeNone, true, org.jruby.ext.socket.RubySocket.class, "listen", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("listen", javaMethod);
        javaMethod = new org.jruby.ext.socket.RubySocket$INVOKER$i$recvfrom_nonblock(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "recvfrom_nonblock", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.socket.RubySocket.class, "recvfrom_nonblock", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("recvfrom_nonblock", javaMethod);
        javaMethod = new org.jruby.ext.socket.RubySocket$INVOKER$i$1$0$connect(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "connect", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.socket.RubySocket.class, "connect", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("connect", javaMethod);
        javaMethod = new org.jruby.ext.socket.RubySocket$INVOKER$i$recvfrom(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "recvfrom", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.socket.RubySocket.class, "recvfrom", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("recvfrom", javaMethod);
        javaMethod = new org.jruby.ext.socket.RubySocket$INVOKER$i$1$0$bind(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "bind", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.socket.RubySocket.class, "bind", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("bind", javaMethod);
        javaMethod = new org.jruby.ext.socket.RubySocket$INVOKER$i$0$0$accept(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "accept", false, CallConfiguration.FrameNoneScopeNone, true, org.jruby.ext.socket.RubySocket.class, "accept", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("accept", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.socket.RubySocket","connect_nonblock","connect_nonblock");
        runtime.addBoundMethod("org.jruby.ext.socket.RubySocket","listen","listen");
        runtime.addBoundMethod("org.jruby.ext.socket.RubySocket","recvfrom_nonblock","recvfrom_nonblock");
        runtime.addBoundMethod("org.jruby.ext.socket.RubySocket","connect","connect");
        runtime.addBoundMethod("org.jruby.ext.socket.RubySocket","recvfrom","recvfrom");
        runtime.addBoundMethod("org.jruby.ext.socket.RubySocket","bind","bind");
        runtime.addBoundMethod("org.jruby.ext.socket.RubySocket","accept","accept");
        if (compatVersion == CompatVersion.RUBY1_8 || compatVersion == CompatVersion.BOTH) {
        javaMethod = new org.jruby.ext.socket.RubySocket$INVOKER$i$3$0$initialize(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 3, "initialize", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.socket.RubySocket.class, "initialize", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("initialize", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.socket.RubySocket","initialize","initialize");
        }
        if (compatVersion.is1_9() || compatVersion == CompatVersion.BOTH) {
        javaMethod = new org.jruby.ext.socket.RubySocket$INVOKER$i$initialize19(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "initialize19", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.socket.RubySocket.class, "initialize19", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("initialize", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.socket.RubySocket","initialize19","initialize");
        }
    }
    static {
     }
}
