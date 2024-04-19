package com.anirudhology.leetcoding.dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MinimumFallingPathSumTest {

    private final MinimumFallingPathSum minimumFallingPathSum = new MinimumFallingPathSum();

    // Test null input
    @Test
    public void testMinFallingPathSumNullInput() {
        int[][] matrix = null;
        assertThrows(IllegalArgumentException.class, () -> minimumFallingPathSum.minFallingPathSum(matrix));
    }

    // Test matrix with empty rows
    @Test
    public void testMinFallingPathSumEmptyRows() {
        int[][] matrix = {};
        assertThrows(IllegalArgumentException.class, () -> minimumFallingPathSum.minFallingPathSum(matrix));
    }

    // Test square matrix with a single element
    @Test
    public void testMinFallingPathSumSingleElementMatrix() {
        int[][] matrix = {{1}};
        assertEquals(1, minimumFallingPathSum.minFallingPathSum(matrix));
    }

    // Test square matrix with multiple elements
    @Test
    public void testMinFallingPathSumSquareMatrix() {
        int[][] matrix = {{2, 1, 3}, {6, 5, 4}, {9, 7, 8}};
        assertEquals(12, minimumFallingPathSum.minFallingPathSum(matrix));
    }

    // Test rectangular matrix
    @Test
    public void testMinFallingPathSumRectangularMatrix() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        assertEquals(5, minimumFallingPathSum.minFallingPathSum(matrix));
    }
}