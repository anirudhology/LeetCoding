package com.anirudhology.leetcoding.array;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    /**
     * Time Complexity - O(N^2)
     * Space Complexity - O(1)
     */
    public int[] twoSumBruteForce(int[] nums, int target) {
        // Special case
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty!");
        }
        // Length of the array
        int n = nums.length;
        // Output array
        int[] result = new int[2];
        // Check for all combinations
        for (int i = 0; i < n; i++) {
            // Check for all other numbers
            for (int j = i + 1; j < n; j++) {
                // Solution is found!!!
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    break;
                }
            }
        }
        return result;
    }

    /**
     * Time Complexity - O(N)
     * Space Complexity - O(N)
     */
    public int[] twoSumSuboptimal(int[] nums, int target) {
        // Special case
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty!");
        }
        // Length of the array
        int n = nums.length;
        // Map to store the elements and its index
        Map<Integer, Integer> elements = new HashMap<>();
        // Output array
        int[] result = new int[2];
        // Populate the map
        for (int i = 0; i < n; i++) {
            elements.put(nums[i], i);
        }
        // Traverse through the array again to check for combination
        // that gives us target value
        for (int i = 0; i < n; i++) {
            // Calculate the complement
            int complement = target - nums[i];
            // Check if complement exists in the array/map, and it is
            // not the same element
            if (elements.containsKey(complement) && elements.get(complement) != i) {
                // We have found the solution
                result[0] = i;
                result[1] = elements.get(complement);
                break;
            }
        }
        return result;
    }

    /**
     * Time Complexity - O(N)
     * Space Complexity - O(N)
     */
    public int[] twoSumOptimal(int[] nums, int target) {
        // Check if array is not null or empty
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Array must have at least two elements.");
        }
        // Map to store the difference of target and current element as key and
        // index of current element as value;
        Map<Integer, Integer> complements = new HashMap<>();
        // Output array
        int[] result = new int[2];
        // Traverse through the array
        for (int i = 0; i < nums.length; i++) {
            // Compliment of current element w.r.t target
            int compliment = target - nums[i];
            // Check if we have already found the difference
            if (complements.containsKey(compliment)) {
                result[0] = i;
                result[1] = complements.get(compliment);
                break;
            }
            complements.put(nums[i], i);
        }
        return result;
    }
}
