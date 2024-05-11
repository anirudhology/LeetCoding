package com.anirudhology.leetcoding.array;

public class SortColors {

    /**
     * Time Complexity - O(N)
     * Space Complexity - O(1)
     */
    public int[] sortColorsTwoPass(int[] nums) {
        // Special case
        if (nums == null || nums.length == 0) {
            return nums;
        }
        // Length of the array
        int n = nums.length;
        int zeroCount = 0;
        int oneCount = 0;
        // Traverse through the array
        for (int num : nums) {
            if (num == 0) {
                zeroCount++;
            } else if (num == 1) {
                oneCount++;
            }
        }
        // Index to keep track of current element in the array
        int index = 0;
        while (index < zeroCount) {
            nums[index] = 0;
            index++;
        }

        while (index < zeroCount + oneCount) {
            nums[index] = 1;
            index++;
        }
        while (index < n) {
            nums[index] = 2;
            index++;
        }
        return nums;
    }

    /**
     * Time Complexity - O(N)
     * Space Complexity - O(1)
     */
    public int[] sortColorsOnePass(int[] nums) {
        // Special case
        if (nums == null || nums.length == 0) {
            return nums;
        }
        // Length of the array
        int n = nums.length;
        // Left and right pointers
        int left = 0;
        int right = n - 1;
        // Middle pointer
        int middle = 0;
        // The aim is to keep all zeroes before left pointer, all 2s
        // after right pointer and all 1s in between.
        while (middle <= right) {
            // Check for zero - swap with left
            if (nums[middle] == 0) {
                swap(nums, left, middle);
                left++;
                middle++;
            }
            // Check for 1 - no need to do anything
            else if (nums[middle] == 1) {
                middle++;
            }
            // Check for 2 - swap with right
            else {
                swap(nums, middle, right);
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
