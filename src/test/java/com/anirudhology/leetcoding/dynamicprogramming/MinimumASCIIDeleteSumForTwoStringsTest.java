package com.anirudhology.leetcoding.dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinimumASCIIDeleteSumForTwoStringsTest {

    private final MinimumASCIIDeleteSumForTwoStrings minimumASCIIDeleteSumForTwoStrings = new MinimumASCIIDeleteSumForTwoStrings();

    @Test
    public void testMinimumDeleteSumWithEmptyStrings() {
        String s1 = "";
        String s2 = "";
        assertEquals(0, minimumASCIIDeleteSumForTwoStrings.minimumDeleteSum(s1, s2));
    }

    @Test
    public void testMinimumDeleteSumWithOneEmptyString() {
        String s1 = "abc";
        String s2 = "";
        assertEquals(294, minimumASCIIDeleteSumForTwoStrings.minimumDeleteSum(s1, s2));
    }

    @Test
    public void testMinimumDeleteSumWithEqualStrings() {
        String s1 = "abc";
        String s2 = "abc";
        assertEquals(0, minimumASCIIDeleteSumForTwoStrings.minimumDeleteSum(s1, s2));
    }

    @Test
    public void testMinimumDeleteSumWithNoCommonSubsequence() {
        String s1 = "abc";
        String s2 = "def";
        assertEquals(597, minimumASCIIDeleteSumForTwoStrings.minimumDeleteSum(s1, s2));
    }

    @Test
    public void testMinimumDeleteSumWithCommonSubsequence() {
        String s1 = "sea";
        String s2 = "eat";
        assertEquals(231, minimumASCIIDeleteSumForTwoStrings.minimumDeleteSum(s1, s2));
    }

    @Test
    public void testMinimumDeleteSumWithMultipleCommonSubsequences() {
        String s1 = "delete";
        String s2 = "leet";
        assertEquals(403, minimumASCIIDeleteSumForTwoStrings.minimumDeleteSum(s1, s2));
    }
}