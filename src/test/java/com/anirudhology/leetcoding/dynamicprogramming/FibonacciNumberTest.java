package com.anirudhology.leetcoding.dynamicprogramming;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FibonacciNumberTest {

    private final FibonacciNumber fibonacciNumber = new FibonacciNumber();
    private final List<Integer> expected = List.of(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610,
            987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040);

    @Test
    void testRecursive() {
        for (int i = 1; i <= 30 ; i++) {
            assertEquals(expected.get(i), fibonacciNumber.fibRecursive(i));
        }
    }

    @Test
    void testMemoized() {
        for (int i = 1; i <= 30 ; i++) {
            assertEquals(expected.get(i), fibonacciNumber.fibMemoized(i));
        }
    }
}