package com.anirudhology.leetcoding.dynamicprogramming;

import java.util.Arrays;

public class CoinChange {

    public int coinChange(int[] coins, int amount) {
        // Special case
        if (coins == null || coins.length == 0) {
            throw new IllegalArgumentException("There are no coins!");
        }
        // Array to store the number of coins to make up amount
        int[] ways = new int[amount + 1];
        // Fill with default values
        Arrays.fill(ways, Integer.MAX_VALUE);
        // Ways to make 0 amount
        ways[0] = 0;
        // Populate the table
        for (int i = 1; i <= amount; i++) {
            // Take each coin into consideration
            for (int coin : coins) {
                // We can only take coin if it is less than the current amount
                if (coin <= i) {
                    int difference = ways[i - coin];
                    // Update number of ways
                    if (difference != Integer.MAX_VALUE) {
                        ways[i] = Math.min(difference + 1, ways[i]);
                    }
                }
            }
        }
        return ways[amount] != Integer.MAX_VALUE ? ways[amount] : -1;
    }
}
