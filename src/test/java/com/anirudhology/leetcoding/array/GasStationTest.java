package com.anirudhology.leetcoding.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class GasStationTest {

    private final GasStation gasStation = new GasStation();

    @Test
    public void testCanCompleteCircuitWithNullGasArrayShouldThrowException() {
        int[] gas = null;
        int[] cost = {1, 2, 3};
        assertThrows(IllegalArgumentException.class, () -> gasStation.canCompleteCircuit(gas, cost));
    }

    @Test
    public void testCanCompleteCircuitWithNullCostArrayShouldThrowException() {
        int[] gas = {1, 2, 3};
        int[] cost = null;
        assertThrows(IllegalArgumentException.class, () -> gasStation.canCompleteCircuit(gas, cost));
    }

    @Test
    public void testCanCompleteCircuitWithEmptyGasArrayShouldThrowException() {
        int[] gas = {};
        int[] cost = {1, 2, 3};
        assertThrows(IllegalArgumentException.class, () -> gasStation.canCompleteCircuit(gas, cost));
    }

    @Test
    public void testCanCompleteCircuitWithEmptyCostArrayShouldThrowException() {
        int[] gas = {1, 2, 3};
        int[] cost = {};
        assertThrows(IllegalArgumentException.class, () -> gasStation.canCompleteCircuit(gas, cost));
    }

    @Test
    public void testCanCompleteCircuitWithEqualGasAndCostShouldReturnZero() {
        int[] gas = {1, 2, 3};
        int[] cost = {1, 2, 3};
        int expected = 0;
        int actual = gasStation.canCompleteCircuit(gas, cost);
        assertEquals(expected, actual);
    }

    @Test
    public void testCanCompleteCircuitWithInsufficientFuelShouldReturnMinusOne() {
        int[] gas = {1, 2, 3};
        int[] cost = {4, 5, 6};
        int expected = -1;
        int actual = gasStation.canCompleteCircuit(gas, cost);
        assertEquals(expected, actual);
    }

    @Test
    public void testCanCompleteCircuitWithSufficientFuelShouldReturnStartIndex() {
        int[] gas = {1, 2, 3, 4, 5};
        int[] cost = {3, 4, 5, 1, 2};
        int expected = 3;
        int actual = gasStation.canCompleteCircuit(gas, cost);
        assertEquals(expected, actual);
    }
}