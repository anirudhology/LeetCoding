package com.anirudhology.leetcoding.graph;

public class NumberOfIslands {

    public int numIslands(char[][] grid) {
        // Special case
        if (grid == null || grid.length == 0) {
            return 0;
        }
        // Dimensions of the grid
        int m = grid.length;
        int n = grid[0].length;
        // Total number of islands
        int islandCount = 0;
        // Array to mark the visited cells
        boolean[][] visited = new boolean[m][n];
        // Traverse through the grid
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1' && !visited[i][j]) {
                    dfs(grid, i, j, m, n, visited);
                    islandCount++;
                }
            }
        }
        return islandCount;
    }

    private void dfs(char[][] grid, int i, int j, int m, int n, boolean[][] visited) {
        if (i < 0 || i >= m || j < 0 || j >= n || visited[i][j] || grid[i][j] == '0') {
            return;
        }
        // Mark the current cell visited
        visited[i][j] = true;
        // Perform DFS in all four directions
        dfs(grid, i + 1, j, m, n, visited);
        dfs(grid, i - 1, j, m, n, visited);
        dfs(grid, i, j + 1, m, n, visited);
        dfs(grid, i, j - 1, m, n, visited);
    }
}
