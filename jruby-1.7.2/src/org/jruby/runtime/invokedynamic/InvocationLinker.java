/*
 **** BEGIN LICENSE BLOCK *****
 * Version: CPL 1.0/GPL 2.0/LGPL 2.1
 *
 * The contents of this file are subject to the Common Public
 * License Version 1.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a copy of
 * the License at http://www.eclipse.org/legal/cpl-v10.html
 *
 * Software distributed under the License is distributed on an "AS
 * IS" basis, WITHOUT WARRANTY OF ANY KIND, either express or
 * implied. See the License for the specific language governing
 * rights and limitations under the License.
 *
 * Copyright (C) 2001-2011 The JRuby Community (and contribs)
 *
 * Alternatively, the contents of this file may be used under the terms of
 * either of the GNU General Public License Version 2 or later (the "GPL"),
 * or the GNU Lesser General Public License Version 2.1 or later (the "LGPL"),
 * in which case the provisions of the GPL or the LGPL are applicable instead
 * of those above. If you wish to allow use of your version of this file only
 * under the terms of either the GPL or the LGPL, and not to allow others to
 * use your version of this file under the terms of the CPL, indicate your
 * decision by deleting the provisions above and replace them with the notice
 * and other provisions required by the GPL or the LGPL. If you do not delete
 * the provisions above, a recipient may use your version of this file under
 * the terms of any one of the CPL, the GPL or the LGPL.
 ***** END LICENSE BLOCK *****/
package org.jruby.runtime.invokedynamic;

import java.lang.invoke.*;

import static java.lang.invoke.MethodHandles.*;
import static java.lang.invoke.MethodType.*;

import java.math.BigInteger;
import java.util.Arrays;

import com.headius.invokebinder.Binder;
import org.jruby.*;
import org.jruby.exceptions.JumpException;
import org.jruby.exceptions.RaiseException;
import org.jruby.exceptions.Unrescuable;
import org.jruby.ext.ffi.jffi.JITNativeInvoker;
import org.jruby.ext.ffi.jffi.NativeInvoker;
import org.jruby.internal.runtime.methods.*;
import org.jruby.java.invokers.SingletonMethodInvoker;
import org.jruby.javasupport.JavaUtil;
import org.jruby.javasupport.proxy.InternalJavaProxy;
import org.jruby.parser.StaticScope;
import org.jruby.runtime.Block;
import org.jruby.runtime.CallType;
import org.jruby.runtime.ThreadContext;
import org.jruby.runtime.builtin.IRubyObject;
import org.jruby.runtime.callsite.CacheEntry;
import org.jruby.util.ByteList;
import org.jruby.util.CodegenUtils;
import org.jruby.util.JavaNameMangler;
import org.jruby.util.log.Logger;
import org.jruby.util.log.LoggerFactory;

import static java.lang.invoke.MethodType.methodType;
import static org.jruby.runtime.invokedynamic.InvokeDynamicSupport.*;
import static org.jruby.util.CodegenUtils.p;

/**
 * Bootstrapping logic for invokedynamic-based invocation.
 */
public class InvocationLinker {
    private static final Logger LOG = LoggerFactory.getLogger("InvocationLinker");
    
    public static CallSite invocationBootstrap(Lookup lookup, String name, MethodType type, String file, int line) throws NoSuchMethodException, IllegalAccessException {
        String[] names = name.split(":");
        String operation = names[0];

        if (name.equals("yieldSpecific")) {
            MethodHandle target = lookup.findStatic(InvocationLinker.class, "yieldSpecificFallback", type);
            return new ConstantCallSite(target);
        }

        JRubyCallSite site;
        String method = JavaNameMangler.demangleMethodName(names[1]);
        if (operation.equals("call")) {
            site = new JRubyCallSite(lookup, type, CallType.NORMAL, file, line, method, false, false, true);
        } else if (operation.equals("fcall")) {
            site = new JRubyCallSite(lookup, type, CallType.FUNCTIONAL, file, line, method, false, false, true);
        } else if (operation.equals("vcall")) {
            site = new JRubyCallSite(lookup, type, CallType.VARIABLE, file, line, method, false, false, true);
        } else if (operation.equals("callIter")) {
            site = new JRubyCallSite(lookup, type, CallType.NORMAL, file, line, method, false, true, true);
        } else if (operation.equals("fcallIter")) {
            site = new JRubyCallSite(lookup, type, CallType.FUNCTIONAL, file, line, method, false, true, true);
        } else if (operation.equals("vcallIter")) {
            site = new JRubyCallSite(lookup, type, CallType.VARIABLE, file, line, method, false, true, true);
        } else if (operation.equals("attrAssign")) {
            site = new JRubyCallSite(lookup, type, CallType.NORMAL, file, line, method, true, false, false);
        } else if (operation.equals("attrAssignSelf")) {
            site = new JRubyCallSite(lookup, type, CallType.VARIABLE, file, line, method, true, false, false);
        } else if (operation.equals("attrAssignExpr")) {
            site = new JRubyCallSite(lookup, type, CallType.NORMAL, file, line, method, true, false, true);
        } else if (operation.equals("attrAssignSelfExpr")) {
            site = new JRubyCallSite(lookup, type, CallType.VARIABLE, file, line, method, true, false, true);
        } else {
            throw new RuntimeException("wrong invokedynamic target: " + name);
        }
        
        MethodType fallbackType = type.insertParameterTypes(0, JRubyCallSite.class);
        MethodHandle myFallback = insertArguments(
                lookup.findStatic(InvocationLinker.class, "invocationFallback",
                fallbackType),
                0,
                site);

        site.setInitialTarget(myFallback);
        return site;
    }
    
    public static IRubyObject invocationFallback(JRubyCallSite site, 
            ThreadContext context,
            IRubyObject caller,
            IRubyObject self) throws Throwable {
        RubyClass selfClass = pollAndGetClass(context, self);
        String method = site.name();
        SwitchPoint switchPoint = (SwitchPoint)selfClass.getInvalidator().getData();
        CacheEntry entry = selfClass.searchWithCache(method);
        
        if (methodMissing(entry, site.callType(), method, caller)) {
            return callMethodMissing(entry, site.callType(), context, self, method);
        }
        
        MethodHandle target = getTarget(site, selfClass, method, entry, 0);
        target = updateInvocationTarget(target, site, self, selfClass, method, entry, switchPoint, false, 0);

        return (IRubyObject)target.invokeWithArguments(context, caller, self);
    }

    public static IRubyObject invocationFallback(JRubyCallSite site, ThreadContext context, IRubyObject caller, IRubyObject self, IRubyObject arg0) throws Throwable {
        RubyClass selfClass = pollAndGetClass(context, self);
        String method = site.name();
        SwitchPoint switchPoint = (SwitchPoint)selfClass.getInvalidator().getData();
        CacheEntry entry = selfClass.searchWithCache(method);
        if (methodMissing(entry, site.callType(), method, caller)) {
            IRubyObject mmResult = callMethodMissing(entry, site.callType(), context, self, method, arg0);
            // TODO: replace with handle logic
            return site.isAttrAssign() ? arg0 : mmResult;
        }
        
        MethodHandle target = getTarget(site, selfClass, method, entry, 1);
        target = updateInvocationTarget(target, site, self, selfClass, method, entry, switchPoint, false, 1);

        return (IRubyObject)target.invokeWithArguments(context, caller, self, arg0);
    }

    public static IRubyObject invocationFallback(JRubyCallSite site, ThreadContext context, IRubyObject caller, IRubyObject self, IRubyObject arg0, IRubyObject arg1) throws Throwable {
        RubyClass selfClass = pollAndGetClass(context, self);
        String method = site.name();
        SwitchPoint switchPoint = (SwitchPoint)selfClass.getInvalidator().getData();
        CacheEntry entry = selfClass.searchWithCache(method);
        if (methodMissing(entry, site.callType(), method, caller)) {
            IRubyObject mmResult = callMethodMissing(entry, site.callType(), context, self, method, arg0, arg1);
            // TODO: replace with handle logic
            return site.isAttrAssign() ? arg1 : mmResult;
        }
        
        MethodHandle target = getTarget(site, selfClass, method, entry, 2);
        target = updateInvocationTarget(target, site, self, selfClass, method, entry, switchPoint, false, 2);

        return (IRubyObject)target.invokeWithArguments(context, caller, self, arg0, arg1);
    }

    public static IRubyObject invocationFallback(JRubyCallSite site, ThreadContext context, IRubyObject caller, IRubyObject self, IRubyObject arg0, IRubyObject arg1, IRubyObject arg2) throws Throwable {
        RubyClass selfClass = pollAndGetClass(context, self);
        String method = site.name();
        SwitchPoint switchPoint = (SwitchPoint)selfClass.getInvalidator().getData();
        CacheEntry entry = selfClass.searchWithCache(method);
        if (methodMissing(entry, site.callType(), method, caller)) {
            IRubyObject mmResult = callMethodMissing(entry, site.callType(), context, self, method, arg0, arg1, arg2);
            // TODO: replace with handle logic
            return site.isAttrAssign() ? arg2 : mmResult;
        }
        
        MethodHandle target = getTarget(site, selfClass, method, entry, 3);
        target = updateInvocationTarget(target, site, self, selfClass, method, entry, switchPoint, false, 3);

        return (IRubyObject)target.invokeWithArguments(context, caller, self, arg0, arg1, arg2);
    }
    
    public static IRubyObject invocationFallback(JRubyCallSite site, ThreadContext context, IRubyObject caller, IRubyObject self, IRubyObject[] args) throws Throwable {
        RubyClass selfClass = pollAndGetClass(context, self);
        String method = site.name();
        SwitchPoint switchPoint = (SwitchPoint)selfClass.getInvalidator().getData();
        CacheEntry entry = selfClass.searchWithCache(method);
        if (methodMissing(entry, site.callType(), method, caller)) {
            IRubyObject mmResult = callMethodMissing(entry, site.callType(), context, self, method, args);
            // TODO: replace with handle logic
            return site.isAttrAssign() ? args[args.length - 1] : mmResult;
        }
        
        MethodHandle target = getTarget(site, selfClass, method, entry, -1);
        target = updateInvocationTarget(target, site, self, selfClass, method, entry, switchPoint, false, 4);

        return (IRubyObject)target.invokeWithArguments(context, caller, self, args);
    }

    public static IRubyObject invocationFallback(JRubyCallSite site, ThreadContext context, IRubyObject caller, IRubyObject self, Block block) throws Throwable {
        RubyClass selfClass = pollAndGetClass(context, self);
        String method = site.name();
        SwitchPoint switchPoint = (SwitchPoint)selfClass.getInvalidator().getData();
        CacheEntry entry = selfClass.searchWithCache(method);

        if (methodMissing(entry, site.callType(), method, caller)) {
            try {
                return callMethodMissing(entry, site.callType(), context, self, method, block);
            } catch (JumpException.BreakJump bj) {
                return handleBreakJump(context, bj);
            } catch (JumpException.RetryJump rj) {
                return retryJumpError(context);
            } finally {
                if (site.isIterator()) block.escape();
            }
        }

        MethodHandle target = getTarget(site, selfClass, method, entry, 0);
        target = updateInvocationTarget(target, site, self, selfClass, method, entry, switchPoint, true, 0);

        return (IRubyObject) target.invokeWithArguments(context, caller, self, block);
    }

    public static IRubyObject invocationFallback(JRubyCallSite site, ThreadContext context, IRubyObject caller, IRubyObject self, IRubyObject arg0, Block block) throws Throwable {
        RubyClass selfClass = pollAndGetClass(context, self);
        String method = site.name();
        SwitchPoint switchPoint = (SwitchPoint)selfClass.getInvalidator().getData();
        CacheEntry entry = selfClass.searchWithCache(method);

        if (methodMissing(entry, site.callType(), method, caller)) {
            try {
                return callMethodMissing(entry, site.callType(), context, self, method, arg0, block);
            } catch (JumpException.BreakJump bj) {
                return handleBreakJump(context, bj);
            } catch (JumpException.RetryJump rj) {
                return retryJumpError(context);
            } finally {
                if (site.isIterator()) block.escape();
            }
        }

        MethodHandle target = getTarget(site, selfClass, method, entry, 1);
        target = updateInvocationTarget(target, site, self, selfClass, method, entry, switchPoint, true, 1);

        return (IRubyObject) target.invokeWithArguments(context, caller, self, arg0, block);
    }

    public static IRubyObject invocationFallback(JRubyCallSite site, ThreadContext context, IRubyObject caller, IRubyObject self, IRubyObject arg0, IRubyObject arg1, Block block) throws Throwable {
        RubyClass selfClass = pollAndGetClass(context, self);
        String method = site.name();
        SwitchPoint switchPoint = (SwitchPoint)selfClass.getInvalidator().getData();
        CacheEntry entry = selfClass.searchWithCache(method);

        if (methodMissing(entry, site.callType(), method, caller)) {
            try {
                return callMethodMissing(entry, site.callType(), context, self, method, arg0, arg1, block);
            } catch (JumpException.BreakJump bj) {
                return handleBreakJump(context, bj);
            } catch (JumpException.RetryJump rj) {
                return retryJumpError(context);
            } finally {
                if (site.isIterator()) block.escape();
            }
        }

        MethodHandle target = getTarget(site, selfClass, method, entry, 2);
        target = updateInvocationTarget(target, site, self, selfClass, method, entry, switchPoint, true, 2);

        return (IRubyObject) target.invokeWithArguments(context, caller, self, arg0, arg1, block);
    }

