package com.anirudhology.leetcoding.dynamicprogramming;

public class DistinctSubsequences {

    public int numDistinct(String s, String t) {
        // Special case
        if (s == null || s.isEmpty() || t == null || t.isEmpty()) {
            throw new IllegalArgumentException("Strings cannot be null or empty!");
        }
        // Lengths of the string
        int m = s.length();
        int n = t.length();
        // Lookup table to store count of distinct subsequences of s
        // that are same as t.
        int[][] lookup = new int[m + 1][n + 1];
        // If s is empty
        for (int j = 0; j <= n; j++) {
            lookup[0][j] = 0;
        }
        // If t is empty
        for (int i = 0; i <= m; i++) {
            lookup[i][0] = 1;
        }
        // Process both strings
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s.charAt(i - 1) == t.charAt(j - 1)) {
                    lookup[i][j] = lookup[i - 1][j - 1] + lookup[i - 1][j];
                } else {
                    lookup[i][j] = lookup[i - 1][j];
                }
            }
        }
        return lookup[m][n];
    }
}
