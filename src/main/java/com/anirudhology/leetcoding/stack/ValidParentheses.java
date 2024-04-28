package com.anirudhology.leetcoding.stack;

import java.util.Stack;

public class ValidParentheses {

    public boolean isValid(String s) {
        // Special case
        if (s == null || s.isEmpty()) {
            return true;
        }
        // Stack to store the left parentheses
        Stack<Character> leftParentheses = new Stack<>();
        // Traverse through the string
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                leftParentheses.push(c);
            } else if (!leftParentheses.isEmpty() && c == ')' && leftParentheses.peek() == '(') {
                leftParentheses.pop();
            } else if (!leftParentheses.isEmpty() && c == '}' && leftParentheses.peek() == '{') {
                leftParentheses.pop();
            } else if (!leftParentheses.isEmpty() && c == ']' && leftParentheses.peek() == '[') {
                leftParentheses.pop();
            } else {
                return false;
            }
        }
        return leftParentheses.isEmpty();
    }
}
