package com.anirudhology.leetcoding.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestPalindromeTest {

    private final LongestPalindrome longestPalindrome = new LongestPalindrome();

    @Test
    void testLongestPalindromeWithMapEmptyString() {
        assertEquals(0, longestPalindrome.longestPalindromeWithMap(""));
    }

    @Test
    void testLongestPalindromeWithMapNullString() {
        assertEquals(0, longestPalindrome.longestPalindromeWithMap(null));
    }

    @Test
    void testLongestPalindromeWithMapAllUniqueCharacters() {
        assertEquals(1, longestPalindrome.longestPalindromeWithMap("abcdef"));
    }

    @Test
    void testLongestPalindromeWithMapAllPairs() {
        assertEquals(6, longestPalindrome.longestPalindromeWithMap("aabbcc"));
    }

    @Test
    void testLongestPalindromeWithMapMixedCharacters() {
        assertEquals(7, longestPalindrome.longestPalindromeWithMap("abccccdd"));
    }

    @Test
    void testLongestPalindromeWithMapSingleCharacter() {
        assertEquals(1, longestPalindrome.longestPalindromeWithMap("a"));
    }

    @Test
    void testLongestPalindromeWithMapSinglePair() {
        assertEquals(2, longestPalindrome.longestPalindromeWithMap("aa"));
    }

    @Test
    void testLongestPalindromeWithSetEmptyString() {
        assertEquals(0, longestPalindrome.longestPalindromeWithSet(""));
    }

    @Test
    void testLongestPalindromeWithSetNullString() {
        assertEquals(0, longestPalindrome.longestPalindromeWithSet(null));
    }

    @Test
    void testLongestPalindromeWithSetAllUniqueCharacters() {
        assertEquals(1, longestPalindrome.longestPalindromeWithSet("abcdef"));
    }

    @Test
    void testLongestPalindromeWithSetAllPairs() {
        assertEquals(6, longestPalindrome.longestPalindromeWithSet("aabbcc"));
    }

    @Test
    void testLongestPalindromeWithSetMixedCharacters() {
        assertEquals(7, longestPalindrome.longestPalindromeWithSet("abccccdd"));
    }

    @Test
    void testLongestPalindromeWithSetSingleCharacter() {
        assertEquals(1, longestPalindrome.longestPalindromeWithSet("a"));
    }

    @Test
    void testLongestPalindromeWithSetSinglePair() {
        assertEquals(2, longestPalindrome.longestPalindromeWithSet("aa"));
    }
}