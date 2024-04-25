package com.anirudhology.leetcoding.string;

public class LongestPalindromicSubstring {

    public String longestPalindrome(String s) {
        // Special case
        if (s == null || s.isEmpty()) {
            return s;
        }
        // Start and end pointers of longest palindromic substring
        int start = 0;
        int end = 0;
        // Traverse through the string
        for (int i = 0; i < s.length(); i++) {
            // String with odd number of characters has one middle element
            int oddLength = expandFromCenter(s, i, i);
            // String with even number of characters has two middle elements
            int evenLength = expandFromCenter(s, i, i + 1);
            int maxLength = Math.max(oddLength, evenLength);
            if (maxLength > end - start) {
                start = i - (maxLength - 1) / 2;
                end = i + maxLength / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private int expandFromCenter(String s, int left, int right) {
        if (left > right) {
            return 0;
        }
        // Check for the palindrome
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}
