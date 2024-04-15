package com.anirudhology.leetcoding.tree;

import com.anirudhology.leetcoding.utils.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {

    public List<List<Integer>> levelOrder(TreeNode root) {
        // List to store the lever order traversal
        List<List<Integer>> output = new ArrayList<>();
        // Special case
        if (root == null) {
            return output;
        }
        // Queue to perform the lever order traversal
        Queue<TreeNode> nodes = new ArrayDeque<>();
        // Add root node to the queue
        nodes.offer(root);
        // Traverse through the tree level by level
        while (!nodes.isEmpty()) {
            // Get the count of the nodes at the current level
            int count = nodes.size();
            // Process all the nodes
            List<Integer> levelNodes = new ArrayList<>();
            for (int i = 0; i < count; i++) {
                // Get the front node
                TreeNode node = nodes.remove();
                levelNodes.add(node.val);
                // Process left and right subtrees
                if (node.left != null) {
                    nodes.offer(node.left);
                }
                if (node.right != null) {
                    nodes.offer(node.right);
                }
            }
            // Add current level to the list
            output.add(levelNodes);
        }
        return output;
    }
}
