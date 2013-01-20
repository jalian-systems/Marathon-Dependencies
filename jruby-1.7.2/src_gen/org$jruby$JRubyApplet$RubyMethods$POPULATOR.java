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
public class org$jruby$JRubyApplet$RubyMethods$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.JRubyApplet$RubyMethods$INVOKER$s$0$0$on_destroy(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "on_destroy", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.JRubyApplet.RubyMethods.class, "on_destroy", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("on_destroy", javaMethod);
        javaMethod = new org.jruby.JRubyApplet$RubyMethods$INVOKER$s$0$0$on_stop(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "on_stop", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.JRubyApplet.RubyMethods.class, "on_stop", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("on_stop", javaMethod);
        javaMethod = new org.jruby.JRubyApplet$RubyMethods$INVOKER$s$0$0$on_paint(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "on_paint", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.JRubyApplet.RubyMethods.class, "on_paint", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("on_paint", javaMethod);
        javaMethod = new org.jruby.JRubyApplet$RubyMethods$INVOKER$s$0$0$on_start(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "on_start", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.JRubyApplet.RubyMethods.class, "on_start", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("on_start", javaMethod);
        runtime.addBoundMethod("org.jruby.JRubyApplet.RubyMethods","on_destroy","on_destroy");
        runtime.addBoundMethod("org.jruby.JRubyApplet.RubyMethods","on_stop","on_stop");
        runtime.addBoundMethod("org.jruby.JRubyApplet.RubyMethods","on_paint","on_paint");
        runtime.addBoundMethod("org.jruby.JRubyApplet.RubyMethods","on_start","on_start");
    }
    static {
     }
}