    public static IRubyObject invocationFallback(JRubyCallSite site, ThreadContext context, IRubyObject caller, IRubyObject self, IRubyObject arg0, IRubyObject arg1, IRubyObject arg2, Block block) throws Throwable {
        RubyClass selfClass = pollAndGetClass(context, self);
        String method = site.name();
        SwitchPoint switchPoint = (SwitchPoint)selfClass.getInvalidator().getData();
        CacheEntry entry = selfClass.searchWithCache(method);

        if (methodMissing(entry, site.callType(), method, caller)) {
            try {
                return callMethodMissing(entry, site.callType(), context, self, method, arg0, arg1, arg2, block);
            } catch (JumpException.BreakJump bj) {
                return handleBreakJump(context, bj);
            } catch (JumpException.RetryJump rj) {
                return retryJumpError(context);
            } finally {
                if (site.isIterator()) block.escape();
            }
        }

        MethodHandle target = getTarget(site, selfClass, method, entry, 3);
        target = updateInvocationTarget(target, site, self, selfClass, method, entry, switchPoint, true, 3);

        return (IRubyObject) target.invokeWithArguments(context, caller, self, arg0, arg1, arg2, block);
    }

    public static IRubyObject invocationFallback(JRubyCallSite site, ThreadContext context, IRubyObject caller, IRubyObject self, IRubyObject[] args, Block block) throws Throwable {
        RubyClass selfClass = pollAndGetClass(context, self);
        String method = site.name();
        SwitchPoint switchPoint = (SwitchPoint)selfClass.getInvalidator().getData();
        CacheEntry entry = selfClass.searchWithCache(method);

        if (methodMissing(entry, site.callType(), method, caller)) {
            try {
                return callMethodMissing(entry, site.callType(), context, self, method, args, block);
            } catch (JumpException.BreakJump bj) {
                return handleBreakJump(context, bj);
            } catch (JumpException.RetryJump rj) {
                return retryJumpError(context);
            } finally {
                if (site.isIterator()) block.escape();
            }
        }

        MethodHandle target = getTarget(site, selfClass, method, entry, -1);
        target = updateInvocationTarget(target, site, self, selfClass, method, entry, switchPoint, true, 4);

        return (IRubyObject) target.invokeWithArguments(context, caller, self, args, block);
    }

    /**
     * Update the given call site using the new target, wrapping with appropriate
     * guard and argument-juggling logic. Return a handle suitable for invoking
     * with the site's original method type.
     */
    private static MethodHandle updateInvocationTarget(MethodHandle target, JRubyCallSite site, IRubyObject self, RubyModule selfClass, String name, CacheEntry entry, SwitchPoint switchPoint, boolean block, int arity) {
        if (target == null ||
                site.clearCount() > RubyInstanceConfig.MAX_FAIL_COUNT ||
                (!site.hasSeenType(selfClass.id)
                && site.seenTypesCount() > RubyInstanceConfig.MAX_POLY_COUNT)) {
            site.setTarget(target = createFail((block?FAILS_B:FAILS)[arity], site, name, entry.method));
        } else {
            target = postProcess(site, target);
            
            boolean curry;
            MethodHandle fallback;
            MethodHandle gwt;

            // if we've cached no types, and the site is bound and we haven't seen this new type...
            if (site.seenTypesCount() > 0 && site.getTarget() != null && !site.hasSeenType(selfClass.id)) {
                // stack it up into a PIC
                if (RubyInstanceConfig.LOG_INDY_BINDINGS) LOG.info(name + "\tadded to PIC " + logMethod(entry.method));
                fallback = site.getTarget();
                curry = false;
            } else {
                // wipe out site with this new type and method
                String bind = site.boundOnce() ? "rebind" : "bind";
                if (RubyInstanceConfig.LOG_INDY_BINDINGS) LOG.info(name + "\ttriggered site #" + site.siteID() + " " + bind + " (" + site.file() + ":" + site.line() + ")");
                fallback = (block?FALLBACKS_B:FALLBACKS)[arity];
                site.clearTypes();
                curry = true;
            }

            site.addType(selfClass.id);
            
            Ruby runtime = selfClass.getRuntime();
            MethodHandle test;
            if (self instanceof RubySymbol ||
                    self instanceof RubyFixnum ||
                    self instanceof RubyFloat ||
                    self instanceof RubyNil ||
                    self instanceof RubyBoolean.True ||
                    self instanceof RubyBoolean.False) {
                test = Binder
                        .from(site.type().changeReturnType(boolean.class))
                        .permute(2)
                        .insert(1, self.getClass())
                        .cast(boolean.class, Object.class, Class.class)
                        .invoke(TEST_CLASS);
            } else {
                test = Binder
                        .from(site.type().changeReturnType(boolean.class))
                        .permute(2)
                        .insert(0, RubyInstanceConfig.INVOKEDYNAMIC_INVOCATION_SWITCHPOINT ? selfClass : entry.token)
                        .cast(boolean.class, RubyClass.class, IRubyObject.class)
                        .invoke(TEST);
            }
            
            gwt = createGWT(test, target, fallback, entry, site, curry);
            
            if (RubyInstanceConfig.INVOKEDYNAMIC_INVOCATION_SWITCHPOINT) {
                // wrap in switchpoint for mutation invalidation
                gwt = switchPoint.guardWithTest(gwt, curry ? insertArguments(fallback, 0, site) : fallback);
            }
            
            site.setTarget(gwt);
        }
        
        return target;
    }
    
    public static IRubyObject yieldSpecificFallback(
            Block block,
            ThreadContext context) throws Throwable {
        return block.yieldSpecific(context);
    }
    
    public static IRubyObject yieldSpecificFallback(
            Block block,
            ThreadContext context,
            IRubyObject arg0) throws Throwable {
        return block.yieldSpecific(context, arg0);
    }
    
    public static IRubyObject yieldSpecificFallback(
            Block block,
            ThreadContext context,
            IRubyObject arg0,
            IRubyObject arg1) throws Throwable {
        return block.yieldSpecific(context, arg0, arg1);
    }
    
    public static IRubyObject yieldSpecificFallback(
            Block block,
            ThreadContext context,
            IRubyObject arg0,
            IRubyObject arg1,
            IRubyObject arg2) throws Throwable {
        return block.yieldSpecific(context, arg0, arg1, arg2);
    }

    private static MethodHandle createFail(MethodHandle fail, JRubyCallSite site, String name, DynamicMethod method) {
        if (RubyInstanceConfig.LOG_INDY_BINDINGS) LOG.info(name + "\tbound to inline cache failed " + logMethod(method));
        
        MethodHandle myFail = insertArguments(fail, 0, site);
        myFail = postProcess(site, myFail);
        return myFail;
    }

    private static MethodHandle createGWT(MethodHandle test, MethodHandle target, MethodHandle fallback, CacheEntry entry, JRubyCallSite site, boolean curryFallback) {
        MethodHandle myFallback = curryFallback ? insertArguments(fallback, 0, site) : fallback;
        MethodHandle guardWithTest = guardWithTest(test, target, myFallback);
        
        return guardWithTest;
    }
    
    private static class IndirectBindingException extends RuntimeException {
        public IndirectBindingException(String reason) {
            super(reason);
        }
    }

    private static MethodHandle tryDispatchDirect(JRubyCallSite site, String name, RubyClass cls, DynamicMethod method) {
        // get the "real" method in a few ways
        while (method instanceof AliasMethod) {
            name = ((AliasMethod)method).getOldName(); // need to use original name, not aliased name
            method = method.getRealMethod();
        }
        while (method instanceof WrapperMethod) method = method.getRealMethod();
        
        // ProfilingDynamicMethod wraps any number of other types of methods but
        // we do not handle it in indy binding right now. Disable direct binding
        // and bind through DynamicMethod.
        if (method instanceof ProfilingDynamicMethod) {
            throw new IndirectBindingException("profiling active");
        }

        if (method instanceof DefaultMethod) {
            DefaultMethod defaultMethod = (DefaultMethod) method;
            if (defaultMethod.getMethodForCaching() instanceof JittedMethod) {
                method = defaultMethod.getMethodForCaching();
            }
        }

        DynamicMethod.NativeCall nativeCall = method.getNativeCall();

        int siteArgCount = getSiteCount(site.type().parameterArray());

        if (method instanceof AttrReaderMethod) {
            // attr reader
            if (!RubyInstanceConfig.INVOKEDYNAMIC_ATTR) {
                throw new IndirectBindingException("direct attribute dispatch not enabled");
            }
            if (siteArgCount != 0) {
                throw new IndirectBindingException("attr reader with > 0 args");
            }
        } else if (method instanceof AttrWriterMethod) {
            // attr writer
            if (!RubyInstanceConfig.INVOKEDYNAMIC_ATTR) {
                throw new IndirectBindingException("direct attribute dispatch not enabled");
            }
            if (siteArgCount != 1) {
                throw new IndirectBindingException("attr writer with > 1 args");
            }

        } else if (method instanceof org.jruby.ext.ffi.jffi.DefaultMethod || method instanceof org.jruby.ext.ffi.jffi.JITNativeInvoker) {
            // if frame/scope required, can't dispatch direct
            if (method.getCallConfig() != CallConfiguration.FrameNoneScopeNone) {
                throw new IndirectBindingException("frame or scope required: " + method.getCallConfig());
            }

            if (!method.getArity().isFixed()) {
                throw new IndirectBindingException("fixed arity required: " + method.getArity());
            }

            // Arity must match, otherwise let the indirect method process errors
            if (method.getArity().getValue() != siteArgCount) {
                throw new IndirectBindingException("arity mismatch");
            }

            // Only support 0..6 parameters
            if (method.getArity().getValue() > 6) {
                throw new IndirectBindingException("target args > 6");
            }

            if (site.type().parameterType(site.type().parameterCount() - 1) == Block.class) {
                // Called with a block to substitute for a callback param - cannot bind directly
                throw new IndirectBindingException("callback block supplied");
            }

        } else if (nativeCall != null) {
            // has an explicit native call path

            if (nativeCall.isJava()) {
                if (!RubyInstanceConfig.INVOKEDYNAMIC_JAVA) {
                    throw new IndirectBindingException("direct Java dispatch not enabled");
                }

                // if Java, must:
                // * match arity <= 3
                // * not be passed a block (no coercion yet)
                // * be a normal wrapper around a class or module (not a Ruby subclass)
                if (nativeCall.getNativeSignature().length != siteArgCount
                        || siteArgCount > 3
                        || site.isIterator()
                        || !cls.getJavaProxy()) {
                    throw new IndirectBindingException("Java call arity mismatch or > 3 args");
                }
            } else {
                // if non-Java, must:
                // * exactly match arities or both are [] boxed
                // * 3 or fewer arguments

                int nativeArgCount = (method instanceof CompiledMethod || method instanceof JittedMethod)
                        ? getRubyArgCount(nativeCall.getNativeSignature())
                        : getArgCount(nativeCall.getNativeSignature(), nativeCall.isStatic());

                // arity must match or both be [] args
                if (nativeArgCount != siteArgCount) {
                    throw new IndirectBindingException("arity mismatch or varargs at call site: " + nativeArgCount + " != " + siteArgCount);
                }
            }
        } else {
            throw new IndirectBindingException("no direct path available for " + method.getClass().getName());
        }

        return handleForMethod(site, name, cls, method);
    }

    private static MethodHandle getTarget(JRubyCallSite site, RubyClass cls, String name, CacheEntry entry, int arity) {
        IndirectBindingException ibe;
        try {
            return tryDispatchDirect(site, name, cls, entry.method);
        } catch (IndirectBindingException _ibe) {
            ibe = _ibe;
            // proceed with indirect, if enabled
        }

        // if indirect indy-bound methods (via DynamicMethod.call) are disabled, bail out
        if (!RubyInstanceConfig.INVOKEDYNAMIC_INDIRECT) {
            if (RubyInstanceConfig.LOG_INDY_BINDINGS)
                LOG.info(name + "\tfailed to bind to " + logMethod(entry.method) + ": " + ibe.getMessage());
            return null;
        }

        // no direct native path, use DynamicMethod.call
        if (RubyInstanceConfig.LOG_INDY_BINDINGS)
            LOG.info(name + "\tbound indirectly to " + logMethod(entry.method) + ": " + ibe.getMessage());

        MethodHandle dynMethodTarget = getDynamicMethodTarget(site.type(), arity, entry.method);
        dynMethodTarget = insertArguments(dynMethodTarget, 4, name);
        dynMethodTarget = insertArguments(dynMethodTarget, 0, entry);

        return dynMethodTarget;
    }
    
