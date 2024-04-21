package com.anirudhology.leetcoding.dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestIncreasingSubsequenceTest {

    private final LongestIncreasingSubsequence longestIncreasingSubsequence = new LongestIncreasingSubsequence();

    @Test
    public void testLengthOfLISWithEmptyArray() {
        int[] nums = {};
        assertEquals(0, longestIncreasingSubsequence.lengthOfLIS(nums));
    }

    @Test
    public void testLengthOfLISWithSingleElement() {
        int[] nums = {5};
        assertEquals(1, longestIncreasingSubsequence.lengthOfLIS(nums));
    }

    @Test
    public void testLengthOfLISWithIncreasingSequence() {
        int[] nums = {1, 2, 3, 4, 5};
        assertEquals(5, longestIncreasingSubsequence.lengthOfLIS(nums));
    }

    @Test
    public void testLengthOfLISWithDecreasingSequence() {
        int[] nums = {5, 4, 3, 2, 1};
        assertEquals(1, longestIncreasingSubsequence.lengthOfLIS(nums));
    }

    @Test
    public void testLengthOfLISWithMixedSequence() {
        int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};
        assertEquals(4, longestIncreasingSubsequence.lengthOfLIS(nums));
    }

    @Test
    public void testLengthOfLISWithRepeatedElements() {
        int[] nums = {4, 10, 4, 3, 8, 9};
        assertEquals(3, longestIncreasingSubsequence.lengthOfLIS(nums));
    }
}