package com.github.pattyshortcake.ffi;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class FfiCppExampleTest {

    @Test
    void printHelloWorld() {
        FfiCppExample.printHelloWorld();
    }

    @Test
    void sum() {
        // Given
        int a = 3;
        int b = 4;

        // When
        int actual = FfiCppExample.sum(a, b);

        // Then
        Assertions.assertThat(actual).isEqualTo(7);
    }

    @Test
    void sumNumbers() {
        // Given
        double a = 2.3D;
        double b = 4.5D;

        // When
        double actual = FfiCppExample.sumNumbers(a, b);

        // Then
        Assertions.assertThat(actual).isEqualTo(6.8D);
    }

}