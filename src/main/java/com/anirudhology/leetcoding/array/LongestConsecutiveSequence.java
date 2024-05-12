package com.anirudhology.leetcoding.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

    /**
     * Time Complexity - O(N*log(N))
     * Space Complexity - O(1)
     */
    public int longestConsecutiveSubOptimal(int[] nums) {
        // Special case
        if (nums == null || nums.length == 0) {
            return 0;
        }
        // Length of the array
        int n = nums.length;
        // Sort the array
        Arrays.sort(nums);
        // Length of LCS
        int lcsLength = 0;
        // Traverse through the array
        for (int i = 0; i < n; i++) {
            // Length of current consecutive sequence
            int currentLength = 1;
            while (i < n - 1) {
                // If consecutive elements are not equal but part of
                // consecutive sequence
                if (nums[i] + 1 == nums[i + 1]) {
                    i++;
                    currentLength++;
                }
                // If consecutive elements are equal, we will skip
                else if (nums[i] == nums[i + 1]) {
                    i++;
                }
                // If consecutive elements are not equal and not part of
                // consecutive sequence
                else if (nums[i] + 1 != nums[i + 1]) {
                    break;
                }
            }
            // Update lcsLength, if required
            lcsLength = Math.max(lcsLength, currentLength);
        }
        return lcsLength;
    }

    /**
     * Time Complexity - O(N)
     * Space Complexity - O(N)
     */
    public int longestConsecutiveOptimal(int[] nums) {
        // Special case
        if (nums == null || nums.length == 0) {
            return 0;
        }
        // Set to store the elements of the array
        Set<Integer> numbers = new HashSet<>();
        // Add all elements to the set
        for (int num : nums) {
            numbers.add(num);
        }
        // Length of the longest consecutive sequence
        int maxLength = 0;
        // Traverse through the array
        for (int num : nums) {
            if (!numbers.contains(num - 1)) {
                int x = num + 1;
                while (numbers.contains(x)) {
                    x++;
                }
                maxLength = Math.max(maxLength, x - num);
            }
        }
        return maxLength;
    }
}
