package com.anirudhology.leetcoding.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class SortColorsTest {

    private final SortColors sortColors = new SortColors();

    @Test
    public void testSortColorsWithNullArrayShouldNotModifyArray() {
        int[] nums = null;
        assertNull(sortColors.sortColorsTwoPass(nums));
        assertNull(sortColors.sortColorsOnePass(nums));
    }

    @Test
    public void testSortColorsWithEmptyArrayShouldNotModifyArray() {
        int[] nums = {};
        int[] expected = {};
        assertArrayEquals(expected, sortColors.sortColorsTwoPass(nums));
        assertArrayEquals(expected, sortColors.sortColorsOnePass(nums));
    }

    @Test
    public void testSortColorsWithAllZerosArrayShouldNotModifyArray() {
        int[] nums = {0, 0, 0};
        int[] expected = {0, 0, 0};
        assertArrayEquals(expected, sortColors.sortColorsTwoPass(nums));
        assertArrayEquals(expected, sortColors.sortColorsOnePass(nums));
    }

    @Test
    public void testSortColorsWithAllOnesArrayShouldNotModifyArray() {
        int[] nums = {1, 1, 1};
        int[] expected = {1, 1, 1};
        assertArrayEquals(expected, sortColors.sortColorsTwoPass(nums));
        assertArrayEquals(expected, sortColors.sortColorsOnePass(nums));
    }

    @Test
    public void testSortColorsWithAllTwosArrayShouldNotModifyArray() {
        int[] nums = {2, 2, 2};
        int[] expected = {2, 2, 2};
        assertArrayEquals(expected, sortColors.sortColorsTwoPass(nums));
        assertArrayEquals(expected, sortColors.sortColorsOnePass(nums));
    }

    @Test
    public void testSortColorsWithMixedArrayShouldSortColors() {
        int[] nums = {2, 0, 1, 2, 1, 0};
        int[] expected = {0, 0, 1, 1, 2, 2};
        assertArrayEquals(expected, sortColors.sortColorsTwoPass(nums));
        assertArrayEquals(expected, sortColors.sortColorsOnePass(nums));
    }
}