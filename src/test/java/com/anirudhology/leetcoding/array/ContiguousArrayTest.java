package com.anirudhology.leetcoding.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ContiguousArrayTest {

    private final ContiguousArray contiguousArray = new ContiguousArray();

    @Test
    public void testFindMaxLength() {
        // Test case with contiguous array having maximum length
        assertEquals(6, contiguousArray.findMaxLength(new int[]{0, 1, 0, 1, 0, 1}));
        // Test case with contiguous array having maximum length starting with all zeros
        assertEquals(4, contiguousArray.findMaxLength(new int[]{0, 0, 1, 1, 0}));
        // Test case with contiguous array having maximum length starting with all ones
        assertEquals(4, contiguousArray.findMaxLength(new int[]{1, 1, 1, 0, 0}));
        // Test case with empty array
        assertEquals(0, contiguousArray.findMaxLength(new int[]{}));
        // Test case with null input
        assertEquals(0, contiguousArray.findMaxLength(null));
        // Test case with single element
        assertEquals(0, contiguousArray.findMaxLength(new int[]{0}));
        assertEquals(0, contiguousArray.findMaxLength(new int[]{1}));
        // Test case with all zeros
        assertEquals(0, contiguousArray.findMaxLength(new int[]{0, 0, 0, 0, 0}));
        // Test case with all ones
        assertEquals(0, contiguousArray.findMaxLength(new int[]{1, 1, 1, 1, 1}));
    }
}