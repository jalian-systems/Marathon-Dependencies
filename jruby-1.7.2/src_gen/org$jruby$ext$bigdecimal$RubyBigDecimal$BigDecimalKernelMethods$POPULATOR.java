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
public class org$jruby$ext$bigdecimal$RubyBigDecimal$BigDecimalKernelMethods$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        RubyClass singletonClass = cls.getSingletonClass();
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.ext.bigdecimal.RubyBigDecimal$BigDecimalKernelMethods$INVOKER$s$0$0$newBigDecimal(cls, Visibility.PRIVATE);
        populateMethod(javaMethod, -1, "newBigDecimal", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.ext.bigdecimal.RubyBigDecimal.BigDecimalKernelMethods.class, "newBigDecimal", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class});
        cls.addMethodAtBootTimeOnly("BigDecimal", javaMethod);
        moduleMethod = populateModuleMethod(cls, javaMethod);
        singletonClass.addMethodAtBootTimeOnly("BigDecimal", moduleMethod);
        runtime.addBoundMethod("org.jruby.ext.bigdecimal.RubyBigDecimal.BigDecimalKernelMethods","newBigDecimal","BigDecimal");
    }
    static {
     }
}
