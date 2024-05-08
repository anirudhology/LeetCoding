package com.anirudhology.leetcoding.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    /**
     * Time Complexity - O(N*log(N))
     * Space Complexity - O(1)
     */
    public boolean containsDuplicateBruteForce(int[] nums) {
        // Special case
        if (nums == null || nums.length == 0) {
            return false;
        }
        // Sort the array
        Arrays.sort(nums);
        // Traverse the array
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] == nums[i]) {
                return true;
            }
        }
        return false;
    }

    /**
     * Time Complexity - O(N)
     * Space Complexity - O(N)
     */
    public boolean containsDuplicateOptimal(int[] nums) {
        // Special case
        if (nums == null || nums.length == 0) {
            return false;
        }
        // Set to store the elements
        Set<Integer> elements = new HashSet<>();
        // Traverse through the array
        for (int num : nums) {
            if (!elements.add(num)) {
                return true;
            }
        }
        return false;
    }
}
