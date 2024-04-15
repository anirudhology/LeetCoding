package com.anirudhology.leetcoding.tree;

import com.anirudhology.leetcoding.utils.TreeNode;

public class SubtreeOfAnotherTree {

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        // A null tree is a subtree of every tree
        if (subRoot == null) {
            return true;
        }
        // If the bigger tree is empty, then we can't match
        if (root == null) {
            return false;
        }
        // Compare the values and their subtrees
        if (root.val == subRoot.val && matchTree(root, subRoot)) {
            return true;
        }
        // Recurse for left and right subtree
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    private boolean matchTree(TreeNode a, TreeNode b) {
        // If we have reached leaves
        if (a == null && b == null) {
            return true;
        }
        // If one tree is empty, we cannot match
        if (a == null || b == null) {
            return false;
        }
        // If values are not matching
        if (a.val != b.val) {
            return false;
        }
        // Recurse for left and right subtree
        return matchTree(a.left, b.left) && matchTree(a.right, b.right);
    }
}
