package com.anirudhology.leetcoding.dynamicprogramming;

public class TwoKeysKeyboard {

    public int minSteps(int n) {
        // Special case
        if (n <= 1) {
            return 0;
        }
        // Lookup table to store the minimum steps to make
        // A appear n times on screen
        int[] lookup = new int[n + 1];
        lookup[2] = 2;
        for (int i = 3; i <= n; i++) {
            // Find the largest prime factor for the current element
            int largestPrimeFactor = findGreatestPrimeFactor(i);
            if (largestPrimeFactor == i) {
                lookup[i] = largestPrimeFactor;
            } else {
                lookup[i] = lookup[largestPrimeFactor] + lookup[i / largestPrimeFactor];
            }
        }
        return lookup[n];
    }

    private int findGreatestPrimeFactor(int n) {
        int result = 2;
        for (int i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                result = i;
                n = n / i;
            }
        }
        return n > 1 ? Math.max(n, result) : result;
    }
}
