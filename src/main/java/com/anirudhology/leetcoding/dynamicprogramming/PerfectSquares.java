package com.anirudhology.leetcoding.dynamicprogramming;

import java.util.Arrays;

public class PerfectSquares {

    public int numSquares(int n) {
        // Special case
        if (n <= 0) {
            throw new IllegalArgumentException("Number cannot be 0 or negative");
        }
        // Maximum value of perfect square that can be used
        int x = (int) Math.sqrt(n);
        // Lookup table to store least number of perfect squares that
        // make up the current value (represented by index)
        int[] lookup = new int[n + 1];
        // Fill the table with default value
        Arrays.fill(lookup, Integer.MAX_VALUE);
        // We don't need any number to make 0
        lookup[0] = 0;
        // Populate the table
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= x; j++) {
                if (j * j <= i) {
                    int difference = lookup[i - j * j];
                    if (difference != Integer.MAX_VALUE) {
                        lookup[i] = Math.min(lookup[i], difference + 1);
                    }
                }
            }
        }
        return lookup[n];
    }
}
