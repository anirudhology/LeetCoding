package com.anirudhology.leetcoding.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class DailyTemperatures {

    /**
     * Time Complexity - O(N)
     * Space Complexity - O(N)
     */
    public int[] dailyTemperaturesWithStack(int[] temperatures) {
        // Special case
        if (temperatures == null || temperatures.length == 0) {
            return temperatures;
        }
        // Length of the array
        int n = temperatures.length;
        // Array to store the days after warmer temperature is available
        int[] answer = new int[n];
        // Stack to store the temperatures
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = n - 1; i >= 0; i--) {
            // Since we are travelling from the right to left,
            // the next greater element will be at top of the
            // stack and we can consider it
            while (!stack.isEmpty() && temperatures[i] >= temperatures[stack.peek()]) {
                stack.pop();
            }
            // If the stack is not empty at this point, it means we
            // have a next greater element, and we can find the distance
            // of the current index and index of top of stack
            if (!stack.isEmpty()) {
                answer[i] = stack.peek() - i;
            }
            stack.push(i);
        }
        return answer;
    }

    /**
     * Time Complexity - O(N)
     * Space Complexity - O(N)
     */
    public int[] dailyTemperaturesWithArray(int[] temperatures) {
        // Special case
        if (temperatures == null || temperatures.length == 0) {
            return temperatures;
        }
        // Length of the array
        int n = temperatures.length;
        // Array to store the days after warmer temperature is available
        int[] answer = new int[n];
        int[] stack = new int[n];
        // Top of the stack
        int top = -1;
        for (int i = n - 1; i >= 0; i--) {
            // Since we are travelling from the right to left,
            // the next greater element will be at top of the
            // stack and we can consider it
            while (top > -1 && temperatures[i] >= temperatures[stack[top]]) {
                top--;
            }
            // If the stack is not empty at this point, it means we
            // have a next greater element, and we can find the distance
            // of the current index and index of top of stack
            if (top > -1) {
                answer[i] = stack[top] - i;
            }
            top++;
            stack[top] = i;
        }
        return answer;
    }
}
