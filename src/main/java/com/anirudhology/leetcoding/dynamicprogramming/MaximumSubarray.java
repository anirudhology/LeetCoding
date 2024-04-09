package com.anirudhology.leetcoding.dynamicprogramming;

public class MaximumSubarray {

    public int maxSubArray(int[] nums) {
        // Special case
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty or null.");
        }
        /*
            Kadane's Algorithm
        */
        // Local maxima and global maxima
        int localMaxima = nums[0];
        int globalMaxima = nums[0];
        // Traverse through the array
        for (int i = 1; i < nums.length; i++) {
            localMaxima = Math.max(nums[i] + localMaxima, nums[i]);
            globalMaxima = Math.max(globalMaxima, localMaxima);
        }
        return globalMaxima;
    }
}
