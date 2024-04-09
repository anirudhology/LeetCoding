package com.anirudhology.leetcoding.array;

public class SquaresOfSortedArray {

    public int[] sortedSquares(int[] nums) {
        // Special case
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty.");
        }
        // Length of the array
        int n = nums.length;
        // Array to store squares
        int[] squares = new int[n];
        // Left and right pointers
        int left = 0;
        int right = n - 1;
        // Index to keep track of current element
        int index = n - 1;
        // Traverse through the array from both sides
        while (left <= right) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];
            if (leftSquare > rightSquare) {
                squares[index] = leftSquare;
                left++;
            } else {
                squares[index] = rightSquare;
                right--;
            }
            index--;
        }
        return squares;
    }
}
