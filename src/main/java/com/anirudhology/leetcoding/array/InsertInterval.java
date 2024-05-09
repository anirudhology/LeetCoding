package com.anirudhology.leetcoding.array;

import java.util.ArrayList;
import java.util.List;

public class InsertInterval {

    /**
     * Time Complexity - O(N)
     * Space Complexity - O(1)
     */
    public int[][] insert(int[][] intervals, int[] newInterval) {
        // Special cases
        if (intervals == null || intervals.length == 0 || newInterval == null || newInterval.length == 0) {
            return new int[][]{newInterval};
        }
        // List to store overlapped intervals
        List<int[]> result = new ArrayList<>();
        // To insert the newInterval so that the order is maintained, we need to
        // compare the end of the current interval with the start of the new interval.
        // If the currentEnd < newStart, we will insert the new interval.
        int index = 0;
        // Total number of intervals
        int n = intervals.length;
        // Step 1 - check for all the intervals that are smaller than the newInterval
        while (index < n && intervals[index][1] < newInterval[0]) {
            result.add(intervals[index]);
            index++;
        }
        // Step 2 - check for overlapping intervals
        while (index < n && intervals[index][0] <= newInterval[1]) {
            newInterval = new int[]{
                    Math.min(intervals[index][0], newInterval[0]),
                    Math.max(intervals[index][1], newInterval[1])};
            index++;
        }
        // Add overlapped intervals
        result.add(newInterval);
        // Add remaining intervals, if any
        while (index < n) {
            result.add(intervals[index]);
            index++;
        }
        return result.toArray(new int[result.size()][]);
    }
}
