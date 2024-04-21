package com.anirudhology.leetcoding.dynamicprogramming;

import java.util.Arrays;

public class RussianDollEnvelopes {

    /**
     * This is a good enough solution but for very huge arrays, it gives TLE
     */
    public int maxEnvelopesOne(int[][] envelopes) {
        // Special case
        if (envelopes == null || envelopes.length == 0) {
            return 0;
        }
        // Sort the array by width in increasing order.
        // If widths are same, sort by heights in decreasing order.
        Arrays.sort(envelopes, (a, b) -> {
            if (a[0] == b[0]) {
                return b[1] - a[1];
            } else {
                return a[0] - b[0];
            }
        });
        // Total number of envelopes
        int n = envelopes.length;
        // Table to store the maximum Russian doll envelopes until the index i
        int[] lookup = new int[n];
        // Since every envelope can be Russian dolled itself
        Arrays.fill(lookup, 1);
        // Maximum number of envelopes
        int maxEnvelopes = 0;
        // Traverse through all the envelopes
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (envelopes[j][0] < envelopes[i][0] && envelopes[j][1] < envelopes[i][1]) {
                    lookup[i] = Math.max(lookup[i], 1 + lookup[j]);
                }
            }
            maxEnvelopes = Math.max(maxEnvelopes, lookup[i]);
        }
        return maxEnvelopes;
    }

    public int maxEnvelopesTwo(int[][] envelopes) {
        // Special case
        if (envelopes == null || envelopes.length == 0) {
            return 0;
        }
        // Sort the array by width in increasing order.
        // If widths are same, sort by heights in decreasing order.
        Arrays.sort(envelopes, (a, b) -> {
            if (a[0] == b[0]) {
                return b[1] - a[1];
            } else {
                return a[0] - b[0];
            }
        });
        // Total number of envelopes
        int n = envelopes.length;
        // Table to store the maximum Russian doll envelopes until the index i
        int[] lookup = new int[n];
        // Since every envelope can be Russian dolled itself
        Arrays.fill(lookup, 1);
        // Maximum number of envelopes
        int maxEnvelopes = 0;
        // Traverse through all the envelopes
        for (int[] envelope : envelopes) {
            int height = envelope[1];
            int index = Arrays.binarySearch(lookup, 0, maxEnvelopes, height);
            if (index < 0) {
                index = -(index + 1);
            }
            if (index == maxEnvelopes) {
                maxEnvelopes++;
            }
            lookup[index] = height;
        }
        return maxEnvelopes;
    }
}
