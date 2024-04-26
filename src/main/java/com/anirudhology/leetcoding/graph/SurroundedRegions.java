package com.anirudhology.leetcoding.graph;

public class SurroundedRegions {

    public char[][] solve(char[][] board) {
        // Special case
        if (board == null || board.length == 0) {
            return board;
        }
        // Dimensions of the board
        int m = board.length;
        int n = board[0].length;
        // Step 1 - find all "O"s that cannot be flipped because they are forming
        // a chain with an "O" that are at boundary. We will do this by using
        // boundaryDFS for corner rows and columns
        for (int i = 0; i < m; i++) {
            if (board[i][0] == 'O') {
                boundaryDFS(board, i, 0, m, n);
            }
            if (board[i][n - 1] == 'O') {
                boundaryDFS(board, i, n - 1, m, n);
            }
        }
        for (int j = 0; j < n; j++) {
            if (board[0][j] == 'O') {
                boundaryDFS(board, 0, j, m, n);
            }
            if (board[m - 1][j] == 'O') {
                boundaryDFS(board, m - 1, j, m, n);
            }
        }
        // Step 2 - Mark remaining "O" to "X" and "#" to "O"
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                }
                if (board[i][j] == '#') {
                    board[i][j] = 'O';
                }
            }
        }
        return board;
    }

    private void boundaryDFS(char[][] board, int i, int j, int m, int n) {
        // Base case
        if (i < 0 || i >= m || j < 0 || j >= n || board[i][j] != 'O') {
            return;
        }
        // Mark the current cell as "#"
        board[i][j] = '#';
        // Perform DFS
        boundaryDFS(board, i + 1, j, m, n);
        boundaryDFS(board, i - 1, j, m, n);
        boundaryDFS(board, i, j + 1, m, n);
        boundaryDFS(board, i, j - 1, m, n);
    }
}
