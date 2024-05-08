package com.anirudhology.leetcoding.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BestTimeToBuyAndSellStocksTest {

    private final BestTimeToBuyAndSellStocks bestTimeToBuyAndSellStocks = new BestTimeToBuyAndSellStocks();

    @Test
    void testMaxProfitBruteForce() {
        int[] prices = {7, 1, 5, 3, 6, 4};
        assertEquals(5, bestTimeToBuyAndSellStocks.maxProfitBruteForce(prices));
    }

    @Test
    void testMaxProfitKadaneAlgorithm() {
        int[] prices = {7, 1, 5, 3, 6, 4};
        assertEquals(5, bestTimeToBuyAndSellStocks.maxProfitKadaneAlgorithm(prices));
    }

    @Test
    void testMaxProfitStraightForward() {
        int[] prices = {7, 1, 5, 3, 6, 4};
        assertEquals(5, bestTimeToBuyAndSellStocks.maxProfitStraightForward(prices));
    }

    @Test
    void testMaxProfitBruteForceEmptyArray() {
        int[] prices = {};
        assertEquals(0, bestTimeToBuyAndSellStocks.maxProfitBruteForce(prices));
    }

    @Test
    void testMaxProfitKadaneAlgorithmEmptyArray() {
        int[] prices = {};
        assertEquals(0, bestTimeToBuyAndSellStocks.maxProfitKadaneAlgorithm(prices));
    }

    @Test
    void testMaxProfitStraightForwardEmptyArray() {
        int[] prices = {};
        assertEquals(0, bestTimeToBuyAndSellStocks.maxProfitStraightForward(prices));
    }

    @Test
    void testMaxProfitBruteForceNullArray() {
        int[] prices = null;
        assertEquals(0, bestTimeToBuyAndSellStocks.maxProfitBruteForce(prices));
    }

    @Test
    void testMaxProfitKadaneAlgorithmNullArray() {
        int[] prices = null;
        assertEquals(0, bestTimeToBuyAndSellStocks.maxProfitKadaneAlgorithm(prices));
    }

    @Test
    void testMaxProfitStraightForwardNullArray() {
        int[] prices = null;
        assertEquals(0, bestTimeToBuyAndSellStocks.maxProfitStraightForward(prices));
    }
}