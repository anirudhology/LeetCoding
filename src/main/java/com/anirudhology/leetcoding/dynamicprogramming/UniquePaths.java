package com.anirudhology.leetcoding.dynamicprogramming;

import java.util.HashMap;
import java.util.Map;

public class UniquePaths {

    public int uniquePathsRecursive(int m, int n) {
        // Invalid grid
        if (m == 0 || n == 0) {
            return 0;
        }
        // Single row or column
        if (m == 1 || n == 1) {
            return 1;
        }
        // Moving down and right respectively
        return uniquePathsRecursive(m - 1, n) + uniquePathsRecursive(m, n - 1);
    }

    public int uniquePathsMemoized(int m, int n) {
        // Cache to store calculated results
        Map<String, Integer> cache = new HashMap<>();
        return uniquePathsMemoized(m, n, cache);
    }

    private int uniquePathsMemoized(int m, int n, Map<String, Integer> cache) {
        // Invalid grid
        if (m == 0 || n == 0) {
            return 0;
        }
        // Single row or column
        if (m == 1 || n == 1) {
            return 1;
        }
        String key = m + "," + n;
        // Check in the cache
        if (cache.containsKey(key)) {
            return cache.get(key);
        }
        // Moving down and right respectively and store the result in cache
        int currentUniquePaths = uniquePathsMemoized(m - 1, n, cache) + uniquePathsMemoized(m, n - 1, cache);
        cache.put(key, currentUniquePaths);
        return currentUniquePaths;
    }
}
