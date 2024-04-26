package com.anirudhology.leetcoding.graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class SurroundedRegionsTest {

    private final SurroundedRegions surroundedRegions = new SurroundedRegions();

    @Test
    public void testSolveNullBoard() {
        assertNull(surroundedRegions.solve(null));
    }

    @Test
    public void testSolveEmptyBoard() {
        char[][] board = {};
        assertArrayEquals(board, surroundedRegions.solve(board));
    }

    @Test
    public void testSolveNoSurroundedRegions() {
        char[][] board = {
                {'X', 'X', 'X', 'X'},
                {'X', 'O', 'O', 'X'},
                {'X', 'X', 'O', 'X'},
                {'X', 'O', 'X', 'X'}
        };
        char[][] expected = {
                {'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'X'},
                {'X', 'O', 'X', 'X'}
        };
        assertArrayEquals(expected, surroundedRegions.solve(board));
    }

    @Test
    public void testSolveSurroundedRegions() {
        char[][] board = {
                {'X', 'X', 'X', 'X'},
                {'X', 'O', 'O', 'X'},
                {'X', 'X', 'O', 'X'},
                {'X', 'O', 'X', 'X'}
        };
        char[][] expected = {
                {'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'X'},
                {'X', 'O', 'X', 'X'}
        };
        assertArrayEquals(expected, surroundedRegions.solve(board));
    }
}