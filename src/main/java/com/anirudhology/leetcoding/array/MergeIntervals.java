package com.anirudhology.leetcoding.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {

    /**
     * Time Complexity - O(N*log(N))
     * Space Complexity - O(1)
     */
    public int[][] merge(int[][] intervals) {
        // Special case
        if (intervals == null) {
            return intervals;
        }
        // Sort intervals using their start times
        Arrays.sort(intervals, Comparator.comparingInt(interval -> interval[0]));
        // List to store merged intervals
        List<int[]> mergedIntervals = new ArrayList<>();
        // Current interval
        int[] currentInterval = intervals[0];
        // Add this interval to the list
        mergedIntervals.add(currentInterval);
        // Traverse all the intervals
        for (int[] interval : intervals) {
            // Current end
            int currentEnd = currentInterval[1];
            // Next start and end
            int nextStart = interval[0];
            int nextEnd = interval[1];
            // Check if the intervals overlap
            if (nextStart <= currentEnd) {
                currentInterval[1] = Math.max(currentEnd, nextEnd);
            }
            // If they don't overlap, we add the next interval to the list
            else {
                currentInterval = interval;
                mergedIntervals.add(currentInterval);
            }
        }
        return mergedIntervals.toArray(new int[mergedIntervals.size()][]);
    }
}
