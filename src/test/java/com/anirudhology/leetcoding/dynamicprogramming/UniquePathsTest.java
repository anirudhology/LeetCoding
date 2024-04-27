package com.anirudhology.leetcoding.dynamicprogramming;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UniquePathsTest {

    private final UniquePaths uniquePaths = new UniquePaths();

    @Test
    public void testUniquePathsRecursive() {
        assertEquals(1, uniquePaths.uniquePathsRecursive(1, 1));
        assertEquals(1, uniquePaths.uniquePathsRecursive(1, 2));
        assertEquals(1, uniquePaths.uniquePathsRecursive(2, 1));
        assertEquals(2, uniquePaths.uniquePathsRecursive(2, 2));
        assertEquals(3, uniquePaths.uniquePathsRecursive(2, 3));
        assertEquals(3, uniquePaths.uniquePathsRecursive(3, 2));
        assertEquals(6, uniquePaths.uniquePathsRecursive(3, 3));
        assertEquals(10, uniquePaths.uniquePathsRecursive(3, 4));
        assertEquals(10, uniquePaths.uniquePathsRecursive(4, 3));
        assertEquals(0, uniquePaths.uniquePathsRecursive(0, 0));
    }

    @Test
    public void testUniquePathsMemoized() {
        assertEquals(1, uniquePaths.uniquePathsMemoized(1, 1));
        assertEquals(1, uniquePaths.uniquePathsMemoized(1, 2));
        assertEquals(1, uniquePaths.uniquePathsMemoized(2, 1));
        assertEquals(2, uniquePaths.uniquePathsMemoized(2, 2));
        assertEquals(3, uniquePaths.uniquePathsMemoized(2, 3));
        assertEquals(3, uniquePaths.uniquePathsMemoized(3, 2));
        assertEquals(6, uniquePaths.uniquePathsMemoized(3, 3));
        assertEquals(10, uniquePaths.uniquePathsMemoized(3, 4));
        assertEquals(10, uniquePaths.uniquePathsMemoized(4, 3));
        assertEquals(0, uniquePaths.uniquePathsMemoized(0, 0));
    }
}