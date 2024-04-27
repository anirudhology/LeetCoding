package com.anirudhology.leetcoding.graph;

public class FloodFill {

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        // Special case
        if (image[sr][sc] == color) {
            return image;
        }
        int previousColor = image[sr][sc];
        // Perform DFS on neighboring cells of sr and sc
        dfs(image, sr, sc, previousColor, color);
        return image;
    }

    private void dfs(int[][] image, int i, int j, int previousColor, int color) {
        // Check for out of bounds cells
        if (i < 0 || i >= image.length || j < 0 || j >= image[0].length || image[i][j] != previousColor) {
            return;
        }
        // Color the current cell
        image[i][j] = color;
        // Color the neighboring cells
        dfs(image, i + 1, j, previousColor, color);
        dfs(image, i - 1, j, previousColor, color);
        dfs(image, i, j + 1, previousColor, color);
        dfs(image, i, j - 1, previousColor, color);
    }
}
