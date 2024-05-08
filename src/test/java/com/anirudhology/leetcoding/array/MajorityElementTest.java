package com.anirudhology.leetcoding.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MajorityElementTest {

    private final MajorityElement majorityElement = new MajorityElement();

    @Test
    public void testMajorityElementBruteForce() {
        int[] nums = {3, 2, 3};
        assertEquals(3, majorityElement.majorityElementBruteForce(nums));
    }

    @Test
    public void testMajorityElementSuboptimal() {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        assertEquals(2, majorityElement.majorityElementSuboptimal(nums));
    }

    @Test
    public void testMajorityElementOptimal() {
        int[] nums = {3, 3, 4};
        assertEquals(3, majorityElement.majorityElementOptimal(nums));
    }

    @Test
    public void testMajorityElementBruteForceException() {
        int[] nums = {};
        assertThrows(IllegalArgumentException.class, () -> majorityElement.majorityElementBruteForce(nums));
    }

    @Test
    public void testMajorityElementSuboptimalException() {
        int[] nums = {};
        assertThrows(IllegalArgumentException.class, () -> majorityElement.majorityElementSuboptimal(nums));
    }

    @Test
    public void testMajorityElementOptimalException() {
        int[] nums = {};
        assertThrows(IllegalArgumentException.class, () -> majorityElement.majorityElementOptimal(nums));
    }

    @Test
    public void testMajorityElementSuboptimalInvalidInputs() {
        int[] nums = {1, 2, 3};
        assertThrows(IllegalArgumentException.class, () -> majorityElement.majorityElementSuboptimal(nums));
    }

    @Test
    public void testMajorityElementOptimalInvalidInputs() {
        int[] nums = {1, 2, 3};
        assertEquals(3, majorityElement.majorityElementOptimal(nums));
    }
}