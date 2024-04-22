package com.anirudhology.leetcoding.dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class LastStoneWeightIITest {

    private final LastStoneWeightII lastStoneWeightII = new LastStoneWeightII();

    @Test
    public void testLastStoneWeightIIWithEmptyArray() {
        int[] stones = {};
        assertEquals(0, lastStoneWeightII.lastStoneWeightII(stones));
    }

    @Test
    public void testLastStoneWeightIIWithSingleStone() {
        int[] stones = {5};
        assertEquals(5, lastStoneWeightII.lastStoneWeightII(stones));
    }

    @Test
    public void testLastStoneWeightIIWithTwoStones() {
        int[] stones = {3, 4};
        assertEquals(1, lastStoneWeightII.lastStoneWeightII(stones));
    }

    @Test
    public void testLastStoneWeightIIWithThreeStones() {
        int[] stones = {1, 2, 3};
        assertEquals(0, lastStoneWeightII.lastStoneWeightII(stones));
    }

    @Test
    public void testLastStoneWeightIIWithFourStones() {
        int[] stones = {3, 6, 4, 5};
        assertEquals(0, lastStoneWeightII.lastStoneWeightII(stones));
    }

    @Test
    public void testLastStoneWeightIIWithFiveStones() {
        int[] stones = {1, 3, 5, 7, 9};
        assertEquals(1, lastStoneWeightII.lastStoneWeightII(stones));
    }
}