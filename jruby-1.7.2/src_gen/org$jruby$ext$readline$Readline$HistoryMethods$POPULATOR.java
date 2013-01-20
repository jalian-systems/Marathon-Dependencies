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
public class org$jruby$ext$readline$Readline$HistoryMethods$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.ext.readline.Readline$HistoryMethods$INVOKER$s$1$0$s_hist_get(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "s_hist_get", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.readline.Readline.HistoryMethods.class, "s_hist_get", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("[]", javaMethod);
        javaMethod = new org.jruby.ext.readline.Readline$HistoryMethods$INVOKER$s$0$0$s_hist_empty_p(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "s_hist_empty_p", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.readline.Readline.HistoryMethods.class, "s_hist_empty_p", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("empty?", javaMethod);
        javaMethod = new org.jruby.ext.readline.Readline$HistoryMethods$INVOKER$s$1$0$s_hist_delete_at(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "s_hist_delete_at", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.readline.Readline.HistoryMethods.class, "s_hist_delete_at", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("delete_at", javaMethod);
        javaMethod = new org.jruby.ext.readline.Readline$HistoryMethods$INVOKER$s$0$0$s_hist_length(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "s_hist_length", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.readline.Readline.HistoryMethods.class, "s_hist_length", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("length", javaMethod);
        cls.addMethodAtBootTimeOnly("size", javaMethod);
        javaMethod = new org.jruby.ext.readline.Readline$HistoryMethods$INVOKER$s$0$0$s_pop(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "s_pop", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.readline.Readline.HistoryMethods.class, "s_pop", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("pop", javaMethod);
        javaMethod = new org.jruby.ext.readline.Readline$HistoryMethods$INVOKER$s$0$0$s_hist_each(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "s_hist_each", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.readline.Readline.HistoryMethods.class, "s_hist_each", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("each", javaMethod);
        javaMethod = new org.jruby.ext.readline.Readline$HistoryMethods$INVOKER$s$0$0$s_hist_shift(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "s_hist_shift", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.readline.Readline.HistoryMethods.class, "s_hist_shift", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("shift", javaMethod);
        javaMethod = new org.jruby.ext.readline.Readline$HistoryMethods$INVOKER$s$0$0$s_hist_to_a(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "s_hist_to_a", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.readline.Readline.HistoryMethods.class, "s_hist_to_a", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("to_a", javaMethod);
        javaMethod = new org.jruby.ext.readline.Readline$HistoryMethods$INVOKER$s$0$0$s_push(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "s_push", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.readline.Readline.HistoryMethods.class, "s_push", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class});
        cls.addMethodAtBootTimeOnly("push", javaMethod);
        cls.addMethodAtBootTimeOnly("<<", javaMethod);
        javaMethod = new org.jruby.ext.readline.Readline$HistoryMethods$INVOKER$s$2$0$s_hist_set(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 2, "s_hist_set", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.readline.Readline.HistoryMethods.class, "s_hist_set", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("[]=", javaMethod);
        javaMethod = new org.jruby.ext.readline.Readline$HistoryMethods$INVOKER$s$0$0$s_hist_to_s(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "s_hist_to_s", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.readline.Readline.HistoryMethods.class, "s_hist_to_s", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("to_s", javaMethod);
        runtime.addBoundMethod("org.jruby.ext.readline.Readline.HistoryMethods","s_hist_get","[]");
        runtime.addBoundMethod("org.jruby.ext.readline.Readline.HistoryMethods","s_hist_empty_p","empty?");
        runtime.addBoundMethod("org.jruby.ext.readline.Readline.HistoryMethods","s_hist_delete_at","delete_at");
        runtime.addBoundMethod("org.jruby.ext.readline.Readline.HistoryMethods","s_hist_length","length");
        runtime.addBoundMethod("org.jruby.ext.readline.Readline.HistoryMethods","s_pop","pop");
        runtime.addBoundMethod("org.jruby.ext.readline.Readline.HistoryMethods","s_hist_each","each");
        runtime.addBoundMethod("org.jruby.ext.readline.Readline.HistoryMethods","s_hist_shift","shift");
        runtime.addBoundMethod("org.jruby.ext.readline.Readline.HistoryMethods","s_hist_to_a","to_a");
        runtime.addBoundMethod("org.jruby.ext.readline.Readline.HistoryMethods","s_push","push");
        runtime.addBoundMethod("org.jruby.ext.readline.Readline.HistoryMethods","s_hist_set","[]=");
        runtime.addBoundMethod("org.jruby.ext.readline.Readline.HistoryMethods","s_hist_to_s","to_s");
    }
    static {
     }
}
