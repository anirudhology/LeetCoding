package com.anirudhology.leetcoding.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquaresOfSortedArrayTest {

    private final SquaresOfSortedArray squaresOfSortedArray = new SquaresOfSortedArray();

    @Test
    void testSortedSquaresNormalCase() {
        // Normal case: sorted array with positive and negative numbers
        int[] nums1 = {-4, -1, 0, 3, 10};
        int[] expected1 = {0, 1, 9, 16, 100};
        assertArrayEquals(expected1, squaresOfSortedArray.sortedSquares(nums1));

        // Normal case: sorted array with all negative numbers
        int[] nums2 = {-7, -3, -2, -1};
        int[] expected2 = {1, 4, 9, 49};
        assertArrayEquals(expected2, squaresOfSortedArray.sortedSquares(nums2));

        // Normal case: sorted array with all positive numbers
        int[] nums3 = {1, 2, 3, 4, 5};
        int[] expected3 = {1, 4, 9, 16, 25};
        assertArrayEquals(expected3, squaresOfSortedArray.sortedSquares(nums3));
    }

    @Test
    void testSortedSquaresSpecialCase() {
        // Special case: empty array
        int[] nums4 = {};
        int[] expected4 = {};
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> squaresOfSortedArray.sortedSquares(nums4));
        assertEquals("Array cannot be null or empty.", exception.getMessage());

        // Special case: null array
        int[] nums5 = null;
        exception = assertThrows(IllegalArgumentException.class, () -> squaresOfSortedArray.sortedSquares(nums5));
        assertEquals("Array cannot be null or empty.", exception.getMessage());
    }

    @Test
    void testSortedSquaresSingleElement() {
        // Single element in the array
        int[] nums6 = {5};
        int[] expected6 = {25};
        assertArrayEquals(expected6, squaresOfSortedArray.sortedSquares(nums6));

        // Single negative element in the array
        int[] nums7 = {-3};
        int[] expected7 = {9};
        assertArrayEquals(expected7, squaresOfSortedArray.sortedSquares(nums7));

        // Single zero element in the array
        int[] nums8 = {0};
        int[] expected8 = {0};
        assertArrayEquals(expected8, squaresOfSortedArray.sortedSquares(nums8));
    }
}