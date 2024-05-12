package com.anirudhology.leetcoding.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class RotateArrayTest {

    private final RotateArray rotateArray = new RotateArray();

    @Test
    void testRotateWithLinearSpace() {
        // Test case with positive rotation
        assertArrayEquals(new int[]{5, 6, 1, 2, 3, 4}, rotateArray.rotateWithLinearSpace(new int[]{1, 2, 3, 4, 5, 6}, 2));
        // Test case with zero rotation
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, rotateArray.rotateWithLinearSpace(new int[]{1, 2, 3, 4, 5, 6}, 0));
        // Test case with negative rotation
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, rotateArray.rotateWithLinearSpace(new int[]{1, 2, 3, 4, 5, 6}, -2));
        // Test case with null input
        assertNull(rotateArray.rotateWithLinearSpace(null, 2));
        // Test case with empty array
        assertArrayEquals(new int[]{}, rotateArray.rotateWithLinearSpace(new int[]{}, 2));
    }

    @Test
    void testRotateWithConstantSpace() {
        // Test case with positive rotation
        assertArrayEquals(new int[]{5, 6, 1, 2, 3, 4}, rotateArray.rotateWithConstantSpace(new int[]{1, 2, 3, 4, 5, 6}, 2));
        // Test case with zero rotation
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, rotateArray.rotateWithConstantSpace(new int[]{1, 2, 3, 4, 5, 6}, 0));
        // Test case with negative rotation
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, rotateArray.rotateWithConstantSpace(new int[]{1, 2, 3, 4, 5, 6}, -2));
        // Test case with null input
        assertNull(rotateArray.rotateWithConstantSpace(null, 2));
        // Test case with empty array
        assertArrayEquals(new int[]{}, rotateArray.rotateWithConstantSpace(new int[]{}, 2));
    }

}