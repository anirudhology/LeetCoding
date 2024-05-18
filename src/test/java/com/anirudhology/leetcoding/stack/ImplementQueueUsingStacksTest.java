package com.anirudhology.leetcoding.stack;

import org.junit.jupiter.api.Test;

import static com.anirudhology.leetcoding.stack.ImplementQueueUsingStacks.MyQueue;
import static org.junit.jupiter.api.Assertions.*;

class ImplementQueueUsingStacksTest {

    private final MyQueue myQueue = new MyQueue();

    @Test
    public void testPushAndPeek() {
        myQueue.push(1);
        assertEquals(1, myQueue.peek());
        myQueue.push(2);
        assertEquals(1, myQueue.peek());
        myQueue.push(3);
        assertEquals(1, myQueue.peek());
    }

    @Test
    public void testPushAndPop() {
        myQueue.push(1);
        myQueue.push(2);
        myQueue.push(3);
        assertEquals(1, myQueue.pop());
        assertEquals(2, myQueue.pop());
        assertEquals(3, myQueue.pop());
    }

    @Test
    public void testEmpty() {
        assertTrue(myQueue.empty());
        myQueue.push(1);
        assertFalse(myQueue.empty());
        myQueue.pop();
        assertTrue(myQueue.empty());
    }

    @Test
    public void testPushPopMix() {
        myQueue.push(1);
        myQueue.push(2);
        assertEquals(1, myQueue.pop());
        myQueue.push(3);
        assertEquals(2, myQueue.pop());
        assertEquals(3, myQueue.pop());
        assertTrue(myQueue.empty());
    }

    @Test
    public void testMultiplePushPop() {
        myQueue.push(1);
        myQueue.push(2);
        myQueue.push(3);
        myQueue.push(4);
        assertEquals(1, myQueue.pop());
        myQueue.push(5);
        assertEquals(2, myQueue.pop());
        assertEquals(3, myQueue.pop());
        assertEquals(4, myQueue.pop());
        assertEquals(5, myQueue.pop());
        assertTrue(myQueue.empty());
    }
}