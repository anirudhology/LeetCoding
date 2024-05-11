package com.anirudhology.leetcoding.array;

public class ContainerWithMostWater {

    /**
     * Time Complexity - O(N)
     * Space Complexity - O(1)
     */
    public int maxArea(int[] height) {
        // Special case
        if (height == null || height.length == 0) {
            return 0;
        }
        // Left and right pointers
        int left = 0;
        int right = height.length - 1;
        // Maximum area calculated so far
        int maximumArea = 0;
        // Process the array
        while (left < right) {
            // Length of the current portion
            int length = Math.min(height[left], height[right]);
            // Breadth of the current portion
            int breadth = right - left;
            // Current area
            int currentArea = length * breadth;
            // Update maximum area, if required
            maximumArea = Math.max(maximumArea, currentArea);
            // Update pointers
            if (height[left] < height[right]) {
                left++;
            } else if (height[left] > height[right]) {
                right--;
            } else {
                left++;
                right--;
            }
        }
        return maximumArea;
    }
}
