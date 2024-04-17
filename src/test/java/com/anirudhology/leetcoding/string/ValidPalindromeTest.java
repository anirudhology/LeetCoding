package com.anirudhology.leetcoding.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidPalindromeTest {

    private final ValidPalindrome validPalindrome = new ValidPalindrome();

    @Test
    public void testIsPalindromeEmptyString() {
        assertTrue(validPalindrome.isPalindrome(""));
    }

    // Test single character string
    @Test
    public void testIsPalindromeSingleCharacter() {
        assertTrue(validPalindrome.isPalindrome("a"));
    }

    // Test palindrome with alphanumeric characters
    @Test
    public void testIsPalindromeAlphanumericPalindrome() {
        assertTrue(validPalindrome.isPalindrome("A man, a plan, a canal: Panama"));
    }

    // Test non-palindrome with alphanumeric characters
    @Test
    public void testIsPalindromeAlphanumericNonPalindrome() {
        assertFalse(validPalindrome.isPalindrome("race a car"));
    }

    // Test palindrome with numeric characters
    @Test
    public void testIsPalindromeNumericPalindrome() {
        assertTrue(validPalindrome.isPalindrome("12321"));
    }

    // Test non-palindrome with numeric characters
    @Test
    public void testIsPalindromeNumericNonPalindrome() {
        assertFalse(validPalindrome.isPalindrome("12345"));
    }

    // Test palindrome with special characters
    @Test
    public void testIsPalindromeSpecialCharactersPalindrome() {
        assertTrue(validPalindrome.isPalindrome("A man, a plan, a canal: Panama!"));
    }
}