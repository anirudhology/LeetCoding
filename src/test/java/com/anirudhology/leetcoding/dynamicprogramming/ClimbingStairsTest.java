package com.anirudhology.leetcoding.dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClimbingStairsTest {

    private final ClimbingStairs climbingStairs = new ClimbingStairs();

    @Test
    void testClimbStairsNormalCase() {
        // Normal case: n = 1
        assertEquals(1, climbingStairs.climbStairs(1));

        // Normal case: n = 2
        assertEquals(2, climbingStairs.climbStairs(2));

        // Normal case: n = 3
        assertEquals(3, climbingStairs.climbStairs(3));

        // Normal case: n = 4
        assertEquals(5, climbingStairs.climbStairs(4));

        // Normal case: n = 5
        assertEquals(8, climbingStairs.climbStairs(5));
    }

    @Test
    void testClimbStairsSpecialCase() {
        // Special case: n = 0
        IllegalArgumentException exception1 = assertThrows(IllegalArgumentException.class, () -> climbingStairs.climbStairs(0));
        assertEquals("There can't be negative or zero stairs.", exception1.getMessage());

        // Special case: n = -1
        IllegalArgumentException exception2 = assertThrows(IllegalArgumentException.class, () -> climbingStairs.climbStairs(-1));
        assertEquals("There can't be negative or zero stairs.", exception2.getMessage());
    }
}