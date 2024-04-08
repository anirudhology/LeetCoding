package com.anirudhology.leetcoding.array;

public class BestTimeToBuyAndSellStocks {

    public int maxProfit(int[] prices) {
        // Special case
        if (prices == null || prices.length == 0) {
            throw new IllegalArgumentException("Prices array cannot be null or empty");
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
