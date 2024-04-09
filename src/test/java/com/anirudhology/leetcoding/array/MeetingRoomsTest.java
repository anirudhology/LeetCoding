package com.anirudhology.leetcoding.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MeetingRoomsTest {

    private final MeetingRooms meetingRooms = new MeetingRooms();

    @Test
    void testCanAttendMeetingsNormalCase() {
        // Normal case: meetings without overlap
        int[][] intervals1 = {{0, 30}, {35, 45}, {50, 60}};
        assertTrue(meetingRooms.canAttendMeetings(intervals1));

        // Normal case: meetings with overlap
        int[][] intervals2 = {{0, 30}, {5, 10}, {15, 20}};
        assertFalse(meetingRooms.canAttendMeetings(intervals2));
    }

    @Test
    void testCanAttendMeetingsSpecialCase() {
        // Special case: empty array
        int[][] intervals3 = {};
        IllegalArgumentException exception1 = assertThrows(IllegalArgumentException.class, () -> meetingRooms.canAttendMeetings(intervals3));
        assertEquals("There are no meetings to attend!", exception1.getMessage());

        // Special case: null array
        int[][] intervals4 = null;
        IllegalArgumentException exception2 = assertThrows(IllegalArgumentException.class, () -> meetingRooms.canAttendMeetings(intervals4));
        assertEquals("There are no meetings to attend!", exception2.getMessage());
    }

    @Test
    void testCanAttendMeetingsSingleMeeting() {
        // Single meeting in the array
        int[][] intervals5 = {{0, 30}};
        assertTrue(meetingRooms.canAttendMeetings(intervals5));
    }
}