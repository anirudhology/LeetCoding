package com.anirudhology.leetcoding.dynamicprogramming;

import java.util.List;

public class Triangle {

    public int minimumTotal(List<List<Integer>> triangle) {
        // Special case
        if (triangle == null || triangle.isEmpty()) {
            throw new IllegalArgumentException("Invalid inputs!");
        }
        // Total number of rows
        int n = triangle.size();
        // Lookup table to store the minimum cumulative sum
        int[] lookup = new int[n];
        // Start from bottom to top
        for (int i = 0; i < n; i++) {
            lookup[i] = triangle.get(n - 1).get(i);
        }
        // For remaining rows
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                lookup[j] = triangle.get(i).get(j) + Math.min(lookup[j], lookup[j + 1]);
            }
        }
        return lookup[0];
    }
}
