package com.anirudhology.leetcoding.array;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

    public int longestConsecutive(int[] nums) {
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
