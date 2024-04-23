package com.anirudhology.leetcoding.backtracking;

import java.util.Arrays;

public class PartitionToKEqualSumSubsets {

    public boolean canPartitionKSubsets(int[] nums, int k) {
        // Special case
        if (nums == null || nums.length == 0 || k <= 0) {
            return false;
        }
        // Sum of all elements in the array
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        // Check if we can create k subsets with equal sum
        if (sum % k != 0) {
            return false;
        }
        // Sort the array so that we can take the biggest element and start filling our bucket
        Arrays.sort(nums);
        // Total number of groups
        int[] buckets = new int[k];
        // Perform backtracking
        return backtrack(nums, sum/k, nums.length - 1, buckets);
    }

    private boolean backtrack(int[] nums, int target, int index, int[] buckets) {
        // If we have taken all the elements
        if (index == -1) {
            return true;
        }
        // Start filling the bucket
        for (int i = 0; i < buckets.length; i++) {
            // Perform backtracking on the current element
            if (buckets[i] + nums[index] <= target) {
                buckets[i] += nums[index];
                if (backtrack(nums, target, index - 1, buckets)) {
                    return true;
                }
                buckets[i] -= nums[index];
            }
            // If our bucket is empty, it means we have not taken any element
            if (buckets[i] == 0) {
                break;
            }
        }
        return false;
    }
}
