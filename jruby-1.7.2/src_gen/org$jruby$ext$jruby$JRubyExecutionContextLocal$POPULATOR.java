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
public class org$jruby$ext$jruby$JRubyExecutionContextLocal$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.ext.jruby.JRubyExecutionContextLocal$INVOKER$i$1$0$setValue(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "setValue", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.jruby.JRubyExecutionContextLocal.class, "setValue", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("value=", javaMethod);
        javaMethod = new org.jruby.ext.jruby.JRubyExecutionContextLocal$INVOKER$i$0$0$getDefault(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "getDefault", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.jruby.JRubyExecutionContextLocal.class, "getDefault", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("default", javaMethod);
        javaMethod = new org.jruby.ext.jruby.JRubyExecutionContextLocal$INVOKER$i$0$0$getValue(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "getValue", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.jruby.JRubyExecutionContextLocal.class, "getValue", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("value", javaMethod);
        javaMethod = new org.jruby.ext.jruby.JRubyExecutionContextLocal$INVOKER$i$0$0$getDefaultProc(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "getDefaultProc", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.jruby.JRubyExecutionContextLocal.class, "getDefaultProc", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("default_proc", javaMethod);
        javaMethod = new org.jruby.ext.jruby.JRubyExecutionContextLocal$INVOKER$i$0$1$rubyInitialize(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "rubyInitialize", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.jruby.JRubyExecutionContextLocal.class, "rubyInitialize", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject[].class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("initialize", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.jruby.JRubyExecutionContextLocal","setValue","value=");
        runtime.addBoundMethod("org.jruby.ext.jruby.JRubyExecutionContextLocal","getDefault","default");
        runtime.addBoundMethod("org.jruby.ext.jruby.JRubyExecutionContextLocal","getValue","value");
        runtime.addBoundMethod("org.jruby.ext.jruby.JRubyExecutionContextLocal","getDefaultProc","default_proc");
        runtime.addBoundMethod("org.jruby.ext.jruby.JRubyExecutionContextLocal","rubyInitialize","initialize");
    }
    static {
     }
}
