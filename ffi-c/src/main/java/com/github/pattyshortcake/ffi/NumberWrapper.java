package com.github.pattyshortcake.ffi;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.MemorySession;
import java.lang.foreign.SegmentAllocator;

import com.github.pattyshortcake.ffi.jextract.Number;

public class NumberWrapper {
    private final MemorySession memorySession;
    private final MemorySegment memorySegment;

    public NumberWrapper(MemorySession memorySession) {
        this(memorySession, MemorySegment.allocateNative(Number.$LAYOUT(), memorySession));
    }

    public NumberWrapper(MemorySession memorySession, MemorySegment memorySegment) {
        this.memorySession = memorySession;
        this.memorySegment = memorySegment;
    }

    public void setN(double n) {
        Number.n$set(memorySegment, n);
    }

    public double getN() {
       return Number.n$get(memorySegment);
    }

    public NumberWrapper add(NumberWrapper value) {
        SegmentAllocator segmentAllocator = SegmentAllocator.newNativeArena(memorySession);
        MemorySegment sum = com.github.pattyshortcake.ffi.jextract.ffi_h.sum_numbers(segmentAllocator, memorySegment, value.memorySegment);

        return new NumberWrapper(memorySession, sum);
    }

}
