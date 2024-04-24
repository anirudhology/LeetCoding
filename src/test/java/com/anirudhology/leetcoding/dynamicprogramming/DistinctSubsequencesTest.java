package com.anirudhology.leetcoding.dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class DistinctSubsequencesTest {

    private final DistinctSubsequences distinctSubsequences = new DistinctSubsequences();

    @Test
    public void testNumDistinctWithEmptyStrings() {
        String s = "";
        String t = "";
        assertThrows(IllegalArgumentException.class, () -> distinctSubsequences.numDistinct(s, t));
    }

    @Test
    public void testNumDistinctWithOneEmptyString() {
        String s = "abc";
        String t = "";
        assertThrows(IllegalArgumentException.class, () -> distinctSubsequences.numDistinct(s, t));
    }

    @Test
    public void testNumDistinctWithEqualStrings() {
        String s = "abc";
        String t = "abc";
        assertEquals(1, distinctSubsequences.numDistinct(s, t));
    }

    @Test
    public void testNumDistinctWithNoCommonSubsequence() {
        String s = "abc";
        String t = "def";
        assertEquals(0, distinctSubsequences.numDistinct(s, t));
    }

    @Test
    public void testNumDistinctWithCommonSubsequence() {
        String s = "rabbbit";
        String t = "rabbit";
        assertEquals(3, distinctSubsequences.numDistinct(s, t));
    }

    @Test
    public void testNumDistinctWithMultipleCommonSubsequences() {
        String s = "babgbag";
        String t = "bag";
        assertEquals(5, distinctSubsequences.numDistinct(s, t));
    }
}