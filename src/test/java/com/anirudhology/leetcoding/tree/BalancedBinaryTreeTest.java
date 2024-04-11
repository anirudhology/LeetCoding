package com.anirudhology.leetcoding.tree;

import com.anirudhology.leetcoding.utils.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BalancedBinaryTreeTest {

    private final BalancedBinaryTree balancedBinaryTree = new BalancedBinaryTree();

    @Test
    public void testIsBalancedWithNullRootShouldReturnTrue() {
        assertTrue(balancedBinaryTree.isBalanced(null));
    }

    @Test
    public void testIsBalancedWithSingleNodeTreeShouldReturnTrue() {
        TreeNode root = new TreeNode(1);
        assertTrue(balancedBinaryTree.isBalanced(root));
    }

    @Test
    public void testIsBalancedWithBalancedTreeShouldReturnTrue() {
        // Creating a balanced tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        assertTrue(balancedBinaryTree.isBalanced(root));
    }

    @Test
    public void testIsBalancedWithUnbalancedTreeShouldReturnFalse() {
        // Creating an unbalanced tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        assertFalse(balancedBinaryTree.isBalanced(root));
    }

    @Test
    public void testIsBalancedWithUnbalancedTree2ShouldReturnFalse() {
        // Creating another unbalanced tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.left.left = new TreeNode(6);
        assertFalse(balancedBinaryTree.isBalanced(root));
    }
}