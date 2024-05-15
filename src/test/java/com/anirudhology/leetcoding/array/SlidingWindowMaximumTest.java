package com.anirudhology.leetcoding.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SlidingWindowMaximumTest {

    private final SlidingWindowMaximum slidingWindowMaximum = new SlidingWindowMaximum();

    @Test
    public void testMaxSlidingWindowBruteForce() {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int[] expected = {3, 3, 5, 5, 6, 7};
        assertArrayEquals(expected, slidingWindowMaximum.maxSlidingWindowBruteForce(nums, k));
    }

    @Test
    public void testMaxSlidingWindowSuboptimal() {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int[] expected = {3, 3, 5, 5, 6, 7};
        assertArrayEquals(expected, slidingWindowMaximum.maxSlidingWindowSuboptimal(nums, k));
    }

    @Test
    public void testMaxSlidingWindow() {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int[] expected = {3, 3, 5, 5, 6, 7};
        assertArrayEquals(expected, slidingWindowMaximum.maxSlidingWindow(nums, k));
    }

    @Test
    public void testMaxSlidingWindowEdgeCase() {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 1;
        int[] expected = {1, 3, -1, -3, 5, 3, 6, 7};
        assertArrayEquals(expected, slidingWindowMaximum.maxSlidingWindow(nums, k));
    }

    @Test
    public void testMaxSlidingWindowEmptyInput() {
        int[] nums = {};
        int k = 3;
        int[] expected = {};
        assertArrayEquals(expected, slidingWindowMaximum.maxSlidingWindow(nums, k));
    }
}