    private static MethodHandle handleForMethod(JRubyCallSite site, String name, RubyClass cls, DynamicMethod method) {
        MethodHandle nativeTarget = null;
        
        if (method instanceof AttrReaderMethod) {
            // Ruby to attr reader
            if (RubyInstanceConfig.LOG_INDY_BINDINGS) LOG.info(name + "\tbound as attr reader " + logMethod(method) + ":" + ((AttrReaderMethod)method).getVariableName());
            nativeTarget = createAttrReaderHandle(site, cls, method);
        } else if (method instanceof AttrWriterMethod) {
            // Ruby to attr writer
            if (RubyInstanceConfig.LOG_INDY_BINDINGS) LOG.info(name + "\tbound as attr writer " + logMethod(method) + ":" + ((AttrWriterMethod)method).getVariableName());
            nativeTarget = createAttrWriterHandle(site, cls, method);

        } else if (method instanceof org.jruby.ext.ffi.jffi.JITNativeInvoker || method instanceof org.jruby.ext.ffi.jffi.DefaultMethod) {
            // Ruby to FFI
            nativeTarget = createFFIHandle(site, method);

        } else if (method.getNativeCall() != null) {
            DynamicMethod.NativeCall nativeCall = method.getNativeCall();

            if (nativeCall.isJava()) {
                // Ruby to Java
                if (RubyInstanceConfig.LOG_INDY_BINDINGS) LOG.info(name + "\tbound to Java method " + logMethod(method) + ": " + nativeCall);
                nativeTarget = createJavaHandle(site, method);
            } else if (method instanceof CompiledMethod || method instanceof JittedMethod) {
                // Ruby to Ruby
                if (RubyInstanceConfig.LOG_INDY_BINDINGS) LOG.info(name + "\tbound to Ruby method " + logMethod(method) + ": " + nativeCall);
                nativeTarget = createRubyHandle(site, method, name);
            } else {
                // Ruby to Core
                if (RubyInstanceConfig.LOG_INDY_BINDINGS) LOG.info(name + "\tbound to native method " + logMethod(method) + ": " + nativeCall);
                nativeTarget = createNativeHandle(site, method, name);
            }
        }
                        
        // add NULL_BLOCK if needed
        if (nativeTarget != null) {
            if (
                    site.type().parameterCount() > 0
                    && site.type().parameterArray()[site.type().parameterCount() - 1] != Block.class
                    && nativeTarget.type().parameterCount() > 0
                    && nativeTarget.type().parameterType(nativeTarget.type().parameterCount() - 1) == Block.class) {
                nativeTarget = insertArguments(nativeTarget, nativeTarget.type().parameterCount() - 1, Block.NULL_BLOCK);
            } else if (
                    site.type().parameterCount() > 0
                    && site.type().parameterArray()[site.type().parameterCount() - 1] == Block.class
                    && nativeTarget.type().parameterCount() > 0
                    && nativeTarget.type().parameterType(nativeTarget.type().parameterCount() - 1) != Block.class) {
                // drop block if not used
                nativeTarget = dropArguments(nativeTarget, nativeTarget.type().parameterCount(), Block.class);
            }
        }
        
        return nativeTarget;
    }

    public static boolean testGeneration(int token, IRubyObject self) {
        return token == ((RubyBasicObject)self).getMetaClass().getGeneration();
    }

    public static boolean testMetaclass(RubyClass metaclass, IRubyObject self) {
        return metaclass == ((RubyBasicObject)self).getMetaClass();
    }

    public static boolean testRealClass(int id, IRubyObject self) {
        return id == ((RubyBasicObject)self).getMetaClass().getRealClass().id;
    }
    
    public static boolean testClass(Object object, Class clazz) {
        return object.getClass() == clazz;
    }
    
    public static IRubyObject getLast(IRubyObject[] args) {
        return args[args.length - 1];
    }
    
    private static final MethodHandle BLOCK_ESCAPE = findStatic(InvocationLinker.class, "blockEscape", methodType(void.class, Block.class));
    public static void blockEscape(Block block) {
        block.escape();
    }
    
    private static final MethodHandle HANDLE_BREAK_JUMP = findStatic(InvokeDynamicSupport.class, "handleBreakJump", methodType(IRubyObject.class, JumpException.BreakJump.class, ThreadContext.class));
//    
//    private static IRubyObject handleRetryJump(JumpException.RetryJump bj, ThreadContext context) {
//        block.escape();
//        throw context.getRuntime().newLocalJumpError(RubyLocalJumpError.Reason.RETRY, context.getRuntime().getNil(), "retry outside of rescue not supported");
//    }
//    private static final MethodHandle HANDLE_RETRY_JUMP = findStatic(InvokeDynamicSupport.class, "handleRetryJump", methodType(IRubyObject.class, JumpException.BreakJump.class, ThreadContext.class));
    
    private static MethodHandle postProcess(JRubyCallSite site, MethodHandle target) {
        if (site.isIterator()) {
            // wrap with iter logic for break, retry, and block escape
            MethodHandle breakHandler = permuteArguments(
                    HANDLE_BREAK_JUMP,
                    site.type().insertParameterTypes(0, JumpException.BreakJump.class),
                    new int[] {0, 1});

            target = catchException(target, JumpException.BreakJump.class, breakHandler);

            target = Binder
                    .from(target.type())
                    .tryFinally(permuteArguments(BLOCK_ESCAPE, site.type().changeReturnType(void.class), site.type().parameterCount() - 1))
                    .invoke(target);
        }
        
        // if it's an attr assignment as an expression, need to return n-1th argument
        if (site.isAttrAssign() && site.isExpression()) {
            // return given argument
            MethodHandle newTarget = identity(IRubyObject.class);
            
            // if args are IRubyObject[].class, yank out n-1th
            if (site.type().parameterArray()[site.type().parameterCount() - 1] == IRubyObject[].class) {
                newTarget = filterArguments(newTarget, 0, findStatic(InvocationLinker.class, "getLast", methodType(IRubyObject.class, IRubyObject[].class))); 
            }
            
            // drop standard preamble args plus extra args
            newTarget = dropArguments(newTarget, 0, IRubyObject.class, ThreadContext.class, IRubyObject.class, IRubyObject.class);
            
            // drop extra arguments, if any
            MethodType dropped = target.type().dropParameterTypes(0, 3);
            if (dropped.parameterCount() > 1) {
                Class[] drops = new Class[dropped.parameterCount() - 1];
                Arrays.fill(drops, IRubyObject.class);
                newTarget = dropArguments(newTarget, 4, drops);
            }
            
            // fold using target
            target = foldArguments(newTarget, target);
        }
        
        return target;
    }
    
    ////////////////////////////////////////////////////////////////////////////
    // Inline-caching failure paths, for megamorphic call sites
    ////////////////////////////////////////////////////////////////////////////

    public static IRubyObject fail(JRubyCallSite site, 
            ThreadContext context,
            IRubyObject caller,
            IRubyObject self) throws Throwable {
        RubyClass selfClass = pollAndGetClass(context, self);
        String name = site.name();
        CacheEntry entry = site.entry;
        
        if (entry.typeOk(selfClass)) {
            return entry.method.call(context, self, selfClass, name);
        } else {
            entry = selfClass.searchWithCache(name);
            if (methodMissing(entry, site.callType(), name, caller)) {
                return callMethodMissing(entry, site.callType(), context, self, name);
            }
            site.entry = entry;
            return entry.method.call(context, self, selfClass, name);
        }
    }

    public static IRubyObject fail(JRubyCallSite site, ThreadContext context, IRubyObject caller, IRubyObject self, IRubyObject arg0) throws Throwable {
        RubyClass selfClass = pollAndGetClass(context, self);
        String name = site.name();
        CacheEntry entry = site.entry;
        
        if (entry.typeOk(selfClass)) {
            return entry.method.call(context, self, selfClass, name, arg0);
        } else {
            entry = selfClass.searchWithCache(name);
            if (methodMissing(entry, site.callType(), name, caller)) {
                return callMethodMissing(entry, site.callType(), context, self, name, arg0);
            }
            site.entry = entry;
            return entry.method.call(context, self, selfClass, name, arg0);
        }
    }

    public static IRubyObject fail(JRubyCallSite site, ThreadContext context, IRubyObject caller, IRubyObject self, IRubyObject arg0, IRubyObject arg1) throws Throwable {
        RubyClass selfClass = pollAndGetClass(context, self);
        String name = site.name();
        CacheEntry entry = site.entry;
        
        if (entry.typeOk(selfClass)) {
            return entry.method.call(context, self, selfClass, name, arg0, arg1);
        } else {
            entry = selfClass.searchWithCache(name);
            if (methodMissing(entry, site.callType(), name, caller)) {
                return callMethodMissing(entry, site.callType(), context, self, name, arg0, arg1);
            }
            site.entry = entry;
            return entry.method.call(context, self, selfClass, name, arg0, arg1);
        }
    }

    public static IRubyObject fail(JRubyCallSite site, ThreadContext context, IRubyObject caller, IRubyObject self, IRubyObject arg0, IRubyObject arg1, IRubyObject arg2) throws Throwable {
        RubyClass selfClass = pollAndGetClass(context, self);
        String name = site.name();
        CacheEntry entry = site.entry;
        
        if (entry.typeOk(selfClass)) {
            return entry.method.call(context, self, selfClass, name, arg0, arg1, arg2);
        } else {
            entry = selfClass.searchWithCache(name);
            if (methodMissing(entry, site.callType(), name, caller)) {
                return callMethodMissing(entry, site.callType(), context, self, name, arg0, arg1, arg2);
            }
            site.entry = entry;
            return entry.method.call(context, self, selfClass, name, arg0, arg1, arg2);
        }
    }

    public static IRubyObject fail(JRubyCallSite site, ThreadContext context, IRubyObject caller, IRubyObject self, IRubyObject[] args) throws Throwable {
        RubyClass selfClass = pollAndGetClass(context, self);
        String name = site.name();
        CacheEntry entry = site.entry;
        
        if (entry.typeOk(selfClass)) {
            return entry.method.call(context, self, selfClass, name, args);
        } else {
            entry = selfClass.searchWithCache(name);
            if (methodMissing(entry, site.callType(), name, caller)) {
                return callMethodMissing(entry, site.callType(), context, self, name, args);
            }
            site.entry = entry;
            return entry.method.call(context, self, selfClass, name, args);
        }
    }

    public static IRubyObject fail(JRubyCallSite site, ThreadContext context, IRubyObject caller, IRubyObject self, Block block) throws Throwable {
        RubyClass selfClass = pollAndGetClass(context, self);
        String name = site.name();
        CacheEntry entry = site.entry;
        
        if (entry.typeOk(selfClass)) {
            return entry.method.call(context, self, selfClass, name, block);
        } else {
            entry = selfClass.searchWithCache(name);
            if (methodMissing(entry, site.callType(), name, caller)) {
                return callMethodMissing(entry, site.callType(), context, self, name, block);
            }
            site.entry = entry;
            return entry.method.call(context, self, selfClass, name, block);
        }
    }

    public static IRubyObject fail(JRubyCallSite site, ThreadContext context, IRubyObject caller, IRubyObject self, IRubyObject arg0, Block block) throws Throwable {
        RubyClass selfClass = pollAndGetClass(context, self);
        String name = site.name();
        CacheEntry entry = site.entry;
        
        if (entry.typeOk(selfClass)) {
            return entry.method.call(context, self, selfClass, name, arg0, block);
        } else {
            entry = selfClass.searchWithCache(name);
            if (methodMissing(entry, site.callType(), name, caller)) {
                return callMethodMissing(entry, site.callType(), context, self, name, arg0, block);
            }
            site.entry = entry;
            return entry.method.call(context, self, selfClass, name, arg0, block);
        }
    }

    public static IRubyObject fail(JRubyCallSite site, ThreadContext context, IRubyObject caller, IRubyObject self, IRubyObject arg0, IRubyObject arg1, Block block) throws Throwable {
        RubyClass selfClass = pollAndGetClass(context, self);
        String name = site.name();
        CacheEntry entry = site.entry;
        
        if (entry.typeOk(selfClass)) {
            return entry.method.call(context, self, selfClass, name, arg0, arg1, block);
        } else {
            entry = selfClass.searchWithCache(name);
            if (methodMissing(entry, site.callType(), name, caller)) {
                return callMethodMissing(entry, site.callType(), context, self, name, arg0, arg1, block);
            }
            site.entry = entry;
            return entry.method.call(context, self, selfClass, name, arg0, arg1, block);
        }
    }

