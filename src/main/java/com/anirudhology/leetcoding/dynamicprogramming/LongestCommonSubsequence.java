package com.anirudhology.leetcoding.dynamicprogramming;

public class LongestCommonSubsequence {

    public int longestCommonSubsequence(String text1, String text2) {
        // Special case
        if (text1 == null || text1.isBlank() || text2 == null || text2.isBlank()) {
            return 0;
        }
        // Lengths of strings
        int m = text1.length();
        int n = text2.length();
        // Lookup table to store longest common subsequence until the indices
        // i and j of text1 and text2 respectively.
        int[][] lookup = new int[m + 1][n + 1];
        // Process both strings simultaneously
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0) {
                    lookup[i][j] = 0;
                } else if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    lookup[i][j] = 1 + lookup[i - 1][j - 1];
                } else {
                    lookup[i][j] = Math.max(lookup[i - 1][j], lookup[i][j - 1]);
                }
            }
        }
        return lookup[m][n];
    }
}
