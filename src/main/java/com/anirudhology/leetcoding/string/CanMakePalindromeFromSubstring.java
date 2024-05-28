package com.anirudhology.leetcoding.string;

import java.util.ArrayList;
import java.util.List;

public class CanMakePalindromeFromSubstring {

    /**
     * Time Complexity - O(N)
     * Space Complexity - O(N)
     */
    public List<Boolean> canMakePaliQueries(String s, int[][] queries) {
        // List to store the result of queries
        List<Boolean> answers = new ArrayList<>();
        // Special case
        if (s == null || s.isEmpty() || queries == null) {
            return answers;
        }
        // Length of the string
        int n = s.length();
        // Calculate the frequencies of every prefix in the string
        int[][] frequencies = new int[n + 1][26];
        // Populate this frequencies table
        for (int i = 0; i < n; i++) {
            frequencies[i + 1] = frequencies[i].clone();
            frequencies[i + 1][s.charAt(i) - 'a']++;
        }
        // Process for every query
        for (int[] query : queries) {
            // Calculate total number of odds that can't be paired
            int odds = 0;
            for (int i = 0; i < 26; i++) {
                odds += (frequencies[query[1] + 1][i] - frequencies[query[0]][i]) % 2;
            }
            // If total odd count is less than k, then we are good
            answers.add(odds / 2 <= query[2]);
        }
        return answers;
    }
}
