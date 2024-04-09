package com.anirudhology.leetcoding.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MajorityElementTest {

    private final MajorityElement majorityElement = new MajorityElement();

    @Test
    void testMajorityElementNormalCase() {
        // Normal case: single majority element
        int[] nums1 = {3, 3, 4, 2, 4, 4, 2, 4, 4};
        assertEquals(4, majorityElement.majorityElement(nums1));

        // Normal case: multiple majority elements
        int[] nums2 = {2, 2, 1, 1, 1, 2, 2};
        assertEquals(2, majorityElement.majorityElement(nums2));

        // Normal case: arbitrary input
        int[] nums3 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertEquals(9, majorityElement.majorityElement(nums3)); // No majority element
    }

    @Test
    void testMajorityElementSpecialCase() {
        // Special case: empty array
        int[] nums4 = {};
        IllegalArgumentException exception1 = assertThrows(IllegalArgumentException.class, () -> majorityElement.majorityElement(nums4));
        assertEquals("Array should not be null or empty.", exception1.getMessage());

        // Special case: null array
        int[] nums5 = null;
        IllegalArgumentException exception2 = assertThrows(IllegalArgumentException.class, () -> majorityElement.majorityElement(nums5));
        assertEquals("Array should not be null or empty.", exception2.getMessage());
    }

    @Test
    void testMajorityElementSingleElement() {
        // Single element in the array
        int[] nums6 = {10};
        assertEquals(10, majorityElement.majorityElement(nums6));
    }

    @Test
    void testMajorityElementTwoElements() {
        // Two elements in the array
        int[] nums7 = {3, 3};
        assertEquals(3, majorityElement.majorityElement(nums7));

        int[] nums8 = {3, 2};
        assertEquals(3, majorityElement.majorityElement(nums8)); // No majority element
    }

    @Test
    void testMajorityElementAllSameElements() {
        // All elements are the same
        int[] nums9 = {5, 5, 5, 5, 5};
        assertEquals(5, majorityElement.majorityElement(nums9));
    }

}