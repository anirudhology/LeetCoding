package com.anirudhology.leetcoding.array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class MeetingRoomsII {

    /**
     * Time Complexity - O(N*log(N)
     * Space Complexity - O(N)
     */
    public int minMeetingRooms(int[][] intervals) {
        // Special case
        if (intervals == null || intervals.length == 0) {
            return 0;
        }
        // Sort meeting rooms by start time
        Arrays.sort(intervals, Comparator.comparingInt(interval -> interval[0]));
        // Min heap to keep track of end times
        Queue<Integer> minHeap = new PriorityQueue<>();
        // Traverse through all the intervals
        for (int[] interval : intervals) {
            // When meetings are not overlapping, we can use the same room
            if (!minHeap.isEmpty() && interval[0] >= minHeap.peek()) {
                minHeap.remove();
            }
            // Add end time to heap
            minHeap.offer(interval[1]);
        }
        return minHeap.size();
    }
}
