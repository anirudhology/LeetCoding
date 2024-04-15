package com.anirudhology.leetcoding.tree;

import com.anirudhology.leetcoding.utils.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

class BinaryTreeLevelOrderTraversalTest {

    private final BinaryTreeLevelOrderTraversal binaryTreeLevelOrderTraversal = new BinaryTreeLevelOrderTraversal();

    @Test
    public void testLevelOrderWithEmptyTreeShouldReturnEmptyList() {
        TreeNode root = null;
        List<List<Integer>> expected = new ArrayList<>();
        assertTrue(compareLists(expected, binaryTreeLevelOrderTraversal.levelOrder(root)));
    }

    @Test
    public void testLevelOrderWithSingleNodeTreeShouldReturnSingleList() {
        TreeNode root = new TreeNode(1);
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(List.of(1));
        assertTrue(compareLists(expected, binaryTreeLevelOrderTraversal.levelOrder(root)));
    }

    @Test
    public void testLevelOrderWithTreeHavingMultipleLevelsShouldReturnCorrectOrder() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(List.of(3));
        expected.add(Arrays.asList(9, 20));
        expected.add(Arrays.asList(15, 7));
        assertTrue(compareLists(expected, binaryTreeLevelOrderTraversal.levelOrder(root)));
    }

    // Helper method to compare two lists of lists
    private boolean compareLists(List<List<Integer>> list1, List<List<Integer>> list2) {
        if (list1.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list1.size(); i++) {
            if (!list1.get(i).equals(list2.get(i))) {
                return false;
            }
        }
        return true;
    }
}