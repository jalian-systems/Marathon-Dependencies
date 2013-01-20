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
public class org$jruby$RubyEncoding$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        RubyClass singletonClass = cls.getSingletonClass();
        CompatVersion compatVersion = cls.getRuntime().getInstanceConfig().getCompatVersion();
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.RubyEncoding$INVOKER$s$0$0$locale_charmap(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "locale_charmap", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyEncoding.class, "locale_charmap", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        singletonClass.addMethodAtBootTimeOnly("locale_charmap", javaMethod);
        javaMethod = new org.jruby.RubyEncoding$INVOKER$s$1$0$_load(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "_load", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyEncoding.class, "_load", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        singletonClass.addMethodAtBootTimeOnly("_load", javaMethod);
        javaMethod = new org.jruby.RubyEncoding$INVOKER$s$0$0$name_list(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "name_list", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyEncoding.class, "name_list", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        singletonClass.addMethodAtBootTimeOnly("name_list", javaMethod);
        javaMethod = new org.jruby.RubyEncoding$INVOKER$s$0$0$list(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "list", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyEncoding.class, "list", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        singletonClass.addMethodAtBootTimeOnly("list", javaMethod);
        javaMethod = new org.jruby.RubyEncoding$INVOKER$s$2$0$compatible_p(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, 2, "compatible_p", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyEncoding.class, "compatible_p", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        singletonClass.addMethodAtBootTimeOnly("compatible?", javaMethod);
        javaMethod = new org.jruby.RubyEncoding$INVOKER$s$0$0$aliases(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "aliases", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyEncoding.class, "aliases", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        singletonClass.addMethodAtBootTimeOnly("aliases", javaMethod);
        javaMethod = new org.jruby.RubyEncoding$INVOKER$s$1$0$find(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "find", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyEncoding.class, "find", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        singletonClass.addMethodAtBootTimeOnly("find", javaMethod);
        runtime.addBoundMethod("org.jruby.RubyEncoding","locale_charmap","locale_charmap");
        runtime.addBoundMethod("org.jruby.RubyEncoding","_load","_load");
        runtime.addBoundMethod("org.jruby.RubyEncoding","name_list","name_list");
        runtime.addBoundMethod("org.jruby.RubyEncoding","list","list");
        runtime.addBoundMethod("org.jruby.RubyEncoding","compatible_p","compatible?");
        runtime.addBoundMethod("org.jruby.RubyEncoding","aliases","aliases");
        runtime.addBoundMethod("org.jruby.RubyEncoding","find","find");
        if (compatVersion.is1_9() || compatVersion == CompatVersion.BOTH) {
        javaMethod = new org.jruby.RubyEncoding$INVOKER$s$1$0$setDefaultExternal(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "setDefaultExternal", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyEncoding.class, "setDefaultExternal", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        singletonClass.addMethodAtBootTimeOnly("default_external=", javaMethod);
        javaMethod = new org.jruby.RubyEncoding$INVOKER$s$0$0$getDefaultInternal(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "getDefaultInternal", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyEncoding.class, "getDefaultInternal", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        singletonClass.addMethodAtBootTimeOnly("default_internal", javaMethod);
        javaMethod = new org.jruby.RubyEncoding$INVOKER$s$1$0$setDefaultInternal(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "setDefaultInternal", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyEncoding.class, "setDefaultInternal", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        singletonClass.addMethodAtBootTimeOnly("default_internal=", javaMethod);
        javaMethod = new org.jruby.RubyEncoding$INVOKER$s$0$0$getDefaultExternal(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "getDefaultExternal", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyEncoding.class, "getDefaultExternal", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        singletonClass.addMethodAtBootTimeOnly("default_external", javaMethod);
        runtime.addBoundMethod("org.jruby.RubyEncoding","setDefaultExternal","default_external=");
        runtime.addBoundMethod("org.jruby.RubyEncoding","getDefaultInternal","default_internal");
        runtime.addBoundMethod("org.jruby.RubyEncoding","setDefaultInternal","default_internal=");
        runtime.addBoundMethod("org.jruby.RubyEncoding","getDefaultExternal","default_external");
        }
        javaMethod = new org.jruby.RubyEncoding$INVOKER$i$1$0$_dump(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "_dump", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyEncoding.class, "_dump", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("_dump", javaMethod);
        javaMethod = new org.jruby.RubyEncoding$INVOKER$i$0$0$dummy_p(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "dummy_p", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyEncoding.class, "dummy_p", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("dummy?", javaMethod);
        javaMethod = new org.jruby.RubyEncoding$INVOKER$i$0$0$names(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "names", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyEncoding.class, "names", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("names", javaMethod);
        javaMethod = new org.jruby.RubyEncoding$INVOKER$i$0$0$asciiCompatible_p(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "asciiCompatible_p", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyEncoding.class, "asciiCompatible_p", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("ascii_compatible?", javaMethod);
        javaMethod = new org.jruby.RubyEncoding$INVOKER$i$0$0$inspect(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "inspect", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyEncoding.class, "inspect", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("inspect", javaMethod);
        javaMethod = new org.jruby.RubyEncoding$INVOKER$i$0$0$to_s(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "to_s", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyEncoding.class, "to_s", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("to_s", javaMethod);
        cls.addMethodAtBootTimeOnly("name", javaMethod);
        runtime.addBoundMethod("org.jruby.RubyEncoding","_dump","_dump");
        runtime.addBoundMethod("org.jruby.RubyEncoding","dummy_p","dummy?");
        runtime.addBoundMethod("org.jruby.RubyEncoding","names","names");
        runtime.addBoundMethod("org.jruby.RubyEncoding","asciiCompatible_p","ascii_compatible?");
        runtime.addBoundMethod("org.jruby.RubyEncoding","inspect","inspect");
        runtime.addBoundMethod("org.jruby.RubyEncoding","to_s","to_s");
    }
    static {
     }
}
