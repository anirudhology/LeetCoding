package com.anirudhology.leetcoding.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ProductOfArrayExceptSelfTest {

    private final ProductOfArrayExceptSelf productOfArrayExceptSelf = new ProductOfArrayExceptSelf();

    @Test
    public void testProductExceptSelfSuboptimalWithNullInputShouldReturnInputArray() {
        int[] nums = null;
        assertArrayEquals(nums, productOfArrayExceptSelf.productExceptSelfSuboptimal(nums));
    }

    @Test
    public void testProductExceptSelfSuboptimalWithEmptyInputShouldReturnInputArray() {
        int[] nums = {};
        assertArrayEquals(nums, productOfArrayExceptSelf.productExceptSelfSuboptimal(nums));
    }

    @Test
    public void testProductExceptSelfSuboptimalWithSingleElementInputShouldReturnInputArray() {
        int[] nums = {5};
        assertArrayEquals(nums, productOfArrayExceptSelf.productExceptSelfSuboptimal(nums));
    }

    @Test
    public void testProductExceptSelfOneWithMultipleElementsShouldReturnCorrectProductArray() {
        int[] nums = {1, 2, 3, 4};
        int[] expected = {24, 12, 8, 6};
        assertArrayEquals(expected, productOfArrayExceptSelf.productExceptSelfSuboptimal(nums));
    }

    @Test
    public void testProductExceptSelfOptimalWithNullInputShouldReturnInputArray() {
        int[] nums = null;
        assertArrayEquals(nums, productOfArrayExceptSelf.productExceptSelfOptimal(nums));
    }

    @Test
    public void testProductExceptSelfOptimalWithEmptyInputShouldReturnInputArray() {
        int[] nums = {};
        assertArrayEquals(nums, productOfArrayExceptSelf.productExceptSelfOptimal(nums));
    }

    @Test
    public void testProductExceptSelfOptimalWithSingleElementInputShouldReturnInputArray() {
        int[] nums = {5};
        assertArrayEquals(nums, productOfArrayExceptSelf.productExceptSelfOptimal(nums));
    }

    @Test
    public void testProductExceptSelfTwoWithMultipleElementsShouldReturnCorrectProductArray() {
        int[] nums = {1, 2, 3, 4};
        int[] expected = {24, 12, 8, 6};
        assertArrayEquals(expected, productOfArrayExceptSelf.productExceptSelfOptimal(nums));
    }
}