package com.anirudhology.leetcoding.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestConsecutiveSequenceTest {

    private final LongestConsecutiveSequence longestConsecutiveSequence = new LongestConsecutiveSequence();

    // Test null input
    @Test
    public void testLongestConsecutiveNullInput() {
        assertEquals(0, longestConsecutiveSequence.longestConsecutiveSubOptimal(null));
        assertEquals(0, longestConsecutiveSequence.longestConsecutiveOptimal(null));
    }

    // Test array with no elements
    @Test
    public void testLongestConsecutiveEmptyArray() {
        assertEquals(0, longestConsecutiveSequence.longestConsecutiveSubOptimal(new int[]{}));
        assertEquals(0, longestConsecutiveSequence.longestConsecutiveOptimal(new int[]{}));
    }

    // Test array with a single element
    @Test
    public void testLongestConsecutiveSingleElementArray() {
        assertEquals(1, longestConsecutiveSequence.longestConsecutiveSubOptimal(new int[]{5}));
        assertEquals(1, longestConsecutiveSequence.longestConsecutiveOptimal(new int[]{5}));
    }

    // Test array with consecutive elements
    @Test
    public void testLongestConsecutiveConsecutiveElementsArray() {
        assertEquals(5, longestConsecutiveSequence.longestConsecutiveSubOptimal(new int[] {100, 101, 102, 103, 104}));
        assertEquals(5, longestConsecutiveSequence.longestConsecutiveOptimal(new int[] {100, 101, 102, 103, 104}));
    }

    // Test array with non-consecutive elements
    @Test
    public void testLongestConsecutiveNonConsecutiveElementsArray() {
        assertEquals(2, longestConsecutiveSequence.longestConsecutiveSubOptimal(new int[] {100, 102, 103, 105, 106}));
        assertEquals(2, longestConsecutiveSequence.longestConsecutiveOptimal(new int[] {100, 102, 103, 105, 106}));
    }
}