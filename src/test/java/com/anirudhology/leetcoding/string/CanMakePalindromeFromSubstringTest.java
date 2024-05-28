package com.anirudhology.leetcoding.string;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CanMakePalindromeFromSubstringTest {

    private final CanMakePalindromeFromSubstring canMakePalindromeFromSubstring = new CanMakePalindromeFromSubstring();

    @Test
    void testEmptyString() {
        List<Boolean> result = canMakePalindromeFromSubstring.canMakePaliQueries("", new int[][]{{0, 0, 0}});
        assertTrue(result.isEmpty());
    }

    @Test
    void testNullString() {
        List<Boolean> result = canMakePalindromeFromSubstring.canMakePaliQueries(null, new int[][]{{0, 0, 0}});
        assertTrue(result.isEmpty());
    }

    @Test
    void testNullQueries() {
        List<Boolean> result = canMakePalindromeFromSubstring.canMakePaliQueries("abc", null);
        assertTrue(result.isEmpty());
    }

    @Test
    void testSingleCharacter() {
        List<Boolean> result = canMakePalindromeFromSubstring.canMakePaliQueries("a", new int[][]{{0, 0, 0}});
        assertEquals(List.of(true), result);
    }

    @Test
    void testNoReplacementsNeeded() {
        List<Boolean> result = canMakePalindromeFromSubstring.canMakePaliQueries("aba", new int[][]{{0, 2, 0}});
        assertEquals(List.of(true), result);
    }

    @Test
    void testOneReplacementNeeded() {
        List<Boolean> result = canMakePalindromeFromSubstring.canMakePaliQueries("abc", new int[][]{{0, 2, 1}});
        assertEquals(List.of(true), result);
    }

    @Test
    void testMultipleQueries() {
        List<Boolean> result = canMakePalindromeFromSubstring.canMakePaliQueries("abacaba", new int[][]{
                {0, 3, 1}, {0, 3, 0}, {0, 6, 1}, {0, 6, 2}, {1, 5, 1}
        });
        assertEquals(Arrays.asList(true, false, true, true, true), result);
    }

    @Test
    void testNoReplacementPossible() {
        List<Boolean> result = canMakePalindromeFromSubstring.canMakePaliQueries("abcdef", new int[][]{{0, 5, 0}});
        assertEquals(List.of(false), result);
    }

    @Test
    void testExactReplacementsNeeded() {
        List<Boolean> result = canMakePalindromeFromSubstring.canMakePaliQueries("abccba", new int[][]{{0, 5, 1}});
        assertEquals(List.of(true), result);
    }
}