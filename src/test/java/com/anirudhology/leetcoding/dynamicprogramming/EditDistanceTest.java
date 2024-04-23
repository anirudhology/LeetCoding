package com.anirudhology.leetcoding.dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EditDistanceTest {

    private final EditDistance editDistance = new EditDistance();

    @Test
    public void testMinDistanceWithEmptyStrings() {
        String word1 = "";
        String word2 = "";
        assertEquals(0, editDistance.minDistance(word1, word2));
    }

    @Test
    public void testMinDistanceWithOneEmptyString() {
        String word1 = "hello";
        String word2 = "";
        assertEquals(5, editDistance.minDistance(word1, word2));
    }

    @Test
    public void testMinDistanceWithEqualStrings() {
        String word1 = "kitten";
        String word2 = "kitten";
        assertEquals(0, editDistance.minDistance(word1, word2));
    }

    @Test
    public void testMinDistanceWithOneDifferentCharacter() {
        String word1 = "kitten";
        String word2 = "sitten";
        assertEquals(1, editDistance.minDistance(word1, word2));
    }

    @Test
    public void testMinDistanceWithCompletelyDifferentStrings() {
        String word1 = "sitting";
        String word2 = "kitten";
        assertEquals(3, editDistance.minDistance(word1, word2));
    }

    @Test
    public void testMinDistanceWithLongerFirstString() {
        String word1 = "kittens";
        String word2 = "kitten";
        assertEquals(1, editDistance.minDistance(word1, word2));
    }

    @Test
    public void testMinDistanceWithLongerSecondString() {
        String word1 = "kitten";
        String word2 = "kittens";
        assertEquals(1, editDistance.minDistance(word1, word2));
    }
}