package com.anirudhology.leetcoding.dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumLengthOfPairChainTest {

    private final MaximumLengthOfPairChain maximumLengthOfPairChain = new MaximumLengthOfPairChain();

    @Test
    public void testFindLongestChainDPWithEmptyArray() {
        int[][] pairs = {};
        assertEquals(0, maximumLengthOfPairChain.findLongestChainDP(pairs));
    }

    @Test
    public void testFindLongestChainDPWithSinglePair() {
        int[][] pairs = {{1, 2}};
        assertEquals(1, maximumLengthOfPairChain.findLongestChainDP(pairs));
    }

    @Test
    public void testFindLongestChainDPWithIncreasingPairs() {
        int[][] pairs = {{1, 2}, {2, 3}, {3, 4}, {4, 5}};
        assertEquals(2, maximumLengthOfPairChain.findLongestChainDP(pairs));
    }

    @Test
    public void testFindLongestChainDPWithDecreasingPairs() {
        int[][] pairs = {{4, 5}, {3, 4}, {2, 3}, {1, 2}};
        assertEquals(2, maximumLengthOfPairChain.findLongestChainDP(pairs));
    }

    @Test
    public void testFindLongestChainGreedyWithEmptyArray() {
        int[][] pairs = {};
        assertEquals(0, maximumLengthOfPairChain.findLongestChainGreedy(pairs));
    }

    @Test
    public void testFindLongestChainGreedyWithSinglePair() {
        int[][] pairs = {{1, 2}};
        assertEquals(1, maximumLengthOfPairChain.findLongestChainGreedy(pairs));
    }

    @Test
    public void testFindLongestChainGreedyWithIncreasingPairs() {
        int[][] pairs = {{1, 2}, {2, 3}, {3, 4}, {4, 5}};
        assertEquals(2, maximumLengthOfPairChain.findLongestChainGreedy(pairs));
    }

    @Test
    public void testFindLongestChainGreedyWithDecreasingPairs() {
        int[][] pairs = {{4, 5}, {3, 4}, {2, 3}, {1, 2}};
        assertEquals(2, maximumLengthOfPairChain.findLongestChainGreedy(pairs));
    }
}