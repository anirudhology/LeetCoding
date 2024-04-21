package com.anirudhology.leetcoding.dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RussianDollEnvelopesTest {

    private final RussianDollEnvelopes russianDollEnvelopes = new RussianDollEnvelopes();

    @Test
    public void testMaxEnvelopesOneWithEmptyArray() {
        int[][] input = {};
        assertEquals(0, russianDollEnvelopes.maxEnvelopesOne(input));
    }

    @Test
    public void testMaxEnvelopesOneWithSingleEnvelope() {
        int[][] input = {{1, 1}};
        assertEquals(1, russianDollEnvelopes.maxEnvelopesOne(input));
    }

    @Test
    public void testMaxEnvelopesOneWithIncreasingWidths() {
        int[][] input = {{1, 2}, {2, 3}, {3, 4}, {4, 5}};
        assertEquals(4, russianDollEnvelopes.maxEnvelopesOne(input));
    }

    @Test
    public void testMaxEnvelopesOneWithDecreasingWidths() {
        int[][] input = {{4, 5}, {3, 4}, {2, 3}, {1, 2}};
        assertEquals(4, russianDollEnvelopes.maxEnvelopesOne(input));
    }

    @Test
    public void testMaxEnvelopesTwoWithEmptyArray() {
        int[][] input = {};
        assertEquals(0, russianDollEnvelopes.maxEnvelopesTwo(input));
    }

    @Test
    public void testMaxEnvelopesTwoWithSingleEnvelope() {
        int[][] input = {{1, 1}};
        assertEquals(1, russianDollEnvelopes.maxEnvelopesTwo(input));
    }

    @Test
    public void testMaxEnvelopesTwoWithIncreasingWidths() {
        int[][] input = {{1, 2}, {2, 3}, {3, 4}, {4, 5}};
        assertEquals(4, russianDollEnvelopes.maxEnvelopesTwo(input));
    }

    @Test
    public void testMaxEnvelopesTwoWithDecreasingWidths() {
        int[][] input = {{4, 5}, {3, 4}, {2, 3}, {1, 2}};
        assertEquals(4, russianDollEnvelopes.maxEnvelopesTwo(input));
    }
}