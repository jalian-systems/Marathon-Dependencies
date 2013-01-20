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
public class org$jruby$ext$jruby$JRubyObjectInputStream$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        RubyClass singletonClass = cls.getSingletonClass();
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.ext.jruby.JRubyObjectInputStream$INVOKER$s$0$0$newInstance(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "newInstance", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.jruby.JRubyObjectInputStream.class, "newInstance", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class, org.jruby.runtime.Block.class});
        singletonClass.addMethodAtBootTimeOnly("new", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.jruby.JRubyObjectInputStream","newInstance","new");
        javaMethod = new org.jruby.ext.jruby.JRubyObjectInputStream$INVOKER$i$0$0$readObject(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "readObject", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.jruby.JRubyObjectInputStream.class, "readObject", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("read_object", javaMethod);
        cls.defineAlias("readObject", "read_object");
        javaMethod = new org.jruby.ext.jruby.JRubyObjectInputStream$INVOKER$i$0$0$close(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "close", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.jruby.JRubyObjectInputStream.class, "close", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("close", javaMethod);
        javaMethod = new org.jruby.ext.jruby.JRubyObjectInputStream$INVOKER$i$1$0$initialize(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, 1, "initialize", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.jruby.JRubyObjectInputStream.class, "initialize", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("initialize", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.jruby.JRubyObjectInputStream","readObject","read_object");
        runtime.addBoundMethod("org.jruby.ext.jruby.JRubyObjectInputStream","close","close");
        runtime.addBoundMethod("org.jruby.ext.jruby.JRubyObjectInputStream","initialize","initialize");
    }
    static {
     }
}
