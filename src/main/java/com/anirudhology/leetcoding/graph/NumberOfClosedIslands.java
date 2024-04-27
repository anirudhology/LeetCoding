package com.anirudhology.leetcoding.graph;

public class NumberOfClosedIslands {

    public int closedIsland(int[][] grid) {
        // Special case
        if (grid == null || grid.length == 0) {
            return 0;
        }
        // Dimensions of the grid
        int m = grid.length;
        int n = grid[0].length;
        // Count of closed islands
        int closedIslands = 0;
        // Process grid
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // Check if the current cell is land
                if (grid[i][j] == 0 && dfs(grid, i, j, m, n)) {
                    closedIslands++;
                }
            }
        }
        return closedIslands;
    }

    private boolean dfs(int[][] grid, int i, int j, int m, int n) {
        // Check for out of bounds
        if (i < 0 || i >= m || j < 0 || j >= n) {
            return false;
        }
        // If current cell is 1 then return true
        if (grid[i][j] == 1) {
            return true;
        }
        grid[i][j] = 1;
        // Check in all four directions
        boolean a = dfs(grid, i + 1, j, m, n);
        boolean b = dfs(grid, i - 1, j, m, n);
        boolean c = dfs(grid, i, j + 1, m, n);
        boolean d = dfs(grid, i, j - 1, m, n);
        return a && b && c && d;
    }
}
