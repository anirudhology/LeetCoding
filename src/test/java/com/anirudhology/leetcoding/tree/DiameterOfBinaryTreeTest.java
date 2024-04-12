package com.anirudhology.leetcoding.tree;

import com.anirudhology.leetcoding.utils.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DiameterOfBinaryTreeTest {

    DiameterOfBinaryTree diameterOfBinaryTree = new DiameterOfBinaryTree();

    // Test cases for diameterOfBinaryTreeOne method

    @Test
    public void testDiameterOfBinaryTreeOneWithNullRootShouldReturnZero() {
        TreeNode root = null;
        int expected = 0;
        int actual = diameterOfBinaryTree.diameterOfBinaryTreeOne(root);
        assertEquals(expected, actual);
    }

    @Test
    public void testDiameterOfBinaryTreeOneWithSingleNodeTreeShouldReturnZero() {
        TreeNode root = new TreeNode(1);
        int expected = 0;
        int actual = diameterOfBinaryTree.diameterOfBinaryTreeOne(root);
        assertEquals(expected, actual);
    }

    @Test
    public void testDiameterOfBinaryTreeOneWithLeftSkewedTreeShouldReturnCorrectDiameter() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        int expected = 2;
        int actual = diameterOfBinaryTree.diameterOfBinaryTreeOne(root);
        assertEquals(expected, actual);
    }

    @Test
    public void testDiameterOfBinaryTreeOneWithRightSkewedTreeShouldReturnCorrectDiameter() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(3);
        int expected = 2;
        int actual = diameterOfBinaryTree.diameterOfBinaryTreeOne(root);
        assertEquals(expected, actual);
    }

    @Test
    public void testDiameterOfBinaryTreeOneWithBalancedTreeShouldReturnCorrectDiameter() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        int expected = 2;
        int actual = diameterOfBinaryTree.diameterOfBinaryTreeOne(root);
        assertEquals(expected, actual);
    }

    // Test cases for diameterOfBinaryTreeTwo method

    @Test
    public void testDiameterOfBinaryTreeTwoWithNullRootShouldReturnZero() {
        TreeNode root = null;
        int expected = 0;
        int actual = diameterOfBinaryTree.diameterOfBinaryTreeTwo(root);
        assertEquals(expected, actual);
    }

    @Test
    public void testDiameterOfBinaryTreeTwoWithSingleNodeTreeShouldReturnZero() {
        TreeNode root = new TreeNode(1);
        int expected = 0;
        int actual = diameterOfBinaryTree.diameterOfBinaryTreeTwo(root);
        assertEquals(expected, actual);
    }

    @Test
    public void testDiameterOfBinaryTreeTwoWithLeftSkewedTreeShouldReturnCorrectDiameter() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        int expected = 2;
        int actual = diameterOfBinaryTree.diameterOfBinaryTreeTwo(root);
        assertEquals(expected, actual);
    }

    @Test
    public void testDiameterOfBinaryTreeTwoWithRightSkewedTreeShouldReturnCorrectDiameter() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(3);
        int expected = 2;
        int actual = diameterOfBinaryTree.diameterOfBinaryTreeTwo(root);
        assertEquals(expected, actual);
    }

    @Test
    public void testDiameterOfBinaryTreeTwoWithBalancedTreeShouldReturnCorrectDiameter() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        int expected = 2;
        int actual = diameterOfBinaryTree.diameterOfBinaryTreeTwo(root);
        assertEquals(expected, actual);
    }

    // Test cases for diameterOfBinaryTreeThree method

    @Test
    public void testDiameterOfBinaryTreeThreeWithNullRootShouldReturnZero() {
        TreeNode root = null;
        int expected = 0;
        int actual = diameterOfBinaryTree.diameterOfBinaryTreeThree(root);
        assertEquals(expected, actual);
    }

    @Test
    public void testDiameterOfBinaryTreeThreeWithSingleNodeTreeShouldReturnZero() {
        TreeNode root = new TreeNode(1);
        int expected = 0;
        int actual = diameterOfBinaryTree.diameterOfBinaryTreeThree(root);
        assertEquals(expected, actual);
    }

    @Test
    public void testDiameterOfBinaryTreeThreeWithLeftSkewedTreeShouldReturnCorrectDiameter() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        int expected = 2;
        int actual = diameterOfBinaryTree.diameterOfBinaryTreeThree(root);
        assertEquals(expected, actual);
    }

    @Test
    public void testDiameterOfBinaryTreeThreeWithRightSkewedTreeShouldReturnCorrectDiameter() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(3);
        int expected = 2;
        int actual = diameterOfBinaryTree.diameterOfBinaryTreeThree(root);
        assertEquals(expected, actual);
    }

    @Test
    public void testDiameterOfBinaryTreeThreeWithBalancedTreeShouldReturnCorrectDiameter() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        int expected = 2;
        int actual = diameterOfBinaryTree.diameterOfBinaryTreeThree(root);
        assertEquals(expected, actual);
    }
}