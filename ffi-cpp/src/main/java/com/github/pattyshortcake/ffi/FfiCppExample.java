package com.github.pattyshortcake.ffi;

import com.github.pattyshortcake.ffi.jextract.ffi_h;

public class FfiCppExample {

    static void printHelloWorld() {
        System.out.println("Before Hello");
        ffi_h.print_hello_world();
        System.out.println("After Hello");
    }

    static int sum(int a, int b) {
        int sum = ffi_h.sum(a, b);
        System.out.println( String.format("%d + %d = %d", a, b, sum));
        return sum;
    }

//    static double sumNumbers(double a, double b) {
//        try(var session = MemorySession.openConfined()) {
//            MemorySegment number1 = MemorySegment.allocateNative(Number.$LAYOUT(), session);
//            Number.n$set(number1, a);
//
//            MemorySegment number2 = MemorySegment.allocateNative(Number.$LAYOUT(), session);
//            Number.n$set(number2, b);
//
//            SegmentAllocator segmentAllocator = SegmentAllocator.newNativeArena(session);
//            MemorySegment sum = ffi_h.sum_numbers(segmentAllocator, number1, number2);
//
//            double sumValue = Number.n$get(sum);
//
//            System.out.println( String.format("%f + %f = %f", a, b, sumValue));
//
//            return sumValue;
//        }
//    }

    public static void main(String[] args) {
        printHelloWorld();
        sum(1, 3);
//        sumNumbers(1.2, 7.8);
    }
}
