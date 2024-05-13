package com.anirudhology.leetcoding.array;

import java.util.Arrays;

public class ThreeSumClosest {

    /**
     * Time Complexity - O(N^2)
     * Space Complexity - O(1)
     */
    public int threeSumClosest(int[] nums, int target) {
        // Special case
        if (nums == null || nums.length < 3) {
            return 0;
        }
        // Sort the array in ascending order
        Arrays.sort(nums);
        // Length of the array
        int n = nums.length;
        // Closest sum
        int closestSum = nums[0] + nums[1] + nums[n - 1];
        // Process the array
        for (int i = 0; i < n - 2; i++) {
            // Left and right pointers
            int j = i + 1;
            int k = n - 1;
            // Process the remaining elements
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum <= target) {
                    j++;
                } else {
                    k--;
                }
                if (Math.abs(sum - target) < Math.abs(closestSum - target)) {
                    closestSum = sum;
                }
            }
        }
        return closestSum;
    }
}
