package com.anirudhology.leetcoding.greedy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NonOverlappingIntervalsTest {

    private final NonOverlappingIntervals nonOverlappingIntervals = new NonOverlappingIntervals();

    @Test
    public void testEraseOverlapIntervals() {
        // Test case with the smallest possible input array
        assertEquals(0, nonOverlappingIntervals.eraseOverlapIntervals(new int[][]{}));

        // Test case with null input
        assertEquals(0, nonOverlappingIntervals.eraseOverlapIntervals(null));

        // Test case with single interval
        assertEquals(0, nonOverlappingIntervals.eraseOverlapIntervals(new int[][]{{1, 2}}));

        // Test case with no overlapping intervals
        assertEquals(0, nonOverlappingIntervals.eraseOverlapIntervals(new int[][]{{1, 2}, {3, 4}, {5, 6}}));

        // Test case with all intervals overlapping
        assertEquals(1, nonOverlappingIntervals.eraseOverlapIntervals(new int[][]{{1, 4}, {2, 3}, {3, 5}}));

        // Test case with some overlapping intervals
        assertEquals(0, nonOverlappingIntervals.eraseOverlapIntervals(new int[][]{{1, 2}, {2, 3}, {3, 4}, {4, 5}}));

        // Test case with all intervals being the same
        assertEquals(2, nonOverlappingIntervals.eraseOverlapIntervals(new int[][]{{1, 2}, {1, 2}, {1, 2}}));

        // Test case with intervals in descending order of end times
        assertEquals(0, nonOverlappingIntervals.eraseOverlapIntervals(new int[][]{{5, 6}, {3, 4}, {1, 2}}));

        // Test case with intervals in ascending order of start times
        assertEquals(0, nonOverlappingIntervals.eraseOverlapIntervals(new int[][]{{1, 2}, {2, 3}, {3, 4}, {4, 5}}));
    }
}