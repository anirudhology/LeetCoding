package com.anirudhology.leetcoding.greedy;

public class GasStation {

    /**
     * Time Complexity - O(N^2)
     * Space Complexity - O(1)
     */
    public int canCompleteCircuitBruteForce(int[] gas, int[] cost) {
        // Special case
        if (gas == null || gas.length == 0 || cost == null || cost.length == 0) {
            return -1;
        }
        // Total number of stops
        int n = gas.length;
        // Process each combination
        for (int i = 0; i < n; i++) {
            // Fuel at the start
            int totalFuel = 0;
            // Number of stops we have covered
            int stops = 0;
            int j = i;
            // Process until we traverse all the stops
            while (stops < n) {
                totalFuel += gas[j % n] - cost[j % n];
                // If totalFuel becomes negative, it means
                // current stop can't be the starting point
                if (totalFuel < 0) {
                    break;
                }
                stops++;
                j++;
            }
            if (stops == n) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Time Complexity - O(N)
     * Space Complexity - O(1)
     */
    public int canCompleteCircuitOptimalTwoPass(int[] gas, int[] cost) {
        // Special case
        if (gas == null || gas.length == 0 || cost == null || cost.length == 0) {
            return -1;
        }
        // Total number of stops
        int n = gas.length;
        // Calculate total sum of gas and cost
        int totalGas = 0;
        int totalCost = 0;
        for (int i = 0; i < n; i++) {
            totalGas += gas[i];
            totalCost += cost[i];
        }
        // Check if we have sufficient gas to make the trip
        if (totalGas < totalCost) {
            return -1;
        }
        // Now, if we have at this point, we have made sure that the solution exists
        int fuel = 0;
        int start = 0;
        for (int i = 0; i < n; i++) {
            fuel += gas[i] - cost[i];
            // If at the current position, fuel becomes negative, it
            // means the current index cannot be the starting point
            if (fuel < 0) {
                fuel = 0;
                // We will try the next index as the starting point
                start = i + 1;
            }
        }
        return start;
    }

    /**
     * Time Complexity - O(N)
     * Space Complexity - O(1)
     */
    public int canCompleteCircuitOptimalOnePass(int[] gas, int[] cost) {
        // Special case
        if (gas == null || gas.length == 0 || cost == null || cost.length == 0) {
            return -1;
        }
        // Number of stations
        int n = gas.length;
        // Effective fuel left - globally
        int globalEffectiveFuel = 0;
        // Effective fuel left - locally
        int localEffectiveFuel = 0;
        // Start index
        int index = 0;
        // Traverse through the array
        for (int i = 0; i < n; i++) {
            globalEffectiveFuel += gas[i] - cost[i];
            localEffectiveFuel += gas[i] - cost[i];
            // If the localEffectiveFuel becomes negative,
            // we cannot start from this index
            if (localEffectiveFuel < 0) {
                localEffectiveFuel = 0;
                index = i + 1;
            }
        }
        return globalEffectiveFuel < 0 ? -1 : index;
    }
}
