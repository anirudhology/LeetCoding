package com.anirudhology.leetcoding.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ThreeSumClosestTest {

    private final ThreeSumClosest threeSumClosest = new ThreeSumClosest();

    @Test
    public void testThreeSumClosest() {
        // Test case with the smallest possible input array
        assertEquals(0, threeSumClosest.threeSumClosest(new int[]{}, 10));

        // Test case with null input
        assertEquals(0, threeSumClosest.threeSumClosest(null, 10));

        // Test case with array length less than 3
        assertEquals(0, threeSumClosest.threeSumClosest(new int[]{1, 2}, 10));

        // Test case with closest sum in the middle
        assertEquals(2, threeSumClosest.threeSumClosest(new int[]{-1, 2, 1}, 1));

        // Test case with the closest sum at the beginning
        assertEquals(2, threeSumClosest.threeSumClosest(new int[]{-1, 2, 1}, 0));

        // Test case with the closest sum at the end
        assertEquals(4, threeSumClosest.threeSumClosest(new int[]{-1, 2, 3}, 10));

        // Test case with negative numbers
        assertEquals(-6, threeSumClosest.threeSumClosest(new int[]{-1, -2, -3}, 1));

        // Test case with all numbers being the same
        assertEquals(9, threeSumClosest.threeSumClosest(new int[]{3, 3, 3, 3}, 10));

        // Test case with target being a number in the array
        assertEquals(6, threeSumClosest.threeSumClosest(new int[]{1, 2, 3, 4, 5}, 6));
    }
}