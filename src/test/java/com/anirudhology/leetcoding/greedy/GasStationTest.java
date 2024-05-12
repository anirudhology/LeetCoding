package com.anirudhology.leetcoding.greedy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GasStationTest {

    private final GasStation gasStation = new GasStation();

    @Test
    public void testCanCompleteCircuitWithNullGasArray() {
        int[] gas = null;
        int[] cost = {1, 2, 3};
        assertEquals(-1, gasStation.canCompleteCircuitBruteForce(gas, cost));
        assertEquals(-1, gasStation.canCompleteCircuitOptimalTwoPass(gas, cost));
        assertEquals(-1, gasStation.canCompleteCircuitOptimalOnePass(gas, cost));
    }

    @Test
    public void testCanCompleteCircuitWithNullCostArray() {
        int[] gas = {1, 2, 3};
        int[] cost = null;
        assertEquals(-1, gasStation.canCompleteCircuitBruteForce(gas, cost));
        assertEquals(-1, gasStation.canCompleteCircuitOptimalTwoPass(gas, cost));
        assertEquals(-1, gasStation.canCompleteCircuitOptimalOnePass(gas, cost));
    }

    @Test
    public void testCanCompleteCircuitWithEqualGasAndCostShouldReturnZero() {
        int[] gas = {1, 2, 3};
        int[] cost = {1, 2, 3};
        int expected = 0;
        assertEquals(expected, gasStation.canCompleteCircuitBruteForce(gas, cost));
        assertEquals(expected, gasStation.canCompleteCircuitOptimalTwoPass(gas, cost));
        assertEquals(expected, gasStation.canCompleteCircuitOptimalOnePass(gas, cost));
    }

    @Test
    public void testCanCompleteCircuitWithInsufficientFuelShouldReturnMinusOne() {
        int[] gas = {1, 2, 3};
        int[] cost = {4, 5, 6};
        int expected = -1;
        assertEquals(expected, gasStation.canCompleteCircuitBruteForce(gas, cost));
        assertEquals(expected, gasStation.canCompleteCircuitOptimalTwoPass(gas, cost));
        assertEquals(expected, gasStation.canCompleteCircuitOptimalOnePass(gas, cost));
    }

    @Test
    public void testCanCompleteCircuitWithSufficientFuelShouldReturnStartIndex() {
        int[] gas = {1, 2, 3, 4, 5};
        int[] cost = {3, 4, 5, 1, 2};
        int expected = 3;
        assertEquals(expected, gasStation.canCompleteCircuitBruteForce(gas, cost));
        assertEquals(expected, gasStation.canCompleteCircuitOptimalTwoPass(gas, cost));
        assertEquals(expected, gasStation.canCompleteCircuitOptimalOnePass(gas, cost));
    }
}