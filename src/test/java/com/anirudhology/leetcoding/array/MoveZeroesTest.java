package com.anirudhology.leetcoding.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoveZeroesTest {

    public final MoveZeroes moveZeroes = new MoveZeroes();

    @Test
    void testMoveZeroesOneNormalCase() {
        // Normal case: array with zeroes and non-zeroes
        int[] nums1 = {0, 1, 0, 3, 12};
        int[] expected1 = {1, 3, 12, 0, 0};
        assertArrayEquals(expected1, moveZeroes.moveZeroesOne(nums1));
    }

    @Test
    void testMoveZeroesOneSpecialCase() {
        // Special case: empty array
        int[] nums2 = {};
        IllegalArgumentException exception1 = assertThrows(IllegalArgumentException.class, () -> moveZeroes.moveZeroesOne(nums2));
        assertEquals("Array cannot be null or empty.", exception1.getMessage());

        // Special case: null array
        int[] nums3 = null;
        IllegalArgumentException exception2 = assertThrows(IllegalArgumentException.class, () -> moveZeroes.moveZeroesOne(nums3));
        assertEquals("Array cannot be null or empty.", exception2.getMessage());
    }

    @Test
    void testMoveZeroesTwoNormalCase() {
        // Normal case: array with zeroes and non-zeroes
        int[] nums1 = {0, 1, 0, 3, 12};
        int[] expected1 = {1, 3, 12, 0, 0};
        assertArrayEquals(expected1, moveZeroes.moveZeroesTwo(nums1));
    }

    @Test
    void testMoveZeroesTwoSpecialCase() {
        // Special case: empty array
        int[] nums2 = {};
        IllegalArgumentException exception1 = assertThrows(IllegalArgumentException.class, () -> moveZeroes.moveZeroesTwo(nums2));
        assertEquals("Array cannot be null or empty.", exception1.getMessage());

        // Special case: null array
        int[] nums3 = null;
        IllegalArgumentException exception2 = assertThrows(IllegalArgumentException.class, () -> moveZeroes.moveZeroesTwo(nums3));
        assertEquals("Array cannot be null or empty.", exception2.getMessage());
    }
}