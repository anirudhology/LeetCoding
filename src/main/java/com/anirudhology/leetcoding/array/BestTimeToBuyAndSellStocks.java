package com.anirudhology.leetcoding.array;

public class BestTimeToBuyAndSellStocks {

    /**
     * Time Complexity - O(N^2)
     * Space Complexity - O(1)
     */
    public int maxProfitBruteForce(int[] prices) {
        // Special case
        if (prices == null || prices.length == 0) {
            return 0;
        }
        // Length of the array
        int n = prices.length;
        // Maximum profit
        int maxProfit = 0;
        // Process all the prices in the array
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                maxProfit = Math.max(maxProfit, prices[j] - prices[i]);
            }
        }
        return maxProfit;
    }

    /**
     * Time Complexity - O(N)
     * Space Complexity - O(1)
     */
    public int maxProfitKadaneAlgorithm(int[] prices) {
        // Special case
        if (prices == null || prices.length == 0) {
            return 0;
        }
        // Current profit
        int currentProfit = 0;
        // Maximum profit
        int maxProfit = 0;
        // Traverse through prices array
        for (int i = 1; i < prices.length; i++) {
            currentProfit = Math.max(0, currentProfit + (prices[i] - prices[i - 1]));
            maxProfit = Math.max(maxProfit, currentProfit);
        }
        return maxProfit;
    }

    /**
     * Time Complexity - O(N)
     * Space Complexity - O(1)
     */
    public int maxProfitStraightForward(int[] prices) {
        // Special case
        if (prices == null || prices.length == 0) {
            return 0;
        }
        // The maximum profit will be realized when we purchase the stock at the lowest
        // price and sell it at the highest price. This is possible because we are allowed
        // to buy and sell stock only once.
        int minPrice = prices[0];
        int maxProfit = 0;
        // Process remaining prices
        for (int i = 1; i < prices.length; i++) {
            maxProfit = Math.max(prices[i] - minPrice, maxProfit);
            minPrice = Math.min(prices[i], minPrice);
        }
        return maxProfit;
    }
}
