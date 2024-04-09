package com.anirudhology.leetcoding.array;

public class MajorityElement {

    public int majorityElement(int[] nums) {
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
