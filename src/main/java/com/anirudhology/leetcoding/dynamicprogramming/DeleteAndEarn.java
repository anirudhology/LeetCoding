package com.anirudhology.leetcoding.dynamicprogramming;

import java.util.Map;
import java.util.TreeMap;

public class DeleteAndEarn {

    public int deleteAndEarn(int[] nums) {
        // Special case
        if (nums == null || nums.length == 0) {
            return 0;
        }
        // Map to store the current element and sum of all those elements in the array
        // as key and value respectively.
        Map<Integer, Integer> elements = new TreeMap<>();
        for (final int num : nums) {
            elements.put(num, elements.getOrDefault(num, 0) + num);
        }
        // Current and previous values
        int previous = 0;
        int current = 0;
        // Traverse through all the unique elements in the array
        for (final int element : elements.keySet()) {
            if (!elements.containsKey(element - 1)) {
                previous = current;
                current += elements.get(element);
            } else {
                final int temp = Math.max(previous + elements.get(element), current);
                previous = current;
                current = temp;
            }
        }
        return current;
    }
}
