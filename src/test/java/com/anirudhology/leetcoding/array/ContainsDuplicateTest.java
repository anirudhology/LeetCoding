package com.anirudhology.leetcoding.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicateTest {

    private final ContainsDuplicate containsDuplicate = new ContainsDuplicate();

    @Test
    void testContainsDuplicateNormalCase() {
        // Normal case: array contains duplicates
        int[] nums1 = {1, 2, 3, 1};
        assertTrue(containsDuplicate.containsDuplicateBruteForce(nums1));
        assertTrue(containsDuplicate.containsDuplicateOptimal(nums1));

        // Normal case: array does not contain duplicates
        int[] nums2 = {1, 2, 3, 4};
        assertFalse(containsDuplicate.containsDuplicateBruteForce(nums2));
        assertFalse(containsDuplicate.containsDuplicateOptimal(nums2));
    }

    @Test
    void testContainsDuplicateSpecialCase() {
        // Special case: empty array
        int[] nums3 = {};
        assertFalse(containsDuplicate.containsDuplicateBruteForce(nums3));
        assertFalse(containsDuplicate.containsDuplicateOptimal(nums3));

        // Special case: null array
        int[] nums4 = null;
        assertFalse(containsDuplicate.containsDuplicateBruteForce(nums4));
        assertFalse(containsDuplicate.containsDuplicateOptimal(nums4));
    }

    @Test
    void testContainsDuplicateSingleElement() {
        // Single element in the array
        int[] nums5 = {10};
        assertFalse(containsDuplicate.containsDuplicateBruteForce(nums5));
        assertFalse(containsDuplicate.containsDuplicateOptimal(nums5));
    }

    @Test
    void testContainsDuplicateTwoElements() {
        // Two elements in the array
        int[] nums6 = {3, 3};
        assertTrue(containsDuplicate.containsDuplicateBruteForce(nums6));
        assertTrue(containsDuplicate.containsDuplicateOptimal(nums6));

        int[] nums7 = {3, 2};
        assertFalse(containsDuplicate.containsDuplicateBruteForce(nums7));
        assertFalse(containsDuplicate.containsDuplicateOptimal(nums7));
    }

    @Test
    void testContainsDuplicateAllSameElements() {
        // All elements are the same
        int[] nums8 = {5, 5, 5, 5, 5};
        assertTrue(containsDuplicate.containsDuplicateBruteForce(nums8));
        assertTrue(containsDuplicate.containsDuplicateOptimal(nums8));
    }
}