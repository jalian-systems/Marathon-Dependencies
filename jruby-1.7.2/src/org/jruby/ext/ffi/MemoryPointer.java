
package org.jruby.ext.ffi;


import org.jruby.Ruby;
import org.jruby.RubyClass;
import org.jruby.RubyFixnum;
import org.jruby.RubyModule;
import org.jruby.RubyNumeric;
import org.jruby.RubyString;
import org.jruby.anno.JRubyClass;
import org.jruby.anno.JRubyMethod;
import org.jruby.exceptions.RaiseException;
import org.jruby.runtime.Block;
import org.jruby.runtime.ObjectAllocator;
import org.jruby.runtime.ThreadContext;
import org.jruby.runtime.builtin.IRubyObject;
import static org.jruby.runtime.Visibility.*;

@JRubyClass(name = "FFI::MemoryPointer", parent = "FFI::Pointer")
public final class MemoryPointer extends Pointer {
    
    public static RubyClass createMemoryPointerClass(Ruby runtime, RubyModule module) {
        RubyClass result = module.defineClassUnder("MemoryPointer",
                module.getClass("Pointer"),
                MemoryPointerAllocator.INSTANCE);
        result.defineAnnotatedMethods(MemoryPointer.class);
        result.defineAnnotatedConstants(MemoryPointer.class);

        return result;
    }

    private static final class MemoryPointerAllocator implements ObjectAllocator {
        static final ObjectAllocator INSTANCE = new MemoryPointerAllocator();

        public IRubyObject allocate(Ruby runtime, RubyClass klazz) {
            return new MemoryPointer(runtime, klazz);
        }
    }


    private MemoryPointer(Ruby runtime, IRubyObject klass) {
        super(runtime, (RubyClass) klass);
    }

    private MemoryPointer(Ruby runtime, IRubyObject klass, DirectMemoryIO io, long total, int typeSize) {
        super(runtime, (RubyClass) klass, io, total, typeSize);
    }

    private final IRubyObject init(ThreadContext context, IRubyObject rbTypeSize, int count, int align, boolean clear, Block block) {
        typeSize = calculateTypeSize(context, rbTypeSize);
        size = typeSize * count;
        if (size < 0) {
            throw context.runtime.newArgumentError(String.format("Negative size (%d objects of %d size)", count, typeSize));
        }
        setMemoryIO(Factory.getInstance().allocateDirectMemory(context.runtime,
                size > 0 ? (int) size : 1, align, clear));
        if (getMemoryIO() == null) {
            Ruby runtime = context.runtime;
            throw new RaiseException(runtime, runtime.getNoMemoryError(),
                    String.format("Failed to allocate %d objects of %d bytes", typeSize, count), true);
        }
        
        if (block.isGiven()) {
            try {
                return block.yield(context, this);
            } finally {
                ((AllocatedDirectMemoryIO) getMemoryIO()).free();
                setMemoryIO(new FreedMemoryIO(context.runtime));
            }
        } else {
            return this;
        }
    }

    static MemoryPointer allocate(Ruby runtime, int typeSize, int count, boolean clear) {
        return newInstance(runtime, runtime.getFFI().memptrClass, typeSize, count, clear);
    }

    static MemoryPointer newInstance(Ruby runtime, IRubyObject klass, int typeSize, int count, boolean clear) {
        final int total = typeSize * count;
        AllocatedDirectMemoryIO io = Factory.getInstance().allocateDirectMemory(runtime, total > 0 ? total : 1, clear);
        if (io == null) {
            throw new RaiseException(runtime, runtime.getNoMemoryError(),
                    String.format("Failed to allocate %d objects of %d bytes", count, typeSize), true);
        }

        return new MemoryPointer(runtime, klass, io, total, typeSize);
    }


    @JRubyMethod(name = "new", meta = true)
    public static IRubyObject newInstance(ThreadContext context, IRubyObject klass, IRubyObject sizeArg) {
        if (klass == context.runtime.getFFI().memptrClass) {
            return newInstance(context.runtime, klass, calculateTypeSize(context, sizeArg), 1, true);

        } else {
            return ((RubyClass) klass).newInstance(context, sizeArg, Block.NULL_BLOCK);
        }
    }

    @JRubyMethod(name = "new", meta = true)
    public static IRubyObject newInstance(ThreadContext context, IRubyObject klass, IRubyObject sizeArg,
                                          IRubyObject countArg) {

        if (klass == context.runtime.getFFI().memptrClass) {
            return newInstance(context.runtime, klass,
                    calculateTypeSize(context, sizeArg), RubyFixnum.fix2int(countArg), true);

        } else {
            return ((RubyClass) klass).newInstance(context, sizeArg, countArg, Block.NULL_BLOCK);
        }
    }

