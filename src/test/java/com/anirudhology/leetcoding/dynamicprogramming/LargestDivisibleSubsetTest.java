package com.anirudhology.leetcoding.dynamicprogramming;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LargestDivisibleSubsetTest {

    private final LargestDivisibleSubset largestDivisibleSubset = new LargestDivisibleSubset();

    @Test
    public void testLargestDivisibleSubsetWithEmptyArray() {
        int[] nums = {};
        List<Integer> expected = List.of();
        assertEquals(expected, largestDivisibleSubset.largestDivisibleSubset(nums));
    }

    @Test
    public void testLargestDivisibleSubsetWithSingleElementArray() {
        int[] nums = {5};
        List<Integer> expected = List.of(5);
        assertEquals(expected, largestDivisibleSubset.largestDivisibleSubset(nums));
    }

    @Test
    public void testLargestDivisibleSubsetWithAllElementsDivisibleByOne() {
        int[] nums = {1, 2, 3, 4, 5};
        List<Integer> expected = Arrays.asList(1, 2, 4);
        assertEquals(expected, largestDivisibleSubset.largestDivisibleSubset(nums));
    }

    @Test
    public void testLargestDivisibleSubsetWithAllElementsDivisibleByFirstElement() {
        int[] nums = {2, 4, 6, 8, 10};
        List<Integer> expected = Arrays.asList(2, 4, 8);
        assertEquals(expected, largestDivisibleSubset.largestDivisibleSubset(nums));
    }

    @Test
    public void testLargestDivisibleSubsetWithMixedElements() {
        int[] nums = {1, 2, 4, 8, 9, 72};
        List<Integer> expected = Arrays.asList(1, 2, 4, 8, 72);
        assertEquals(expected, largestDivisibleSubset.largestDivisibleSubset(nums));
    }

    @Test
    public void testLargestDivisibleSubsetWithRepeatedElements() {
        int[] nums = {2, 2, 2, 4, 4, 4, 8, 8};
        List<Integer> expected = Arrays.asList(2, 2, 2, 4, 4, 4, 8, 8);
        assertEquals(expected, largestDivisibleSubset.largestDivisibleSubset(nums));
    }
}