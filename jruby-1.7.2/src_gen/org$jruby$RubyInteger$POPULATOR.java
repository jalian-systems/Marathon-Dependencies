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
public class org$jruby$RubyInteger$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        RubyClass singletonClass = cls.getSingletonClass();
        CompatVersion compatVersion = cls.getRuntime().getInstanceConfig().getCompatVersion();
        Ruby runtime = cls.getRuntime();
        if (compatVersion == CompatVersion.RUBY1_8 || compatVersion == CompatVersion.BOTH) {
        javaMethod = new org.jruby.RubyInteger$INVOKER$s$1$0$induced_from(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "induced_from", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyInteger.class, "induced_from", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        singletonClass.addMethodAtBootTimeOnly("induced_from", javaMethod);
        runtime.addBoundMethod("org.jruby.RubyInteger","induced_from","induced_from");
        }
        javaMethod = new org.jruby.RubyInteger$INVOKER$i$0$0$succ(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "succ", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyInteger.class, "succ", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("succ", javaMethod);
        cls.addMethodAtBootTimeOnly("next", javaMethod);
        javaMethod = new org.jruby.RubyInteger$INVOKER$i$1$0$downto(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "downto", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyInteger.class, "downto", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("downto", javaMethod);
        javaMethod = new org.jruby.RubyInteger$INVOKER$i$0$0$to_i(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "to_i", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyInteger.class, "to_i", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("to_i", javaMethod);
        cls.addMethodAtBootTimeOnly("to_int", javaMethod);
        cls.addMethodAtBootTimeOnly("floor", javaMethod);
        cls.addMethodAtBootTimeOnly("ceil", javaMethod);
        cls.addMethodAtBootTimeOnly("truncate", javaMethod);
        javaMethod = new org.jruby.RubyInteger$INVOKER$i$0$0$integer_p(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "integer_p", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyInteger.class, "integer_p", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("integer?", javaMethod);
        javaMethod = new org.jruby.RubyInteger$INVOKER$i$0$0$even_p(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "even_p", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyInteger.class, "even_p", org.jruby.RubyBoolean.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("even?", javaMethod);
        javaMethod = new org.jruby.RubyInteger$INVOKER$i$0$0$odd_p(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "odd_p", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyInteger.class, "odd_p", org.jruby.RubyBoolean.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("odd?", javaMethod);
        javaMethod = new org.jruby.RubyInteger$INVOKER$i$0$0$ord(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "ord", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyInteger.class, "ord", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("ord", javaMethod);
        javaMethod = new org.jruby.RubyInteger$INVOKER$i$0$0$times(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "times", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyInteger.class, "times", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("times", javaMethod);
        javaMethod = new org.jruby.RubyInteger$INVOKER$i$1$0$upto(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "upto", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyInteger.class, "upto", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("upto", javaMethod);
        javaMethod = new org.jruby.RubyInteger$INVOKER$i$0$0$pred(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "pred", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyInteger.class, "pred", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("pred", javaMethod);
        runtime.addBoundMethod("org.jruby.RubyInteger","succ","succ");
        runtime.addBoundMethod("org.jruby.RubyInteger","downto","downto");
        runtime.addBoundMethod("org.jruby.RubyInteger","to_i","to_i");
        runtime.addBoundMethod("org.jruby.RubyInteger","integer_p","integer?");
        runtime.addBoundMethod("org.jruby.RubyInteger","even_p","even?");
        runtime.addBoundMethod("org.jruby.RubyInteger","odd_p","odd?");
        runtime.addBoundMethod("org.jruby.RubyInteger","ord","ord");
        runtime.addBoundMethod("org.jruby.RubyInteger","times","times");
        runtime.addBoundMethod("org.jruby.RubyInteger","upto","upto");
        runtime.addBoundMethod("org.jruby.RubyInteger","pred","pred");
        if (compatVersion == CompatVersion.RUBY1_8 || compatVersion == CompatVersion.BOTH) {
        javaMethod = new org.jruby.RubyInteger$INVOKER$i$0$0$round(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "round", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyInteger.class, "round", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("round", javaMethod);
        javaMethod = new org.jruby.RubyInteger$INVOKER$i$0$0$chr(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "chr", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyInteger.class, "chr", org.jruby.RubyString.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("chr", javaMethod);
        runtime.addBoundMethod("org.jruby.RubyInteger","round","round");
        runtime.addBoundMethod("org.jruby.RubyInteger","chr","chr");
        }
        if (compatVersion.is1_9() || compatVersion == CompatVersion.BOTH) {
        javaMethod = new org.jruby.RubyInteger$INVOKER$i$1$0$gcdlcm(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "gcdlcm", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyInteger.class, "gcdlcm", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("gcdlcm", javaMethod);
        javaMethod = new org.jruby.RubyInteger$INVOKER$i$0$1$rationalize(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "rationalize", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyInteger.class, "rationalize", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject[].class});
        cls.addMethodAtBootTimeOnly("rationalize", javaMethod);
        javaMethod = new org.jruby.RubyInteger$INVOKER$i$1$0$lcm(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "lcm", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyInteger.class, "lcm", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("lcm", javaMethod);
        javaMethod = new org.jruby.RubyInteger$INVOKER$i$0$0$denominator(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "denominator", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyInteger.class, "denominator", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("denominator", javaMethod);
        javaMethod = new org.jruby.RubyInteger$INVOKER$i$0$0$numerator(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "numerator", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyInteger.class, "numerator", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("numerator", javaMethod);
        javaMethod = new org.jruby.RubyInteger$INVOKER$i$round19(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "round19", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyInteger.class, "round19", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("round", javaMethod);
        javaMethod = new org.jruby.RubyInteger$INVOKER$i$0$0$to_r(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "to_r", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyInteger.class, "to_r", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("to_r", javaMethod);
        javaMethod = new org.jruby.RubyInteger$INVOKER$i$1$0$gcd(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "gcd", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyInteger.class, "gcd", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("gcd", javaMethod);
        javaMethod = new org.jruby.RubyInteger$INVOKER$i$chr19(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "chr19", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyInteger.class, "chr19", org.jruby.RubyString.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("chr", javaMethod);
        runtime.addBoundMethod("org.jruby.RubyInteger","gcdlcm","gcdlcm");
        runtime.addBoundMethod("org.jruby.RubyInteger","rationalize","rationalize");
        runtime.addBoundMethod("org.jruby.RubyInteger","lcm","lcm");
        runtime.addBoundMethod("org.jruby.RubyInteger","denominator","denominator");
        runtime.addBoundMethod("org.jruby.RubyInteger","numerator","numerator");
        runtime.addBoundMethod("org.jruby.RubyInteger","round19","round");
        runtime.addBoundMethod("org.jruby.RubyInteger","to_r","to_r");
        runtime.addBoundMethod("org.jruby.RubyInteger","gcd","gcd");
        runtime.addBoundMethod("org.jruby.RubyInteger","chr19","chr");
        }
    }
    static {
     }
}
