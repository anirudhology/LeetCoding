package com.anirudhology.leetcoding.tree;

import com.anirudhology.leetcoding.utils.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SymmetricTreeTest {

    private final SymmetricTree symmetricTree = new SymmetricTree();

    @Test
    public void testIsSymmetricWithNullRootShouldReturnTrue() {
        TreeNode root = null;
        boolean expected = true;
        boolean actual = symmetricTree.isSymmetric(root);
        assertEquals(expected, actual);
    }

    @Test
    public void testIsSymmetricWithSingleNodeTreeShouldReturnTrue() {
        TreeNode root = new TreeNode(1);
        boolean expected = true;
        boolean actual = symmetricTree.isSymmetric(root);
        assertEquals(expected, actual);
    }

    @Test
    public void testIsSymmetricWithSymmetricTreeShouldReturnTrue() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);
        boolean expected = true;
        boolean actual = symmetricTree.isSymmetric(root);
        assertEquals(expected, actual);
    }

    @Test
    public void testIsSymmetricWithAsymmetricTreeShouldReturnFalse() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.right = new TreeNode(3);
        root.right.right = new TreeNode(3);
        boolean expected = false;
        boolean actual = symmetricTree.isSymmetric(root);
        assertEquals(expected, actual);
    }
}