package com.anirudhology.leetcoding.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class MergeIntervalsTest {

    private final MergeIntervals mergeIntervals = new MergeIntervals();

    @Test
    public void testMergeWithNullIntervalsShouldReturnNull() {
        int[][] intervals = null;
        int[][] expected = null;
        int[][] actual = mergeIntervals.merge(intervals);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testMergeWithEmptyIntervalsShouldReturnEmptyArray() {
        int[][] intervals = null;
        int[][] actual = mergeIntervals.merge(intervals);
        assertNull(actual);
    }

    @Test
    public void testMergeWithNonOverlappingIntervalsShouldReturnSameIntervals() {
        int[][] intervals = {{1, 2}, {3, 4}, {5, 6}};
        int[][] expected = {{1, 2}, {3, 4}, {5, 6}};
        int[][] actual = mergeIntervals.merge(intervals);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testMergeWithOverlappingIntervalsShouldMergeIntervals() {
        int[][] intervals = {{1, 3}, {2, 4}, {5, 6}};
        int[][] expected = {{1, 4}, {5, 6}};
        int[][] actual = mergeIntervals.merge(intervals);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testMergeWithNestedIntervalsShouldMergeIntervals() {
        int[][] intervals = {{1, 3}, {2, 5}, {4, 6}};
        int[][] expected = {{1, 6}};
        int[][] actual = mergeIntervals.merge(intervals);
        assertArrayEquals(expected, actual);
    }
}