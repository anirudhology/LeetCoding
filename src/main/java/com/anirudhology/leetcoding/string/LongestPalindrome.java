package com.anirudhology.leetcoding.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestPalindrome {

    /**
     * Time Complexity - O(N)
     * Space Complexity - O(N)
     */
    public int longestPalindromeWithMap(String s) {
        // Special case
        if (s == null || s.isEmpty()) {
            return 0;
        }
        // Map to store the frequency of every character
        final Map<Character, Integer> frequencies = new HashMap<>();
        // Process the string
        for (char c : s.toCharArray()) {
            frequencies.put(c, frequencies.getOrDefault(c, 0) + 1);
        }
        // For a palindrome, we will have all characters with even
        // frequencies except one character. This character with
        // odd frequencies can be put in the middle.
        int longestLength = 0;
        int oddCount = 0;
        for (int frequency : frequencies.values()) {
            if (frequency % 2 == 0) {
                longestLength += frequency;
            } else {
                longestLength += frequency - 1;
                oddCount++;
            }
        }
        return oddCount > 0 ? longestLength + 1 : longestLength;
    }

    /**
     * Time Complexity - O(N)
     * Space Complexity - O(N)
     */
    public int longestPalindromeWithSet(String s) {
        // Special case
        if (s == null || s.isEmpty()) {
            return 0;
        }
        // Set to store only the characters that don't have pairs
        Set<Character> pairs = new HashSet<>();
        int pairCount = 0;
        for (char c : s.toCharArray()) {
            // If the set already contains the character, it means
            // a pair exists.
            if (pairs.contains(c)) {
                // Remove this character and increment the count
                pairs.remove(c);
                pairCount++;
            }
            // If the element doesn't have pair
            else {
                pairs.add(c);
            }
        }
        return pairs.isEmpty() ? pairCount * 2 : pairCount * 2 + 1;
    }
}
