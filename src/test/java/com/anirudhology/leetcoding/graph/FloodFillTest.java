package com.anirudhology.leetcoding.graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class FloodFillTest {

    private final FloodFill floodFill = new FloodFill();

    @Test
    public void testFloodFillBasic() {
        int[][] image = {
                {1, 1, 1},
                {1, 1, 0},
                {1, 0, 1}
        };
        int[][] expected = {
                {2, 2, 2},
                {2, 2, 0},
                {2, 0, 1}
        };
        assertArrayEquals(expected, floodFill.floodFill(image, 1, 1, 2));
    }

    @Test
    public void testFloodFillAlreadyColored() {
        int[][] image = {
                {1, 1, 1},
                {1, 1, 1},
                {1, 1, 1}
        };
        int[][] expected = {
                {1, 1, 1},
                {1, 1, 1},
                {1, 1, 1}
        };
        assertArrayEquals(expected, floodFill.floodFill(image, 1, 1, 1));
    }

    @Test
    public void testFloodFillSinglePixel() {
        int[][] image = {{1}};
        int[][] expected = {{2}};
        assertArrayEquals(expected, floodFill.floodFill(image, 0, 0, 2));
    }

    @Test
    public void testFloodFillMultiplePixels() {
        int[][] image = {
                {0, 0, 0},
                {0, 1, 1},
                {1, 0, 0}
        };
        int[][] expected = {
                {2, 2, 2},
                {2, 1, 1},
                {1, 0, 0}
        };
        assertArrayEquals(expected, floodFill.floodFill(image, 0, 0, 2));
    }
}