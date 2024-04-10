package com.anirudhology.leetcoding.array;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ThreeSumTest {
    
    private final ThreeSum threeSum = new ThreeSum();

    @Test
    public void testThreeSum_WithNullArray_ShouldReturnEmptyList() {
        int[] nums = null;
        List<List<Integer>> result = threeSum.threeSum(nums);
        assertEquals(0, result.size());
    }

    @Test
    public void testThreeSum_WithLessThanThreeElements_ShouldReturnEmptyList() {
        int[] nums = {};
        List<List<Integer>> result = threeSum.threeSum(nums);
        assertEquals(0, result.size());

        int[] nums2 = {1};
        List<List<Integer>> result2 = threeSum.threeSum(nums2);
        assertEquals(0, result2.size());

        int[] nums3 = {1, 2};
        List<List<Integer>> result3 = threeSum.threeSum(nums3);
        assertEquals(0, result3.size());
    }

    @Test
    public void testThreeSum_WithValidInput_ShouldReturnCorrectTriplets() {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> expected = List.of(List.of(-1, -1, 2), List.of(-1, 0, 1));
        List<List<Integer>> result = threeSum.threeSum(nums);
        assertEquals(expected, result);
    }

    @Test
    public void testThreeSum_WithAllNegativeNumbers_ShouldReturnEmptyList() {
        int[] nums = {-1, -2, -3, -4};
        List<List<Integer>> result = threeSum.threeSum(nums);
        assertEquals(0, result.size());
    }

    @Test
    public void testThreeSum_WithAllPositiveNumbers_ShouldReturnEmptyList() {
        int[] nums = {1, 2, 3, 4};
        List<List<Integer>> result = threeSum.threeSum(nums);
        assertEquals(0, result.size());
    }

    @Test
    public void testThreeSum_WithAllZeroes_ShouldReturnCorrectTriplets() {
        int[] nums = {0, 0, 0, 0};
        List<List<Integer>> expected = List.of(List.of(0, 0, 0));
        List<List<Integer>> result = threeSum.threeSum(nums);
        assertEquals(expected, result);
    }

}