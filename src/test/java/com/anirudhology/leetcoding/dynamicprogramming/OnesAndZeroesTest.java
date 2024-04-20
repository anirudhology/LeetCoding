package com.anirudhology.leetcoding.dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class OnesAndZeroesTest {

    private final OnesAndZeroes onesAndZeroes = new OnesAndZeroes();

    // Test null input
    @Test
    public void testFindMaxFormNullInput() {
        String[] strs = null;
        int m = 1;
        int n = 1;
        assertThrows(IllegalArgumentException.class, () -> onesAndZeroes.findMaxForm(strs, m, n));
    }

    // Test empty input
    @Test
    public void testFindMaxFormEmptyInput() {
        String[] strs = {};
        int m = 1;
        int n = 1;
        assertThrows(IllegalArgumentException.class, () -> onesAndZeroes.findMaxForm(strs, m, n));
    }

    // Test negative m value
    @Test
    public void testFindMaxFormNegativeMValue() {
        String[] strs = {"10", "01"};
        int m = -1;
        int n = 1;
        assertThrows(IllegalArgumentException.class, () -> onesAndZeroes.findMaxForm(strs, m, n));
    }

    // Test negative n value
    @Test
    public void testFindMaxFormNegativeNValue() {
        String[] strs = {"10", "01"};
        int m = 1;
        int n = -1;
        assertThrows(IllegalArgumentException.class, () -> onesAndZeroes.findMaxForm(strs, m, n));
    }

    // Test zero m and n value
    @Test
    public void testFindMaxFormZeroMAndNValue() {
        String[] strs = {"10", "01"};
        int m = 0;
        int n = 0;
        assertEquals(0, onesAndZeroes.findMaxForm(strs, m, n));
    }

    // Test valid input
    @Test
    public void testFindMaxFormValidInput() {
        String[] strs = {"10", "0001", "111001", "1", "0"};
        int m = 5;
        int n = 3;
        assertEquals(4, onesAndZeroes.findMaxForm(strs, m, n));
    }
}