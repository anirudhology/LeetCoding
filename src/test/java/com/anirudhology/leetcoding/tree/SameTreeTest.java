package com.anirudhology.leetcoding.tree;

import com.anirudhology.leetcoding.utils.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SameTreeTest {

    private final SameTree sameTree = new SameTree();

    @Test
    public void testIsSameTreeWithBothTreesNullShouldReturnTrue() {
        TreeNode p = null;
        TreeNode q = null;
        boolean expected = true;
        boolean actual = sameTree.isSameTree(p, q);
        assertEquals(expected, actual);
    }

    @Test
    public void testIsSameTreeWithOneTreeNullAndOtherNotNullShouldReturnFalse() {
        TreeNode p = new TreeNode(1);
        TreeNode q = null;
        boolean expected = false;
        boolean actual = sameTree.isSameTree(p, q);
        assertEquals(expected, actual);
    }

    @Test
    public void testIsSameTreeWithDifferentValuesInRootNodesShouldReturnFalse() {
        TreeNode p = new TreeNode(1);
        TreeNode q = new TreeNode(2);
        boolean expected = false;
        boolean actual = sameTree.isSameTree(p, q);
        assertEquals(expected, actual);
    }

    @Test
    public void testIsSameTreeWithSameTreeStructureButDifferentValuesShouldReturnFalse() {
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);

        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(4); // Different value here
        q.right = new TreeNode(3);

        boolean expected = false;
        boolean actual = sameTree.isSameTree(p, q);
        assertEquals(expected, actual);
    }

    @Test
    public void testIsSameTreeWithIdenticalTreesShouldReturnTrue() {
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);

        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(2);
        q.right = new TreeNode(3);

        boolean expected = true;
        boolean actual = sameTree.isSameTree(p, q);
        assertEquals(expected, actual);
    }

    @Test
    public void testIsSameTreeWithDifferentStructureButSameValuesShouldReturnFalse() {
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);

        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(2);
        q.left.left = new TreeNode(3); // Different structure here
        q.right = new TreeNode(3);

        boolean expected = false;
        boolean actual = sameTree.isSameTree(p, q);
        assertEquals(expected, actual);
    }

    @Test
    public void testIsSameTreeWithBothTreesBeingNullShouldReturnTrue() {
        TreeNode p = null;
        TreeNode q = null;
        boolean expected = true;
        boolean actual = sameTree.isSameTree(p, q);
        assertEquals(expected, actual);
    }

}