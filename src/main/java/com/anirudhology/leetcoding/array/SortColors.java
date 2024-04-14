package com.anirudhology.leetcoding.array;

public class SortColors {

    public int[] sortColors(int[] nums) {
        // Special case
        if (nums == null || nums.length == 0) {
            return nums;
        }
        // Length of the array
        int n = nums.length;
        int left = 0;
        int right = n - 1;
        // Traverse through the array
        for (int i = 0; i <= right; i++) {
            if (nums[i] == 0 && i > left) {
                swap(nums, i, left);
                i--;
                left++;
            } else if (nums[i] == 2 && i < right) {
                swap(nums, i, right);
                i--;
                right--;
            }
        }
        return nums;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
