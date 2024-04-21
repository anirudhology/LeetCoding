package com.anirudhology.leetcoding.dynamicprogramming;

import java.util.Arrays;
import java.util.Comparator;

public class MaximumLengthOfPairChain {

    public int findLongestChainDP(int[][] pairs) {
        // Special case
        if (pairs == null || pairs.length == 0) {
            return 0;
        }
        // Sort the pairs by their first element
        Arrays.sort(pairs, Comparator.comparingInt(pair -> pair[0]));
        // Length of the array
        int n = pairs.length;
        // Lookup table to store the length of longest chain until index i
        int[] lookup = new int[n];
        // Since every pair is a longest chain of length 1
        Arrays.fill(lookup, 1);
        // Length of longest chain
        int maxLength = 0;
        // Traverse all pairs
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (pairs[i][0] > pairs[j][1]) {
                    lookup[i] = Math.max(lookup[i], 1 + lookup[j]);
                }
            }
            maxLength = Math.max(maxLength, lookup[i]);
        }
        return maxLength;
    }

    public int findLongestChainGreedy(int[][] pairs) {
        // Special case
        if (pairs == null || pairs.length == 0) {
            return 0;
        }
        // Sort the pairs by their second element
        Arrays.sort(pairs, Comparator.comparingInt(pair -> pair[1]));
        // Length of the array
        int n = pairs.length;
        // Maximum length of the pair chain
        int maxLength = 0;
        // Variable to keep track of last element of the chain
        int lastElement = Integer.MIN_VALUE;
        // Traverse through the pairs
        for (int[] pair : pairs) {
            // Check if chain can be extended
            if (lastElement < pair[0]) {
                lastElement = pair[1];
                maxLength++;
            }
        }
        return maxLength;
    }
}
