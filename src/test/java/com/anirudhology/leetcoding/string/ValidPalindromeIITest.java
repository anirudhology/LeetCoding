package com.anirudhology.leetcoding.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidPalindromeIITest {

    private final ValidPalindromeII validPalindromeII = new ValidPalindromeII();

    @Test
    public void testEmptyString() {
        assertTrue(validPalindromeII.validPalindrome(""));
    }

    @Test
    public void testSingleCharacter() {
        assertTrue(validPalindromeII.validPalindrome("a"));
    }

    @Test
    public void testPalindromeEvenLength() {
        assertTrue(validPalindromeII.validPalindrome("abba"));
    }

    @Test
    public void testPalindromeOddLength() {
        assertTrue(validPalindromeII.validPalindrome("aba"));
    }

    @Test
    public void testNearPalindromeRemoveOneCharacter() {
        assertTrue(validPalindromeII.validPalindrome("abca"));
    }

    @Test
    public void testNearPalindromeRemoveOneCharacterMiddle() {
        assertTrue(validPalindromeII.validPalindrome("racecarb"));
    }

    @Test
    public void testNotPalindrome() {
        assertFalse(validPalindromeII.validPalindrome("abc"));
    }

    @Test
    public void testComplexPalindrome() {
        assertTrue(validPalindromeII.validPalindrome("deeee"));
    }

    @Test
    public void testComplexNonPalindrome() {
        assertFalse(validPalindromeII.validPalindrome("deeeea"));
    }
}