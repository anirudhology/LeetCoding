package com.anirudhology.leetcoding.array;

public class GasStation {

    public int canCompleteCircuit(int[] gas, int[] cost) {
        // Special case
        if (gas == null || gas.length == 0 || cost == null || cost.length == 0) {
            throw new IllegalArgumentException("Gas/Cost arrays cannot be null or empty.");
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
