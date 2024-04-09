package com.anirudhology.leetcoding.array;

public class MoveZeroes {

    public int[] moveZeroesOne(int[] nums) {
        // Special case
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty.");
        }
        // Counter for zeroes
        int count = 0;
        // Index for non-zero elements
        int index = 0;
        // Traverse through the array
        for (int num : nums) {
            if (num != 0) {
                nums[index] = num;
                index++;
            } else {
                count++;
            }
        }
        // Place zeroes at the right of all non-zero elements
        for (int i = index; i < nums.length; i++) {
            nums[i] = 0;
        }
        return nums;
    }

    public int[] moveZeroesTwo(int[] nums) {
        // Special case
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty.");
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
