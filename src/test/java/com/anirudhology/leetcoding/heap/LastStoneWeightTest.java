package com.anirudhology.leetcoding.heap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LastStoneWeightTest {

    private final LastStoneWeight lastStoneWeight = new LastStoneWeight();

    @Test
    public void testLastStoneWeightWithEmptyArray() {
        int[] stones = {};
        assertEquals(0, lastStoneWeight.lastStoneWeight(stones));
    }

    @Test
    public void testLastStoneWeightWithSingleStone() {
        int[] stones = {5};
        assertEquals(5, lastStoneWeight.lastStoneWeight(stones));
    }

    @Test
    public void testLastStoneWeightWithTwoEqualStones() {
        int[] stones = {5, 5};
        assertEquals(0, lastStoneWeight.lastStoneWeight(stones));
    }

    @Test
    public void testLastStoneWeightWithTwoDifferentStones() {
        int[] stones = {5, 10};
        assertEquals(5, lastStoneWeight.lastStoneWeight(stones));
    }

    @Test
    public void testLastStoneWeightWithMultipleStones() {
        int[] stones = {2, 7, 4, 1, 8, 1};
        assertEquals(1, lastStoneWeight.lastStoneWeight(stones));
    }
}