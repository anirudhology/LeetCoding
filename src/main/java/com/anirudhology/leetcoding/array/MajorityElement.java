package com.anirudhology.leetcoding.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public int majorityElementBruteForce(int[] nums) {
        // Special case
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Array should not be null or empty.");
        }
        // Sort the array
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

    /**
     * Time Complexity - O(N)
     * Space Complexity - O(N)
     */
    public int majorityElementSuboptimal(int[] nums) {
        // Special case
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Array should not be null or empty.");
        }
        // Map to store the counts of elements in the array
        Map<Integer, Integer> frequencies = new HashMap<>();
        for (int num : nums) {
            frequencies.put(num, frequencies.getOrDefault(num, 0) + 1);
            if (frequencies.get(num) > nums.length / 2) {
                return num;
            }
        }
        // Should never reach here in case of valid inputs
        throw new IllegalArgumentException("Invalid input!");
    }

    /**
     * Time Complexity - O(N)
     * Space Complexity - O(1)
     */
    public int majorityElementOptimal(int[] nums) {
        // Special case
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Array should not be null or empty.");
        }
        /*
         We will use Boyer-Moore Majority Voting algorithm here
         */
        // Candidate under consideration
        int candidate = -1;
        // Votes
        int votes = 0;
        // Traverse through the array
        for (int num : nums) {
            // Choose a new candidate as majority element
            if (votes == 0) {
                candidate = num;
            }
            // Increase/decrease votes in favour of current candidate
            if (num == candidate) {
                votes++;
            } else {
                votes--;
            }
        }
        return candidate;
    }
}