package com.anirudhology.leetcoding.dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PartitionEqualSubsetSumTest {

    private final PartitionEqualSubsetSum partitionEqualSubsetSum = new PartitionEqualSubsetSum();

    @Test
    public void testCanPartitionWithNullArrayShouldReturnTrue() {
        int[] nums = null;
        assertTrue(partitionEqualSubsetSum.canPartition(nums));
    }

    @Test
    public void testCanPartitionWithEmptyArrayShouldReturnTrue() {
        int[] nums = {};
        assertTrue(partitionEqualSubsetSum.canPartition(nums));
    }

    @Test
    public void testCanPartitionWithEvenSumArrayShouldReturnTrue() {
        int[] nums = {1, 5, 11, 5};
        assertTrue(partitionEqualSubsetSum.canPartition(nums));
    }

    @Test
    public void testCanPartitionWithOddSumArrayShouldReturnFalse() {
        int[] nums = {1, 2, 3, 5};
        assertFalse(partitionEqualSubsetSum.canPartition(nums));
    }
}