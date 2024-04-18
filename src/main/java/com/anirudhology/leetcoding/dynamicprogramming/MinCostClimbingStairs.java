package com.anirudhology.leetcoding.dynamicprogramming;

public class MinCostClimbingStairs {

    public int minCostClimbingStairsOne(int[] cost) {
        // Special case
        if (cost == null || cost.length < 2) {
            throw new IllegalArgumentException("Array should have at least two elements");
        }
        // Length of the array
        int n = cost.length;
        // Lookup table to store costs for climbing stairs
        int[] lookup = new int[n + 1];
        lookup[0] = cost[0];
        lookup[1] = cost[1];
        // Populate the lookup table for all stairs
        for (int i = 2; i <= n; i++) {
            lookup[i] = Math.min(lookup[i - 1], lookup[i - 2]) + (i == n ? 0 : cost[i]);
        }
        return lookup[n];
    }

    public int minCostClimbingStairsTwo(int[] cost) {
        // Special case
        if (cost == null || cost.length < 2) {
            throw new IllegalArgumentException("Array should have at least two elements");
        }
        // Length of the array
        int n = cost.length;
        // First choice
        int a = cost[0];
        // Second choice
        int b = cost[1];
        // Final cost
        int c = 0;
        // Traverse for remaining stairs
        for (int i = 2; i <= n; i++) {
            c = Math.min(a, b) + (i == n ? 0 : cost[i]);
            a = b;
            b = c;
        }
        return c;
    }
}
