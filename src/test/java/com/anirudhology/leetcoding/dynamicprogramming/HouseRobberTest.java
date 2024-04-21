package com.anirudhology.leetcoding.dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HouseRobberTest {

    private final HouseRobber houseRobber = new HouseRobber();

    @Test
    public void testRobWithEmptyArray() {
        int[] nums = {};
        assertEquals(0, houseRobber.rob(nums));
    }

    @Test
    public void testRobWithSingleHouse() {
        int[] nums = {5};
        assertEquals(5, houseRobber.rob(nums));
    }

    @Test
    public void testRobWithTwoHouses() {
        int[] nums = {5, 10};
        assertEquals(10, houseRobber.rob(nums));
    }

    @Test
    public void testRobWithThreeHouses() {
        int[] nums = {5, 10, 15};
        assertEquals(20, houseRobber.rob(nums));
    }

    @Test
    public void testRobWithFourHouses() {
        int[] nums = {5, 10, 15, 20};
        assertEquals(30, houseRobber.rob(nums));
    }

    @Test
    public void testRobWithFiveHouses() {
        int[] nums = {5, 10, 15, 20, 25};
        assertEquals(45, houseRobber.rob(nums));
    }
}