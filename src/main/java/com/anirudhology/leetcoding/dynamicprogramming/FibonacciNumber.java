package com.anirudhology.leetcoding.dynamicprogramming;

import java.util.HashMap;
import java.util.Map;

public class FibonacciNumber {

    public int fibRecursive(int n) {
        // Base case
        if (n <= 1) {
            return n;
        }
        return fibRecursive(n - 1) + fibRecursive(n - 2);
    }

    public int fibMemoized(int n) {
        // Map to store the already calculated results as cache
        Map<Integer, Integer> cache = new HashMap<>();
        return fibMemoized(n, cache);
    }

    private int fibMemoized(int n, Map<Integer, Integer> cache) {
        // Base case
        if (n <= 1) {
            return n;
        }
        // Check if the key is already present in cache
        if (cache.containsKey(n)) {
            return cache.get(n);
        }
        // Calculate new result and cache it
        int result = fibMemoized(n - 1, cache) + fibMemoized(n - 2, cache);
        cache.put(n, result);
        return result;
    }
}
