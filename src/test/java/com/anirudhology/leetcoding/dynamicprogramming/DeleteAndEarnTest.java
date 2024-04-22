package com.anirudhology.leetcoding.dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DeleteAndEarnTest {

    private final DeleteAndEarn deleteAndEarn = new DeleteAndEarn();
    
    @Test
    public void testDeleteAndEarnWithEmptyArray() {
        int[] nums = {};
        assertEquals(0, deleteAndEarn.deleteAndEarn(nums));
    }

    @Test
    public void testDeleteAndEarnWithSingleElement() {
        int[] nums = {5};
        assertEquals(5, deleteAndEarn.deleteAndEarn(nums));
    }

    @Test
    public void testDeleteAndEarnWithTwoDistinctElements() {
        int[] nums = {3, 4};
        assertEquals(4, deleteAndEarn.deleteAndEarn(nums));
    }

    @Test
    public void testDeleteAndEarnWithMultipleElements() {
        int[] nums = {3, 4, 2, 2, 3, 3, 4, 4, 5, 6};
        assertEquals(22, deleteAndEarn.deleteAndEarn(nums));
    }

    @Test
    public void testDeleteAndEarnWithRepeatedElements() {
        int[] nums = {2, 2, 2, 2, 2, 2};
        assertEquals(12, deleteAndEarn.deleteAndEarn(nums));
    }
}