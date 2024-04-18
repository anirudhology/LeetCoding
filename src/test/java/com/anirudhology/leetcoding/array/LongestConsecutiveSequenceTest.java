package com.anirudhology.leetcoding.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestConsecutiveSequenceTest {

    private final LongestConsecutiveSequence longestConsecutiveSequence = new LongestConsecutiveSequence();

    // Test null input
    @Test
    public void testLongestConsecutiveNullInput() {
        assertEquals(0, longestConsecutiveSequence.longestConsecutive(null));
    }

    // Test array with no elements
    @Test
    public void testLongestConsecutiveEmptyArray() {
        assertEquals(0, longestConsecutiveSequence.longestConsecutive(new int[] {}));
    }

    // Test array with a single element
    @Test
    public void testLongestConsecutiveSingleElementArray() {
        assertEquals(1, longestConsecutiveSequence.longestConsecutive(new int[] {5}));
    }

    // Test array with consecutive elements
    @Test
    public void testLongestConsecutiveConsecutiveElementsArray() {
        assertEquals(5, longestConsecutiveSequence.longestConsecutive(new int[] {100, 101, 102, 103, 104}));
    }

    // Test array with non-consecutive elements
    @Test
    public void testLongestConsecutiveNonConsecutiveElementsArray() {
        assertEquals(2, longestConsecutiveSequence.longestConsecutive(new int[] {100, 102, 103, 105, 106}));
    }
}