package com.anirudhology.leetcoding.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ProductOfArrayExceptSelfTest {

    private final ProductOfArrayExceptSelf productOfArrayExceptSelf = new ProductOfArrayExceptSelf();

    @Test
    public void testProductExceptSelfOneWithNullInputShouldReturnInputArray() {
        int[] nums = null;
        assertArrayEquals(nums, productOfArrayExceptSelf.productExceptSelfOne(nums));
    }

    @Test
    public void testProductExceptSelfOneWithEmptyInputShouldReturnInputArray() {
        int[] nums = {};
        assertArrayEquals(nums, productOfArrayExceptSelf.productExceptSelfOne(nums));
    }

    @Test
    public void testProductExceptSelfOneWithSingleElementInputShouldReturnInputArray() {
        int[] nums = {5};
        assertArrayEquals(nums, productOfArrayExceptSelf.productExceptSelfOne(nums));
    }

    @Test
    public void testProductExceptSelfOneWithMultipleElementsShouldReturnCorrectProductArray() {
        int[] nums = {1, 2, 3, 4};
        int[] expected = {24, 12, 8, 6};
        assertArrayEquals(expected, productOfArrayExceptSelf.productExceptSelfOne(nums));
    }

    @Test
    public void testProductExceptSelfTwoWithNullInputShouldReturnInputArray() {
        int[] nums = null;
        assertArrayEquals(nums, productOfArrayExceptSelf.productExceptSelfTwo(nums));
    }

    @Test
    public void testProductExceptSelfTwoWithEmptyInputShouldReturnInputArray() {
        int[] nums = {};
        assertArrayEquals(nums, productOfArrayExceptSelf.productExceptSelfTwo(nums));
    }

    @Test
    public void testProductExceptSelfTwoWithSingleElementInputShouldReturnInputArray() {
        int[] nums = {5};
        assertArrayEquals(nums, productOfArrayExceptSelf.productExceptSelfTwo(nums));
    }

    @Test
    public void testProductExceptSelfTwoWithMultipleElementsShouldReturnCorrectProductArray() {
        int[] nums = {1, 2, 3, 4};
        int[] expected = {24, 12, 8, 6};
        assertArrayEquals(expected, productOfArrayExceptSelf.productExceptSelfTwo(nums));
    }
}