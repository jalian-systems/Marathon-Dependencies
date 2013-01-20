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
public class org$jruby$RubyProcess$UserID$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        RubyClass singletonClass = cls.getSingletonClass();
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.RubyProcess$UserID$INVOKER$s$1$0$eid(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "eid", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyProcess.UserID.class, "eid", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("eid=", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("eid=", moduleMethod);
        javaMethod = new org.jruby.RubyProcess$UserID$INVOKER$s$1$0$grant_privilege(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "grant_privilege", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyProcess.UserID.class, "grant_privilege", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("grant_privilege", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("grant_privilege", moduleMethod);
        javaMethod = new org.jruby.RubyProcess$UserID$INVOKER$s$0$0$sid_available_p(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "sid_available_p", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyProcess.UserID.class, "sid_available_p", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("sid_available?", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("sid_available?", moduleMethod);
        javaMethod = new org.jruby.RubyProcess$UserID$INVOKER$s$0$0$rid(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "rid", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyProcess.UserID.class, "rid", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("rid", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("rid", moduleMethod);
        javaMethod = new org.jruby.RubyProcess$UserID$INVOKER$s$0$0$switch_rb(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, 0, "switch_rb", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyProcess.UserID.class, "switch_rb", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("switch", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("switch", moduleMethod);
        javaMethod = new org.jruby.RubyProcess$UserID$INVOKER$s$0$0$re_exchange(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "re_exchange", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyProcess.UserID.class, "re_exchange", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("re_exchange", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("re_exchange", moduleMethod);
        javaMethod = new org.jruby.RubyProcess$UserID$INVOKER$s$1$0$change_privilege(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "change_privilege", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyProcess.UserID.class, "change_privilege", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("change_privilege", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("change_privilege", moduleMethod);
        javaMethod = new org.jruby.RubyProcess$UserID$INVOKER$s$0$0$re_exchangeable_p(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "re_exchangeable_p", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyProcess.UserID.class, "re_exchangeable_p", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("re_exchangeable?", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("re_exchangeable?", moduleMethod);
        javaMethod = new org.jruby.RubyProcess$UserID$INVOKER$s$0$0$eid(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "eid", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyProcess.UserID.class, "eid", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("eid", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("eid", moduleMethod);
        runtime.addBoundMethod("org.jruby.RubyProcess.UserID","eid","eid=");
        runtime.addBoundMethod("org.jruby.RubyProcess.UserID","grant_privilege","grant_privilege");
        runtime.addBoundMethod("org.jruby.RubyProcess.UserID","sid_available_p","sid_available?");
        runtime.addBoundMethod("org.jruby.RubyProcess.UserID","rid","rid");
        runtime.addBoundMethod("org.jruby.RubyProcess.UserID","switch_rb","switch");
        runtime.addBoundMethod("org.jruby.RubyProcess.UserID","re_exchange","re_exchange");
        runtime.addBoundMethod("org.jruby.RubyProcess.UserID","change_privilege","change_privilege");
        runtime.addBoundMethod("org.jruby.RubyProcess.UserID","re_exchangeable_p","re_exchangeable?");
        runtime.addBoundMethod("org.jruby.RubyProcess.UserID","eid","eid");
    }
    static {
     }
}
