package com.anirudhology.leetcoding.heap;

import java.util.PriorityQueue;
import java.util.Queue;

public class LastStoneWeight {

    public int lastStoneWeight(int[] stones) {
        // Special case
        if (stones == null || stones.length == 0) {
            return 0;
        }
        // Max heap to store weights of all stones
        Queue<Integer> weights = new PriorityQueue<>((a, b) -> b - a);
        for (int stone : stones) {
            weights.offer(stone);
        }
        // Process elements from heap until one element is left
        while (weights.size() > 1) {
            // Get two heaviest stones
            int heaviest = weights.remove();
            int secondHeaviest = weights.remove();
            if (heaviest != secondHeaviest) {
                weights.offer(heaviest - secondHeaviest);
            }
        }
        return weights.size() == 1 ? weights.remove() : 0;
    }
}
