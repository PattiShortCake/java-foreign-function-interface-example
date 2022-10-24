package com.github.pattyshortcake.ffi;

import com.github.pattyshortcake.ffi.jextract.Ffi_h;
import com.github.pattyshortcake.ffi.jextract.NumberC;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.MemorySession;
import java.lang.foreign.SegmentAllocator;


public class FfiCppExample {

    static void printHelloWorld() {
        System.out.println("Before Hello");
        Ffi_h.print_hello_world();
        System.out.println("After Hello");
    }

    static int sum(int a, int b) {
        int sum = Ffi_h.sum(a, b);
        System.out.println( String.format("%d + %d = %d", a, b, sum));
        return sum;
    }

    static double sumNumbers(double a, double b) {
        try(var session = MemorySession.openConfined()) {
            MemorySegment number1 = MemorySegment.allocateNative(NumberC.$LAYOUT(), session);
            NumberC.value$set(number1, a);

            MemorySegment number2 = MemorySegment.allocateNative(NumberC.$LAYOUT(), session);
            NumberC.value$set(number2, b);

            SegmentAllocator segmentAllocator = SegmentAllocator.newNativeArena(session);
            MemorySegment sum = Ffi_h.sum_numbers(segmentAllocator, number1, number2);

            double sumValue = NumberC.value$get(sum);

            System.out.println( String.format("%f + %f = %f", a, b, sumValue));

            return sumValue;
        }
    }

    public static void main(String[] args) {
        printHelloWorld();
        sum(1, 3);
        sumNumbers(1.2, 7.8);
    }
}
