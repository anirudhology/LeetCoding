package com.anirudhology.leetcoding.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class AsteroidCollision {

    /**
     * Time Complexity - O(N)
     * Space Complexity - O(N)
     */
    public int[] asteroidCollision(int[] asteroids) {
        // Special case
        if (asteroids == null || asteroids.length == 0) {
            return asteroids;
        }
        // Stack to store the asteroids
        final Deque<Integer> stack = new ArrayDeque<>();
        // Process the asteroids in the array
        for (int asteroid : asteroids) {
            if (asteroid > 0) {
                stack.push(asteroid);
            } else {
                while (!stack.isEmpty() && stack.peek() > 0 && stack.peek() < -asteroid) {
                    stack.pop();
                }
                if (!stack.isEmpty() && stack.peek() == -asteroid) {
                    stack.pop();
                } else if (stack.isEmpty() || stack.peek() < 0) {
                    stack.push(asteroid);
                }
            }
        }
        int[] result = new int[stack.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }
        return result;
    }
}
