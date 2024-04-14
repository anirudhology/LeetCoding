package com.anirudhology.leetcoding.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ContainerWithMostWaterTest {

    private final ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();

    @Test
    public void testMaxAreaWithNullArrayShouldReturnZero() {
        int[] height = null;
        int expected = 0;
        int actual = containerWithMostWater.maxArea(height);
        assertEquals(expected, actual);
    }

    @Test
    public void testMaxAreaWithEmptyArrayShouldReturnZero() {
        int[] height = {};
        int expected = 0;
        int actual = containerWithMostWater.maxArea(height);
        assertEquals(expected, actual);
    }

    @Test
    public void testMaxAreaWithSingleElementArrayShouldReturnZero() {
        int[] height = {5};
        int expected = 0;
        int actual = containerWithMostWater.maxArea(height);
        assertEquals(expected, actual);
    }

    @Test
    public void testMaxAreaWithIncreasingHeightsArrayShouldReturnCorrectArea() {
        int[] height = {1, 2, 3, 4, 5};
        int expected = 6; // (min(1,5) * 4)
        int actual = containerWithMostWater.maxArea(height);
        assertEquals(expected, actual);
    }

    @Test
    public void testMaxAreaWithDecreasingHeightsArrayShouldReturnCorrectArea() {
        int[] height = {5, 4, 3, 2, 1};
        int expected = 6; // (min(5,1) * 4)
        int actual = containerWithMostWater.maxArea(height);
        assertEquals(expected, actual);
    }

    @Test
    public void testMaxAreaWithMixedHeightsArrayShouldReturnCorrectArea() {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int expected = 49; // (min(1,7) * 8)
        int actual = containerWithMostWater.maxArea(height);
        assertEquals(expected, actual);
    }

}