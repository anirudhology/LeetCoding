package com.anirudhology.leetcoding.stack;

import java.util.Stack;

public class ImplementQueueUsingStacks {

    static class MyQueue {

        private final Stack<Integer> stackOne;
        private final Stack<Integer> stackTwo;

        public MyQueue() {
            this.stackOne = new Stack<>();
            this.stackTwo = new Stack<>();
        }

        public void push(int x) {
            // Add all elements from stackOne to stackTwo
            while (!stackOne.isEmpty()) {
                stackTwo.push(stackOne.pop());
            }
            // Add the current element to the stackOne
            stackOne.push(x);
            // Restore all elements from stackTwo to stackOne
            while (!stackTwo.isEmpty()) {
                stackOne.push(stackTwo.pop());
            }
        }

        public int pop() {
            return stackOne.pop();
        }

        public int peek() {
            return stackOne.peek();
        }

        public boolean empty() {
            return stackOne.isEmpty();
        }
    }
}
