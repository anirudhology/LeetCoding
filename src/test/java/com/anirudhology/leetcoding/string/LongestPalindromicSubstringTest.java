package com.anirudhology.leetcoding.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestPalindromicSubstringTest {

    private final LongestPalindromicSubstring longestPalindromicSubstring = new LongestPalindromicSubstring();

    @Test
    public void testLongestPalindromeWithEmptyString() {
        String input = "";
        assertEquals("", longestPalindromicSubstring.longestPalindrome(input));
    }

    @Test
    public void testLongestPalindromeWithSingleCharacter() {
        String input = "a";
        assertEquals("a", longestPalindromicSubstring.longestPalindrome(input));
    }

    @Test
    public void testLongestPalindromeWithNoPalindrome() {
        String input = "xyz";
        assertEquals("z", longestPalindromicSubstring.longestPalindrome(input));
    }

    @Test
    public void testLongestPalindromeWithOddLengthPalindrome() {
        String input = "babad";
        assertEquals("aba", longestPalindromicSubstring.longestPalindrome(input));
    }

    @Test
    public void testLongestPalindromeWithEvenLengthPalindrome() {
        String input = "cbbd";
        assertEquals("bb", longestPalindromicSubstring.longestPalindrome(input));
    }

    @Test
    public void testLongestPalindromeWithEntireStringPalindrome() {
        String input = "level";
        assertEquals("level", longestPalindromicSubstring.longestPalindrome(input));
    }

}