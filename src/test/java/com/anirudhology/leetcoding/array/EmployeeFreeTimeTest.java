package com.anirudhology.leetcoding.array;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeFreeTimeTest {

    private final EmployeeFreeTime employeeFreeTime = new EmployeeFreeTime();

    @Test
    public void testEmployeeFreeTime() {
        // Test case with overlapping intervals
        List<List<int[]>> schedules1 = new ArrayList<>();
        schedules1.add(List.of(new int[]{1, 2}, new int[]{5, 6}));
        schedules1.add(List.of(new int[]{1, 3}));
        schedules1.add(List.of(new int[]{4, 10}));
        List<int[]> expected1 = List.of(new int[]{3, 4});
        List<int[]> actual1 = employeeFreeTime.employeeFreeTime(schedules1);
        assertEquals(actual1.size(), expected1.size());
        for (int i = 0; i < actual1.size(); i++) {
            assertArrayEquals(actual1.get(i), expected1.get(i));
        }

        // Test case with no overlapping intervals
        List<List<int[]>> schedules2 = new ArrayList<>();
        schedules2.add(Arrays.asList(new int[]{1, 2}, new int[]{5, 6}));
        schedules2.add(Arrays.asList(new int[]{3, 4}, new int[]{7, 8}));
        List<int[]> expected2 = Arrays.asList(new int[]{2, 3}, new int[]{4, 5}, new int[]{6, 7});
        List<int[]> actual2 = employeeFreeTime.employeeFreeTime(schedules2);
        assertEquals(actual2.size(), expected2.size());
        for (int i = 0; i < actual1.size(); i++) {
            assertArrayEquals(actual2.get(i), expected2.get(i));
        }

        // Test case with empty schedules
        List<List<int[]>> schedules3 = new ArrayList<>();
        List<int[]> actual3 = employeeFreeTime.employeeFreeTime(schedules3);
        assertTrue(actual3.isEmpty());

        // Test case with single schedule having one interval
        List<List<int[]>> schedules4 = new ArrayList<>();
        schedules4.add(List.of(new int[]{1, 3}));
        List<int[]> actual4 = employeeFreeTime.employeeFreeTime(schedules4);
        assertEquals(0, actual4.size());


        // Test case with single schedule having multiple intervals
        List<List<int[]>> schedules5 = new ArrayList<>();
        schedules5.add(Arrays.asList(new int[]{1, 2}, new int[]{4, 5}, new int[]{7, 8}));
        List<int[]> expected5 = Arrays.asList(new int[]{2, 4}, new int[]{5, 7});
        List<int[]> actual5 = employeeFreeTime.employeeFreeTime(schedules5);
        assertEquals(actual5.size(), expected5.size());
        for (int i = 0; i < actual5.size(); i++) {
            assertArrayEquals(actual5.get(i), expected5.get(i));
        }
    }
}