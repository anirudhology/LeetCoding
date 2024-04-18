package com.anirudhology.leetcoding.dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MinCostClimbingStairsTest {

    private final MinCostClimbingStairs minCostClimbingStairs = new MinCostClimbingStairs();

    // Test null input for both methods
    @Test
    public void testMinCostClimbingStairsNullInput() {
        int[] cost = null;
        assertThrows(IllegalArgumentException.class, () -> minCostClimbingStairs.minCostClimbingStairsOne(cost));
        assertThrows(IllegalArgumentException.class, () -> minCostClimbingStairs.minCostClimbingStairsTwo(cost));
    }

    // Test array with no elements for both methods
    @Test
    public void testMinCostClimbingStairsEmptyArray() {
        int[] cost = {};
        assertThrows(IllegalArgumentException.class, () -> minCostClimbingStairs.minCostClimbingStairsOne(cost));
        assertThrows(IllegalArgumentException.class, () -> minCostClimbingStairs.minCostClimbingStairsTwo(cost));
    }

    // Test array with single element for both methods
    @Test
    public void testMinCostClimbingStairsSingleElementArray() {
        int[] cost = {10};
        assertThrows(IllegalArgumentException.class, () -> minCostClimbingStairs.minCostClimbingStairsOne(cost));
        assertThrows(IllegalArgumentException.class, () -> minCostClimbingStairs.minCostClimbingStairsTwo(cost));
    }

    // Test array with two elements for both methods
    @Test
    public void testMinCostClimbingStairsTwoElementArray() {
        int[] cost = {10, 15};
        assertEquals(10, minCostClimbingStairs.minCostClimbingStairsOne(cost));
        assertEquals(10, minCostClimbingStairs.minCostClimbingStairsTwo(cost));
    }

    // Test array with more than two elements for both methods
    @Test
    public void testMinCostClimbingStairsMultipleElementArray() {
        int[] cost = {10, 15, 20, 25};
        assertEquals(30, minCostClimbingStairs.minCostClimbingStairsOne(cost));
        assertEquals(30, minCostClimbingStairs.minCostClimbingStairsTwo(cost));
    }
}