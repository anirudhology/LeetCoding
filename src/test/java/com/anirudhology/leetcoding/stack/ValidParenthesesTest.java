package com.anirudhology.leetcoding.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidParenthesesTest {

    private final ValidParentheses validParentheses = new ValidParentheses();

    @Test
    public void testValidParentheses() {
        assertTrue(validParentheses.isValid("()"));
        assertTrue(validParentheses.isValid("({})"));
        assertTrue(validParentheses.isValid("[()]{}"));
    }

    @Test
    public void testInvalidParentheses() {
        assertFalse(validParentheses.isValid("("));
        assertFalse(validParentheses.isValid(")"));
        assertFalse(validParentheses.isValid("(]"));
        assertFalse(validParentheses.isValid("([)]"));
    }

    @Test
    public void testEmptyString() {
        assertTrue(validParentheses.isValid(""));
    }

    @Test
    public void testNullString() {
        assertTrue(validParentheses.isValid(null));
    }

    @Test
    public void testNestedInvalidParentheses() {
        assertFalse(validParentheses.isValid("({[}])"));
    }

    @Test
    public void testExtraClosingParentheses() {
        assertFalse(validParentheses.isValid("()("));
    }

    @Test
    public void testExtraOpeningParentheses() {
        assertFalse(validParentheses.isValid("())"));
    }

    @Test
    public void testRandomString() {
        assertFalse(validParentheses.isValid("a(b)c[d]"));
    }
}