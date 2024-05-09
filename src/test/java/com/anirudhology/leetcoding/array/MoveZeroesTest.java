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
        assertArrayEquals(expected1, moveZeroes.moveZeroesTwoPointers(nums1));
        assertArrayEquals(expected1, moveZeroes.moveZeroesSwapping(nums1));
    }

    @Test
    void testMoveZeroesOneSpecialCase() {
        // Special case: empty array
        int[] nums2 = {};
        assertArrayEquals(nums2, moveZeroes.moveZeroesTwoPointers(nums2));
        assertArrayEquals(nums2, moveZeroes.moveZeroesSwapping(nums2));

        // Special case: null array
        int[] nums3 = null;
        assertArrayEquals(nums3, moveZeroes.moveZeroesTwoPointers(nums3));
        assertArrayEquals(nums3, moveZeroes.moveZeroesSwapping(nums3));
    }

    @Test
    void testMoveZeroesTwoNormalCase() {
        // Normal case: array with zeroes and non-zeroes
        int[] nums = {0, 1, 0, 3, 12};
        int[] expected = {1, 3, 12, 0, 0};
        assertArrayEquals(expected, moveZeroes.moveZeroesTwoPointers(nums));
        assertArrayEquals(expected, moveZeroes.moveZeroesSwapping(nums));
    }
}