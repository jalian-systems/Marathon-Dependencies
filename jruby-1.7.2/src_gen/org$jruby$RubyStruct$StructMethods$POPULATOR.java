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
public class org$jruby$RubyStruct$StructMethods$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        CompatVersion compatVersion = cls.getRuntime().getInstanceConfig().getCompatVersion();
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.RubyStruct$StructMethods$INVOKER$s$newStruct(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "newStruct", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyStruct.StructMethods.class, "newStruct", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("new", javaMethod);
        cls.addMethodAtBootTimeOnly("[]", javaMethod);
        runtime.addBoundMethod("org.jruby.RubyStruct.StructMethods","newStruct","new");
        if (compatVersion == CompatVersion.RUBY1_8 || compatVersion == CompatVersion.BOTH) {
        javaMethod = new org.jruby.RubyStruct$StructMethods$INVOKER$s$0$0$members(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "members", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyStruct.StructMethods.class, "members", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("members", javaMethod);
        runtime.addBoundMethod("org.jruby.RubyStruct.StructMethods","members","members");
        }
        if (compatVersion.is1_9() || compatVersion == CompatVersion.BOTH) {
        javaMethod = new org.jruby.RubyStruct$StructMethods$INVOKER$s$0$0$members19(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "members19", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyStruct.StructMethods.class, "members19", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("members", javaMethod);
        runtime.addBoundMethod("org.jruby.RubyStruct.StructMethods","members19","members");
        }
    }
    static {
     }
}
