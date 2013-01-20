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
public class org$jruby$RubyStruct$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        RubyClass singletonClass = cls.getSingletonClass();
        CompatVersion compatVersion = cls.getRuntime().getInstanceConfig().getCompatVersion();
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.RubyStruct$INVOKER$s$0$0$newInstance(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "newInstance", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyStruct.class, "newInstance", org.jruby.RubyClass.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class, org.jruby.runtime.Block.class});
        singletonClass.addMethodAtBootTimeOnly("new", javaMethod);
        runtime.addBoundMethod("org.jruby.RubyStruct","newInstance","new");
        javaMethod = new org.jruby.RubyStruct$INVOKER$i$0$0$each_pair(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "each_pair", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyStruct.class, "each_pair", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("each_pair", javaMethod);
        javaMethod = new org.jruby.RubyStruct$INVOKER$i$initialize(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, -1, "initialize", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyStruct.class, "initialize", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject[].class});
        cls.addMethodAtBootTimeOnly("initialize", javaMethod);
        javaMethod = new org.jruby.RubyStruct$INVOKER$i$1$0$aref(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "aref", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyStruct.class, "aref", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("[]", javaMethod);
        javaMethod = new org.jruby.RubyStruct$INVOKER$i$0$0$values_at(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "values_at", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyStruct.class, "values_at", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject[].class});
        cls.addMethodAtBootTimeOnly("values_at", javaMethod);
        javaMethod = new org.jruby.RubyStruct$INVOKER$i$0$0$size(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "size", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyStruct.class, "size", org.jruby.RubyFixnum.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("size", javaMethod);
        cls.addMethodAtBootTimeOnly("length", javaMethod);
        javaMethod = new org.jruby.RubyStruct$INVOKER$i$1$0$initialize_copy(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "initialize_copy", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyStruct.class, "initialize_copy", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("initialize_copy", javaMethod);
        javaMethod = new org.jruby.RubyStruct$INVOKER$i$0$0$each(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "each", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyStruct.class, "each", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("each", javaMethod);
        javaMethod = new org.jruby.RubyStruct$INVOKER$i$1$0$op_equal(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "op_equal", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyStruct.class, "op_equal", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("==", javaMethod);
        javaMethod = new org.jruby.RubyStruct$INVOKER$i$0$0$hash(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "hash", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyStruct.class, "hash", org.jruby.RubyFixnum.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("hash", javaMethod);
        javaMethod = new org.jruby.RubyStruct$INVOKER$i$0$0$select(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "select", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyStruct.class, "select", org.jruby.RubyArray.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("select", javaMethod);
        javaMethod = new org.jruby.RubyStruct$INVOKER$i$1$0$eql_p(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "eql_p", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyStruct.class, "eql_p", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("eql?", javaMethod);
        javaMethod = new org.jruby.RubyStruct$INVOKER$i$0$0$inspect(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "inspect", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyStruct.class, "inspect", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("inspect", javaMethod);
        cls.addMethodAtBootTimeOnly("to_s", javaMethod);
        javaMethod = new org.jruby.RubyStruct$INVOKER$i$0$0$to_a(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "to_a", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyStruct.class, "to_a", org.jruby.RubyArray.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("to_a", javaMethod);
        cls.addMethodAtBootTimeOnly("values", javaMethod);
        javaMethod = new org.jruby.RubyStruct$INVOKER$i$2$0$aset(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 2, "aset", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyStruct.class, "aset", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("[]=", javaMethod);
        runtime.addBoundMethod("org.jruby.RubyStruct","each_pair","each_pair");
        runtime.addBoundMethod("org.jruby.RubyStruct","initialize","initialize");
        runtime.addBoundMethod("org.jruby.RubyStruct","aref","[]");
        runtime.addBoundMethod("org.jruby.RubyStruct","values_at","values_at");
        runtime.addBoundMethod("org.jruby.RubyStruct","size","size");
        runtime.addBoundMethod("org.jruby.RubyStruct","initialize_copy","initialize_copy");
        runtime.addBoundMethod("org.jruby.RubyStruct","each","each");
        runtime.addBoundMethod("org.jruby.RubyStruct","op_equal","==");
        runtime.addBoundMethod("org.jruby.RubyStruct","hash","hash");
        runtime.addBoundMethod("org.jruby.RubyStruct","select","select");
        runtime.addBoundMethod("org.jruby.RubyStruct","eql_p","eql?");
        runtime.addBoundMethod("org.jruby.RubyStruct","inspect","inspect");
        runtime.addBoundMethod("org.jruby.RubyStruct","to_a","to_a");
        runtime.addBoundMethod("org.jruby.RubyStruct","aset","[]=");
        if (compatVersion == CompatVersion.RUBY1_8 || compatVersion == CompatVersion.BOTH) {
        javaMethod = new org.jruby.RubyStruct$INVOKER$i$0$0$members(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "members", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyStruct.class, "members", org.jruby.RubyArray.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("members", javaMethod);
        runtime.addBoundMethod("org.jruby.RubyStruct","members","members");
        }
        if (compatVersion.is1_9() || compatVersion == CompatVersion.BOTH) {
        javaMethod = new org.jruby.RubyStruct$INVOKER$i$0$0$members19(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "members19", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyStruct.class, "members19", org.jruby.RubyArray.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("members", javaMethod);
        runtime.addBoundMethod("org.jruby.RubyStruct","members19","members");
        }
    }
    static {
     }
}
