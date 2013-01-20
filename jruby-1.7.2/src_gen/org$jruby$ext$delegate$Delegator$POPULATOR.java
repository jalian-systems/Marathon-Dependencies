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
public class org$jruby$ext$delegate$Delegator$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.ext.delegate.Delegator$INVOKER$s$1$0$marshal_load(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "marshal_load", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.delegate.Delegator.class, "marshal_load", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("marshal_load", javaMethod);
        javaMethod = new org.jruby.ext.delegate.Delegator$INVOKER$s$0$0$method_missing(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "method_missing", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.delegate.Delegator.class, "method_missing", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("method_missing", javaMethod);
        javaMethod = new org.jruby.ext.delegate.Delegator$INVOKER$s$0$0$__getobj__(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "__getobj__", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.delegate.Delegator.class, "__getobj__", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("__getobj__", javaMethod);
        javaMethod = new org.jruby.ext.delegate.Delegator$INVOKER$s$1$0$initialize(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, 1, "initialize", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.delegate.Delegator.class, "initialize", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("initialize", javaMethod);
        javaMethod = new org.jruby.ext.delegate.Delegator$INVOKER$s$1$0$method(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "method", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.delegate.Delegator.class, "method", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("method", javaMethod);
        javaMethod = new org.jruby.ext.delegate.Delegator$INVOKER$s$0$0$send(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "send", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.delegate.Delegator.class, "send", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("send", javaMethod);
        javaMethod = new org.jruby.ext.delegate.Delegator$INVOKER$s$0$0$marshal_dump(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "marshal_dump", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.delegate.Delegator.class, "marshal_dump", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("marshal_dump", javaMethod);
        javaMethod = new org.jruby.ext.delegate.Delegator$INVOKER$s$1$0$repond_to_p(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "repond_to_p", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.delegate.Delegator.class, "repond_to_p", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("respond_to?", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.delegate.Delegator","marshal_load","marshal_load");
        runtime.addBoundMethod("org.jruby.ext.delegate.Delegator","method_missing","method_missing");
        runtime.addBoundMethod("org.jruby.ext.delegate.Delegator","__getobj__","__getobj__");
        runtime.addBoundMethod("org.jruby.ext.delegate.Delegator","initialize","initialize");
        runtime.addBoundMethod("org.jruby.ext.delegate.Delegator","method","method");
        runtime.addBoundMethod("org.jruby.ext.delegate.Delegator","send","send");
        runtime.addBoundMethod("org.jruby.ext.delegate.Delegator","marshal_dump","marshal_dump");
        runtime.addBoundMethod("org.jruby.ext.delegate.Delegator","repond_to_p","respond_to?");
    }
    static {
     }
}
