package com.anirudhology.leetcoding.dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoinChangeTest {

    private final CoinChange coinChange = new CoinChange();

    @Test
    void testCoinChange_NormalCase() {
        // Normal case: coins that can make up the amount
        int[] coins1 = {1, 2, 5};
        int amount1 = 11;
        assertEquals(3, coinChange.coinChange(coins1, amount1));

        // Normal case: coins that cannot make up the amount
        int[] coins2 = {2};
        int amount2 = 3;
        assertEquals(-1, coinChange.coinChange(coins2, amount2));

        // Normal case: single coin needed to make up the amount
        int[] coins3 = {1};
        int amount3 = 2;
        assertEquals(2, coinChange.coinChange(coins3, amount3));
    }

    @Test
    void testCoinChange_SpecialCase() {
        // Special case: no coins provided
        int[] coins4 = {};
        int amount4 = 5;
        IllegalArgumentException exception1 = assertThrows(IllegalArgumentException.class, () -> coinChange.coinChange(coins4, amount4));
        assertEquals("There are no coins!", exception1.getMessage());

        // Special case: null coins array
        int[] coins5 = null;
        int amount5 = 5;
        IllegalArgumentException exception2 = assertThrows(IllegalArgumentException.class, () -> coinChange.coinChange(coins5, amount5));
        assertEquals("There are no coins!", exception2.getMessage());

        // Special case: amount is 0
        int[] coins6 = {1, 2, 5};
        int amount6 = 0;
        assertEquals(0, coinChange.coinChange(coins6, amount6));
    }
}