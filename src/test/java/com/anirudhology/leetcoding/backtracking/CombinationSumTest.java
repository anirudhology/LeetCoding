package com.anirudhology.leetcoding.backtracking;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CombinationSumTest {

    private final CombinationSum combinationSum = new CombinationSum();

    @Test
    public void testCombinationSumWithEmptyCandidatesShouldReturnEmptyList() {
        int[] candidates = {};
        int target = 7;
        List<List<Integer>> expected = new ArrayList<>();
        List<List<Integer>> actual = combinationSum.combinationSum(candidates, target);
        assertEquals(expected, actual);
    }

    @Test
    public void testCombinationSumWithTargetZeroShouldReturnEmptyList() {
        int[] candidates = {2, 3, 6, 7};
        int target = 0;
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Collections.emptyList());
        List<List<Integer>> actual = combinationSum.combinationSum(candidates, target);
        assertEquals(expected, actual);
    }

    @Test
    public void testCombinationSumWithValidCandidatesAndTargetShouldReturnCorrectCombinations() {
        int[] candidates = {2, 3, 6, 7};
        int target = 7;
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(List.of(2, 2, 3));
        expected.add(List.of(7));
        List<List<Integer>> actual = combinationSum.combinationSum(candidates, target);
        assertEquals(expected, actual);
    }
}