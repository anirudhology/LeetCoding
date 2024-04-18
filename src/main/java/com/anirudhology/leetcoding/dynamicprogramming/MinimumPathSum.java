package com.anirudhology.leetcoding.dynamicprogramming;

public class MinimumPathSum {

    public int minPathSum(int[][] grid) {
        // Special case
        if (grid == null || grid.length == 0) {
            throw new IllegalArgumentException("Invalid grid!");
        }
        // Grid dimensions
        int m = grid.length;
        int n = grid[0].length;
        // Lookup  table to store the minimized sum at each cell
        int[][] lookup = new int[m][n];
        // Populate the remaining cells of lookup table
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // For the very first cell
                if (i == 0 && j == 0) {
                    lookup[i][j] = grid[0][0];
                }
                // For the first row
                else if (i == 0) {
                    lookup[0][j] = grid[0][j] + lookup[0][j - 1];
                }
                // For the first column
                else if (j == 0) {
                    lookup[i][0] = grid[i][0] + lookup[i - 1][0];
                }
                // For all other cells
                else {
                    lookup[i][j] = Math.min(lookup[i - 1][j], lookup[i][j - 1]) + grid[i][j];
                }
            }
        }
        return lookup[m - 1][n - 1];
    }
}
