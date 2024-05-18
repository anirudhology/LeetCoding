package com.anirudhology.leetcoding.utils;

public class MinStackNode {

    public final int val;
    public final int min;
    public final MinStackNode next;

    public MinStackNode(int val, int min, MinStackNode next) {
        this.val = val;
        this.min = min;
        this.next = next;
    }
}
