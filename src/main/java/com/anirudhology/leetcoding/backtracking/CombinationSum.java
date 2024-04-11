package com.anirudhology.leetcoding.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        // List to store the combinations
        List<List<Integer>> combinations = new ArrayList<>();
        // Special case
        if (candidates == null || candidates.length == 0) {
            return combinations;
        }
        // Sort the array
        Arrays.sort(candidates);
        // Perform backtracking operation
        backtrack(candidates, 0, new ArrayList<>(), combinations, target);
        return combinations;
    }

    private void backtrack(int[] candidates, int index, List<Integer> combination, List<List<Integer>> combinations, int target) {
        // Base cases
        if (target < 0) {
            return;
        }
        if (target == 0) {
            combinations.add(new ArrayList<>(combination));
        }
        // Traverse for all the candidates
        for (int i = index; i < candidates.length; i++) {
            // Add current element to the list
            combination.add(candidates[i]);
            // Backtrack
            backtrack(candidates, i, combination, combinations, target - candidates[i]);
            // Discard current element
            combination.remove(combination.size() - 1);
        }
    }
}
