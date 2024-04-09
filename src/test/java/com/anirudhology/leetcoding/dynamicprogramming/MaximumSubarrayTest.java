package com.anirudhology.leetcoding.dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumSubarrayTest {

    private final MaximumSubarray maximumSubarray = new MaximumSubarray();

    @Test
    void testMaxSubArrayNormalCase() {
        // Normal case: array with both positive and negative numbers
        int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        assertEquals(6, maximumSubarray.maxSubArray(nums1));

        // Normal case: array with all positive numbers
        int[] nums2 = {1, 2, 3, 4, 5};
        assertEquals(15, maximumSubarray.maxSubArray(nums2));

        // Normal case: array with all negative numbers
        int[] nums3 = {-5, -4, -3, -2, -1};
        assertEquals(-1, maximumSubarray.maxSubArray(nums3));
    }

    @Test
    void testMaxSubArraySpecialCase() {
        // Special case: empty array
        int[] nums4 = {};
        IllegalArgumentException exception1 = assertThrows(IllegalArgumentException.class, () -> maximumSubarray.maxSubArray(nums4));
        assertEquals("Array cannot be empty or null.", exception1.getMessage());

        // Special case: null array
        int[] nums5 = null;
        IllegalArgumentException exception2 = assertThrows(IllegalArgumentException.class, () -> maximumSubarray.maxSubArray(nums5));
        assertEquals("Array cannot be empty or null.", exception2.getMessage());

        // Special case: single element
        int[] nums6 = {5};
        assertEquals(5, maximumSubarray.maxSubArray(nums6));
    }
}