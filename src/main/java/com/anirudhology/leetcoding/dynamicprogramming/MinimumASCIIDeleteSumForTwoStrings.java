package com.anirudhology.leetcoding.dynamicprogramming;

public class MinimumASCIIDeleteSumForTwoStrings {

    public int minimumDeleteSum(String s1, String s2) {
        // Lengths of both the strings
        int m = s1.length();
        int n = s2.length();
        // Lookup table to store the minimum sum for string
        // s1[i...m] and s2[j...n]
        int[][] lookup = new int[m + 1][n + 1];
        // If s1 is empty, we need to delete everything from s2
        for (int i = 1; i <= m; i++) {
            lookup[i][0] = lookup[i - 1][0] + s1.charAt(i - 1);
        }
        // If s2 is empty, we need to delete everything from s1
        for (int j = 1; j <= n; j++) {
            lookup[0][j] = lookup[0][j - 1] + s2.charAt(j - 1);
        }
        // Co
        // Process for remaining characters
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    lookup[i][j] = lookup[i - 1][j - 1];
                } else {
                    // Skip character from s1 and s2 and take their minimum
                    lookup[i][j] = Math.min(lookup[i - 1][j] + s1.charAt(i - 1),
                            lookup[i][j - 1] + s2.charAt(j - 1));
                }
            }
        }
        return lookup[m][n];
    }
}
