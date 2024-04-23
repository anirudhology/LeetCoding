package com.anirudhology.leetcoding.dynamicprogramming;

public class EditDistance {

    public int minDistance(String word1, String word2) {
        // Lengths of both the words
        int m = word1.length();
        int n = word2.length();
        // Lookup table to store minimum number of operations to
        // convert word1 to word2
        int[][] lookup = new int[m + 1][n + 1];
        // If the second word is empty
        for (int i = 0; i <= m; i++) {
            lookup[i][0] = i;
        }
        // If the first word is empty
        for (int j = 0; j <= n; j++) {
            lookup[0][j] = j;
        }
        // Process both strings
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                // Cost of operation
                int cost = word1.charAt(i - 1) != word2.charAt(j - 1) ? 1 : 0;
                lookup[i][j] = Math.min(cost + lookup[i - 1][j - 1], Math.min(1 + lookup[i - 1][j], 1 + lookup[i][j - 1]));
            }
        }
        return lookup[m][n];
    }
}
