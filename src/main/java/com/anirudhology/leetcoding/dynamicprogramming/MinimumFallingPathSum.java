package com.anirudhology.leetcoding.dynamicprogramming;

public class MinimumFallingPathSum {

    public int minFallingPathSum(int[][] matrix) {
        // Special case
        if (matrix == null || matrix.length == 0) {
            throw new IllegalArgumentException("Invalid matrix");
        }
        // Dimension of the square matrix
        int n = matrix.length;
        // Traverse the matrix row by row from bottom to top
        // and left to right
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < n; j++) {
                if (j == 0) {
                    matrix[i][j] += Math.min(matrix[i + 1][j], matrix[i + 1][j + 1]);
                } else if (j == n - 1) {
                    matrix[i][j] += Math.min(matrix[i + 1][j], matrix[i + 1][j - 1]);
                } else {
                    matrix[i][j] += Math.min(matrix[i + 1][j], Math.min(matrix[i + 1][j - 1], matrix[i + 1][j + 1]));
                }
            }
        }
        // Find the minimum value
        int minSum = Integer.MAX_VALUE;
        for (int j = 0; j < n; j++) {
            minSum = Math.min(minSum, matrix[0][j]);
        }
        return minSum;
    }
}
