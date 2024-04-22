package com.anirudhology.leetcoding.dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestStringChainTest {

    private final LongestStringChain longestStringChain = new LongestStringChain();

    @Test
    public void testLongestStrChainWithEmptyArray() {
        String[] words = {};
        assertEquals(0, longestStringChain.longestStrChain(words));
    }

    @Test
    public void testLongestStrChainWithSingleWord() {
        String[] words = {"a"};
        assertEquals(1, longestStringChain.longestStrChain(words));
    }

    @Test
    public void testLongestStrChainWithTwoWords() {
        String[] words = {"ab", "a"};
        assertEquals(2, longestStringChain.longestStrChain(words));
    }

    @Test
    public void testLongestStrChainWithThreeWords() {
        String[] words = {"abcd", "abc", "ab"};
        assertEquals(3, longestStringChain.longestStrChain(words));
    }

    @Test
    public void testLongestStrChainWithFourWords() {
        String[] words = {"a", "b", "bc", "abc"};
        assertEquals(3, longestStringChain.longestStrChain(words));
    }

    @Test
    public void testLongestStrChainWithFiveWords() {
        String[] words = {"abcd", "ab", "abc", "a", "bc"};
        assertEquals(4, longestStringChain.longestStrChain(words));
    }
}