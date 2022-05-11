package com.munywele.dynamic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    Fibonacci fibonacci;

    @BeforeEach
    void setUp() {
        fibonacci = new Fibonacci();
    }

    @Test
    void compute_fibonacci() {
        int result = fibonacci.getFibonacci(8);

        assertEquals(21, result);
    }
}