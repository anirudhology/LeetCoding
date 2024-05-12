package com.anirudhology.leetcoding.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SubarraySumEqualsKTest {

    private final SubarraySumEqualsK subarraySumEqualsK = new SubarraySumEqualsK();

    @Test
    public void testSubarraySumBruteForce() {
        // Test case with multiple valid subarrays
        assertEquals(2, subarraySumEqualsK.subarraySumBruteForce(new int[]{1, 2, 3, 4, 5}, 5));

        // Test case with no valid subarrays
        assertEquals(0, subarraySumEqualsK.subarraySumBruteForce(new int[]{1, 2, 3, 4, 5}, 20));

        // Test case with all elements equal to target
        assertEquals(5, subarraySumEqualsK.subarraySumBruteForce(new int[]{5, 5, 5, 5, 5}, 5));

        // Test case with empty array
        assertEquals(0, subarraySumEqualsK.subarraySumBruteForce(new int[]{}, 5));

        // Test case with null input
        assertEquals(0, subarraySumEqualsK.subarraySumBruteForce(null, 5));

        // Test case with single element array
        assertEquals(1, subarraySumEqualsK.subarraySumBruteForce(new int[]{5}, 5));
    }

    @Test
    public void testSubarraySumOptimal() {
        // Test case with multiple valid subarrays
        assertEquals(2, subarraySumEqualsK.subarraySumOptimal(new int[]{1, 2, 3, 4, 5}, 5));

        // Test case with no valid subarrays
        assertEquals(0, subarraySumEqualsK.subarraySumOptimal(new int[]{1, 2, 3, 4, 5}, 20));

        // Test case with all elements equal to target
        assertEquals(5, subarraySumEqualsK.subarraySumOptimal(new int[]{5, 5, 5, 5, 5}, 5));

        // Test case with empty array
        assertEquals(0, subarraySumEqualsK.subarraySumOptimal(new int[]{}, 5));

        // Test case with null input
        assertEquals(0, subarraySumEqualsK.subarraySumOptimal(null, 5));

        // Test case with single element array
        assertEquals(1, subarraySumEqualsK.subarraySumOptimal(new int[]{5}, 5));
    }
}