    public static IRubyObject fail(JRubyCallSite site, ThreadContext context, IRubyObject caller, IRubyObject self, IRubyObject arg0, IRubyObject arg1, IRubyObject arg2, Block block) throws Throwable {
        RubyClass selfClass = pollAndGetClass(context, self);
        String name = site.name();
        CacheEntry entry = site.entry;
        
        if (entry.typeOk(selfClass)) {
            return entry.method.call(context, self, selfClass, name, arg0, arg1, arg2, block);
        } else {
            entry = selfClass.searchWithCache(name);
            if (methodMissing(entry, site.callType(), name, caller)) {
                return callMethodMissing(entry, site.callType(), context, self, name, arg0, arg1, arg2, block);
            }
            site.entry = entry;
            return entry.method.call(context, self, selfClass, name, arg0, arg1, arg2, block);
        }
    }

    public static IRubyObject fail(JRubyCallSite site, ThreadContext context, IRubyObject caller, IRubyObject self, IRubyObject[] args, Block block) throws Throwable {
        RubyClass selfClass = pollAndGetClass(context, self);
        String name = site.name();
        CacheEntry entry = site.entry;

        if (entry.typeOk(selfClass)) {
            return entry.method.call(context, self, selfClass, name, args, block);
        } else {
            entry = selfClass.searchWithCache(name);
            if (methodMissing(entry, site.callType(), name, caller)) {
                return callMethodMissing(entry, site.callType(), context, self, name, args, block);
            }
            site.entry = entry;
            return entry.method.call(context, self, selfClass, name, args, block);
        }
    }

    public static IRubyObject failIter(JRubyCallSite site, ThreadContext context, IRubyObject caller, IRubyObject self, Block block) throws Throwable {
        RubyClass selfClass = pollAndGetClass(context, self);
        String name = site.name();
        CacheEntry entry = site.entry;
        try {
            if (entry.typeOk(selfClass)) {
                return entry.method.call(context, self, selfClass, name, block);
            } else {
                entry = selfClass.searchWithCache(name);
                if (methodMissing(entry, site.callType(), name, caller)) {
                    return callMethodMissing(entry, site.callType(), context, self, name, block);
                }
                site.entry = entry;
                return entry.method.call(context, self, selfClass, name, block);
            }
        } catch (JumpException.BreakJump bj) {
            return handleBreakJump(context, bj);
        } catch (JumpException.RetryJump rj) {
            return retryJumpError(context);
        } finally {
            block.escape();
        }
    }

    public static IRubyObject failIter(JRubyCallSite site, ThreadContext context, IRubyObject caller, IRubyObject self, IRubyObject arg0, Block block) throws Throwable {
        RubyClass selfClass = pollAndGetClass(context, self);
        String name = site.name();
        CacheEntry entry = site.entry;
        try {
            if (entry.typeOk(selfClass)) {
                return entry.method.call(context, self, selfClass, name, arg0, block);
            } else {
                entry = selfClass.searchWithCache(name);
                if (methodMissing(entry, site.callType(), name, caller)) {
                    return callMethodMissing(entry, site.callType(), context, self, name, arg0, block);
                }
                site.entry = entry;
                return entry.method.call(context, self, selfClass, name, arg0, block);
            }
        } catch (JumpException.BreakJump bj) {
            return handleBreakJump(context, bj);
        } catch (JumpException.RetryJump rj) {
            return retryJumpError(context);
        } finally {
            block.escape();
        }
    }

    public static IRubyObject failIter(JRubyCallSite site, ThreadContext context, IRubyObject caller, IRubyObject self, IRubyObject arg0, IRubyObject arg1, Block block) throws Throwable {
        RubyClass selfClass = pollAndGetClass(context, self);
        String name = site.name();
        CacheEntry entry = site.entry;
        try {
            if (entry.typeOk(selfClass)) {
                return entry.method.call(context, self, selfClass, name, arg0, arg1, block);
            } else {
                entry = selfClass.searchWithCache(name);
                if (methodMissing(entry, site.callType(), name, caller)) {
                    return callMethodMissing(entry, site.callType(), context, self, name, arg0, arg1, block);
                }
                site.entry = entry;
                return entry.method.call(context, self, selfClass, name, arg0, arg1, block);
            }
        } catch (JumpException.BreakJump bj) {
            return handleBreakJump(context, bj);
        } catch (JumpException.RetryJump rj) {
            return retryJumpError(context);
        } finally {
            block.escape();
        }
    }

    public static IRubyObject failIter(JRubyCallSite site, ThreadContext context, IRubyObject caller, IRubyObject self, IRubyObject arg0, IRubyObject arg1, IRubyObject arg2, Block block) throws Throwable {
        RubyClass selfClass = pollAndGetClass(context, self);
        String name = site.name();
        CacheEntry entry = site.entry;
        try {
            if (entry.typeOk(selfClass)) {
                return entry.method.call(context, self, selfClass, name, arg0, arg1, arg2, block);
            } else {
                entry = selfClass.searchWithCache(name);
                if (methodMissing(entry, site.callType(), name, caller)) {
                    return callMethodMissing(entry, site.callType(), context, self, name, arg0, arg1, arg2, block);
                }
                site.entry = entry;
                return entry.method.call(context, self, selfClass, name, arg0, arg1, arg2, block);
            }
        } catch (JumpException.BreakJump bj) {
            return handleBreakJump(context, bj);
        } catch (JumpException.RetryJump rj) {
            return retryJumpError(context);
        } finally {
            block.escape();
        }
    }

    public static IRubyObject failIter(JRubyCallSite site, ThreadContext context, IRubyObject caller, IRubyObject self, IRubyObject[] args, Block block) throws Throwable {
        RubyClass selfClass = pollAndGetClass(context, self);
        String name = site.name();
        CacheEntry entry = site.entry;
        try {
            if (entry.typeOk(selfClass)) {
                return entry.method.call(context, self, selfClass, name, args, block);
            } else {
                entry = selfClass.searchWithCache(name);
                if (methodMissing(entry, site.callType(), name, caller)) {
                    return callMethodMissing(entry, site.callType(), context, self, name, args, block);
                }
                site.entry = entry;
                return entry.method.call(context, self, selfClass, name, args, block);
            }
        } catch (JumpException.BreakJump bj) {
            return handleBreakJump(context, bj);
        } catch (JumpException.RetryJump rj) {
            return retryJumpError(context);
        } finally {
            block.escape();
        }
    }
    
    ////////////////////////////////////////////////////////////////////////////
    // Dispatch via DynamicMethod#call
    ////////////////////////////////////////////////////////////////////////////
    
    private static MethodHandle getDynamicMethodTarget(MethodType callType, int arity, DynamicMethod method) {
        MethodHandle target = null;
        
        Class lastParam = callType.parameterType(callType.parameterCount() - 1);
        boolean block = lastParam == Block.class;
        switch (arity) {
            case 0:
                target = block ? TARGET_0_B : TARGET_0;
                break;
            case 1:
                target = block ? TARGET_1_B : TARGET_1;
                break;
            case 2:
                target = block ? TARGET_2_B : TARGET_2;
                break;
            case 3:
                target = block ? TARGET_3_B : TARGET_3;
                break;
            default:
                target = block ? TARGET_N_B : TARGET_N;
        }
        
        return target;
    }
    
    ////////////////////////////////////////////////////////////////////////////
    // Dispatch from Ruby to Java via Java integration
    ////////////////////////////////////////////////////////////////////////////
    
    private static MethodHandle createJavaHandle(CallSite site, DynamicMethod method) {
        MethodHandle nativeTarget = (MethodHandle)method.getHandle();
        if (nativeTarget != null) return nativeTarget;
        
        MethodHandle returnFilter = null;

        Ruby runtime = method.getImplementationClass().getRuntime();
        DynamicMethod.NativeCall nativeCall = method.getNativeCall();
        boolean isStatic = nativeCall.isStatic();

        // varargs broken, so ignore methods that take a trailing array
        Class[] signature = nativeCall.getNativeSignature();
        if (signature.length > 0 && signature[signature.length - 1].isArray()) {
            return null;
        }

        // Scala singletons have slightly different JI logic, so skip for now
        if (method instanceof SingletonMethodInvoker) return null;
        
        // the "apparent" type from the NativeCall, excluding receiver
        MethodType apparentType = methodType(nativeCall.getNativeReturn(), nativeCall.getNativeSignature());

        if (isStatic) {
            nativeTarget = findStatic(nativeCall.getNativeTarget(), nativeCall.getNativeName(), apparentType);
        } else {
            nativeTarget = findVirtual(nativeCall.getNativeTarget(), nativeCall.getNativeName(), apparentType);
        }
        
        // the actual native type with receiver
        MethodType nativeType = nativeTarget.type();
        Class[] nativeParams = nativeType.parameterArray();
        Class nativeReturn = nativeType.returnType();

        // convert arguments
        MethodHandle[] argConverters = new MethodHandle[nativeType.parameterCount()];
        for (int i = 0; i < argConverters.length; i++) {
            MethodHandle converter;
            if (!isStatic && i == 0) {
                // handle non-static receiver specially
                converter = Binder
                        .from(nativeParams[0], IRubyObject.class)
                        .cast(Object.class, IRubyObject.class)
                        .invokeStaticQuiet(lookup(), JavaUtil.class, "objectFromJavaProxy");
            } else {
                // all other arguments use toJava
                converter = Binder
                        .from(nativeParams[i], IRubyObject.class)
                        .insert(1, nativeParams[i])
                        .cast(Object.class, IRubyObject.class, Class.class)
                        .invokeVirtualQuiet(lookup(), "toJava");
            }
            argConverters[i] = converter;
        }
        nativeTarget = filterArguments(nativeTarget, 0, argConverters);
        
        Class[] convertedParams = CodegenUtils.params(IRubyObject.class, nativeTarget.type().parameterCount());

        // handle return value
        if (nativeReturn == byte.class
                || nativeReturn == short.class
                || nativeReturn == char.class
                || nativeReturn == int.class
                || nativeReturn == long.class) {
            // native integral type, produce a Fixnum
            nativeTarget = explicitCastArguments(nativeTarget, methodType(long.class, convertedParams));
            returnFilter = insertArguments(
                    findStatic(RubyFixnum.class, "newFixnum", methodType(RubyFixnum.class, Ruby.class, long.class)),
                    0,
                    runtime);
        } else if (nativeReturn == Byte.class
                || nativeReturn == Short.class
                || nativeReturn == Character.class
                || nativeReturn == Integer.class
                || nativeReturn == Long.class) {
            // boxed integral type, produce a Fixnum or nil
            returnFilter = insertArguments(
                    findStatic(InvocationLinker.class, "fixnumOrNil", methodType(IRubyObject.class, Ruby.class, nativeReturn)),
                    0,
                    runtime);
        } else if (nativeReturn == float.class
                || nativeReturn == double.class) {
            // native decimal type, produce a Float
            nativeTarget = explicitCastArguments(nativeTarget, methodType(double.class, convertedParams));
            returnFilter = insertArguments(
                    findStatic(RubyFloat.class, "newFloat", methodType(RubyFloat.class, Ruby.class, double.class)),
                    0,
                    runtime);
        } else if (nativeReturn == Float.class
                || nativeReturn == Double.class) {
            // boxed decimal type, produce a Float or nil
            returnFilter = insertArguments(
                    findStatic(InvocationLinker.class, "floatOrNil", methodType(IRubyObject.class, Ruby.class, nativeReturn)),
                    0,
                    runtime);
        } else if (nativeReturn == boolean.class) {
            // native boolean type, produce a Boolean
            nativeTarget = explicitCastArguments(nativeTarget, methodType(boolean.class, convertedParams));
            returnFilter = insertArguments(
                    findStatic(RubyBoolean.class, "newBoolean", methodType(RubyBoolean.class, Ruby.class, boolean.class)),
                    0,
                    runtime);
        } else if (nativeReturn == Boolean.class) {
            // boxed boolean type, produce a Boolean or nil
            returnFilter = insertArguments(
                    findStatic(InvocationLinker.class, "booleanOrNil", methodType(IRubyObject.class, Ruby.class, Boolean.class)),
                    0,
                    runtime);
        } else if (CharSequence.class.isAssignableFrom(nativeReturn)) {
            // character sequence, produce a String or nil
            nativeTarget = explicitCastArguments(nativeTarget, methodType(CharSequence.class, convertedParams));
            returnFilter = insertArguments(
                    findStatic(InvocationLinker.class, "stringOrNil", methodType(IRubyObject.class, Ruby.class, CharSequence.class)),
                    0,
                    runtime);
        } else if (nativeReturn == void.class) {
            // void return, produce nil
            returnFilter = constant(IRubyObject.class, runtime.getNil());
        } else if (nativeReturn == ByteList.class) {
            // not handled yet
        } else if (nativeReturn == BigInteger.class) {
            // not handled yet
        } else {
            // all other object types
            nativeTarget = explicitCastArguments(nativeTarget, methodType(Object.class, convertedParams));
            returnFilter = insertArguments(
                    findStatic(JavaUtil.class, "convertJavaToUsableRubyObject", methodType(IRubyObject.class, Ruby.class, Object.class)),
                    0,
                    runtime);
        }

        // we can handle this; do remaining transforms and return
        if (returnFilter != null) {
            Class[] newNativeParams = nativeTarget.type().parameterArray();
            Class newNativeReturn = nativeTarget.type().returnType();

            Binder exBinder = Binder
                    .from(newNativeReturn, Throwable.class, newNativeParams)
                    .drop(1, newNativeParams.length)
                    .insert(0, runtime);
            if (nativeReturn != void.class) {
                exBinder = exBinder
                        .filterReturn(Binder
                                .from(newNativeReturn)
                                .constant(nullValue(newNativeReturn)));
            }

            nativeTarget = Binder
                    .from(site.type())
                    .drop(0, isStatic ? 3 : 2)
                    .filterReturn(returnFilter)
                    .invoke(nativeTarget);

            method.setHandle(nativeTarget);
            return nativeTarget;
        }

        return null;
    }
    
