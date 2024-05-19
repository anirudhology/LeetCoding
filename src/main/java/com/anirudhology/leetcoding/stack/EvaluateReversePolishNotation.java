package com.anirudhology.leetcoding.stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class EvaluateReversePolishNotation {

    /**
     * Time Complexity - O(N)
     * Space Complexity - O(N)
     */
    public int evalRPN(String[] tokens) {
        // Special case
        if (tokens == null || tokens.length == 0) {
            return 0;
        }
        if (tokens.length == 1) {
            return Integer.parseInt(tokens[0]);
        }
        // Stack to store operands
        final Stack<Integer> operands = new Stack<>();
        // Traverse through the tokens
        for (String token : tokens) {
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                // Get operands
                int operand1 = operands.pop();
                int operand2 = operands.pop();
                // Process operands
                switch (token) {
                    case "+" -> operands.push(operand1 + operand2);
                    case "-" -> operands.push(operand2 - operand1);
                    case "*" -> operands.push(operand1 * operand2);
                    default -> operands.push(operand2 / operand1);
                }
            } else {
                operands.push(Integer.parseInt(token));
            }
        }
        return operands.pop();
    }

    /**
     * Time Complexity - O(N)
     * Space Complexity - O(N)
     */
    public int evalRPNOptimized(String[] tokens) {
        // Special case
        if (tokens == null || tokens.length == 0) {
            return 0;
        }
        // Stack implementation to store values
        Deque<Integer> operands = new ArrayDeque<>();
        int firstOperand;
        int secondOperand;
        for (String token : tokens) {
            switch (token) {
                case "+":
                    firstOperand = operands.pop();
                    secondOperand = operands.pop();
                    operands.push(firstOperand + secondOperand);
                    break;
                case "-":
                    firstOperand = operands.pop();
                    secondOperand = operands.pop();
                    operands.push(secondOperand - firstOperand);
                    break;
                case "*":
                    firstOperand = operands.pop();
                    secondOperand = operands.pop();
                    operands.push(secondOperand * firstOperand);
                    break;
                case "/":
                    firstOperand = operands.pop();
                    secondOperand = operands.pop();
                    operands.push(secondOperand / firstOperand);
                    break;
                default:
                    operands.push(Integer.parseInt(token));
                    break;
            }
        }
        return operands.pop();
    }
}
