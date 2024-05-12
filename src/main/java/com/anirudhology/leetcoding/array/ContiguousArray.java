package com.anirudhology.leetcoding.array;

import java.util.HashMap;
import java.util.Map;

public class ContiguousArray {

    /**
     * Time Complexity - O(N)
     * Space Complexity - O(N)
     */
    public int findMaxLength(int[] nums) {
        // Special case
        if (nums == null || nums.length == 0) {
            return 0;
        }
        // Length of the array
        int n = nums.length;
        // Map to store the sum and indices
        Map<Integer, Integer> sumToIndexMappings = new HashMap<>();
        // For zero-sum at the beginning
        sumToIndexMappings.put(0, -1);
        // Prefix sum
        int sum = 0;
        // Max length
        int maxLength = 0;
        // Traverse through the array
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                sum -= 1;
            } else {
                sum += 1;
            }
            // Check, if we have already seen this sum or not
            if (sumToIndexMappings.containsKey(sum)) {
                // Update maxLength, if necessary
                maxLength = Math.max(maxLength, i - sumToIndexMappings.get(sum));
            } else {
                sumToIndexMappings.put(sum, i);
            }
        }
        return maxLength;
    }
}
