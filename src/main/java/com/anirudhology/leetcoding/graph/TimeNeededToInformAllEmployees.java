package com.anirudhology.leetcoding.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TimeNeededToInformAllEmployees {

    public int numOfMinutes(int headID, int[] manager, int[] informTime) {
        // Map to store the managers and their subordinates
        Map<Integer, List<Integer>> mappings = new HashMap<>();
        for (int employeeId = 0; employeeId < manager.length; employeeId++) {
            int managerId = manager[employeeId];
            if (!mappings.containsKey(managerId)) {
                mappings.put(managerId, new ArrayList<>());
            }
            mappings.get(managerId).add(employeeId);
        }
        // Perform DFS on the nodes starting from headID
        return dfs(mappings, informTime, headID);
    }

    private int dfs(Map<Integer, List<Integer>> mappings, int[] informTime, int managerId) {
        // Time taken
        int time = 0;
        if (!mappings.containsKey(managerId)) {
            return time;
        }
        // Check for all subordinates of current manager id
        for (int i = 0; i < mappings.get(managerId).size(); i++) {
            time = Math.max(time, dfs(mappings, informTime, mappings.get(managerId).get(i)));
        }
        return time + informTime[managerId];
    }
}
