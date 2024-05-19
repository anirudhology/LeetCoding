package com.anirudhology.leetcoding.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class DailyTemperaturesTest {

    private final DailyTemperatures dailyTemperatures = new DailyTemperatures();

    @Test
    public void testDailyTemperaturesWithStackBasic() {
        assertArrayEquals(new int[] {1, 1, 4, 2, 1, 1, 0, 0}, dailyTemperatures.dailyTemperaturesWithStack(new int[] {73, 74, 75, 71, 69, 72, 76, 73}));
        assertArrayEquals(new int[] {1, 1, 1, 0}, dailyTemperatures.dailyTemperaturesWithStack(new int[] {30, 40, 50, 60}));
        assertArrayEquals(new int[] {1, 1, 0}, dailyTemperatures.dailyTemperaturesWithStack(new int[] {30, 60, 90}));
    }

    @Test
    public void testDailyTemperaturesWithStackEdgeCases() {
        assertArrayEquals(new int[] {}, dailyTemperatures.dailyTemperaturesWithStack(new int[] {}));
        assertArrayEquals(null, dailyTemperatures.dailyTemperaturesWithStack(null));
    }

    @Test
    public void testDailyTemperaturesWithStackComplex() {
        assertArrayEquals(new int[] {1, 1, 3, 1, 1, 0, 0}, dailyTemperatures.dailyTemperaturesWithStack(new int[] {70, 71, 72, 69, 70, 75, 74}));
        assertArrayEquals(new int[] {1, 1, 3, 2, 1, 0, 0}, dailyTemperatures.dailyTemperaturesWithStack(new int[] {73, 74, 75, 71, 69, 76, 73}));
    }

    @Test
    public void testDailyTemperaturesWithArrayBasic() {
        assertArrayEquals(new int[] {1, 1, 4, 2, 1, 1, 0, 0}, dailyTemperatures.dailyTemperaturesWithArray(new int[] {73, 74, 75, 71, 69, 72, 76, 73}));
        assertArrayEquals(new int[] {1, 1, 1, 0}, dailyTemperatures.dailyTemperaturesWithArray(new int[] {30, 40, 50, 60}));
        assertArrayEquals(new int[] {1, 1, 0}, dailyTemperatures.dailyTemperaturesWithArray(new int[] {30, 60, 90}));
    }

    @Test
    public void testDailyTemperaturesWithArrayEdgeCases() {
        assertArrayEquals(new int[] {}, dailyTemperatures.dailyTemperaturesWithArray(new int[] {}));
        assertArrayEquals(null, dailyTemperatures.dailyTemperaturesWithArray(null));
    }

    @Test
    public void testDailyTemperaturesWithArrayComplex() {
        assertArrayEquals(new int[] {1, 1, 3, 1, 1, 0, 0}, dailyTemperatures.dailyTemperaturesWithArray(new int[] {70, 71, 72, 69, 70, 75, 74}));
        assertArrayEquals(new int[] {1, 1, 3, 2, 1, 0, 0}, dailyTemperatures.dailyTemperaturesWithArray(new int[] {73, 74, 75, 71, 69, 76, 73}));
    }
}