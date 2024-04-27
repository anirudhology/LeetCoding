package com.anirudhology.leetcoding.graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberOfIslandsTest {

    private final NumberOfIslands numberOfIslands = new NumberOfIslands();

    @Test
    public void testNumIslandsBasic() {
        char[][] grid = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };
        assertEquals(3, numberOfIslands.numIslands(grid));
    }

    @Test
    public void testNumIslandsNoIslands() {
        char[][] grid = {
                {'0', '0', '0'},
                {'0', '0', '0'},
                {'0', '0', '0'}
        };
        assertEquals(0, numberOfIslands.numIslands(grid));
    }

    @Test
    public void testNumIslandsSingleCellGrid() {
        char[][] grid = {{'1'}};
        assertEquals(1, numberOfIslands.numIslands(grid));
    }

    @Test
    public void testNumIslandsMultipleIslands() {
        char[][] grid = {
                {'1', '0', '0', '1', '1'},
                {'0', '0', '0', '0', '0'},
                {'0', '0', '0', '0', '1'},
                {'1', '1', '0', '0', '0'}
        };
        assertEquals(4, numberOfIslands.numIslands(grid));
    }

    @Test
    public void testNumIslandsComplexGrid() {
        char[][] grid = {
                {'1', '1', '0', '0', '0'},
                {'1', '0', '0', '0', '1'},
                {'0', '0', '0', '1', '1'},
                {'0', '0', '0', '0', '0'},
                {'1', '0', '1', '0', '1'}
        };
        assertEquals(5, numberOfIslands.numIslands(grid));
    }
}