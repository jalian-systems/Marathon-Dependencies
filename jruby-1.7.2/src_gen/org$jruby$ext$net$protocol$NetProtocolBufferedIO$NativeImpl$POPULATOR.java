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
public class org$jruby$ext$net$protocol$NetProtocolBufferedIO$NativeImpl$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.ext.net.protocol.NetProtocolBufferedIO$NativeImpl$INVOKER$s$0$0$rbuf_fill(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "rbuf_fill", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.net.protocol.NetProtocolBufferedIO.NativeImpl.class, "rbuf_fill", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("rbuf_fill", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.net.protocol.NetProtocolBufferedIO.NativeImpl","rbuf_fill","rbuf_fill");
    }
    static {
     }
}
