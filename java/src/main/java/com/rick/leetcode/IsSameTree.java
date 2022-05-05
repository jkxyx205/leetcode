package com.rick.leetcode;

/**
 * @author Rick
 * @createdAt 2022-05-03 14:09:00
 */
public class IsSameTree {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p != null) {
            if (q == null) {
                return false;
            }

            if (p.val != q.val) {
                return false;
            }
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);

        } else if (q != null) {
            return false;
        }
        return true;
    }
}
