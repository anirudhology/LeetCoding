package com.anirudhology.leetcoding.dynamicprogramming;

public class PartitionEqualSubsetSum {

    public boolean canPartition(int[] nums) {
        // Special case
        if (nums == null) {
            return true;
        }
        // Length of the array
        int n = nums.length;
        // Sum of all the elements in the array
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        // The sum should be an "even" number for partition
        // in two parts
        if (sum % 2 != 0) {
            return false;
        }
        return subsetSumEqualsK(nums, sum / 2);
    }

    private boolean subsetSumEqualsK(int[] nums, int target) {
        // Length of array
        int n = nums.length;
        // Lookup table to sure if 'i' sum is possible with array
        // of length 'j'
        boolean[][] lookup = new boolean[target + 1][n + 1];
        // If sum is not zero but array is empty, the output is false
        for (int i = 0; i <= target; i++) {
            lookup[i][0] = false;
        }
        // If sum is zero but array is not empty, the output will be true
        for (int j = 0; j <= n; j++) {
            lookup[0][j] = true;
        }
        // Populate for the remaining combinations
        for (int i = 1; i <= target; i++) {
            for (int j = 1; j <= n; j++) {
                lookup[i][j] = lookup[i][j - 1];
                // If sum is greater or equal to the current element
                if (i >= nums[j - 1]) {
                    lookup[i][j] = lookup[i][j] || lookup[i - nums[j - 1]][j - 1];
                }
            }
        }
        return lookup[target][n];
    }
}
