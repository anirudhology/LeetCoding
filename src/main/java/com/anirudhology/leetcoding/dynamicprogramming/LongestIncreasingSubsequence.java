package com.anirudhology.leetcoding.dynamicprogramming;

import java.util.Arrays;

public class LongestIncreasingSubsequence {

    public int lengthOfLIS(int[] nums) {
        // Special case
        if (nums == null || nums.length == 0) {
            return 0;
        }
        // Length of the array
        int n = nums.length;
        // Lookup table to store the length of LIS until that index
        int[] lookup = new int[n];
        // Since every element is an LIS of length 1;
        Arrays.fill(lookup, 1);
        // Populate the table
        for (int i = 0; i < n; i++) {
            // Take current subsequence
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    lookup[i] = Math.max(lookup[i], 1 + lookup[j]);
                }
            }
        }
        // Find the global max
        int max = 1;
        for (int l : lookup) {
            max = Math.max(l, max);
        }
        return max;
    }
}
