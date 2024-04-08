package com.anirudhology.leetcoding.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuyAndSellStocksTest {

    private final BestTimeToBuyAndSellStocks bestTimeToBuyAndSellStocks = new BestTimeToBuyAndSellStocks();

    @Test
    void testMaxProfitNormalCase() {
        // Normal case: prices in ascending order
        int[] prices1 = {1, 2, 3, 4, 5};
        assertEquals(4, bestTimeToBuyAndSellStocks.maxProfit(prices1));

        // Normal case: prices in descending order
        int[] prices2 = {5, 4, 3, 2, 1};
        assertEquals(0, bestTimeToBuyAndSellStocks.maxProfit(prices2));

        // Normal case: arbitrary prices
        int[] prices3 = {7, 1, 5, 3, 6, 4};
        assertEquals(5, bestTimeToBuyAndSellStocks.maxProfit(prices3));
    }

    @Test
    void testMaxProfitSpecialCase() {
        // Special case: empty array
        int[] prices4 = {};
        IllegalArgumentException exception1 = assertThrows(IllegalArgumentException.class, () -> bestTimeToBuyAndSellStocks.maxProfit(prices4));
        assertEquals("Prices array cannot be null or empty", exception1.getMessage());

        // Special case: null array
        int[] prices5 = null;
        IllegalArgumentException exception2 = assertThrows(IllegalArgumentException.class, () -> bestTimeToBuyAndSellStocks.maxProfit(prices5));
        assertEquals("Prices array cannot be null or empty", exception2.getMessage());
    }

    @Test
    void testMaxProfitSinglePrice() {
        // Single price in the array
        int[] prices6 = {10};
        assertEquals(0, bestTimeToBuyAndSellStocks.maxProfit(prices6));
    }

    @Test
    void testMaxProfitSamePrice() {
        // Same price for all elements
        int[] prices7 = {1, 1, 1, 1, 1};
        assertEquals(0, bestTimeToBuyAndSellStocks.maxProfit(prices7));
    }

    @Test
    void testMaxProfitMinMax() {
        // Minimum and maximum price are the same
        int[] prices8 = {3, 3, 3, 3, 3};
        assertEquals(0, bestTimeToBuyAndSellStocks.maxProfit(prices8));
    }
}