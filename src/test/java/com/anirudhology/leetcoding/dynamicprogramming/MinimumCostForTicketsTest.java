package com.anirudhology.leetcoding.dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MinimumCostForTicketsTest {

    private final MinimumCostForTickets minimumCostForTickets = new MinimumCostForTickets();

    // Test null inputs
    @Test
    public void testMinCostTicketsNullInputs() {
        int[] days = null;
        int[] costs = null;
        assertThrows(IllegalArgumentException.class, () -> minimumCostForTickets.minCostTickets(days, costs));
    }

    // Test empty arrays
    @Test
    public void testMinCostTicketsEmptyArrays() {
        int[] days = {};
        int[] costs = {};
        assertThrows(IllegalArgumentException.class, () -> minimumCostForTickets.minCostTickets(days, costs));
    }

    // Test different length arrays
    @Test
    public void testMinCostTicketsDifferentLengthArrays() {
        int[] days = {1, 4, 6, 7, 8};
        int[] costs = {2, 7};
        assertThrows(IllegalArgumentException.class, () -> minimumCostForTickets.minCostTickets(days, costs));
    }

    // Test single day
    @Test
    public void testMinCostTicketsSingleDay() {
        int[] days = {1};
        int[] costs = {2, 7, 15};
        assertEquals(2, minimumCostForTickets.minCostTickets(days, costs));
    }

    // Test multiple days with different costs
    @Test
    public void testMinCostTicketsMultipleDays() {
        int[] days = {1, 4, 6, 7, 8, 20};
        int[] costs = {2, 7, 15};
        assertEquals(11, minimumCostForTickets.minCostTickets(days, costs));
    }

    // Test multiple days with the same cost
    @Test
    public void testMinCostTicketsMultipleDaysSameCost() {
        int[] days = {1, 4, 6, 7, 8, 20};
        int[] costs = {2, 2, 2};
        assertEquals(2, minimumCostForTickets.minCostTickets(days, costs));
    }
}