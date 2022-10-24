package com.github.pattyshortcake.ffi;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class FfiExampleTest {

    @Test
    void printHelloWorld() {
        FfiExample.printHelloWorld();
    }

    @Test
    void sum() {
        // Given
        int a = 3;
        int b = 4;

        // When
        int actual = FfiExample.sum(a, b);

        // Then
        Assertions.assertThat(actual).isEqualTo(7);
    }

    @Test
    void sumNumbers() {
        // Given
        double a = 2.3D;
        double b = 4.5D;

        // When
        double actual = FfiExample.sumNumbers(a, b);

        // Then
        Assertions.assertThat(actual).isEqualTo(6.8D);
    }

    @Test
    void sumNumbersUsingWrapper() {
        // Given
        double a = 2.3D;
        double b = 4.5D;

        // When
        double actual = FfiExample.sumNumbersUsingWrapper(a, b);

        // Then
        Assertions.assertThat(actual).isEqualTo(6.8D);
    }

}