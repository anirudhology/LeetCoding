package com.anirudhology.leetcoding.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        // List to store the triplets
        List<List<Integer>> triplets = new ArrayList<>();
        if (nums == null || nums.length < 3) {
            return triplets;
        }
        // Length of the array
        int n = nums.length;
        // Sort the array
        Arrays.sort(nums);
        // Traverse through the array
        for (int i = 0; i < n; i++) {
            // Skip the duplicates
            if (i > 0 && nums[i - 1] == nums[i]) {
                continue;
            }
            // Perform binary search on the remaining part
            int j = i + 1;
            int k = n - 1;
            while (j < k) {
                // Add current triplet
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    triplets.add(List.of(nums[i], nums[j], nums[k]));
                    j++;
                    // Avoid duplicates
                    while (j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }
                }
                // If the sum is negative, then we should move right
                else if (sum < 0) {
                    j++;
                }
                // If the sum is positive, then we should move left
                else {
                    k--;
                }
            }
        }
        return triplets;
    }
}
