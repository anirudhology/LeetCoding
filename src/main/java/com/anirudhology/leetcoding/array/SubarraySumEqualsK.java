package com.anirudhology.leetcoding.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubarraySumEqualsK {

    /**
     * Time Complexity - O(N^3)
     * Space Complexity - O(N^2)
     */
    public int subarraySumBruteForce(int[] nums, int target) {
        // Special case
        if (nums == null || nums.length == 0) {
            return 0;
        }
        // Length of the array
        int n = nums.length;
        // Count of valid subarrays
        int count = 0;
        // List to store subarrays
        List<List<Integer>> subarrays = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                List<Integer> subarray = new ArrayList<>();
                for (int k = i; k <= j; k++) {
                    subarray.add(nums[k]);
                }
                subarrays.add(subarray);
            }
        }
        // Traverse through all the lists
        for (List<Integer> subarray : subarrays) {
            // Sum of elements of the array
            int sum = 0;
            for (int num : subarray) {
                sum += num;
            }
            if (sum == target) {
                count++;
            }
        }
        return count;
    }

    /**
     * Time Complexity - O(N^3)
     * Space Complexity - O(N^2)
     */
    public int subarraySumOptimal(int[] nums, int k) {
        // Special case
        if (nums == null || nums.length == 0) {
            return 0;
        }
        // Count of valid subarrays
        int count = 0;
        // Map to store cumulative sum and its frequency
        Map<Integer, Integer> sumFrequencyMap = new HashMap<>();
        int sum = 0;
        // Process the array
        for (int num : nums) {
            // Update sum
            sum += num;
            // Check if the current sum is equal to k
            if (sum == k) {
                count++;
            }
            // Check if we have seen sum - k before
            if (sumFrequencyMap.containsKey(sum - k)) {
                count += sumFrequencyMap.get(sum - k);
            }
            // Add entry for the current sum in table
            sumFrequencyMap.put(sum, sumFrequencyMap.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}
