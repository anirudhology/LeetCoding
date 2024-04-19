package com.anirudhology.leetcoding.dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PerfectSquaresTest {

    private final PerfectSquares perfectSquares = new PerfectSquares();

    // Test negative input
    @Test
    public void testNumSquaresNegativeInput() {
        int n = -10;
        assertThrows(IllegalArgumentException.class, () -> perfectSquares.numSquares(n));
    }

    // Test zero input
    @Test
    public void testNumSquaresZeroInput() {
        int n = 0;
        assertThrows(IllegalArgumentException.class, () -> perfectSquares.numSquares(n));
    }

    // Test perfect square input
    @Test
    public void testNumSquaresPerfectSquareInput() {
        int n = 16;
        assertEquals(1, perfectSquares.numSquares(n));
    }

    // Test non-perfect square input
    @Test
    public void testNumSquaresNonPerfectSquareInput() {
        int n = 12;
        assertEquals(3, perfectSquares.numSquares(n));
    }

    // Test large input
    @Test
    public void testNumSquaresLargeInput() {
        int n = 100;
        assertEquals(1, perfectSquares.numSquares(n));
    }
}