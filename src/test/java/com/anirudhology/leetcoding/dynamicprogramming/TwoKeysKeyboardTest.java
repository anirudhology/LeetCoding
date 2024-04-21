package com.anirudhology.leetcoding.dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TwoKeysKeyboardTest {

    private final TwoKeysKeyboard twoKeysKeyboard = new TwoKeysKeyboard();

    @Test
    public void testMinStepsWithZero() {
        assertEquals(0, twoKeysKeyboard.minSteps(0));
    }

    @Test
    public void testMinStepsWithOne() {
        assertEquals(0, twoKeysKeyboard.minSteps(1));
    }

    @Test
    public void testMinStepsWithTwo() {
        assertEquals(2, twoKeysKeyboard.minSteps(2));
    }

    @Test
    public void testMinStepsWithThree() {
        assertEquals(3, twoKeysKeyboard.minSteps(3));
    }

    @Test
    public void testMinStepsWithFour() {
        assertEquals(4, twoKeysKeyboard.minSteps(4));
    }

    @Test
    public void testMinStepsWithFive() {
        assertEquals(5, twoKeysKeyboard.minSteps(5));
    }

    @Test
    public void testMinStepsWithSix() {
        assertEquals(5, twoKeysKeyboard.minSteps(6));
    }

    @Test
    public void testMinStepsWithTen() {
        assertEquals(7, twoKeysKeyboard.minSteps(10));
    }

    @Test
    public void testMinStepsWithFifteen() {
        assertEquals(8, twoKeysKeyboard.minSteps(15));
    }

    @Test
    public void testMinStepsWithTwenty() {
        assertEquals(9, twoKeysKeyboard.minSteps(20));
    }
}