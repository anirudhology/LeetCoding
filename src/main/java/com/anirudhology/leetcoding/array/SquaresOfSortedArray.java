package com.anirudhology.leetcoding.array;

import java.util.Arrays;

public class SquaresOfSortedArray {

    /**
     * Time Complexity - O(N*log(N))
     * Space Complexity - O(1)
     */
    public int[] sortedSquaresBruteForce(int[] nums) {
        // Special case
        if (nums == null || nums.length == 0) {
            return nums;
        }
        // Length of the array
        int n = nums.length;
        // Array to store squares of elements
        int[] squares = new int[n];
        // Calculate the squares of elements
        for (int i = 0; i < n; i++) {
            squares[i] = nums[i] * nums[i];
        }
        // Sort the squares array
        Arrays.sort(squares);
        return squares;
    }

    /**
     * Time Complexity - O(N)
     * Space Complexity - O(1)
     */
    public int[] sortedSquaresOptimal(int[] nums) {
        // Special case
        if (nums == null || nums.length == 0) {
            return nums;
        }
        // Length of the array
        int n = nums.length;
        // Array to store squares of elements
        int[] squares = new int[n];
        // Left and right pointers
        int left = 0;
        int right = n - 1;
        // Index to keep track of bigger square
        int index = n - 1;
        // Process the array
        for (int i = 0; i < n; i++) {
            // Calculate squares at both left and right indices
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];
            // Place the squares at correct place
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
