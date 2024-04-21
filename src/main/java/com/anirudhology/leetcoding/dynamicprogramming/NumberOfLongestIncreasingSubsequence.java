package com.anirudhology.leetcoding.dynamicprogramming;

public class NumberOfLongestIncreasingSubsequence {

    public int findNumberOfLIS(int[] nums) {
        // Special case
        if (nums == null || nums.length == 0) {
            return 0;
        }
        // Length of the array
        int n = nums.length;
        // Length of current LIS
        int localMax = 0;
        // Global max length
        int globalMax = 0;
        // Array to store the length of LISes which end with index i
        int[] lengths = new int[n];
        // Array to store the count of LISes which end with index i
        int[] counts = new int[n];
        // Process the array
        for (int i = 0; i < n; i++) {
            lengths[i] = 1;
            counts[i] = 1;
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    if (lengths[i] == lengths[j] + 1) {
                        counts[i] += counts[j];
                    } else if (lengths[i] < lengths[j] + 1) {
                        lengths[i] = lengths[j] + 1;
                        counts[i] = counts[j];
                    }
                }
            }
            if (localMax == lengths[i]) {
                globalMax += counts[i];
            } else if (localMax < lengths[i]) {
                localMax = lengths[i];
                globalMax = counts[i];
            }
        }
        return globalMax;
    }
}
