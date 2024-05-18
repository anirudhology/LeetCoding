package com.anirudhology.leetcoding.stack;

import java.util.Objects;
import java.util.Stack;

public class BackspaceStringCompare {

    /**
     * Time Complexity - O(N)
     * Space Complexity - O(N)
     */
    public boolean backspaceCompare(String s, String t) {
        // Special case
        if (s == null || t == null) {
            return Objects.equals(s, t);
        }
        // Stacks to store final strings
        Stack<Character> sStack = new Stack<>();
        Stack<Character> tStack = new Stack<>();
        // Process string s
        for (char c : s.toCharArray()) {
            if (c == '#' && !sStack.isEmpty()) {
                sStack.pop();
            } else if (c != '#') {
                sStack.push(c);
            }
        }
        // Process string t
        for (char c : t.toCharArray()) {
            if (c == '#' && !tStack.isEmpty()) {
                tStack.pop();
            } else if (c != '#') {
                tStack.push(c);
            }
        }
        // Compare stacks character by character
        if (sStack.size() != tStack.size()) {
            return false;
        }
        while (!sStack.isEmpty() && !tStack.isEmpty()) {
            if (sStack.pop() != tStack.pop()) {
                return false;
            }
        }
        return true;
    }

    /**
     * Time Complexity - O(N)
     * Space Complexity - O(1)
     */
    public boolean backspaceCompareSpaceOptimized(String s, String t) {
        // Special case
        if (s == null || t == null) {
            return Objects.equals(s, t);
        }
        // Pointers to traverse strings in reverse order
        int i = s.length() - 1;
        int j = t.length() - 1;
        // Counts of '#' in strings
        int count1 = 0;
        int count2 = 0;
        // Process both strings
        while (i >= 0 || j >= 0) {
            // Traverse for string s
            while (i >= 0 && (count1 > 0 || s.charAt(i) == '#')) {
                if (s.charAt(i) == '#') {
                    count1++;
                } else {
                    count1--;
                }
                i--;
            }
            // Traverse for string t
            while (j >= 0 && (count2 > 0 || t.charAt(j) == '#')) {
                if (t.charAt(j) == '#') {
                    count2++;
                } else {
                    count2--;
                }
                j--;
            }
            // If both characters are same
            if (i >= 0 && j >= 0 && s.charAt(i) == t.charAt(j)) {
                i--;
                j--;
            } else {
                return i == -1 && j == -1;
            }
        }
        return true;
    }
}
