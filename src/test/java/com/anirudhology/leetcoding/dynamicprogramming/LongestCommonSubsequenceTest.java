package com.anirudhology.leetcoding.dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestCommonSubsequenceTest {

    private final LongestCommonSubsequence longestCommonSubsequence = new LongestCommonSubsequence();

    @Test
    public void testLongestCommonSubsequenceWithNullText1() {
        String text1 = null;
        String text2 = "abc";
        assertEquals(0, longestCommonSubsequence.longestCommonSubsequence(text1, text2));
    }

    @Test
    public void testLongestCommonSubsequenceWithBlankText1() {
        String text1 = "";
        String text2 = "abc";
        assertEquals(0, longestCommonSubsequence.longestCommonSubsequence(text1, text2));
    }

    @Test
    public void testLongestCommonSubsequenceWithNullText2() {
        String text1 = "abc";
        String text2 = null;
        assertEquals(0, longestCommonSubsequence.longestCommonSubsequence(text1, text2));
    }

    @Test
    public void testLongestCommonSubsequenceWithBlankText2() {
        String text1 = "abc";
        String text2 = "";
        assertEquals(0, longestCommonSubsequence.longestCommonSubsequence(text1, text2));
    }

    @Test
    public void testLongestCommonSubsequenceWithNoCommonSubsequence() {
        String text1 = "abc";
        String text2 = "def";
        assertEquals(0, longestCommonSubsequence.longestCommonSubsequence(text1, text2));
    }

    @Test
    public void testLongestCommonSubsequenceWithCommonSubsequence() {
        String text1 = "abcdef";
        String text2 = "bdxf";
        assertEquals(3, longestCommonSubsequence.longestCommonSubsequence(text1, text2));
    }

    @Test
    public void testLongestCommonSubsequenceWithEqualStrings() {
        String text1 = "abc";
        String text2 = "abc";
        assertEquals(3, longestCommonSubsequence.longestCommonSubsequence(text1, text2));
    }
}