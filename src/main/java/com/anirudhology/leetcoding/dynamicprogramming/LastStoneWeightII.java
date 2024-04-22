package com.anirudhology.leetcoding.dynamicprogramming;

public class LastStoneWeightII {

    public int lastStoneWeightII(int[] stones) {
        // Special case
        if (stones == null || stones.length == 0) {
            return 0;
        }
        /*
         * We need to minimize the weight of the last stone. It means we need to create
         * two sets of stones and the difference of their sums should be minimal.
         * Let's say these two sets are - S1 and S2 and total sum of weights of stones
         * in the array is S.
         *
         * S1 + S2 = S (total sum)
         * S1 - S2 = D (difference)
         *
         * => D = S - 2 * S2
         *
         * We can use partition subset sum approach to solve this
         */
        int S = getS(stones);
        // Total number of stones
        int n = stones.length;
        // Sum of smaller set
        int S2 = 0;
        // Now, we should find the maximum of S2, range from 0 to S/2
        // lookup[i][j] = true, if some subset from 0 to i-th index has sum j
        boolean[][] lookup = new boolean[S + 1][n + 1];
        // Sum = 0 is available for all indices
        for (int j = 0; j <= n; j++) {
            lookup[0][j] = true;
        }
        // Process all the cells
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= S / 2; j++) {
                if (lookup[j][i - 1] || (j >= stones[i - 1] && lookup[j - stones[i - 1]][i - 1])) {
                    lookup[j][i] = true;
                    S2 = Math.max(S2, j);
                }
            }
        }
        return S - 2 * S2;
    }

    private static int getS(int[] stones) {
        int S = 0;
        for (int stone : stones) {
            S += stone;
        }
        return S;
    }
}
