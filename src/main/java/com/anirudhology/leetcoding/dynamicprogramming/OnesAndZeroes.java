package com.anirudhology.leetcoding.dynamicprogramming;

public class OnesAndZeroes {

    public int findMaxForm(String[] strs, int m, int n) {
        // Special cases
        if (strs == null || strs.length == 0 || m < 0 || n < 0) {
            throw new IllegalArgumentException("Invalid inputs!!!");
        }
        // Lookup table to store maximum size of subsets where
        // strings contain m zeroes and n ones combined.
        int[][] lookup = new int[m + 1][n + 1];
        // Process for all strings
        for (String s : strs) {
            // Count ones and zeroes
            int[] counts = countOnesAndZeroes(s);
            // Populate the table
            for (int i = m; i >= 0; i--) {
                for (int j = n; j >= 0; j--) {
                    if (counts[0] <= i && counts[1] <= j) {
                        lookup[i][j] = Math.max(lookup[i][j], 1 + lookup[i - counts[0]][j - counts[1]]);
                    }
                }
            }
        }
        return lookup[m][n];
    }

    private int[] countOnesAndZeroes(String s) {
        int[] counts = new int[2];
        for (char c : s.toCharArray()) {
            if (c == '0') {
                counts[0]++;
            } else {
                counts[1]++;
            }
        }
        return counts;
    }
}
