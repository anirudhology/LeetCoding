package com.anirudhology.leetcoding.array;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EmployeeFreeTime {

    /**
     * Time Complexity - O(N)
     * Space Complexity - O(N)
     */
    public List<int[]> employeeFreeTime(List<List<int[]>> schedules) {
        // List to store free time intervals
        List<int[]> freeTimes = new ArrayList<>();
        // Special case
        if (schedules == null || schedules.isEmpty()) {
            return freeTimes;
        }
        // List to flatten all the intervals
        List<int[]> flattenedIntervals = new ArrayList<>();
        for (List<int[]> schedule : schedules) {
            flattenedIntervals.addAll(schedule);
        }
        // Sort all intervals using their start time
        flattenedIntervals.sort(Comparator.comparingInt(interval -> interval[0]));
        // Now, merge all overlapping intervals
        List<int[]> mergedIntervals = new ArrayList<>();
        int[] currentInterval = flattenedIntervals.get(0);
        int currentStart = currentInterval[0];
        int currentEnd = currentInterval[1];
        // Process other intervals
        for (int i = 1; i < flattenedIntervals.size(); i++) {
            int[] interval = flattenedIntervals.get(i);
            if (interval[0] <= currentEnd) {
                currentEnd = Math.max(interval[1], currentEnd);
            } else {
                mergedIntervals.add(new int[]{currentStart, currentEnd});
                currentStart = interval[0];
                currentEnd = interval[1];
            }
        }
        mergedIntervals.add(new int[]{currentStart, currentEnd});
        // Find free times
        for (int i = 1; i < mergedIntervals.size(); i++) {
            freeTimes.add(new int[]{mergedIntervals.get(i - 1)[1], mergedIntervals.get(i)[0]});
        }
        return freeTimes;
    }
}
