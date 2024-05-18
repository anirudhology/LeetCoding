package com.anirudhology.leetcoding.stack;

import com.anirudhology.leetcoding.utils.MinStackNode;

public class MinStack {

    private MinStackNode head;

    /**
     * Time Complexity - O(!)
     */
    public void push(int val) {
        // For the very first node inserted
        if (head == null) {
            head = new MinStackNode(val, val, null);
        }
        // For subsequent nodes
        else {
            head = new MinStackNode(val, Math.min(val, head.min), head);
        }
    }

    /**
     * Time Complexity - O(!)
     */
    public void pop() {
        head = head.next;
    }

    /**
     * Time Complexity - O(!)
     */
    public int top() {
        return head.val;
    }

    /**
     * Time Complexity - O(!)
     */
    public int getMin() {
        return head.min;
    }
}
