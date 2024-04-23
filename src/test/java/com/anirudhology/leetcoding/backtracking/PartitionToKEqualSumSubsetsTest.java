package com.anirudhology.leetcoding.backtracking;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PartitionToKEqualSumSubsetsTest {

    private final PartitionToKEqualSumSubsets partitionToKEqualSumSubsets = new PartitionToKEqualSumSubsets();

    @Test
    public void testCanPartitionKSubsetsWithEmptyArray() {
        int[] nums = {};
        int k = 3;
        assertFalse(partitionToKEqualSumSubsets.canPartitionKSubsets(nums, k));
    }

    @Test
    public void testCanPartitionKSubsetsWithSingleElementArray() {
        int[] nums = {5};
        int k = 3;
        assertFalse(partitionToKEqualSumSubsets.canPartitionKSubsets(nums, k));
    }

    @Test
    public void testCanPartitionKSubsetsWithNonPositiveK() {
        int[] nums = {1, 2, 3};
        int k = 0;
        assertFalse(partitionToKEqualSumSubsets.canPartitionKSubsets(nums, k));
    }

    @Test
    public void testCanPartitionKSubsetsWithUnequalSum() {
        int[] nums = {1, 2, 3};
        int k = 2;
        assertTrue(partitionToKEqualSumSubsets.canPartitionKSubsets(nums, k));
    }

    @Test
    public void testCanPartitionKSubsetsWithPossiblePartitions() {
        int[] nums = {4, 3, 2, 3, 5, 2, 1};
        int k = 4;
        assertTrue(partitionToKEqualSumSubsets.canPartitionKSubsets(nums, k));
    }

    @Test
    public void testCanPartitionKSubsetsWithImpossiblePartitions() {
        int[] nums = {1, 2, 3, 4};
        int k = 3;
        assertFalse(partitionToKEqualSumSubsets.canPartitionKSubsets(nums, k));
    }
}