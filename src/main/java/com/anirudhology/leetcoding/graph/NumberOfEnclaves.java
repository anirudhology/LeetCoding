package com.anirudhology.leetcoding.graph;

public class NumberOfEnclaves {

    public int numEnclaves(int[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        // Dimensions of the grid
        int m = grid.length;
        int n = grid[0].length;
        // Traverse through the grid
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == m - 1 || j == n - 1) {
                    dfs(grid, i, j, m, n);
                }
            }
        }
        // Count of enclaves
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    count++;
                }
            }
        }
        return count;
    }

    private void dfs(int[][] grid, int i, int j, int m, int n) {
        // Base case
        if (i < 0 || i >= m || j < 0 || j >= n) {
            return;
        }
        // If current cell is not land, we will return
        if (grid[i][j] != 1) {
            return;
        }
        // Mark current cell as visited
        grid[i][j] = -1;
        // Perform DFS on neighbors recursively
        dfs(grid, i + 1, j, m, n);
        dfs(grid, i - 1, j, m, n);
        dfs(grid, i, j + 1, m, n);
        dfs(grid, i, j - 1, m, n);
    }
}
