package com.anirudhology.leetcoding.dynamicprogramming;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class LongestStringChain {

    public int longestStrChain(String[] words) {
        // Special case
        if (words == null || words.length == 0) {
            return 0;
        }
        // Total number of words
        int n = words.length;
        // Sort the array
        Arrays.sort(words, Comparator.comparingInt(String::length));
        // Map to store the length of longest chain starting from a word
        Map<String, Integer> lookup = new HashMap<>();
        // Length of longest chain
        int maxLength = 0;
        // Process each word
        for (String word : words) {
            lookup.put(word, 1);
            // Process the current word
            for (int i = 0; i < word.length(); i++) {
                // Delete the current character
                String previousWord = word.substring(0, i) + word.substring(i + 1);
                // Check if the previous word is present in the array
                if (lookup.containsKey(previousWord)) {
                    lookup.put(word, Math.max(lookup.get(word), lookup.get(previousWord) + 1));
                }
            }
            maxLength = Math.max(maxLength, lookup.get(word));
        }
        return maxLength;
    }
}
