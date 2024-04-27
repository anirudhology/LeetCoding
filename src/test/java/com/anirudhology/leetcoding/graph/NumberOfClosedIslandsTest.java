package com.anirudhology.leetcoding.graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberOfClosedIslandsTest {

    private final NumberOfClosedIslands numberOfClosedIslands = new NumberOfClosedIslands();

    @Test
    public void testClosedIslandsBasic() {
        int[][] grid = {
                {1, 1, 1, 1},
                {1, 0, 0, 1},
                {1, 0, 0, 1},
                {1, 1, 1, 1}
        };
        assertEquals(1, numberOfClosedIslands.closedIsland(grid));
    }

    @Test
    public void testClosedIslandsNoClosedIslands() {
        int[][] grid = {
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1}
        };
        assertEquals(0, numberOfClosedIslands.closedIsland(grid));
    }

    @Test
    public void testClosedIslandsSingleCellGrid() {
        int[][] grid = {{1}};
        assertEquals(0, numberOfClosedIslands.closedIsland(grid));
    }

    @Test
    public void testClosedIslandsMultipleClosedIslands() {
        int[][] grid = {
                {1, 1, 1, 1},
                {1, 0, 0, 1},
                {1, 0, 0, 1},
                {1, 1, 1, 0}
        };
        assertEquals(1, numberOfClosedIslands.closedIsland(grid));
    }

    @Test
    public void testClosedIslandsComplexGrid() {
        int[][] grid = {
                {1, 1, 1, 1, 1},
                {1, 0, 0, 0, 1},
                {1, 0, 1, 0, 1},
                {1, 0, 0, 0, 1},
                {1, 1, 1, 1, 1}
        };
        assertEquals(1, numberOfClosedIslands.closedIsland(grid));
    }

}