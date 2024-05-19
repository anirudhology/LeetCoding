package com.anirudhology.leetcoding.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class DecodeString {

    /**
     * Time Complexity - O(linear)
     * Space Complexity - O(linear)
     */
    public String decodeString(String s) {
        // Special case
        if (s == null || s.isEmpty()) {
            return s;
        }
        // Length of the string
        int n = s.length();
        // Stack to store substrings
        Deque<StringBuilder> result = new ArrayDeque<>();
        // Stack to store multipliers
        Deque<Integer> multipliers = new ArrayDeque<>();
        // Current multiplier
        int multiplier = 0;
        result.push(new StringBuilder());
        // Process the string
        for (int i = 0; i < n; i++) {
            // Current character
            char c = s.charAt(i);
            // If the current character is a digit
            if (Character.isDigit(c)) {
                multiplier = multiplier * 10 + c - '0';
            }
            // If the current character is '['
            else if (c == '[') {
                multipliers.push(multiplier);
                // Reset multiplier
                multiplier = 0;
                // Add new string builder to result stack for
                // further processing
                result.push(new StringBuilder());
            }
            // If the current character is ']'
            else if (c == ']') {
                // String to multiply
                StringBuilder stringToMultiply = result.pop();
                // Multiply count
                int multiplyCount = multipliers.pop();
                // Multiplied string
                String multipliedString = stringToMultiply.toString().repeat(multiplyCount);
                result.push(result.pop().append(multipliedString));
            }
            // For any other character
            else {
                result.push(result.pop().append(c));
            }
        }
        return result.pop().toString();
    }
}
