package com.anirudhology.leetcoding.array;

public class ContainerWithMostWater {

    public int maxArea(int[] height) {
        // Special case
        if (height == null || height.length == 0) {
            return 0;
        }
        // Left and right pointers
        int left = 0;
        int right = height.length - 1;
        // Variable to store area
        int area = 0;
        // Traverse until the pointers meet
        while (left < right) {
            int length = Math.min(height[left], height[right]);
            int breadth = right - left;
            area = Math.max(area, length * breadth);
            if (height[left] < height[right]) {
                left++;
            } else if (height[left] > height[right]) {
                right--;
            } else {
                left++;
                right--;
            }
        }
        return area;
    }
}
