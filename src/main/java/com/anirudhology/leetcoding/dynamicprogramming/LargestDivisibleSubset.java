package com.anirudhology.leetcoding.dynamicprogramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LargestDivisibleSubset {

    public List<Integer> largestDivisibleSubset(int[] nums) {
        // List to store the largest divisible subset
        List<Integer> subset = new ArrayList<>();
        // Special case
        if (nums == null || nums.length == 0) {
            return subset;
        }
        // Sort the array so that we only need to take care about nums[i] % nums[j] == 0
        Arrays.sort(nums);
        // Length of the array
        int n = nums.length;
        // Array to store the length of largest divisible subset
        int[] lengths = new int[n];
        // Since every element is the largest divisible subset of length 1
        Arrays.fill(lengths, 1);
        // Array to store the previous index of the element in the current subset
        int[] indices = new int[n];
        // In the beginning there are no known indices of previous elements
        Arrays.fill(indices, -1);
        // Maximum index of the elements in the largest divisible subset
        int maxIndex = 0;
        // Process the array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] % nums[j] == 0) {
                    if (lengths[i] < 1 + lengths[j]) {
                        lengths[i] = 1 + lengths[j];
                        indices[i] = j;
                    }
                }
            }
            if (lengths[i] > lengths[maxIndex]) {
                maxIndex = i;
            }
        }
        // Now, create the longest divisible subset
        while (maxIndex != -1) {
            subset.add(0, nums[maxIndex]);
            maxIndex = indices[maxIndex];
        }
        return subset;
    }
}
