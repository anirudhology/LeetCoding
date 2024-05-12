package com.anirudhology.leetcoding.array;

public class RotateArray {

    /**
     * Time Complexity - O(N)
     * Space Complexity - O(N)
     */
    public int[] rotateWithLinearSpace(int[] nums, int k) {
        // Special case
        if (nums == null || nums.length == 0 || k <= 0) {
            return nums;
        }
        // Length of the array
        int n = nums.length;
        // If k is greater than n
        if (k >= n) {
            k %= n;
        }
        // Get the k elements to be rotated
        int[] kElements = new int[k];
        for (int i = n - k; i < n; i++) {
            kElements[i - n + k] = nums[i];
        }
        // Remaining elements
        int[] remainingElements = new int[n - k];
        for (int i = 0; i < n - k; i++) {
            remainingElements[i] = nums[i];
        }
        // Combine both arrays
        for (int i = 0; i < k; i++) {
            nums[i] = kElements[i];
        }
        for (int i = 0; i < n - k; i++) {
            nums[i + k] = remainingElements[i];
        }
        return nums;
    }

    /**
     * Time Complexity - O(N)
     * Space Complexity - O(1)
     */
    public int[] rotateWithConstantSpace(int[] nums, int k) {
        // Special case
        if (nums == null || nums.length == 0 || k <= 0) {
            return nums;
        }
        // Length of the array
        int n = nums.length;
        // If k is greater than n
        if (k >= n) {
            k %= n;
        }
        // Reverse the entire array
        reverse(nums, 0, n - 1);
        // Reverse only first k elements
        reverse(nums, 0, k - 1);
        // Reverse remaining n - k elements
        reverse(nums, k, n - 1);
        return nums;
    }

    private void reverse(int[] nums, int left, int right) {
        while (left <= right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}
