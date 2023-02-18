package ru.zrs.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author zrs
 */
class FibonacciNumberTest {

    FibonacciNumber fibonacciNumber = new FibonacciNumber();

    @Test
    void fib() {
        assertEquals(1, fibonacciNumber.fib(2));
        assertEquals(2, fibonacciNumber.fib(3));
        assertEquals(3, fibonacciNumber.fib(4));

        assertEquals(1, fibonacciNumber.fibSlowRecursive(2));
        assertEquals(2, fibonacciNumber.fibSlowRecursive(3));
        assertEquals(3, fibonacciNumber.fibSlowRecursive(4));

        assertEquals(1, fibonacciNumber.fibCorrectRecursive(2));
        assertEquals(2, fibonacciNumber.fibCorrectRecursive(3));
        assertEquals(3, fibonacciNumber.fibCorrectRecursive(4));
    }
}