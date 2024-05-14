package com.anirudhology.leetcoding.backtracking;

import java.util.Arrays;
import java.util.Comparator;

public class NonOverlappingIntervals {

    /**
     * Time Complexity - O(N*log(N)
     * Space Complexity - O(1)
     */
    public int eraseOverlapIntervals(int[][] intervals) {
        // Special case
        if (intervals == null || intervals.length == 0) {
            return 0;
        }
        // Sort the array by their end times
        Arrays.sort(intervals, Comparator.comparingInt(interval -> interval[1]));
        // Count of intervals removed
        int removedIntervals = 1;
        // Current end time
        int currentEnd = intervals[0][1];
        // Traverse through other intervals
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] >= currentEnd) {
                currentEnd = intervals[i][1];
                removedIntervals++;
            }
        }
        return intervals.length - removedIntervals;
    }
}
