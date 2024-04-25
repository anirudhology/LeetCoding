package com.anirudhology.leetcoding.graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberOfEnclavesTest {

    private final NumberOfEnclaves numberOfEnclaves = new NumberOfEnclaves();

    @Test
    public void testNumEnclavesBasic() {
        int[][] grid = {
                {0, 0, 0, 0},
                {1, 0, 1, 0},
                {0, 1, 1, 0},
                {0, 0, 0, 0}
        };
        assertEquals(3, numberOfEnclaves.numEnclaves(grid));
    }

    @Test
    public void testNumEnclavesEmptyGrid() {
        int[][] grid = {};
        assertEquals(0, numberOfEnclaves.numEnclaves(grid));
    }

    @Test
    public void testNumEnclavesAllEnclaves() {
        int[][] grid = {
                {1, 1},
                {1, 1}
        };
        assertEquals(0, numberOfEnclaves.numEnclaves(grid));
    }

    @Test
    public void testNumEnclavesNoEnclaves() {
        int[][] grid = {
                {0, 0},
                {0, 0}
        };
        assertEquals(0, numberOfEnclaves.numEnclaves(grid));
    }
}