    public static boolean subclassProxyTest(Object target) {
        return target instanceof InternalJavaProxy;
    }
    
    private static final MethodHandle IS_JAVA_SUBCLASS = findStatic(InvocationLinker.class, "subclassProxyTest", methodType(boolean.class, Object.class));
    
    private static Object nullValue(Class type) {
        if (type == boolean.class || type == Boolean.class) return false;
        if (type == byte.class || type == Byte.class) return (byte)0;
        if (type == short.class || type == Short.class) return (short)0;
        if (type == int.class || type == Integer.class) return 0;
        if (type == long.class || type == Long.class) return 0L;
        if (type == float.class || type == Float.class) return 0.0F;
        if (type == double.class || type == Double.class)return 0.0;
        return null;
    }
    
    public static IRubyObject fixnumOrNil(Ruby runtime, Byte b) {
        return b == null ? runtime.getNil() : RubyFixnum.newFixnum(runtime, b);
    }
    
    public static IRubyObject fixnumOrNil(Ruby runtime, Short s) {
        return s == null ? runtime.getNil() : RubyFixnum.newFixnum(runtime, s);
    }
    
    public static IRubyObject fixnumOrNil(Ruby runtime, Character c) {
        return c == null ? runtime.getNil() : RubyFixnum.newFixnum(runtime, c);
    }
    
    public static IRubyObject fixnumOrNil(Ruby runtime, Integer i) {
        return i == null ? runtime.getNil() : RubyFixnum.newFixnum(runtime, i);
    }
    
    public static IRubyObject fixnumOrNil(Ruby runtime, Long l) {
        return l == null ? runtime.getNil() : RubyFixnum.newFixnum(runtime, l);
    }
    
    public static IRubyObject floatOrNil(Ruby runtime, Float f) {
        return f == null ? runtime.getNil() : RubyFloat.newFloat(runtime, f);
    }
    
    public static IRubyObject floatOrNil(Ruby runtime, Double d) {
        return d == null ? runtime.getNil() : RubyFloat.newFloat(runtime, d);
    }
    
    public static IRubyObject booleanOrNil(Ruby runtime, Boolean b) {
        return b == null ? runtime.getNil() : RubyBoolean.newBoolean(runtime, b);
    }
    
    public static IRubyObject stringOrNil(Ruby runtime, CharSequence cs) {
        return cs == null ? runtime.getNil() : RubyString.newUnicodeString(runtime, cs);
    }
    
    ////////////////////////////////////////////////////////////////////////////
    // Dispatch via direct handle to native core method
    ////////////////////////////////////////////////////////////////////////////

