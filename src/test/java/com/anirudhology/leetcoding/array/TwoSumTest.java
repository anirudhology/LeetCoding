package com.anirudhology.leetcoding.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class TwoSumTest {

    private final TwoSum twoSum = new TwoSum();

    @Test
    public void testTwoSumBruteForce() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {0, 1};
        assertArrayEquals(expected, twoSum.twoSumBruteForce(nums, target));
    }

    @Test
    public void testTwoSumSuboptimal() {
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] expected = {1, 2};
        assertArrayEquals(expected, twoSum.twoSumSuboptimal(nums, target));
    }

    @Test
    public void testTwoSumOptimal() {
        int[] nums = {3, 3};
        int target = 6;
        int[] expected = {1, 0};
        assertArrayEquals(expected, twoSum.twoSumOptimal(nums, target));
    }

    @Test
    public void testTwoSumBruteForce_Exception() {
        int[] nums = {};
        int target = 9;
        assertThrows(IllegalArgumentException.class, () -> twoSum.twoSumBruteForce(nums, target));
    }

    @Test
    public void testTwoSumSuboptimal_Exception() {
        int[] nums = {};
        int target = 9;
        assertThrows(IllegalArgumentException.class, () -> twoSum.twoSumSuboptimal(nums, target));
    }

    @Test
    public void testTwoSumOptimal_Exception() {
        int[] nums = {};
        int target = 9;
        assertThrows(IllegalArgumentException.class, () -> twoSum.twoSumOptimal(nums, target));
    }
}