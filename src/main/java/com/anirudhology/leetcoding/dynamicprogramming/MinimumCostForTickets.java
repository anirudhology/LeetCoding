package com.anirudhology.leetcoding.dynamicprogramming;

public class MinimumCostForTickets {

    public int minCostTickets(int[] days, int[] costs) {
        // Special cases
        if (days == null || days.length == 0 || costs == null || costs.length < 3) {
            throw new IllegalArgumentException("Invalid inputs!!!");
        }
        // Total number of travelling days
        int n = days.length;
        // Last day to travel
        int lastDay = days[n - 1];
        // Lookup table to store the cost on various days
        int[] lookup = new int[lastDay + 1];
        // Boolean array to mark travel days
        boolean[] travelDays = new boolean[lastDay + 1];
        for (int day : days) {
            travelDays[day] = true;
        }
        // Traverse from day 1 to last day
        for (int i = 1; i <= lastDay; i++) {
            // Check if the current day is the travelling day
            if (!travelDays[i]) {
                lookup[i] = lookup[i - 1];
            } else {
                // Select which type of ticket to buy
                lookup[i] = costs[0] + lookup[i - 1];
                lookup[i] = Math.min(costs[1] + lookup[Math.max(0, i - 7)], lookup[i]);
                lookup[i] = Math.min(costs[2] + lookup[Math.max(0, i - 30)], lookup[i]);
            }
        }
        return lookup[lastDay];
    }
}
