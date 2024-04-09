package com.anirudhology.leetcoding.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicateTest {

    private final ContainsDuplicate containsDuplicate = new ContainsDuplicate();

    @Test
    void testContainsDuplicate_NormalCase() {
        // Normal case: array contains duplicates
        int[] nums1 = {1, 2, 3, 1};
        assertTrue(containsDuplicate.containsDuplicate(nums1));

        // Normal case: array does not contain duplicates
        int[] nums2 = {1, 2, 3, 4};
        assertFalse(containsDuplicate.containsDuplicate(nums2));
    }

    @Test
    void testContainsDuplicate_SpecialCase() {
        // Special case: empty array
        int[] nums3 = {};
        IllegalArgumentException exception1 = assertThrows(IllegalArgumentException.class, () -> containsDuplicate.containsDuplicate(nums3));
        assertEquals("Array cannot be null or empty.", exception1.getMessage());

        // Special case: null array
        int[] nums4 = null;
        IllegalArgumentException exception2 = assertThrows(IllegalArgumentException.class, () -> containsDuplicate.containsDuplicate(nums4));
        assertEquals("Array cannot be null or empty.", exception2.getMessage());
    }

    @Test
    void testContainsDuplicate_SingleElement() {
        // Single element in the array
        int[] nums5 = {10};
        assertFalse(containsDuplicate.containsDuplicate(nums5));
    }

    @Test
    void testContainsDuplicate_TwoElements() {
        // Two elements in the array
        int[] nums6 = {3, 3};
        assertTrue(containsDuplicate.containsDuplicate(nums6));

        int[] nums7 = {3, 2};
        assertFalse(containsDuplicate.containsDuplicate(nums7));
    }

    @Test
    void testContainsDuplicate_AllSameElements() {
        // All elements are the same
        int[] nums8 = {5, 5, 5, 5, 5};
        assertTrue(containsDuplicate.containsDuplicate(nums8));
    }
}