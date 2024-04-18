package com.anirudhology.leetcoding.dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MinimumPathSumTest {

    private final MinimumPathSum minimumPathSum = new MinimumPathSum();

    // Test null input
    @Test
    public void testMinPathSumOneNullInput() {
        int[][] grid = null;
        assertThrows(IllegalArgumentException.class, () -> minimumPathSum.minPathSumOne(grid));
        assertThrows(IllegalArgumentException.class, () -> minimumPathSum.minPathSumTwo(grid));
    }

    // Test grid with empty rows
    @Test
    public void testMinPathSumOneEmptyRows() {
        int[][] grid = {};
        assertThrows(IllegalArgumentException.class, () -> minimumPathSum.minPathSumOne(grid));
        assertThrows(IllegalArgumentException.class, () -> minimumPathSum.minPathSumTwo(grid));
    }

    // Test grid with single row and single column
    @Test
    public void testMinPathSumOneSingleRowSingleColumnGrid() {
        int[][] grid = {{1}};
        assertEquals(1, minimumPathSum.minPathSumOne(grid));
        assertEquals(1, minimumPathSum.minPathSumTwo(grid));
    }

    // Test grid with single row and multiple columns
    @Test
    public void testMinPathSumOneSingleRowMultipleColumnsGrid() {
        int[][] grid = {{1, 2, 3}};
        assertEquals(6, minimumPathSum.minPathSumOne(grid));
        assertEquals(6, minimumPathSum.minPathSumTwo(grid));
    }

    // Test grid with multiple rows and single column
    @Test
    public void testMinPathSumOneMultipleRowsSingleColumnGrid() {
        int[][] grid = {{1}, {2}, {3}};
        assertEquals(6, minimumPathSum.minPathSumOne(grid));
        assertEquals(6, minimumPathSum.minPathSumTwo(grid));
    }

    // Test grid with multiple rows and multiple columns
    @Test
    public void testMinPathSumOneMultipleRowsMultipleColumnsGrid() {
        int[][] grid = {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        assertEquals(7, minimumPathSum.minPathSumOne(grid));
        assertEquals(7, minimumPathSum.minPathSumTwo(grid));
    }
}