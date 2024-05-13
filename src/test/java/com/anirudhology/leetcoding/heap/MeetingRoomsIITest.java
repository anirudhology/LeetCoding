package com.anirudhology.leetcoding.heap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MeetingRoomsIITest {

    private final MeetingRoomsII meetingRoomsII = new MeetingRoomsII();

    @Test
    void testMinMeetingRooms() {
        int[][] intervals = new int[][]{{0, 30}, {5, 10}, {15, 20}};
        assertEquals(2, meetingRoomsII.minMeetingRooms(intervals));

        intervals = new int[][]{{7, 10}, {2, 4}};
        assertEquals(1, meetingRoomsII.minMeetingRooms(intervals));

        intervals = new int[][]{{1, 3}, {9, 18}, {3, 7}, {6, 12}, {4, 9}};
        assertEquals(3, meetingRoomsII.minMeetingRooms(intervals));
    }
}