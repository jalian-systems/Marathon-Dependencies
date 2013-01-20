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
public class org$jruby$RubyDir$POPULATOR extends TypePopulator {
    public void populate(RubyModule cls, Class clazz) {
        JavaMethod javaMethod;
        DynamicMethod moduleMethod;
        RubyClass singletonClass = cls.getSingletonClass();
        CompatVersion compatVersion = cls.getRuntime().getInstanceConfig().getCompatVersion();
        Ruby runtime = cls.getRuntime();
        javaMethod = new org.jruby.RubyDir$INVOKER$s$1$0$chroot(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "chroot", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyDir.class, "chroot", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        singletonClass.addMethodAtBootTimeOnly("chroot", javaMethod);
        javaMethod = new org.jruby.RubyDir$INVOKER$s$0$0$getwd(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "getwd", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyDir.class, "getwd", org.jruby.RubyString.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        singletonClass.addMethodAtBootTimeOnly("getwd", javaMethod);
        singletonClass.addMethodAtBootTimeOnly("pwd", javaMethod);
        javaMethod = new org.jruby.RubyDir$INVOKER$s$0$0$aref(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "aref", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyDir.class, "aref", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class});
        singletonClass.addMethodAtBootTimeOnly("[]", javaMethod);
        javaMethod = new org.jruby.RubyDir$INVOKER$s$0$1$chdir(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "chdir", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyDir.class, "chdir", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class, org.jruby.runtime.Block.class});
        singletonClass.addMethodAtBootTimeOnly("chdir", javaMethod);
        javaMethod = new org.jruby.RubyDir$INVOKER$s$0$1$glob(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "glob", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyDir.class, "glob", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class, org.jruby.runtime.Block.class});
        singletonClass.addMethodAtBootTimeOnly("glob", javaMethod);
        runtime.addBoundMethod("org.jruby.RubyDir","chroot","chroot");
        runtime.addBoundMethod("org.jruby.RubyDir","getwd","getwd");
        runtime.addBoundMethod("org.jruby.RubyDir","aref","[]");
        runtime.addBoundMethod("org.jruby.RubyDir","chdir","chdir");
        runtime.addBoundMethod("org.jruby.RubyDir","glob","glob");
        if (compatVersion == CompatVersion.RUBY1_8 || compatVersion == CompatVersion.BOTH) {
        javaMethod = new org.jruby.RubyDir$INVOKER$s$1$0$open(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "open", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyDir.class, "open", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.Block.class});
        singletonClass.addMethodAtBootTimeOnly("open", javaMethod);
        javaMethod = new org.jruby.RubyDir$INVOKER$s$1$0$entries(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "entries", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyDir.class, "entries", org.jruby.RubyArray.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        singletonClass.addMethodAtBootTimeOnly("entries", javaMethod);
        javaMethod = new org.jruby.RubyDir$INVOKER$s$0$1$mkdir(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "mkdir", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyDir.class, "mkdir", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class});
        singletonClass.addMethodAtBootTimeOnly("mkdir", javaMethod);
        javaMethod = new org.jruby.RubyDir$INVOKER$s$1$0$foreach(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "foreach", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyDir.class, "foreach", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.Block.class});
        singletonClass.addMethodAtBootTimeOnly("foreach", javaMethod);
        javaMethod = new org.jruby.RubyDir$INVOKER$s$1$0$rmdir(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "rmdir", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyDir.class, "rmdir", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        singletonClass.addMethodAtBootTimeOnly("rmdir", javaMethod);
        singletonClass.addMethodAtBootTimeOnly("unlink", javaMethod);
        singletonClass.addMethodAtBootTimeOnly("delete", javaMethod);
        runtime.addBoundMethod("org.jruby.RubyDir","open","open");
        runtime.addBoundMethod("org.jruby.RubyDir","entries","entries");
        runtime.addBoundMethod("org.jruby.RubyDir","mkdir","mkdir");
        runtime.addBoundMethod("org.jruby.RubyDir","foreach","foreach");
        runtime.addBoundMethod("org.jruby.RubyDir","rmdir","rmdir");
        }
        if (compatVersion.is1_9() || compatVersion == CompatVersion.BOTH) {
        javaMethod = new org.jruby.RubyDir$INVOKER$s$1$0$foreach19(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "foreach19", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyDir.class, "foreach19", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.Block.class});
        singletonClass.addMethodAtBootTimeOnly("foreach", javaMethod);
        javaMethod = new org.jruby.RubyDir$INVOKER$s$1$0$open19(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "open19", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyDir.class, "open19", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.Block.class});
        singletonClass.addMethodAtBootTimeOnly("open", javaMethod);
        javaMethod = new org.jruby.RubyDir$INVOKER$s$0$1$home(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "home", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyDir.class, "home", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class});
        singletonClass.addMethodAtBootTimeOnly("home", javaMethod);
        javaMethod = new org.jruby.RubyDir$INVOKER$s$1$0$exist(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "exist", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyDir.class, "exist", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        singletonClass.addMethodAtBootTimeOnly("exists?", javaMethod);
        singletonClass.addMethodAtBootTimeOnly("exist?", javaMethod);
        javaMethod = new org.jruby.RubyDir$INVOKER$s$entries19(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "entries19", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyDir.class, "entries19", org.jruby.RubyArray.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        singletonClass.addMethodAtBootTimeOnly("entries", javaMethod);
        javaMethod = new org.jruby.RubyDir$INVOKER$s$0$1$mkdir19(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, -1, "mkdir19", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyDir.class, "mkdir19", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject[].class});
        singletonClass.addMethodAtBootTimeOnly("mkdir", javaMethod);
        javaMethod = new org.jruby.RubyDir$INVOKER$s$1$0$rmdir19(singletonClass, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "rmdir19", true, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyDir.class, "rmdir19", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.builtin.IRubyObject.class, org.jruby.runtime.builtin.IRubyObject.class});
        singletonClass.addMethodAtBootTimeOnly("rmdir", javaMethod);
        singletonClass.addMethodAtBootTimeOnly("unlink", javaMethod);
        singletonClass.addMethodAtBootTimeOnly("delete", javaMethod);
        runtime.addBoundMethod("org.jruby.RubyDir","foreach19","foreach");
        runtime.addBoundMethod("org.jruby.RubyDir","open19","open");
        runtime.addBoundMethod("org.jruby.RubyDir","home","home");
        runtime.addBoundMethod("org.jruby.RubyDir","exist","exists?");
        runtime.addBoundMethod("org.jruby.RubyDir","entries19","entries");
        runtime.addBoundMethod("org.jruby.RubyDir","mkdir19","mkdir");
        runtime.addBoundMethod("org.jruby.RubyDir","rmdir19","rmdir");
        }
        javaMethod = new org.jruby.RubyDir$INVOKER$i$1$0$set_pos(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "set_pos", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyDir.class, "set_pos", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("pos=", javaMethod);
        javaMethod = new org.jruby.RubyDir$INVOKER$i$0$0$path(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "path", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyDir.class, "path", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class});
        cls.addMethodAtBootTimeOnly("path", javaMethod);
        javaMethod = new org.jruby.RubyDir$INVOKER$i$0$0$inspect(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "inspect", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyDir.class, "inspect", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("inspect", javaMethod);
        javaMethod = new org.jruby.RubyDir$INVOKER$i$0$0$read(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "read", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyDir.class, "read", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("read", javaMethod);
        javaMethod = new org.jruby.RubyDir$INVOKER$i$0$0$entries(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "entries", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyDir.class, "entries", org.jruby.RubyArray.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("entries", javaMethod);
        javaMethod = new org.jruby.RubyDir$INVOKER$i$0$0$tell(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "tell", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyDir.class, "tell", org.jruby.RubyInteger.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("tell", javaMethod);
        cls.addMethodAtBootTimeOnly("pos", javaMethod);
        javaMethod = new org.jruby.RubyDir$INVOKER$i$0$0$each19(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "each19", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyDir.class, "each19", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.ThreadContext.class, org.jruby.runtime.Block.class});
        cls.addMethodAtBootTimeOnly("each", javaMethod);
        javaMethod = new org.jruby.RubyDir$INVOKER$i$0$0$rewind(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "rewind", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyDir.class, "rewind", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("rewind", javaMethod);
        javaMethod = new org.jruby.RubyDir$INVOKER$i$1$0$seek(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "seek", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyDir.class, "seek", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("seek", javaMethod);
        javaMethod = new org.jruby.RubyDir$INVOKER$i$0$0$close(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 0, "close", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyDir.class, "close", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {});
        cls.addMethodAtBootTimeOnly("close", javaMethod);
        runtime.addBoundMethod("org.jruby.RubyDir","set_pos","pos=");
        runtime.addBoundMethod("org.jruby.RubyDir","path","path");
        runtime.addBoundMethod("org.jruby.RubyDir","inspect","inspect");
        runtime.addBoundMethod("org.jruby.RubyDir","read","read");
        runtime.addBoundMethod("org.jruby.RubyDir","entries","entries");
        runtime.addBoundMethod("org.jruby.RubyDir","tell","tell");
        runtime.addBoundMethod("org.jruby.RubyDir","each19","each");
        runtime.addBoundMethod("org.jruby.RubyDir","rewind","rewind");
        runtime.addBoundMethod("org.jruby.RubyDir","seek","seek");
        runtime.addBoundMethod("org.jruby.RubyDir","close","close");
        if (compatVersion == CompatVersion.RUBY1_8 || compatVersion == CompatVersion.BOTH) {
        javaMethod = new org.jruby.RubyDir$INVOKER$i$1$0$initialize(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "initialize", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyDir.class, "initialize", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("initialize", javaMethod);
        runtime.addBoundMethod("org.jruby.RubyDir","initialize","initialize");
        }
        if (compatVersion.is1_9() || compatVersion == CompatVersion.BOTH) {
        javaMethod = new org.jruby.RubyDir$INVOKER$i$1$0$initialize19(cls, Visibility.PUBLIC);
        populateMethod(javaMethod, 1, "initialize19", false, CallConfiguration.FrameNoneScopeNone, false, org.jruby.RubyDir.class, "initialize19", org.jruby.runtime.builtin.IRubyObject.class, new Class[] {org.jruby.runtime.builtin.IRubyObject.class});
        cls.addMethodAtBootTimeOnly("initialize", javaMethod);
        runtime.addBoundMethod("org.jruby.RubyDir","initialize19","initialize");
        }
    }
    static {
     }
}
