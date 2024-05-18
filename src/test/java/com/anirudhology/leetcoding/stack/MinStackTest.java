package com.anirudhology.leetcoding.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinStackTest {

    private final MinStack minStack = new MinStack();

    @Test
    public void testPushAndTop() {
        minStack.push(1);
        assertEquals(1, minStack.top());
        minStack.push(2);
        assertEquals(2, minStack.top());
        minStack.push(3);
        assertEquals(3, minStack.top());
    }

    @Test
    public void testPop() {
        minStack.push(1);
        minStack.push(2);
        minStack.push(3);
        assertEquals(3, minStack.top());
        minStack.pop();
        assertEquals(2, minStack.top());
        minStack.pop();
        assertEquals(1, minStack.top());
    }

    @Test
    public void testGetMin() {
        minStack.push(3);
        assertEquals(3, minStack.getMin());
        minStack.push(5);
        assertEquals(3, minStack.getMin());
        minStack.push(2);
        assertEquals(2, minStack.getMin());
        minStack.push(1);
        assertEquals(1, minStack.getMin());
        minStack.pop();
        assertEquals(2, minStack.getMin());
        minStack.pop();
        assertEquals(3, minStack.getMin());
    }

    @Test
    public void testPushPopSingleElement() {
        minStack.push(42);
        assertEquals(42, minStack.top());
        assertEquals(42, minStack.getMin());
        minStack.pop();
    }

    @Test
    public void testPushSameElements() {
        minStack.push(2);
        minStack.push(2);
        minStack.push(2);
        assertEquals(2, minStack.getMin());
        minStack.pop();
        assertEquals(2, minStack.getMin());
        minStack.pop();
        assertEquals(2, minStack.getMin());
        minStack.pop();
    }
}