package com.anirudhology.leetcoding.graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TimeNeededToInformAllEmployeesTest {

    private final TimeNeededToInformAllEmployees timeNeededToInformAllEmployees = new TimeNeededToInformAllEmployees();

    @Test
    public void testNumOfMinutesBasic() {
        int n = 6;
        int headID = 2;
        int[] manager = {2, 2, -1, 2, 2, 2};
        int[] informTime = {0, 0, 1, 0, 0, 0};
        assertEquals(1, timeNeededToInformAllEmployees.numOfMinutes(n, headID, manager, informTime));
    }

    @Test
    public void testNumOfMinutesNoSubordinates() {
        int n = 1;
        int headID = 0;
        int[] manager = {-1};
        int[] informTime = {0};
        assertEquals(0, timeNeededToInformAllEmployees.numOfMinutes(n, headID, manager, informTime));
    }

    @Test
    public void testNumOfMinutesSingleSubordinate() {
        int n = 2;
        int headID = 0;
        int[] manager = {-1, 0};
        int[] informTime = {0, 10};
        assertEquals(0, timeNeededToInformAllEmployees.numOfMinutes(n, headID, manager, informTime));
    }

    @Test
    public void testNumOfMinutesMultipleSubordinates() {
        int n = 3;
        int headID = 0;
        int[] manager = {-1, 0, 0};
        int[] informTime = {0, 5, 10};
        assertEquals(0, timeNeededToInformAllEmployees.numOfMinutes(n, headID, manager, informTime));
    }

}