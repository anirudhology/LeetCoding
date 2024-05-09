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
        assertArrayEquals(expected1, squaresOfSortedArray.sortedSquaresBruteForce(nums1));
        assertArrayEquals(expected1, squaresOfSortedArray.sortedSquaresOptimal(nums1));

        // Normal case: sorted array with all negative numbers
        int[] nums2 = {-7, -3, -2, -1};
        int[] expected2 = {1, 4, 9, 49};
        assertArrayEquals(expected2, squaresOfSortedArray.sortedSquaresBruteForce(nums2));
        assertArrayEquals(expected2, squaresOfSortedArray.sortedSquaresOptimal(nums2));

        // Normal case: sorted array with all positive numbers
        int[] nums3 = {1, 2, 3, 4, 5};
        int[] expected3 = {1, 4, 9, 16, 25};
        assertArrayEquals(expected3, squaresOfSortedArray.sortedSquaresBruteForce(nums3));
        assertArrayEquals(expected3, squaresOfSortedArray.sortedSquaresOptimal(nums3));
    }

    @Test
    void testSortedSquaresSpecialCase() {
        // Special case: empty array
        int[] nums4 = {};
        assertArrayEquals(nums4, squaresOfSortedArray.sortedSquaresBruteForce(nums4));
        assertArrayEquals(nums4, squaresOfSortedArray.sortedSquaresOptimal(nums4));

        // Special case: null array
        int[] nums5 = null;
        assertArrayEquals(nums5, squaresOfSortedArray.sortedSquaresBruteForce(nums5));
        assertArrayEquals(nums5, squaresOfSortedArray.sortedSquaresOptimal(nums5));
    }

    @Test
    void testSortedSquaresSingleElement() {
        // Single element in the array
        int[] nums6 = {5};
        int[] expected6 = {25};
        assertArrayEquals(expected6, squaresOfSortedArray.sortedSquaresBruteForce(nums6));
        assertArrayEquals(expected6, squaresOfSortedArray.sortedSquaresOptimal(nums6));

        // Single negative element in the array
        int[] nums7 = {-3};
        int[] expected7 = {9};
        assertArrayEquals(expected7, squaresOfSortedArray.sortedSquaresBruteForce(nums7));
        assertArrayEquals(expected7, squaresOfSortedArray.sortedSquaresOptimal(nums7));

        // Single zero element in the array
        int[] nums8 = {0};
        int[] expected8 = {0};
        assertArrayEquals(expected8, squaresOfSortedArray.sortedSquaresBruteForce(nums8));
        assertArrayEquals(expected8, squaresOfSortedArray.sortedSquaresOptimal(nums8));
    }
}