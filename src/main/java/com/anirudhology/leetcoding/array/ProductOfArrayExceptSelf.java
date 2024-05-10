package com.anirudhology.leetcoding.array;

public class ProductOfArrayExceptSelf {

    /**
     * Time Complexity - O(N)
     * Space Complexity - O(N)
     */
    public int[] productExceptSelfSuboptimal(int[] nums) {
        // Special case
        if (nums == null || nums.length < 2) {
            return nums;
        }
        // Length of the array
        int n = nums.length;
        // Left and right product arrays
        int[] leftProduct = new int[n];
        int[] rightProduct = new int[n];
        // Initialize the default values
        leftProduct[0] = 1;
        rightProduct[n - 1] = 1;
        // Populate the leftProduct array
        for (int i = 1; i < n; i++) {
            leftProduct[i] = leftProduct[i - 1] * nums[i - 1];
        }
        // Populate the rightProduct array
        for (int i = n - 2; i >= 0; i--) {
            rightProduct[i] = rightProduct[i + 1] * nums[i + 1];
        }
        // Find the final product array
        for (int i = 0; i < n; i++) {
            nums[i] = leftProduct[i] * rightProduct[i];
        }
        return nums;
    }

    /**
     * Time Complexity - O(N)
     * Space Complexity - O(1)
     */
    public int[] productExceptSelfOptimal(int[] nums) {
        // Special case
        if (nums == null || nums.length < 2) {
            return nums;
        }
        // Length of the array
        int n = nums.length;
        // Array to store the product
        int[] product = new int[n];
        int cumulativeProduct = 1;
        // Left pass
        for (int i = 0; i < n; i++) {
            product[i] = cumulativeProduct;
            cumulativeProduct *= nums[i];
        }
        // Reset cumulative product
        cumulativeProduct = 1;
        // Right pass
        for (int i = n - 1; i >= 0; i--) {
            product[i] *= cumulativeProduct;
            cumulativeProduct *= nums[i];
        }
        return product;
    }
}
