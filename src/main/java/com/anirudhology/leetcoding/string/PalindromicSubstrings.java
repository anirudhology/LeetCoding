package com.anirudhology.leetcoding.string;

public class PalindromicSubstrings {

    public int countSubstrings(String s) {
        // Special case
        if (s == null || s.isEmpty()) {
            return 0;
        }
        // Count of palindromic substrings
        int count = 0;
        // Traverse through the string
        for (int i = 0; i < s.length(); i++) {
            count += expandFromCenter(s, i, i);
            count += expandFromCenter(s, i, i + 1);
        }
        return count;
    }

    private int expandFromCenter(String s, int left, int right) {
        int currentCount = 0;
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
            currentCount++;
        }
        return currentCount;
    }
}
