package com.rick.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Rick
 * @createdAt 2022-05-03 14:09:00
 */
public class IsSameTreeTest {

    private IsSameTree isSameTree = new IsSameTree();

    @Test
    public void isSameTree() {
        boolean sameTree = isSameTree.isSameTree(createTreeNode1(), createTreeNode2());
        System.out.println(sameTree);
    }

    private TreeNode createTreeNode1() {
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode4 = new TreeNode(4);

        TreeNode treeNode3 = new TreeNode(3, treeNode4, null);

        TreeNode treeNode1 = new TreeNode(1, treeNode2, treeNode3);
        return treeNode1;
    }

    private TreeNode createTreeNode2() {
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode4 = new TreeNode(4);

        TreeNode treeNode3 = new TreeNode(3, treeNode4, null);

        TreeNode treeNode1 = new TreeNode(1, treeNode2, treeNode3);
        return treeNode1;
    }

//    private TreeNode createTreeNode1() {
//        TreeNode treeNode2 = new TreeNode(2);
//        TreeNode treeNode1 = new TreeNode(1, treeNode2, null);
//        return treeNode1;
//    }
//
//    private TreeNode createTreeNode2() {
//        TreeNode treeNode2 = new TreeNode(2);
//        TreeNode treeNode1 = new TreeNode(1, null, treeNode2);
//        return treeNode1;
//    }
}