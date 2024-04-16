package com.anirudhology.leetcoding.tree;

import com.anirudhology.leetcoding.utils.TreeNode;

import java.util.*;

public class LowestCommonAncestorOfABinaryTree {

    public TreeNode lowestCommonAncestorRecursive(TreeNode root, TreeNode p, TreeNode q) {
        // Base case
        if (root == null || root == p || root == q) {
            return root;
        }
        // Recurse for left and right subtree
        TreeNode left = lowestCommonAncestorRecursive(root.left, p, q);
        TreeNode right = lowestCommonAncestorRecursive(root.right, p, q);
        // Check if we have reached the given nodes
        if ((left == p && right == q) || (left == q && right == p)) {
            return root;
        }
        return left != null ? left : right;
    }

    public TreeNode lowestCommonAncestorIterative(TreeNode root, TreeNode p, TreeNode q) {
        // Base case
        if (root == null || root == p || root == q) {
            return root;
        }
        // Map to store relationship between node and its parent
        Map<TreeNode, TreeNode> relationships = new HashMap<>();
        // Queue to perform BFS
        Queue<TreeNode> nodes = new LinkedList<>();
        // Process root node
        relationships.put(root, null);
        nodes.offer(root);
        // Traverse until we reach p or q
        while (!relationships.containsKey(p) || !relationships.containsKey(q)) {
            // Get node at the front
            TreeNode node = nodes.remove();
            if (node != null) {
                relationships.put(node.left, node);
                relationships.put(node.right, node);
                nodes.offer(node.left);
                nodes.offer(node.right);
            }
        }
        // Set to add nodes
        Set<TreeNode> nodeSet = new HashSet<>();
        // Check for p node
        while (p != null) {
            nodeSet.add(p);
            p = relationships.get(p);
        }
        // Check for q node
        while (!nodeSet.contains(q)) {
            q = relationships.get(q);
        }
        return q;
    }
}
