package com.anirudhology.leetcoding.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class DecodeStringTest {

    private final DecodeString decodeString = new DecodeString();

    @Test
    public void testDecodeStringBasic() {
        assertEquals("aaabcbc", decodeString.decodeString("3[a]2[bc]"));
        assertEquals("accaccacc", decodeString.decodeString("3[a2[c]]"));
        assertEquals("abcabccdcdcdef", decodeString.decodeString("2[abc]3[cd]ef"));
    }

    @Test
    public void testDecodeStringEdgeCases() {
        assertEquals("", decodeString.decodeString(""));
        assertNull(decodeString.decodeString(null));
        assertEquals("a", decodeString.decodeString("a"));
        assertEquals("abc", decodeString.decodeString("abc"));
    }

    @Test
    public void testDecodeStringNested() {
        assertEquals("abccdcdcdxyz", decodeString.decodeString("abc3[cd]xyz"));
        assertEquals("aaabcbcbcbcbcbc", decodeString.decodeString("3[a]3[2[bc]]"));
        assertEquals("abcabccdcdcdef", decodeString.decodeString("2[abc]3[cd]ef"));
    }

    @Test
    public void testDecodeStringComplex() {
        assertEquals("aaa", decodeString.decodeString("3[a]"));
        assertEquals("aaabaaab", decodeString.decodeString("2[3[a]b]"));
        assertEquals("ababcababcababc", decodeString.decodeString("3[2[ab]c]"));
    }

    @Test
    public void testDecodeStringInvalidInput() {
        assertEquals("", decodeString.decodeString("2["));
        assertEquals("a", decodeString.decodeString("2[a"));
    }
}