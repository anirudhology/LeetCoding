package com.anirudhology.leetcoding.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    private final TwoSum twoSum = new TwoSum();

    @Test
    void testTwoSum() {
        // Test case 1: Valid input
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] expected1 = {0, 1};
        assertArrayEquals(expected1, twoSum.twoSum(nums1, target1));

        // Test case 2: Empty array
        int[] nums2 = {};
        int target2 = 9;
        IllegalArgumentException exception2 = assertThrows(IllegalArgumentException.class, () -> twoSum.twoSum(nums2, target2));
        assertEquals("Array must have at least two elements.", exception2.getMessage());

        // Test case 3: Null array
        int[] nums3 = null;
        int target3 = 9;
        IllegalArgumentException exception3 = assertThrows(IllegalArgumentException.class, () -> twoSum.twoSum(nums3, target3));
        assertEquals("Array must have at least two elements.", exception3.getMessage());

        // Test case 4: No solution
        int[] nums4 = {1, 2, 3, 4};
        int target4 = 9;
        IllegalArgumentException exception4 = assertThrows(IllegalArgumentException.class, () -> twoSum.twoSum(nums4, target4));
        assertEquals("Invalid input(s).", exception4.getMessage());
    }
}