package com.anirudhology.leetcoding.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EvaluateReversePolishNotationTest {

    private final EvaluateReversePolishNotation evaluateReversePolishNotation = new EvaluateReversePolishNotation();

    @Test
    public void testEvalRPNBasic() {
        assertEquals(9, evaluateReversePolishNotation.evalRPN(new String[] {"2", "1", "+", "3", "*"}));
        assertEquals(6, evaluateReversePolishNotation.evalRPN(new String[] {"4", "13", "5", "/", "+"}));
        assertEquals(22, evaluateReversePolishNotation.evalRPN(new String[] {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"}));
    }

    @Test
    public void testEvalRPNEdgeCases() {
        assertEquals(0, evaluateReversePolishNotation.evalRPN(null));
        assertEquals(0, evaluateReversePolishNotation.evalRPN(new String[] {}));
        assertEquals(42, evaluateReversePolishNotation.evalRPN(new String[] {"42"}));
    }

    @Test
    public void testEvalRPNComplex() {
        assertEquals(-1, evaluateReversePolishNotation.evalRPN(new String[] {"3", "4", "-", "2", "*", "1", "+"}));
        assertEquals(2, evaluateReversePolishNotation.evalRPN(new String[] {"4", "2", "/"}));
        assertEquals(100, evaluateReversePolishNotation.evalRPN(new String[] {"10", "10", "*"}));
    }

    @Test
    public void testEvalRPNOptimizedBasic() {
        assertEquals(9, evaluateReversePolishNotation.evalRPNOptimized(new String[] {"2", "1", "+", "3", "*"}));
        assertEquals(6, evaluateReversePolishNotation.evalRPNOptimized(new String[] {"4", "13", "5", "/", "+"}));
        assertEquals(22, evaluateReversePolishNotation.evalRPNOptimized(new String[] {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"}));
    }

    @Test
    public void testEvalRPNOptimizedEdgeCases() {
        assertEquals(0, evaluateReversePolishNotation.evalRPNOptimized(null));
        assertEquals(0, evaluateReversePolishNotation.evalRPNOptimized(new String[] {}));
        assertEquals(42, evaluateReversePolishNotation.evalRPNOptimized(new String[] {"42"}));
    }

    @Test
    public void testEvalRPNOptimizedComplex() {
        assertEquals(-1, evaluateReversePolishNotation.evalRPNOptimized(new String[] {"3", "4", "-", "2", "*", "1", "+"}));
        assertEquals(2, evaluateReversePolishNotation.evalRPNOptimized(new String[] {"4", "2", "/"}));
        assertEquals(100, evaluateReversePolishNotation.evalRPNOptimized(new String[] {"10", "10", "*"}));
    }
}