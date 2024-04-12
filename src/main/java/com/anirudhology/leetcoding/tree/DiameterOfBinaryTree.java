package com.anirudhology.leetcoding.tree;

import com.anirudhology.leetcoding.utils.TreeNode;

public class DiameterOfBinaryTree {

    /**
     * Easy to understand and write but bad performance
     */
    public int diameterOfBinaryTreeOne(TreeNode root) {
        // Base case
        if (root == null) {
            return 0;
        }
        // Current diameter (including current node)
        int diameter = findHeightOne(root.left) + findHeightOne(root.right);
        // Left and right diameters
        int leftDiameter = diameterOfBinaryTreeOne(root.left);
        int rightDiameter = diameterOfBinaryTreeOne(root.right);
        // Find max of all three diameters
        return Math.max(diameter, Math.max(leftDiameter, rightDiameter));
    }

    private int findHeightOne(TreeNode root) {
        // Base case
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(findHeightOne(root.left), findHeightOne(root.right));
    }

    /* ------------------------------------------------------------------ */

    /**
     * Best performance but uses class variable
     */
    private int maxHeight = 0;

    public int diameterOfBinaryTreeTwo(TreeNode root) {
        // Find the height
        findHeightTwo(root);
        return maxHeight;
    }

    private int findHeightTwo(TreeNode root) {
        // Base case
        if (root == null) {
            return 0;
        }
        int leftHeight = findHeightTwo(root.left);
        int rightHeight = findHeightTwo(root.right);
        maxHeight = Math.max(maxHeight, leftHeight + rightHeight);
        return 1 + Math.max(leftHeight, rightHeight);
    }

    /* ------------------------------------------------------------------ */

    /**
     * Intermediate performance but not using class variable
     */
    public int diameterOfBinaryTreeThree(TreeNode root) {
        Height height = new Height();
        return diameterOfBinaryTreeThree(root, height);
    }

    private int diameterOfBinaryTreeThree(TreeNode root, Height height) {
        // Heights of left and right subtrees
        Height leftHeight = new Height();
        Height rightHeight = new Height();
        // Base case
        if (root == null) {
            height.h = 0;
            return 0;
        }
        // Calculate diameters of left and right subtrees recursively
        int leftDiameter = diameterOfBinaryTreeThree(root.left, leftHeight);
        int rightDiameter = diameterOfBinaryTreeThree(root.right, rightHeight);
        // Height of current node is max of heights of left and right subtrees plus 1
        height.h = Math.max(leftHeight.h, rightHeight.h) + 1;
        return Math.max(leftHeight.h + rightHeight.h, Math.max(leftDiameter, rightDiameter));
    }

    static class Height {
        private int h;
    }
}
