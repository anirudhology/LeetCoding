package com.anirudhology.leetcoding.tree;

import com.anirudhology.leetcoding.utils.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SubtreeOfAnotherTreeTest {

    private final SubtreeOfAnotherTree subtreeOfAnotherTree = new SubtreeOfAnotherTree();

    @Test
    public void testIsSubtreeWithNullSubRootShouldReturnTrue() {
        TreeNode root = new TreeNode(1);
        TreeNode subRoot = null;
        assertTrue(subtreeOfAnotherTree.isSubtree(root, subRoot));
    }

    @Test
    public void testIsSubtreeWithNullRootShouldReturnFalse() {
        TreeNode root = null;
        TreeNode subRoot = new TreeNode(1);
        assertFalse(subtreeOfAnotherTree.isSubtree(root, subRoot));
    }

    @Test
    public void testIsSubtreeWithSingleNodeSubRootShouldReturnTrue() {
        TreeNode root = new TreeNode(1);
        TreeNode subRoot = new TreeNode(1);
        assertTrue(subtreeOfAnotherTree.isSubtree(root, subRoot));
    }

    @Test
    public void testIsSubtreeWithSingleNodeMismatchedValueShouldReturnFalse() {
        TreeNode root = new TreeNode(1);
        TreeNode subRoot = new TreeNode(2);
        assertFalse(subtreeOfAnotherTree.isSubtree(root, subRoot));
    }

    @Test
    public void testIsSubtreeWithIdenticalTreesShouldReturnTrue() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        TreeNode subRoot = new TreeNode(1);
        subRoot.left = new TreeNode(2);
        subRoot.right = new TreeNode(3);
        assertTrue(subtreeOfAnotherTree.isSubtree(root, subRoot));
    }

    @Test
    public void testIsSubtreeWithSubtreePresentInTheLeftSubtreeShouldReturnTrue() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(4);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(2);
        root.right = new TreeNode(5);
        TreeNode subRoot = new TreeNode(4);
        subRoot.left = new TreeNode(1);
        subRoot.right = new TreeNode(2);
        assertTrue(subtreeOfAnotherTree.isSubtree(root, subRoot));
    }

    @Test
    public void testIsSubtreeWithSubtreePresentInTheRightSubtreeShouldReturnTrue() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(4);
        root.right = new TreeNode(5);
        root.right.left = new TreeNode(1);
        root.right.right = new TreeNode(2);
        TreeNode subRoot = new TreeNode(5);
        subRoot.left = new TreeNode(1);
        subRoot.right = new TreeNode(2);
        assertTrue(subtreeOfAnotherTree.isSubtree(root, subRoot));
    }

    @Test
    public void testIsSubtreeWithSubtreeNotPresentShouldReturnFalse() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(4);
        root.right = new TreeNode(5);
        root.right.left = new TreeNode(1);
        root.right.right = new TreeNode(2);
        TreeNode subRoot = new TreeNode(1);
        subRoot.left = new TreeNode(0);
        subRoot.right = new TreeNode(2);
        assertFalse(subtreeOfAnotherTree.isSubtree(root, subRoot));
    }
}