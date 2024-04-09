package com.anirudhology.leetcoding.dynamicprogramming;

public class ClimbingStairs {

    public int climbStairs(int n) {
        // Special case
        if (n <= 0) {
            throw new IllegalArgumentException("There can't be negative or zero stairs.");
        }
        // Array to store ways to climb the n stairs
        int[] ways = new int[n + 1];
        // Special case
        if (n <= 2) {
            return n;
        }
        // If there is only 1 stair, we have only one way (1)
        ways[1] = 1;
        // If there are 2 stairs, we have two ways (1 + 1, 2)
        ways[2] = 2;
        // Calculate for the remaining stairs
        for (int i = 3; i <= n; i++) {
            ways[i] = ways[i - 1] + ways[i - 2];
        }
        return ways[n];
    }
}
