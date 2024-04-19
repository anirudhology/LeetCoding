package com.anirudhology.leetcoding.dynamicprogramming;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class TriangleTest {

    private final Triangle triangle = new Triangle();

    // Test null input
    @Test
    public void testMinimumTotalNullInput() {
        List<List<Integer>> triangleList = null;
        assertThrows(IllegalArgumentException.class, () -> triangle.minimumTotal(triangleList));
    }

    // Test empty list
    @Test
    public void testMinimumTotalEmptyList() {
        List<List<Integer>> triangleList = List.of();
        assertThrows(IllegalArgumentException.class, () -> triangle.minimumTotal(triangleList));
    }

    // Test triangle with a single row
    @Test
    public void testMinimumTotalSingleRow() {
        List<List<Integer>> triangleList = List.of(
                List.of(2)
        );
        assertEquals(2, triangle.minimumTotal(triangleList));
    }

    // Test triangle with multiple rows
    @Test
    public void testMinimumTotalMultipleRows() {
        List<List<Integer>> triangleList = Arrays.asList(
                List.of(2),
                Arrays.asList(3, 4),
                Arrays.asList(6, 5, 7),
                Arrays.asList(4, 1, 8, 3)
        );
        assertEquals(11, triangle.minimumTotal(triangleList));
    }
}