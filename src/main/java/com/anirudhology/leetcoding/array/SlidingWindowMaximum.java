package com.anirudhology.leetcoding.array;

import java.util.*;

public class SlidingWindowMaximum {

    /**
     * Time Complexity - O(N*K)
     * Space Complexity - O(1)
     */
    public int[] maxSlidingWindowBruteForce(int[] nums, int k) {
        // Special case
        if (nums == null || nums.length < k) {
            return new int[]{};
        }
        // Length of the array
        int n = nums.length;
        // Sliding window maximum array
        int[] slidingWindowMax = new int[n - k + 1];
        // Traverse through the array
        for (int i = 0; i < n - k + 1; i++) {
            // Find maximum in the current window
            slidingWindowMax[i] = findMax(nums, i, i + k - 1);
        }
        return slidingWindowMax;
    }

    private int findMax(int[] nums, int left, int right) {
        int max = Integer.MIN_VALUE;
        for (int i = left; i <= right; i++) {
            max = Math.max(max, nums[i]);
        }
        return max;
    }

    /**
     * Time Complexity - O(N*log(K))
     * Space Complexity - O(K)
     */
    public int[] maxSlidingWindowSuboptimal(int[] nums, int k) {
        // Special case
        if (nums == null || nums.length < k) {
            return new int[]{};
        }
        // Length of the array
        int n = nums.length;
        // Array to store sliding window maximum elements
        int[] slidingWindowMax = new int[n - k + 1];
        // Max heap to store k elements in a window
        Queue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        // Add first k elements in the heap
        for (int i = 0; i < k; i++) {
            maxHeap.offer(nums[i]);
        }
        // Set the maximum value from the first window to output array
        slidingWindowMax[0] = maxHeap.peek();
        // Process the remaining elements
        for (int i = k; i < n; i++) {
            // Remove the left element of window from the heap
            maxHeap.remove(nums[i - k]);
            // Add the new element to the heap
            maxHeap.offer(nums[i]);
            // Get the max of this window
            slidingWindowMax[i - k + 1] = maxHeap.peek();
        }
        return slidingWindowMax;
    }

    /**
     * Time Complexity - O(N)
     * Space Complexity - O(K)
     */
    public int[] maxSlidingWindow(int[] nums, int k) {
        // Special case
        if (nums == null || nums.length < k) {
            return new int[]{};
        }
        // Length of the array
        int n = nums.length;
        // Array to store sliding window maximum elements
        int[] slidingWindowMax = new int[n - k + 1];
        // Deque to keep track of indices of window
        Deque<Integer> windowElements = new ArrayDeque<>();
        // Process the array
        for (int i = 0; i < n; i++) {
            // Remove the left element from the window
            if (!windowElements.isEmpty() && windowElements.peekFirst() < i - k + 1) {
                windowElements.pollFirst();
            }
            // Remove indices for which values are less than nums[i] as they are useless
            // and can never become max
            while (!windowElements.isEmpty() && nums[windowElements.peekLast()] < nums[i]) {
                windowElements.pollLast();
            }
            // Add current index or the element from the right of the window
            windowElements.offerLast(i);
            if (i >= k - 1) {
                slidingWindowMax[i - k + 1] = nums[windowElements.peekFirst()];
            }
        }
        return slidingWindowMax;
    }
}
