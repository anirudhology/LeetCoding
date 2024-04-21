package com.anirudhology.leetcoding.dynamicprogramming;

public class HouseRobber {

    public int rob(int[] nums) {
        // Special case
        if (nums == null || nums.length == 0) {
            return 0;
        }
        // Length of the array
        int n = nums.length;
        // More special cases
        if (n == 1) {
            return nums[0];
        }
        if (n == 2) {
            return Math.max(nums[0], nums[1]);
        }
        // Array to store the maximum loot until the index i
        int[] lookup = new int[n + 1];
        // Base initialization
        lookup[0] = nums[0];
        lookup[1] = Math.max(nums[0], nums[1]);
        // Process the array
        for (int i = 2; i < n; i++) {
            lookup[i] = Math.max(nums[i] + lookup[i - 2], lookup[i - 1]);
        }
        return lookup[n - 1];
    }
}
