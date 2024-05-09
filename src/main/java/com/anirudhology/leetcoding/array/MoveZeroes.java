package com.anirudhology.leetcoding.array;

public class MoveZeroes {

    /**
     * Time Complexity - O(N)
     * Space Complexity - O(1)
     */
    public int[] moveZeroesTwoPointers(int[] nums) {
        // Special case
        if (nums == null || nums.length == 0) {
            return nums;
        }
        // Length of the array
        int n = nums.length;
        // Index to keep track of non-zero elements
        int index = 0;
        // Traverse the array
        for (int i = 0; i < n; i++) {
            // If the current element is not zero, we will
            // put it at the left index
            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }
        // For the remaining positions in the array
        while (index < n) {
            nums[index] = 0;
            index++;
        }
        return nums;
    }

    /**
     * Time Complexity - O(N)
     * Space Complexity - O(1)
     */
    public int[] moveZeroesSwapping(int[] nums) {
        // Special case
        if (nums == null || nums.length == 0) {
            return nums;
        }
        // Left and right pointers
        int left = 0;
        // Traverse through the array
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != 0) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
            }
        }
        return nums;
    }
}
