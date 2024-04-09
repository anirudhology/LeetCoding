package com.anirudhology.leetcoding.array;

import java.util.Arrays;
import java.util.Comparator;

public class MeetingRooms {

    public boolean canAttendMeetings(int[][] intervals) {
        // Special case
        if (intervals == null || intervals.length == 0) {
            throw new IllegalArgumentException("There are no meetings to attend!");
        }
        // Sort the array by start time of meetings
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));
        // Traverse through the meetings one by one
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i - 1][1] > intervals[i][0]) {
                return false;
            }
        }
        return true;
    }
}