    private static MethodHandle createNativeHandle(JRubyCallSite site, DynamicMethod method, String name) {
        MethodHandle nativeTarget = (MethodHandle)method.getHandle();
        if (nativeTarget != null) return nativeTarget;

        DynamicMethod.NativeCall nativeCall = method.getNativeCall();
        Class[] nativeSig = nativeCall.getNativeSignature();
        boolean isStatic = nativeCall.isStatic();

        try {
            if (isStatic) {
                nativeTarget = site.lookup().findStatic(
                        nativeCall.getNativeTarget(),
                        nativeCall.getNativeName(),
                        methodType(nativeCall.getNativeReturn(),
                        nativeCall.getNativeSignature()));
            } else {
                nativeTarget = site.lookup().findVirtual(
                        nativeCall.getNativeTarget(),
                        nativeCall.getNativeName(),
                        methodType(nativeCall.getNativeReturn(),
                        nativeCall.getNativeSignature()));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        int argCount = getArgCount(nativeCall.getNativeSignature(), isStatic);
        MethodType inboundType = STANDARD_NATIVE_TYPES_BLOCK[argCount];

        int[] permute;
        MethodType convert;
        if (nativeSig.length > 0 && nativeSig[0] == ThreadContext.class) {
            if (nativeSig[nativeSig.length - 1] == Block.class) {
                convert = isStatic ? TARGET_TC_SELF_ARGS_BLOCK[argCount] : TARGET_SELF_TC_ARGS_BLOCK[argCount];
                permute = isStatic ? TC_SELF_ARGS_BLOCK_PERMUTES[argCount] : SELF_TC_ARGS_BLOCK_PERMUTES[argCount];
            } else {
                convert = isStatic ? TARGET_TC_SELF_ARGS[argCount] : TARGET_SELF_TC_ARGS[argCount];
                permute = isStatic ? TC_SELF_ARGS_PERMUTES[argCount] : SELF_TC_ARGS_PERMUTES[argCount];
            }
        } else {
            if (nativeSig.length > 0 && nativeSig[nativeSig.length - 1] == Block.class) {
                convert = TARGET_SELF_ARGS_BLOCK[argCount];
                permute = SELF_ARGS_BLOCK_PERMUTES[argCount];
            } else {
                convert = TARGET_SELF_ARGS[argCount];
                permute = SELF_ARGS_PERMUTES[argCount];
            }
        }

        nativeTarget = explicitCastArguments(nativeTarget, convert);
        nativeTarget = permuteArguments(nativeTarget, inboundType, permute);

        nativeTarget = wrapWithFraming(method, name, nativeTarget, null, argCount);

        method.setHandle(nativeTarget);

        return nativeTarget;
    }

    ////////////////////////////////////////////////////////////////////////////
    // Dispatch via direct handle to FFI native method
    ////////////////////////////////////////////////////////////////////////////

    private static MethodHandle createFFIHandle(JRubyCallSite site, DynamicMethod method) {
        if (site.type().parameterType(site.type().parameterCount() - 1) == Block.class) {
            // Called with a block to substitute for a callback param - cannot cache or use a cached handle
            return null;
        }

        MethodHandle nativeTarget = (MethodHandle) method.getHandle();
        if (nativeTarget != null) return nativeTarget;

        nativeTarget = org.jruby.ext.ffi.jffi.InvokeDynamic.getMethodHandle(site, method);
        if (nativeTarget != null) {
            method.setHandle(nativeTarget);
            return nativeTarget;
        }

        // can't build native handle for it
        return null;
    }
    
    ////////////////////////////////////////////////////////////////////////////
    // Dispatch to attribute accessors
    ////////////////////////////////////////////////////////////////////////////

    private static MethodHandle createAttrReaderHandle(JRubyCallSite site, RubyClass cls, DynamicMethod method) {
        MethodHandle nativeTarget = (MethodHandle)method.getHandle();
        if (nativeTarget != null) return nativeTarget;

        AttrReaderMethod attrReader = (AttrReaderMethod)method;
        String varName = attrReader.getVariableName();

        // we getVariableAccessorForWrite here so it is eagerly created and we don't cache the DUMMY
        RubyClass.VariableAccessor accessor = cls.getRealClass().getVariableAccessorForWrite(varName);

        MethodHandle filter = Binder
                .from(IRubyObject.class, IRubyObject.class)
                .insert(1, cls.getRuntime().getNil())
                .cast(IRubyObject.class, IRubyObject.class, IRubyObject.class)
                .invokeStaticQuiet(lookup(), InvocationLinker.class, "valueOrNil");

        nativeTarget = Binder
                .from(site.type())
                .permute(2)
                .filterReturn(filter)
                .insert(1, accessor.getIndex())
                .cast(Object.class, IRubyObject.class, int.class)
                .invokeVirtualQuiet(lookup(), "getVariable");

        // NOTE: Must not cache the fully-bound handle in the method, since it's specific to this class

        return nativeTarget;
    }
    
    public static IRubyObject valueOrNil(IRubyObject value, IRubyObject nil) {
        return value == null ? nil : value;
    }

    private static MethodHandle createAttrWriterHandle(JRubyCallSite site, RubyClass cls, DynamicMethod method) {
        MethodHandle nativeTarget = (MethodHandle)method.getHandle();
        if (nativeTarget != null) return nativeTarget;

        AttrWriterMethod attrWriter = (AttrWriterMethod)method;
        String varName = attrWriter.getVariableName();
        
        RubyClass.VariableAccessor accessor = cls.getRealClass().getVariableAccessorForWrite(varName);

        MethodHandle filter = Binder
                .from(IRubyObject.class, Object.class)
                .drop(0)
                .constant(cls.getRuntime().getNil());

        nativeTarget = Binder
                .from(site.type())
                .permute(2, 3)
                .filterReturn(filter)
                .insert(1, accessor.getIndex())
                .cast(void.class, IRubyObject.class, int.class, Object.class)
                .invokeVirtualQuiet(lookup(), "setVariable");

        // NOTE: Must not cache the fully-bound handle in the method, since it's specific to this class

        return nativeTarget;
    }
    
    ////////////////////////////////////////////////////////////////////////////
    // Dispatch via direct handle to Ruby method
    ////////////////////////////////////////////////////////////////////////////

    private static MethodHandle createRubyHandle(JRubyCallSite site, DynamicMethod method, String name) {
        MethodHandle nativeTarget = (MethodHandle)method.getHandle();
        if (nativeTarget != null) return nativeTarget;
        
        DynamicMethod.NativeCall nativeCall = method.getNativeCall();
        
        try {
            Object scriptObject;
            StaticScope scope = null;
            if (method instanceof CompiledMethod) {
                scriptObject = ((CompiledMethod)method).getScriptObject();
                scope = ((CompiledMethod)method).getStaticScope();
            } else if (method instanceof JittedMethod) {
                scriptObject = ((JittedMethod)method).getScriptObject();
                scope = ((JittedMethod)method).getStaticScope();
            } else {
                throw new RuntimeException("invalid method for ruby handle: " + method);
            }

            int argCount = getRubyArgCount(nativeCall.getNativeSignature());

            nativeTarget = Binder
                    .from(STANDARD_NATIVE_TYPES_BLOCK[Math.abs(argCount)])
                    .permute(TC_SELF_ARGS_BLOCK_PERMUTES[Math.abs(argCount)])
                    .insert(0, scriptObject)
                    .invokeStaticQuiet(site.lookup(), nativeCall.getNativeTarget(), nativeCall.getNativeName());

            nativeTarget = wrapWithFraming(method, name, nativeTarget, scope, argCount);
            
            method.setHandle(nativeTarget);
            return nativeTarget;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static MethodHandle wrapWithFraming(DynamicMethod method, String name, MethodHandle nativeTarget, StaticScope scope, int argCount) {
        MethodHandle framePre = getFramePre(method, name, argCount, scope);

        if (framePre != null) {
            MethodHandle framePost = getFramePost(method, argCount);

            // break, return, redo handling
            CallConfiguration callConfig = method.getCallConfig();
            boolean heapScoped = callConfig.scoping() != Scoping.None;
            boolean framed = callConfig.framing() != Framing.None;


            if (framed || heapScoped) {
                nativeTarget = catchException(
                        nativeTarget,
                        JumpException.ReturnJump.class,
                        Binder
                                .from(nativeTarget.type().insertParameterTypes(0, JumpException.ReturnJump.class))
                            .permute(0, 1)
                            .invokeStaticQuiet(lookup(), InvocationLinker.class, "handleReturn"));
            }
            if (framed) {
                nativeTarget = catchException(
                        nativeTarget,
                        JumpException.RedoJump.class,
                        Binder
                                .from(nativeTarget.type().insertParameterTypes(0, JumpException.RedoJump.class))
                                .permute(0, 1)
                                .invokeStaticQuiet(lookup(), InvocationLinker.class, "handleRedo"));
            }


            // post logic for frame
            nativeTarget = Binder
                    .from(nativeTarget.type())
                    .tryFinally(framePost)
                    .invoke(nativeTarget);

            // pre logic for frame
            nativeTarget = foldArguments(nativeTarget, framePre);


            // call polling and call number increment
            nativeTarget = Binder
                    .from(nativeTarget.type())
                    .fold(Binder
                            .from(nativeTarget.type().changeReturnType(void.class))
                            .permute(0)
                            .invokeStaticQuiet(lookup(), ThreadContext.class, "callThreadPoll"))
                    .invoke(nativeTarget);
        }

        return nativeTarget;
    }

    public static IRubyObject handleReturn(JumpException.ReturnJump rj, ThreadContext context) {
        if (rj.getTarget() == context.getFrameJumpTarget()) {
            return (IRubyObject)rj.getValue();
        }

        throw rj;
    }

    public static IRubyObject handleRedo(JumpException.RedoJump rj, ThreadContext context) {
        throw context.runtime.newLocalJumpError(RubyLocalJumpError.Reason.REDO, context.runtime.getNil(), "unexpected redo");
    }

    private static MethodHandle getFramePre(DynamicMethod method, String name, int argCount, StaticScope scope) {
        MethodHandle framePre = null;

        switch (method.getCallConfig()) {
            case FrameFullScopeFull:
                // before logic
                framePre = Binder
                        .from(STANDARD_NATIVE_TYPES_BLOCK[Math.abs(argCount)].changeReturnType(void.class))
                        .permute(TC_SELF_BLOCK_PERMUTES[Math.abs(argCount)])
                        .insert(1, new Class[]{RubyModule.class, String.class}, method.getImplementationClass(), name)
                        .insert(5, new Class[]{StaticScope.class}, scope)
                        .invokeVirtualQuiet(lookup(), "preMethodFrameAndScope");

                break;

            case FrameFullScopeDummy:
                // before logic
                framePre = Binder
                        .from(STANDARD_NATIVE_TYPES_BLOCK[Math.abs(argCount)].changeReturnType(void.class))
                        .permute(TC_SELF_BLOCK_PERMUTES[Math.abs(argCount)])
                        .insert(1, new Class[]{RubyModule.class, String.class}, method.getImplementationClass(), name)
                        .insert(5, new Class[]{StaticScope.class}, scope)
                        .invokeVirtualQuiet(lookup(), "preMethodFrameAndDummyScope");

                break;

            case FrameFullScopeNone:
                // before logic
                framePre = Binder
                        .from(STANDARD_NATIVE_TYPES_BLOCK[Math.abs(argCount)].changeReturnType(void.class))
                        .permute(TC_SELF_BLOCK_PERMUTES[Math.abs(argCount)])
                        .insert(1, new Class[]{RubyModule.class, String.class}, method.getImplementationClass(), name)
                        .invokeVirtualQuiet(lookup(), "preMethodFrameOnly");

                break;

            case FrameNoneScopeFull:
                // before logic
                framePre = Binder
                        .from(STANDARD_NATIVE_TYPES_BLOCK[Math.abs(argCount)].changeReturnType(void.class))
                        .permute(0)
                        .insert(1, new Class[]{RubyModule.class, StaticScope.class}, method.getImplementationClass(), scope)
                        .invokeVirtualQuiet(lookup(), "preMethodScopeOnly");

                break;

            case FrameNoneScopeDummy:
                // before logic
                framePre = Binder
                        .from(STANDARD_NATIVE_TYPES_BLOCK[Math.abs(argCount)].changeReturnType(void.class))
                        .permute(0)
                        .insert(1, new Class[]{RubyModule.class, StaticScope.class}, method.getImplementationClass(), scope)
                        .invokeVirtualQuiet(lookup(), "preMethodNoFrameAndDummyScope");

                break;

        }

        return framePre;
    }

    private static MethodHandle getFramePost(DynamicMethod method, int argCount) {
        switch (method.getCallConfig()) {
            case FrameFullScopeFull:
                // finally logic
                return Binder
                        .from(STANDARD_NATIVE_TYPES_BLOCK[Math.abs(argCount)].changeReturnType(void.class))
                        .permute(0)
                        .invokeVirtualQuiet(lookup(), "postMethodFrameAndScope");

            case FrameFullScopeDummy:
                // finally logic
                return Binder
                        .from(STANDARD_NATIVE_TYPES_BLOCK[Math.abs(argCount)].changeReturnType(void.class))
                        .permute(0)
                        .invokeVirtualQuiet(lookup(), "postMethodFrameAndScope");

            case FrameFullScopeNone:
                // finally logic
                return Binder
                        .from(STANDARD_NATIVE_TYPES_BLOCK[Math.abs(argCount)].changeReturnType(void.class))
                        .permute(0)
                        .invokeVirtualQuiet(lookup(), "postMethodFrameOnly");

            case FrameNoneScopeFull:
                // finally logic
                return Binder
                        .from(STANDARD_NATIVE_TYPES_BLOCK[Math.abs(argCount)].changeReturnType(void.class))
                        .permute(0)
                        .invokeVirtualQuiet(lookup(), "postMethodScopeOnly");

            case FrameNoneScopeDummy:
                // finally logic
                return Binder
                        .from(STANDARD_NATIVE_TYPES_BLOCK[Math.abs(argCount)].changeReturnType(void.class))
                        .permute(0)
                        .invokeVirtualQuiet(lookup(), "postMethodScopeOnly");

        }

        return null;
    }

    ////////////////////////////////////////////////////////////////////////////
    // Additional support code
    ////////////////////////////////////////////////////////////////////////////

    private static int getArgCount(Class[] args, boolean isStatic) {
        int length = args.length;
        boolean hasContext = false;
        if (isStatic) {
            if (args.length > 1 && args[0] == ThreadContext.class) {
                length--;
                hasContext = true;
            }
            
            // remove self object
            assert args.length >= 1;
            length--;

            if (args.length > 1 && args[args.length - 1] == Block.class) {
                length--;
            }
            
            if (length == 1) {
                if (hasContext && args[2] == IRubyObject[].class) {
                    length = 4;
                } else if (args[1] == IRubyObject[].class) {
                    length = 4;
                }
            }
        } else {
            if (args.length > 0 && args[0] == ThreadContext.class) {
                length--;
                hasContext = true;
            }

            if (args.length > 0 && args[args.length - 1] == Block.class) {
                length--;
            }

            if (length == 1) {
                if (hasContext && args[1] == IRubyObject[].class) {
                    length = 4;
                } else if (args[0] == IRubyObject[].class) {
                    length = 4;
                }
            }
        }
        return length;
    }

    private static int getRubyArgCount(Class[] args) {
        int length = args.length;
        boolean hasContext = false;
        
        // remove script object
        length--;
        
        if (args.length > 2 && args[1] == ThreadContext.class) {
            length--;
            hasContext = true;
        }

        // remove self object
        assert args.length >= 2;
        length--;

        if (args.length > 2 && args[args.length - 1] == Block.class) {
            length--;
        }

        if (length == 1) {
            if (hasContext && args[3] == IRubyObject[].class) {
                length = 4;
            } else if (args[2] == IRubyObject[].class) {
                length = 4;
            }
        }

        return length;
    }

    private static int getSiteCount(Class[] args) {
        if (args[args.length - 1] == Block.class) {
            if (args[args.length - 2] == IRubyObject[].class) {
                return 4;
            } else {
                return args.length - 4; // TC, caller, self, block
            }
        } else {
            if (args[args.length - 1] == IRubyObject[].class) {
                return 4;
            } else {
                return args.length - 3; // TC, caller, self
            }
        }
    }
    
    private static String logMethod(DynamicMethod method) {
        return "[#" + method.getSerialNumber() + " " + method.getImplementationClass() + "]";
    }

    private static final MethodHandle GETMETHOD;
    static {
        MethodHandle getMethod = findStatic(InvocationLinker.class, "getMethod", methodType(DynamicMethod.class, CacheEntry.class));
        getMethod = dropArguments(getMethod, 0, RubyClass.class);
        getMethod = dropArguments(getMethod, 2, ThreadContext.class, IRubyObject.class, IRubyObject.class);
        GETMETHOD = getMethod;
    }

    public static DynamicMethod getMethod(CacheEntry entry) {
        return entry.method;
    }

    private static final MethodHandle PGC = Binder
                    .from(RubyClass.class, CacheEntry.class, ThreadContext.class, IRubyObject.class, IRubyObject.class)
                    .permute(1, 3)
                    .invokeStaticQuiet(lookup(), InvokeDynamicSupport.class, "pollAndGetClass");

    private static final MethodHandle TEST_GENERATION = Binder
            .from(boolean.class, int.class, IRubyObject.class)
            .invokeStaticQuiet(lookup(), InvocationLinker.class, "testGeneration");

    private static final MethodHandle TEST_METACLASS = Binder
            .from(boolean.class, RubyClass.class, IRubyObject.class)
            .invokeStaticQuiet(lookup(), InvocationLinker.class, "testMetaclass");
    
    private static final MethodHandle TEST =
            RubyInstanceConfig.INVOKEDYNAMIC_INVOCATION_SWITCHPOINT ?
            TEST_METACLASS :
            TEST_GENERATION;
    
    private static final MethodHandle TEST_CLASS = Binder
            .from(boolean.class, Object.class, Class.class)
            .invokeStaticQuiet(lookup(), InvocationLinker.class, "testClass");

    private static MethodHandle dropNameAndArgs(MethodHandle original, int index, int count, boolean block) {
        switch (count) {
        case -1:
            if (block) {
                return dropArguments(original, index, String.class, IRubyObject[].class, Block.class);
            } else {
                return dropArguments(original, index, String.class, IRubyObject[].class);
            }
        case 0:
            if (block) {
                return dropArguments(original, index, String.class, Block.class);
            } else {
                return dropArguments(original, index, String.class);
            }
        case 1:
            if (block) {
                return dropArguments(original, index, String.class, IRubyObject.class, Block.class);
            } else {
                return dropArguments(original, index, String.class, IRubyObject.class);
            }
        case 2:
            if (block) {
                return dropArguments(original, index, String.class, IRubyObject.class, IRubyObject.class, Block.class);
            } else {
                return dropArguments(original, index, String.class, IRubyObject.class, IRubyObject.class);
            }
        case 3:
            if (block) {
                return dropArguments(original, index, String.class, IRubyObject.class, IRubyObject.class, IRubyObject.class, Block.class);
            } else {
                return dropArguments(original, index, String.class, IRubyObject.class, IRubyObject.class, IRubyObject.class);
            }
        default:
            throw new RuntimeException("Invalid arg count (" + count + ") while preparing method handle:\n\t" + original);
        }
    }

    private static MethodHandle dropArgs(MethodHandle original, int index, int count, boolean block) {
        switch (count) {
        case -1:
            if (block) {
                return dropArguments(original, index, IRubyObject[].class, Block.class);
            } else {
                return dropArguments(original, index, IRubyObject[].class);
            }
        case 0:
            if (block) {
                return dropArguments(original, index, Block.class);
            } else {
                return dropArguments(original, index);
            }
        case 1:
            if (block) {
                return dropArguments(original, index, IRubyObject.class, Block.class);
            } else {
                return dropArguments(original, index, IRubyObject.class);
            }
        case 2:
            if (block) {
                return dropArguments(original, index, IRubyObject.class, IRubyObject.class, Block.class);
            } else {
                return dropArguments(original, index, IRubyObject.class, IRubyObject.class);
            }
        case 3:
            if (block) {
                return dropArguments(original, index, IRubyObject.class, IRubyObject.class, IRubyObject.class, Block.class);
            } else {
                return dropArguments(original, index, IRubyObject.class, IRubyObject.class, IRubyObject.class);
            }
        default:
            throw new RuntimeException("Invalid arg count (" + count + ") while preparing method handle:\n\t" + original);
        }
    }
    
    ////////////////////////////////////////////////////////////////////////////
    // Support handles for DynamicMethod.call paths
    ////////////////////////////////////////////////////////////////////////////

    private static final MethodHandle TARGET_0 = Binder
            .from(IRubyObject.class, CacheEntry.class, ThreadContext.class, IRubyObject.class, IRubyObject.class, String.class)
            .fold(dropNameAndArgs(PGC, 4, 0, false))
            .fold(dropNameAndArgs(GETMETHOD, 5, 0, false))
            .permute(0, 3, 5, 1, 6)
            .cast(IRubyObject.class, DynamicMethod.class, ThreadContext.class, IRubyObject.class, RubyModule.class, String.class)
            .invokeVirtualQuiet(lookup(), "call");

    private static final MethodHandle FALLBACK_0 = findStatic(InvocationLinker.class, "invocationFallback",
            methodType(IRubyObject.class, JRubyCallSite.class, ThreadContext.class, IRubyObject.class, IRubyObject.class));
    private static final MethodHandle FAIL_0 = findStatic(InvocationLinker.class, "fail",
            methodType(IRubyObject.class, JRubyCallSite.class, ThreadContext.class, IRubyObject.class, IRubyObject.class));

    private static final MethodHandle TARGET_1 = Binder
            .from(IRubyObject.class, CacheEntry.class, ThreadContext.class, IRubyObject.class, IRubyObject.class, String.class, IRubyObject.class)
            .fold(dropNameAndArgs(PGC, 4, 1, false))
            .fold(dropNameAndArgs(GETMETHOD, 5, 1, false))
            .permute(0, 3, 5, 1, 6, 7)
            .cast(IRubyObject.class, DynamicMethod.class, ThreadContext.class, IRubyObject.class, RubyModule.class, String.class, IRubyObject.class)
            .invokeVirtualQuiet(lookup(), "call");

    private static final MethodHandle FALLBACK_1 = findStatic(InvocationLinker.class, "invocationFallback",
            methodType(IRubyObject.class, JRubyCallSite.class, ThreadContext.class, IRubyObject.class, IRubyObject.class, IRubyObject.class));
    private static final MethodHandle FAIL_1 = findStatic(InvocationLinker.class, "fail",
            methodType(IRubyObject.class, JRubyCallSite.class, ThreadContext.class, IRubyObject.class, IRubyObject.class, IRubyObject.class));

    private static final MethodHandle TARGET_2 = Binder
            .from(IRubyObject.class, CacheEntry.class, ThreadContext.class, IRubyObject.class, IRubyObject.class, String.class, IRubyObject.class, IRubyObject.class)
            .fold(dropNameAndArgs(PGC, 4, 2, false))
            .fold(dropNameAndArgs(GETMETHOD, 5, 2, false))
            .permute(0, 3, 5, 1, 6, 7, 8)
            .cast(IRubyObject.class, DynamicMethod.class, ThreadContext.class, IRubyObject.class, RubyModule.class, String.class, IRubyObject.class, IRubyObject.class)
            .invokeVirtualQuiet(lookup(), "call");

    private static final MethodHandle FALLBACK_2 = findStatic(InvocationLinker.class, "invocationFallback",
            methodType(IRubyObject.class, JRubyCallSite.class, ThreadContext.class, IRubyObject.class, IRubyObject.class, IRubyObject.class, IRubyObject.class));
    private static final MethodHandle FAIL_2 = findStatic(InvocationLinker.class, "fail",
            methodType(IRubyObject.class, JRubyCallSite.class, ThreadContext.class, IRubyObject.class, IRubyObject.class, IRubyObject.class, IRubyObject.class));

    private static final MethodHandle TARGET_3 = Binder
            .from(IRubyObject.class, CacheEntry.class, ThreadContext.class, IRubyObject.class, IRubyObject.class, String.class, IRubyObject.class, IRubyObject.class, IRubyObject.class)
            .fold(dropNameAndArgs(PGC, 4, 3, false))
            .fold(dropNameAndArgs(GETMETHOD, 5, 3, false))
            .permute(0, 3, 5, 1, 6, 7, 8, 9)
            .cast(IRubyObject.class, DynamicMethod.class, ThreadContext.class, IRubyObject.class, RubyModule.class, String.class, IRubyObject.class, IRubyObject.class, IRubyObject.class)
            .invokeVirtualQuiet(lookup(), "call");

    private static final MethodHandle FALLBACK_3 = findStatic(InvocationLinker.class, "invocationFallback",
            methodType(IRubyObject.class, JRubyCallSite.class, ThreadContext.class, IRubyObject.class, IRubyObject.class, IRubyObject.class, IRubyObject.class, IRubyObject.class));
    private static final MethodHandle FAIL_3 = findStatic(InvocationLinker.class, "fail",
            methodType(IRubyObject.class, JRubyCallSite.class, ThreadContext.class, IRubyObject.class, IRubyObject.class, IRubyObject.class, IRubyObject.class, IRubyObject.class));

    private static final MethodHandle TARGET_N = Binder
            .from(IRubyObject.class, CacheEntry.class, ThreadContext.class, IRubyObject.class, IRubyObject.class, String.class, IRubyObject[].class)
            .fold(dropNameAndArgs(PGC, 4, -1, false))
            .fold(dropNameAndArgs(GETMETHOD, 5, -1, false))
            .permute(0, 3, 5, 1, 6, 7)
            .cast(IRubyObject.class, DynamicMethod.class, ThreadContext.class, IRubyObject.class, RubyModule.class, String.class, IRubyObject[].class)
            .invokeVirtualQuiet(lookup(), "call");

    private static final MethodHandle FALLBACK_N = findStatic(InvocationLinker.class, "invocationFallback",
            methodType(IRubyObject.class, JRubyCallSite.class, ThreadContext.class, IRubyObject.class, IRubyObject.class, IRubyObject[].class));
    private static final MethodHandle FAIL_N = findStatic(InvocationLinker.class, "fail",
            methodType(IRubyObject.class, JRubyCallSite.class, ThreadContext.class, IRubyObject.class, IRubyObject.class, IRubyObject[].class));

    private static final MethodHandle TARGET_0_B = Binder
            .from(IRubyObject.class, CacheEntry.class, ThreadContext.class, IRubyObject.class, IRubyObject.class, String.class, Block.class)
            .fold(dropNameAndArgs(PGC, 4, 0, true))
            .fold(dropNameAndArgs(GETMETHOD, 5, 0, true))
            .permute(0, 3, 5, 1, 6, 7)
            .cast(IRubyObject.class, DynamicMethod.class, ThreadContext.class, IRubyObject.class, RubyModule.class, String.class, Block.class)
            .invokeVirtualQuiet(lookup(), "call");

    private static final MethodHandle FALLBACK_0_B = findStatic(InvocationLinker.class, "invocationFallback",
            methodType(IRubyObject.class, JRubyCallSite.class, ThreadContext.class, IRubyObject.class, IRubyObject.class, Block.class));
    private static final MethodHandle FAIL_0_B = findStatic(InvocationLinker.class, "fail",
            methodType(IRubyObject.class, JRubyCallSite.class, ThreadContext.class, IRubyObject.class, IRubyObject.class, Block.class));

    private static final MethodHandle TARGET_1_B = Binder
            .from(IRubyObject.class, CacheEntry.class, ThreadContext.class, IRubyObject.class, IRubyObject.class, String.class, IRubyObject.class, Block.class)
            .fold(dropNameAndArgs(PGC, 4, 1, true))
            .fold(dropNameAndArgs(GETMETHOD, 5, 1, true))
            .permute(0, 3, 5, 1, 6, 7, 8)
            .cast(IRubyObject.class, DynamicMethod.class, ThreadContext.class, IRubyObject.class, RubyModule.class, String.class, IRubyObject.class, Block.class)
            .invokeVirtualQuiet(lookup(), "call");

    private static final MethodHandle FALLBACK_1_B = findStatic(InvocationLinker.class, "invocationFallback",
            methodType(IRubyObject.class, JRubyCallSite.class, ThreadContext.class, IRubyObject.class, IRubyObject.class, IRubyObject.class, Block.class));
    private static final MethodHandle FAIL_1_B = findStatic(InvocationLinker.class, "fail",
            methodType(IRubyObject.class, JRubyCallSite.class, ThreadContext.class, IRubyObject.class, IRubyObject.class, IRubyObject.class, Block.class));

    private static final MethodHandle TARGET_2_B = Binder
            .from(IRubyObject.class, CacheEntry.class, ThreadContext.class, IRubyObject.class, IRubyObject.class, String.class, IRubyObject.class, IRubyObject.class, Block.class)
            .fold(dropNameAndArgs(PGC, 4, 2, true))
            .fold(dropNameAndArgs(GETMETHOD, 5, 2, true))
            .permute(0, 3, 5, 1, 6, 7, 8, 9)
            .cast(IRubyObject.class, DynamicMethod.class, ThreadContext.class, IRubyObject.class, RubyModule.class, String.class, IRubyObject.class, IRubyObject.class, Block.class)
            .invokeVirtualQuiet(lookup(), "call");

    private static final MethodHandle FALLBACK_2_B = findStatic(InvocationLinker.class, "invocationFallback",
            methodType(IRubyObject.class, JRubyCallSite.class, ThreadContext.class, IRubyObject.class, IRubyObject.class, IRubyObject.class, IRubyObject.class, Block.class));
    private static final MethodHandle FAIL_2_B = findStatic(InvocationLinker.class, "fail",
            methodType(IRubyObject.class, JRubyCallSite.class, ThreadContext.class, IRubyObject.class, IRubyObject.class, IRubyObject.class, IRubyObject.class, Block.class));

    private static final MethodHandle TARGET_3_B = Binder
            .from(IRubyObject.class, CacheEntry.class, ThreadContext.class, IRubyObject.class, IRubyObject.class, String.class, IRubyObject.class, IRubyObject.class, IRubyObject.class, Block.class)
            .fold(dropNameAndArgs(PGC, 4, 3, true))
            .fold(dropNameAndArgs(GETMETHOD, 5, 3, true))
            .permute(0, 3, 5, 1, 6, 7, 8, 9, 10)
            .cast(IRubyObject.class, DynamicMethod.class, ThreadContext.class, IRubyObject.class, RubyModule.class, String.class, IRubyObject.class, IRubyObject.class, IRubyObject.class, Block.class)
            .invokeVirtualQuiet(lookup(), "call");

    private static final MethodHandle FALLBACK_3_B = findStatic(InvocationLinker.class, "invocationFallback",
            methodType(IRubyObject.class, JRubyCallSite.class, ThreadContext.class, IRubyObject.class, IRubyObject.class, IRubyObject.class, IRubyObject.class, IRubyObject.class, Block.class));
    private static final MethodHandle FAIL_3_B = findStatic(InvocationLinker.class, "fail",
            methodType(IRubyObject.class, JRubyCallSite.class, ThreadContext.class, IRubyObject.class, IRubyObject.class, IRubyObject.class, IRubyObject.class, IRubyObject.class, Block.class));

    private static final MethodHandle TARGET_N_B = Binder
            .from(IRubyObject.class, CacheEntry.class, ThreadContext.class, IRubyObject.class, IRubyObject.class, String.class, IRubyObject[].class, Block.class)
            .fold(dropNameAndArgs(PGC, 4, -1, true))
            .fold(dropNameAndArgs(GETMETHOD, 5, -1, true))
            .permute(0, 3, 5, 1, 6, 7, 8)
            .cast(IRubyObject.class, DynamicMethod.class, ThreadContext.class, IRubyObject.class, RubyModule.class, String.class, IRubyObject[].class, Block.class)
            .invokeVirtualQuiet(lookup(), "call");

    private static final MethodHandle FALLBACK_N_B = findStatic(InvocationLinker.class, "invocationFallback",
                    methodType(IRubyObject.class, JRubyCallSite.class, ThreadContext.class, IRubyObject.class, IRubyObject.class, IRubyObject[].class, Block.class));
    private static final MethodHandle FAIL_N_B = findStatic(InvocationLinker.class, "fail",
                    methodType(IRubyObject.class, JRubyCallSite.class, ThreadContext.class, IRubyObject.class, IRubyObject.class, IRubyObject[].class, Block.class));

    private static final MethodHandle[] FALLBACKS = new MethodHandle[] {
        FALLBACK_0,
        FALLBACK_1,
        FALLBACK_2,
        FALLBACK_3,
        FALLBACK_N
    };
    
    private static final MethodHandle[] FAILS = new MethodHandle[] {
        FAIL_0,
        FAIL_1,
        FAIL_2,
        FAIL_3,
        FAIL_N
    };
    
    private static final MethodHandle[] FALLBACKS_B = new MethodHandle[] {
        FALLBACK_0_B,
        FALLBACK_1_B,
        FALLBACK_2_B,
        FALLBACK_3_B,
        FALLBACK_N_B
    };
    
    private static final MethodHandle[] FAILS_B = new MethodHandle[] {
        FAIL_0_B,
        FAIL_1_B,
        FAIL_2_B,
        FAIL_3_B,
        FAIL_N_B
    };
    
    ////////////////////////////////////////////////////////////////////////////
    // Support method types and permutations
    ////////////////////////////////////////////////////////////////////////////
    
    private static final MethodType STANDARD_NATIVE_TYPE = methodType(
            IRubyObject.class, // return value
            ThreadContext.class, //context
            IRubyObject.class, // caller
            IRubyObject.class // self
            );
    private static final MethodType STANDARD_NATIVE_TYPE_1ARG = STANDARD_NATIVE_TYPE.appendParameterTypes(IRubyObject.class);
    private static final MethodType STANDARD_NATIVE_TYPE_2ARG = STANDARD_NATIVE_TYPE_1ARG.appendParameterTypes(IRubyObject.class);
    private static final MethodType STANDARD_NATIVE_TYPE_3ARG = STANDARD_NATIVE_TYPE_2ARG.appendParameterTypes(IRubyObject.class);
    private static final MethodType STANDARD_NATIVE_TYPE_NARG = STANDARD_NATIVE_TYPE.appendParameterTypes(IRubyObject[].class);
    private static final MethodType[] STANDARD_NATIVE_TYPES = {
        STANDARD_NATIVE_TYPE,
        STANDARD_NATIVE_TYPE_1ARG,
        STANDARD_NATIVE_TYPE_2ARG,
        STANDARD_NATIVE_TYPE_3ARG,
        STANDARD_NATIVE_TYPE_NARG,
    };
    
    private static final MethodType STANDARD_NATIVE_TYPE_BLOCK = STANDARD_NATIVE_TYPE.appendParameterTypes(Block.class);
    private static final MethodType STANDARD_NATIVE_TYPE_1ARG_BLOCK = STANDARD_NATIVE_TYPE_1ARG.appendParameterTypes(Block.class);
    private static final MethodType STANDARD_NATIVE_TYPE_2ARG_BLOCK = STANDARD_NATIVE_TYPE_2ARG.appendParameterTypes(Block.class);
    private static final MethodType STANDARD_NATIVE_TYPE_3ARG_BLOCK = STANDARD_NATIVE_TYPE_3ARG.appendParameterTypes(Block.class);
    private static final MethodType STANDARD_NATIVE_TYPE_NARG_BLOCK = STANDARD_NATIVE_TYPE_NARG.appendParameterTypes(Block.class);
    private static final MethodType[] STANDARD_NATIVE_TYPES_BLOCK = {
        STANDARD_NATIVE_TYPE_BLOCK,
        STANDARD_NATIVE_TYPE_1ARG_BLOCK,
        STANDARD_NATIVE_TYPE_2ARG_BLOCK,
        STANDARD_NATIVE_TYPE_3ARG_BLOCK,
        STANDARD_NATIVE_TYPE_NARG_BLOCK,
    };
    
    private static final MethodType TARGET_SELF = methodType(
            IRubyObject.class, // return value
            IRubyObject.class // self
            );
    private static final MethodType TARGET_SELF_1ARG = TARGET_SELF.appendParameterTypes(IRubyObject.class);
    private static final MethodType TARGET_SELF_2ARG = TARGET_SELF_1ARG.appendParameterTypes(IRubyObject.class);
    private static final MethodType TARGET_SELF_3ARG = TARGET_SELF_2ARG.appendParameterTypes(IRubyObject.class);
    private static final MethodType TARGET_SELF_NARG = TARGET_SELF.appendParameterTypes(IRubyObject[].class);
    private static final MethodType[] TARGET_SELF_ARGS = {
        TARGET_SELF,
        TARGET_SELF_1ARG,
        TARGET_SELF_2ARG,
        TARGET_SELF_3ARG,
        TARGET_SELF_NARG,
    };
    
    private static final MethodType TARGET_SELF_BLOCK = TARGET_SELF.appendParameterTypes(Block.class);
    private static final MethodType TARGET_SELF_1ARG_BLOCK = TARGET_SELF_1ARG.appendParameterTypes(Block.class);
    private static final MethodType TARGET_SELF_2ARG_BLOCK = TARGET_SELF_2ARG.appendParameterTypes(Block.class);
    private static final MethodType TARGET_SELF_3ARG_BLOCK = TARGET_SELF_3ARG.appendParameterTypes(Block.class);
    private static final MethodType TARGET_SELF_NARG_BLOCK = TARGET_SELF_NARG.appendParameterTypes(Block.class);
    private static final MethodType[] TARGET_SELF_ARGS_BLOCK = {
        TARGET_SELF_BLOCK,
        TARGET_SELF_1ARG_BLOCK,
        TARGET_SELF_2ARG_BLOCK,
        TARGET_SELF_3ARG_BLOCK,
        TARGET_SELF_NARG_BLOCK,
    };
    
    private static final MethodType TARGET_SELF_TC = TARGET_SELF.appendParameterTypes(ThreadContext.class);
    private static final MethodType TARGET_SELF_TC_1ARG = TARGET_SELF_TC.appendParameterTypes(IRubyObject.class);
    private static final MethodType TARGET_SELF_TC_2ARG = TARGET_SELF_TC_1ARG.appendParameterTypes(IRubyObject.class);
    private static final MethodType TARGET_SELF_TC_3ARG = TARGET_SELF_TC_2ARG.appendParameterTypes(IRubyObject.class);
    private static final MethodType TARGET_SELF_TC_NARG = TARGET_SELF_TC.appendParameterTypes(IRubyObject[].class);
    private static final MethodType[] TARGET_SELF_TC_ARGS = {
        TARGET_SELF_TC,
        TARGET_SELF_TC_1ARG,
        TARGET_SELF_TC_2ARG,
        TARGET_SELF_TC_3ARG,
        TARGET_SELF_TC_NARG,
    };
    
    private static final MethodType TARGET_SELF_TC_BLOCK = TARGET_SELF_TC.appendParameterTypes(Block.class);
    private static final MethodType TARGET_SELF_TC_1ARG_BLOCK = TARGET_SELF_TC_1ARG.appendParameterTypes(Block.class);
    private static final MethodType TARGET_SELF_TC_2ARG_BLOCK = TARGET_SELF_TC_2ARG.appendParameterTypes(Block.class);
    private static final MethodType TARGET_SELF_TC_3ARG_BLOCK = TARGET_SELF_TC_3ARG.appendParameterTypes(Block.class);
    private static final MethodType TARGET_SELF_TC_NARG_BLOCK = TARGET_SELF_TC_NARG.appendParameterTypes(Block.class);
    private static final MethodType[] TARGET_SELF_TC_ARGS_BLOCK = {
        TARGET_SELF_TC_BLOCK,
        TARGET_SELF_TC_1ARG_BLOCK,
        TARGET_SELF_TC_2ARG_BLOCK,
        TARGET_SELF_TC_3ARG_BLOCK,
        TARGET_SELF_TC_NARG_BLOCK,
    };
    
    private static final MethodType TARGET_TC_SELF = methodType(
            IRubyObject.class, // return value
            ThreadContext.class, //context
            IRubyObject.class // self
            );
    private static final MethodType TARGET_TC_SELF_1ARG = TARGET_TC_SELF.appendParameterTypes(IRubyObject.class);
    private static final MethodType TARGET_TC_SELF_2ARG = TARGET_TC_SELF_1ARG.appendParameterTypes(IRubyObject.class);
    private static final MethodType TARGET_TC_SELF_3ARG = TARGET_TC_SELF_2ARG.appendParameterTypes(IRubyObject.class);
    private static final MethodType TARGET_TC_SELF_NARG = TARGET_TC_SELF.appendParameterTypes(IRubyObject[].class);
    private static final MethodType[] TARGET_TC_SELF_ARGS = {
        TARGET_TC_SELF,
        TARGET_TC_SELF_1ARG,
        TARGET_TC_SELF_2ARG,
        TARGET_TC_SELF_3ARG,
        TARGET_TC_SELF_NARG,
    };
    
    private static final MethodType TARGET_TC_SELF_BLOCK = TARGET_TC_SELF.appendParameterTypes(Block.class);
    private static final MethodType TARGET_TC_SELF_1ARG_BLOCK = TARGET_TC_SELF_1ARG.appendParameterTypes(Block.class);
    private static final MethodType TARGET_TC_SELF_2ARG_BLOCK = TARGET_TC_SELF_2ARG.appendParameterTypes(Block.class);
    private static final MethodType TARGET_TC_SELF_3ARG_BLOCK = TARGET_TC_SELF_3ARG.appendParameterTypes(Block.class);
    private static final MethodType TARGET_TC_SELF_NARG_BLOCK = TARGET_TC_SELF_NARG.appendParameterTypes(Block.class);
    private static final MethodType[] TARGET_TC_SELF_ARGS_BLOCK = {
        TARGET_TC_SELF_BLOCK,
        TARGET_TC_SELF_1ARG_BLOCK,
        TARGET_TC_SELF_2ARG_BLOCK,
        TARGET_TC_SELF_3ARG_BLOCK,
        TARGET_TC_SELF_NARG_BLOCK
    };
    
    private static final int[] SELF_TC_PERMUTE = {2, 0};
    private static final int[] SELF_TC_1ARG_PERMUTE = {2, 0, 3};
    private static final int[] SELF_TC_2ARG_PERMUTE = {2, 0, 3, 4};
    private static final int[] SELF_TC_3ARG_PERMUTE = {2, 0, 3, 4, 5};
    private static final int[] SELF_TC_NARG_PERMUTE = {2, 0, 3};
    private static final int[][] SELF_TC_ARGS_PERMUTES = {
        SELF_TC_PERMUTE,
        SELF_TC_1ARG_PERMUTE,
        SELF_TC_2ARG_PERMUTE,
        SELF_TC_3ARG_PERMUTE,
        SELF_TC_NARG_PERMUTE
    };
    private static final int[] SELF_PERMUTE = {2};
    private static final int[] SELF_1ARG_PERMUTE = {2, 3};
    private static final int[] SELF_2ARG_PERMUTE = {2, 3, 4};
    private static final int[] SELF_3ARG_PERMUTE = {2, 3, 4, 5};
    private static final int[] SELF_NARG_PERMUTE = {2, 3};
    private static final int[][] SELF_ARGS_PERMUTES = {
        SELF_PERMUTE,
        SELF_1ARG_PERMUTE,
        SELF_2ARG_PERMUTE,
        SELF_3ARG_PERMUTE,
        SELF_NARG_PERMUTE
    };
    private static final int[] SELF_TC_BLOCK_PERMUTE = {2, 0, 3};
    private static final int[] SELF_TC_1ARG_BLOCK_PERMUTE = {2, 0, 3, 4};
    private static final int[] SELF_TC_2ARG_BLOCK_PERMUTE = {2, 0, 3, 4, 5};
    private static final int[] SELF_TC_3ARG_BLOCK_PERMUTE = {2, 0, 3, 4, 5, 6};
    private static final int[] SELF_TC_NARG_BLOCK_PERMUTE = {2, 0, 3, 4};
    private static final int[][] SELF_TC_ARGS_BLOCK_PERMUTES = {
        SELF_TC_BLOCK_PERMUTE,
        SELF_TC_1ARG_BLOCK_PERMUTE,
        SELF_TC_2ARG_BLOCK_PERMUTE,
        SELF_TC_3ARG_BLOCK_PERMUTE,
        SELF_TC_NARG_BLOCK_PERMUTE
    };
    private static final int[] SELF_BLOCK_PERMUTE = {2, 3};
    private static final int[] SELF_1ARG_BLOCK_PERMUTE = {2, 3, 4};
    private static final int[] SELF_2ARG_BLOCK_PERMUTE = {2, 3, 4, 5};
    private static final int[] SELF_3ARG_BLOCK_PERMUTE = {2, 3, 4, 5, 6};
    private static final int[] SELF_NARG_BLOCK_PERMUTE = {2, 3, 4};
    private static final int[][] SELF_ARGS_BLOCK_PERMUTES = {
        SELF_BLOCK_PERMUTE,
        SELF_1ARG_BLOCK_PERMUTE,
        SELF_2ARG_BLOCK_PERMUTE,
        SELF_3ARG_BLOCK_PERMUTE,
        SELF_NARG_BLOCK_PERMUTE
    };
    private static final int[] TC_SELF_PERMUTE = {0, 2};
    private static final int[] TC_SELF_1ARG_PERMUTE = {0, 2, 3};
    private static final int[] TC_SELF_2ARG_PERMUTE = {0, 2, 3, 4};
    private static final int[] TC_SELF_3ARG_PERMUTE = {0, 2, 3, 4, 5};
    private static final int[] TC_SELF_NARG_PERMUTE = {0, 2, 3};
    private static final int[][] TC_SELF_ARGS_PERMUTES = {
        TC_SELF_PERMUTE,
        TC_SELF_1ARG_PERMUTE,
        TC_SELF_2ARG_PERMUTE,
        TC_SELF_3ARG_PERMUTE,
        TC_SELF_NARG_PERMUTE,
    };
    private static final int[] TC_SELF_BLOCK_PERMUTE = {0, 2, 3};
    private static final int[] TC_SELF_1ARG_BLOCK_PERMUTE = {0, 2, 3, 4};
    private static final int[] TC_SELF_2ARG_BLOCK_PERMUTE = {0, 2, 3, 4, 5};
    private static final int[] TC_SELF_3ARG_BLOCK_PERMUTE = {0, 2, 3, 4, 5, 6};
    private static final int[] TC_SELF_NARG_BLOCK_PERMUTE = {0, 2, 3, 4};
    private static final int[][] TC_SELF_ARGS_BLOCK_PERMUTES = {
        TC_SELF_BLOCK_PERMUTE,
        TC_SELF_1ARG_BLOCK_PERMUTE,
        TC_SELF_2ARG_BLOCK_PERMUTE,
        TC_SELF_3ARG_BLOCK_PERMUTE,
        TC_SELF_NARG_BLOCK_PERMUTE,
    };
    private static final int[] TC_SELF_BLOCK_PERMUTE_1 = {0, 2, 4};
    private static final int[] TC_SELF_BLOCK_PERMUTE_2 = {0, 2, 5};
    private static final int[] TC_SELF_BLOCK_PERMUTE_3 = {0, 2, 6};
    private static final int[] TC_SELF_BLOCK_PERMUTE_N = {0, 2, 4};
    private static final int[][] TC_SELF_BLOCK_PERMUTES = {
            TC_SELF_BLOCK_PERMUTE,
            TC_SELF_BLOCK_PERMUTE_1,
            TC_SELF_BLOCK_PERMUTE_2,
            TC_SELF_BLOCK_PERMUTE_3,
            TC_SELF_BLOCK_PERMUTE_N,
    };
}
