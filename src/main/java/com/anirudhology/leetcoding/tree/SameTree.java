package com.anirudhology.leetcoding.tree;

import com.anirudhology.leetcoding.utils.TreeNode;

public class SameTree {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        //Special case
        if (p == null && q == null) {
            return true;
        }
        if ((p == null || q == null)) {
            return false;
        }
        if (p.val != q.val) {
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
