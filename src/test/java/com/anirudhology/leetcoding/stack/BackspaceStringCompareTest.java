package com.anirudhology.leetcoding.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BackspaceStringCompareTest {

    private final BackspaceStringCompare backspaceStringCompare = new BackspaceStringCompare();

    @Test
    public void testBackspaceCompareBasic() {
        assertTrue(backspaceStringCompare.backspaceCompare("ab#c", "ad#c"));
        assertTrue(backspaceStringCompare.backspaceCompare("ab##", "c#d#"));
        assertFalse(backspaceStringCompare.backspaceCompare("a#c", "b"));
        assertTrue(backspaceStringCompare.backspaceCompare("a##c", "#a#c"));
    }

    @Test
    public void testBackspaceCompareEdgeCases() {
        assertTrue(backspaceStringCompare.backspaceCompare("", ""));
        assertTrue(backspaceStringCompare.backspaceCompare("###", "###"));
        assertTrue(backspaceStringCompare.backspaceCompare(null, null));
        assertFalse(backspaceStringCompare.backspaceCompare(null, ""));
        assertFalse(backspaceStringCompare.backspaceCompare("", null));
    }

    @Test
    public void testBackspaceCompareComplexCases() {
        assertTrue(backspaceStringCompare.backspaceCompare("abc###d", "d"));
        assertTrue(backspaceStringCompare.backspaceCompare("ab#d", "ad#d"));
        assertFalse(backspaceStringCompare.backspaceCompare("bxj##tw", "bxj###tw"));
        assertFalse(backspaceStringCompare.backspaceCompare("bxj##tw", "bxj###tw#"));
    }

    @Test
    public void testBackspaceCompareSpaceOptimizedBasic() {
        assertTrue(backspaceStringCompare.backspaceCompareSpaceOptimized("ab#c", "ad#c"));
        assertTrue(backspaceStringCompare.backspaceCompareSpaceOptimized("ab##", "c#d#"));
        assertFalse(backspaceStringCompare.backspaceCompareSpaceOptimized("a#c", "b"));
        assertTrue(backspaceStringCompare.backspaceCompareSpaceOptimized("a##c", "#a#c"));
    }

    @Test
    public void testBackspaceCompareSpaceOptimizedEdgeCases() {
        assertTrue(backspaceStringCompare.backspaceCompareSpaceOptimized("", ""));
        assertTrue(backspaceStringCompare.backspaceCompareSpaceOptimized("###", "###"));
        assertTrue(backspaceStringCompare.backspaceCompareSpaceOptimized(null, null));
        assertFalse(backspaceStringCompare.backspaceCompareSpaceOptimized(null, ""));
        assertFalse(backspaceStringCompare.backspaceCompareSpaceOptimized("", null));
    }

    @Test
    public void testBackspaceCompareSpaceOptimizedComplexCases() {
        assertTrue(backspaceStringCompare.backspaceCompareSpaceOptimized("abc###d", "d"));
        assertTrue(backspaceStringCompare.backspaceCompareSpaceOptimized("ab#d", "ad#d"));
        assertFalse(backspaceStringCompare.backspaceCompareSpaceOptimized("bxj##tw", "bxj###tw"));
        assertFalse(backspaceStringCompare.backspaceCompareSpaceOptimized("bxj##tw", "bxj###tw#"));
    }
}