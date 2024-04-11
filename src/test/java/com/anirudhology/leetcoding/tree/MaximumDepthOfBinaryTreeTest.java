package com.anirudhology.leetcoding.tree;

import com.anirudhology.leetcoding.utils.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumDepthOfBinaryTreeTest {

    private final MaximumDepthOfBinaryTree maximumDepthOfBinaryTree = new MaximumDepthOfBinaryTree();

    @Test
    public void testMaxDepthWithNullRootShouldReturnZero() {
        TreeNode root = null;
        int expected = 0;
        int actual = maximumDepthOfBinaryTree.maxDepth(root);
        assertEquals(expected, actual);
    }

    @Test
    public void testMaxDepthWithSingleNodeTreeShouldReturnOne() {
        TreeNode root = new TreeNode(1);
        int expected = 1;
        int actual = maximumDepthOfBinaryTree.maxDepth(root);
        assertEquals(expected, actual);
    }

    @Test
    public void testMaxDepthWithBalancedTreeShouldReturnCorrectDepth() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        int expected = 3;
        int actual = maximumDepthOfBinaryTree.maxDepth(root);
        assertEquals(expected, actual);
    }

    @Test
    public void testMaxDepthWithUnbalancedTreeShouldReturnCorrectDepth() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.left.left = new TreeNode(4);
        int expected = 4;
        int actual = maximumDepthOfBinaryTree.maxDepth(root);
        assertEquals(expected, actual);
    }
}