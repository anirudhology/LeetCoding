package com.anirudhology.leetcoding.dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberOfLongestIncreasingSubsequenceTest {

    private final NumberOfLongestIncreasingSubsequence numberOfLongestIncreasingSubsequence = new NumberOfLongestIncreasingSubsequence();

    @Test
    public void testFindNumberOfLISWithEmptyArray() {
        int[] nums = {};
        assertEquals(0, numberOfLongestIncreasingSubsequence.findNumberOfLIS(nums));
    }

    @Test
    public void testFindNumberOfLISWithSingleElementArray() {
        int[] nums = {5};
        assertEquals(1, numberOfLongestIncreasingSubsequence.findNumberOfLIS(nums));
    }

    @Test
    public void testFindNumberOfLISWithIncreasingSequence() {
        int[] nums = {1, 2, 3, 4, 5};
        assertEquals(1, numberOfLongestIncreasingSubsequence.findNumberOfLIS(nums));
    }

    @Test
    public void testFindNumberOfLISWithMixedSequence() {
        int[] nums = {1, 3, 5, 4, 7};
        assertEquals(2, numberOfLongestIncreasingSubsequence.findNumberOfLIS(nums));
    }

    @Test
    public void testFindNumberOfLISWithRepeatedElements() {
        int[] nums = {2, 2, 2, 2, 2};
        assertEquals(5, numberOfLongestIncreasingSubsequence.findNumberOfLIS(nums));
    }
}