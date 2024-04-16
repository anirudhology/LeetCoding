package com.anirudhology.leetcoding.tree;

import com.anirudhology.leetcoding.utils.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LowestCommonAncestorOfABinaryTreeTest {

    private final LowestCommonAncestorOfABinaryTree lowestCommonAncestorOfABinaryTree = new LowestCommonAncestorOfABinaryTree();

    // Test for recursive method
    @Test
    public void testLowestCommonAncestorRecursive() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);

        TreeNode p = root.left;
        TreeNode q = root.right;
        assertEquals(root, lowestCommonAncestorOfABinaryTree.lowestCommonAncestorRecursive(root, p, q));

        p = root.left;
        q = root.left.right.right;
        assertEquals(p, lowestCommonAncestorOfABinaryTree.lowestCommonAncestorRecursive(root, p, q));

        p = root.left.left;
        q = root.left.right;
        assertEquals(root.left, lowestCommonAncestorOfABinaryTree.lowestCommonAncestorRecursive(root, p, q));
    }

    // Test for iterative method
    @Test
    public void testLowestCommonAncestorIterative() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);

        TreeNode p = root.left;
        TreeNode q = root.right;
        assertEquals(root, lowestCommonAncestorOfABinaryTree.lowestCommonAncestorIterative(root, p, q));

        p = root.left;
        q = root.left.right.right;
        assertEquals(p, lowestCommonAncestorOfABinaryTree.lowestCommonAncestorIterative(root, p, q));

        p = root.left.left;
        q = root.left.right;
        assertEquals(root.left, lowestCommonAncestorOfABinaryTree.lowestCommonAncestorIterative(root, p, q));
    }


}