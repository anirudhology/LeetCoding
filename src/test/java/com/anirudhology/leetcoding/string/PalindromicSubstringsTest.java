package com.anirudhology.leetcoding.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PalindromicSubstringsTest {
    
    private final PalindromicSubstrings palindromicSubstrings = new PalindromicSubstrings();

    @Test
    public void testCountSubstringsWithPalindrome() {
        assertEquals(3, palindromicSubstrings.countSubstrings("abc"));
        assertEquals(6, palindromicSubstrings.countSubstrings("aaa"));
        assertEquals(4, palindromicSubstrings.countSubstrings("aba"));
    }

    @Test
    public void testCountSubstringsWithEmptyString() {
        assertEquals(0, palindromicSubstrings.countSubstrings(""));
    }

    @Test
    public void testCountSubstringsWithNullString() {
        assertEquals(0, palindromicSubstrings.countSubstrings(null));
    }

}