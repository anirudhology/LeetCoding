package com.anirudhology.leetcoding.dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MinimumPathSumTest {

    private final MinimumPathSum minimumPathSum = new MinimumPathSum();

    // Test null input
    @Test
    public void testMinPathSumNullInput() {
        int[][] grid = null;
        assertThrows(IllegalArgumentException.class, () -> minimumPathSum.minPathSum(grid));
    }

    // Test grid with empty rows
    @Test
    public void testMinPathSumEmptyRows() {
        int[][] grid = {};
        assertThrows(IllegalArgumentException.class, () -> minimumPathSum.minPathSum(grid));
    }

    // Test grid with single row and single column
    @Test
    public void testMinPathSumSingleRowSingleColumnGrid() {
        int[][] grid = {{1}};
        assertEquals(1, minimumPathSum.minPathSum(grid));
    }

    // Test grid with single row and multiple columns
    @Test
    public void testMinPathSumSingleRowMultipleColumnsGrid() {
        int[][] grid = {{1, 2, 3}};
        assertEquals(6, minimumPathSum.minPathSum(grid));
    }

    // Test grid with multiple rows and single column
    @Test
    public void testMinPathSumMultipleRowsSingleColumnGrid() {
        int[][] grid = {{1}, {2}, {3}};
        assertEquals(6, minimumPathSum.minPathSum(grid));
    }

    // Test grid with multiple rows and multiple columns
    @Test
    public void testMinPathSumMultipleRowsMultipleColumnsGrid() {
        int[][] grid = {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        assertEquals(7, minimumPathSum.minPathSum(grid));
    }
}