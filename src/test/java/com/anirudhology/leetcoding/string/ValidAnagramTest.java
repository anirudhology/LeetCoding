package com.anirudhology.leetcoding.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidAnagramTest {

    private final ValidAnagram validAnagram = new ValidAnagram();

    @Test
    public void testIsAnagramNullInputs() {
        assertTrue(validAnagram.isAnagram(null, null));
    }

    // Test null input for first string
    @Test
    public void testIsAnagramNullFirstString() {
        assertFalse(validAnagram.isAnagram(null, "test"));
    }

    // Test null input for second string
    @Test
    public void testIsAnagramNullSecondString() {
        assertFalse(validAnagram.isAnagram("test", null));
    }

    // Test strings with different lengths
    @Test
    public void testIsAnagramDifferentLengthStrings() {
        assertFalse(validAnagram.isAnagram("test", "testing"));
    }

    // Test anagrams
    @Test
    public void testIsAnagramAnagrams() {
        assertTrue(validAnagram.isAnagram("listen", "silent"));
    }

    // Test non-anagrams
    @Test
    public void testIsAnagramNonAnagrams() {
        assertFalse(validAnagram.isAnagram("hello", "world"));
    }
}