    @JRubyMethod(name = "new", meta = true)
    public static IRubyObject newInstance(ThreadContext context, IRubyObject klass, IRubyObject sizeArg,
                                          IRubyObject countArg, IRubyObject clear) {
        if (klass == context.runtime.getFFI().memptrClass) {
            return newInstance(context.runtime, klass,
                    calculateTypeSize(context, sizeArg), RubyFixnum.fix2int(countArg), clear.isTrue());

        } else {
            return ((RubyClass) klass).newInstance(context, sizeArg, countArg, clear, Block.NULL_BLOCK);
        }
    }

    @JRubyMethod(name = "new", meta = true, rest = true)
    public static IRubyObject newInstance(ThreadContext context, IRubyObject klass, IRubyObject[] args) {
        if (klass == context.runtime.getFFI().memptrClass) {
            switch (args.length) {
                case 1:
                    return newInstance(context, klass, args[0]);

                case 2:
                    return newInstance(context, klass, args[0], args[1]);

                case 3:
                    return newInstance(context, klass, args[0], args[1], args[2]);

                default:
                    return ((RubyClass) klass).newInstance(context, args, Block.NULL_BLOCK);
            }
        } else {
            return ((RubyClass) klass).newInstance(context, args, Block.NULL_BLOCK);
        }
    }

    @JRubyMethod(name = "from_string", meta = true)
    public static IRubyObject from_string(ThreadContext context, IRubyObject klass, IRubyObject s) {
        org.jruby.util.ByteList bl = s.convertToString().getByteList();
        MemoryPointer ptr = klass == context.runtime.getFFI().memptrClass
            ? newInstance(context.runtime, klass, 1, bl.length() + 1, false)
            : (MemoryPointer) newInstance(context, klass, context.runtime.newFixnum(bl.length() + 1));
        ptr.getMemoryIO().putZeroTerminatedByteArray(0, bl.unsafeBytes(), bl.begin(), bl.length());

        return ptr;
    }

    @JRubyMethod(name = { "initialize" }, visibility = PRIVATE)
    public final IRubyObject initialize(ThreadContext context, IRubyObject sizeArg, Block block) {
        return sizeArg instanceof RubyFixnum
                ? init(context, RubyFixnum.one(context.runtime),
                    RubyFixnum.fix2int(sizeArg), 1, true, block)
                : init(context, sizeArg, 1, 1, true, block);
    }
    
    @JRubyMethod(name = { "initialize" }, visibility = PRIVATE)
    public final IRubyObject initialize(ThreadContext context, IRubyObject sizeArg, IRubyObject count, Block block) {
        return init(context, sizeArg, RubyNumeric.fix2int(count), 1, true, block);
    }
    
    @JRubyMethod(name = { "initialize" }, visibility = PRIVATE)
    public final IRubyObject initialize(ThreadContext context,
            IRubyObject sizeArg, IRubyObject count, IRubyObject clear, Block block) {
        return init(context, sizeArg, RubyNumeric.fix2int(count), 1, clear.isTrue(), block);
    }
    
    @Override
    public final String toString() {
        return String.format("MemoryPointer[address=%#x, size=%d]", getAddress(), size);
    }

    @JRubyMethod(name = "==", required = 1)
    public IRubyObject op_equal(ThreadContext context, IRubyObject obj) {
        return context.runtime.newBoolean(this == obj
                || getAddress() == 0L && obj.isNil()
                || (obj instanceof MemoryPointer
                && ((MemoryPointer) obj).getAddress() == getAddress())
                && ((MemoryPointer) obj).getSize() == getSize());
    }
    
    @JRubyMethod(name = "free")
    public final IRubyObject free(ThreadContext context) {
        ((AllocatedDirectMemoryIO) getMemoryIO()).free();
        // Replace memory object with one that throws an exception on any access
        setMemoryIO(new FreedMemoryIO(context.runtime));
        return context.runtime.getNil();
    }

    @JRubyMethod(name = "autorelease=", required = 1)
    public final IRubyObject autorelease(ThreadContext context, IRubyObject release) {
        ((AllocatedDirectMemoryIO) getMemoryIO()).setAutoRelease(release.isTrue());
        return context.runtime.getNil();
    }

    @JRubyMethod(name = "autorelease?")
    public final IRubyObject autorelease_p(ThreadContext context) {
        return context.runtime.newBoolean(((AllocatedDirectMemoryIO) getMemoryIO()).isAutoRelease());
    }
}
