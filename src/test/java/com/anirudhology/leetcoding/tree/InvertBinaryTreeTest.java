package com.anirudhology.leetcoding.tree;

import com.anirudhology.leetcoding.utils.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class InvertBinaryTreeTest {

    private final InvertBinaryTree invertBinaryTree = new InvertBinaryTree();

    @Test
    public void testInvertTreeWithNullRootShouldReturnNull() {
        TreeNode result = invertBinaryTree.invertTree(null);
        assertNull(result);
    }

    @Test
    public void testInvertTreeWithSingleNodeShouldReturnSameNode() {
        TreeNode root = new TreeNode(1);
        TreeNode result = invertBinaryTree.invertTree(root);
        assertEquals(root, result);
    }

    @Test
    public void testInvertTreeWithMultipleNodesShouldInvertTreeCorrectly() {
        // Creating a tree
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        // Inverting the tree
        TreeNode invertedRoot = invertBinaryTree.invertTree(root);
        // Asserting the structure after inversion
        assertEquals(4, invertedRoot.val);
        assertEquals(7, invertedRoot.left.val);
        assertEquals(2, invertedRoot.right.val);
        assertEquals(9, invertedRoot.left.left.val);
        assertEquals(6, invertedRoot.left.right.val);
        assertEquals(3, invertedRoot.right.left.val);
        assertEquals(1, invertedRoot.right.right.val);
    }
}