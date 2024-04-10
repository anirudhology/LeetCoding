package com.anirudhology.leetcoding.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InsertIntervalTest {

    private final InsertInterval insertInterval = new InsertInterval();

    @Test
    void testInsertInterval() {
        int[][] intervals = new int[][]{
                {1, 3},
                {6, 9}
        };
        int[] newInterval = new int[]{2, 5};
        int[][] expected = new int[][]{
                {1, 5},
                {6, 9}
        };
        assertArrayEquals(expected, insertInterval.insert(intervals, newInterval));

        intervals = new int[][]{
                {1, 2},
                {3, 5},
                {6, 7},
                {8, 10},
                {12, 16}
        };

    }
}