package com.anirudhology.leetcoding.string;

public class ValidPalindromeII {

    /**
     * Time Complexity - O(N)
     * Space Complexity - O(1)
     */
    public boolean validPalindrome(String s) {
        // Since it is given that s contains only lowercase characters,
        // we can check if a string is palindrome or not by skipping either
        // a character from left or from right

        // Left and right pointers
        int left = 0;
        int right = s.length() - 1;
        // Process the string from both ends
        while (left <= right) {
            // If the characters at both ends are matching
            if (s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            }
            // If the characters are not matching then we skip
            // either from left or from right
            else {
                return checkPalindrome(s, left + 1, right) || checkPalindrome(s, left, right - 1);
            }
        }
        return true;
    }

    private boolean checkPalindrome(String s, int left, int right) {
        while (left <= right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
