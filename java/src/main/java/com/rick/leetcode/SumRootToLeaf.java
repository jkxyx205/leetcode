package com.rick.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Rick
 * @createdAt 2022-05-30 16:30:00
 */
public class SumRootToLeaf {


    public int sumRootToLeaf(TreeNode root) {
        List<String> pathValues = new ArrayList<>();
        getPathValues(pathValues, "", root);
        return pathValues.stream().collect(Collectors.summingInt(v -> Integer.valueOf(v, 2)));
    }

    public void getPathValues(List<String> pathValues, String parent, TreeNode root) {
        if (root != null) {
            getPathValues(pathValues, parent + root.val, root.left);
            getPathValues(pathValues, parent + root.val, root.right);
            if (root.left == null && root.right == null) {
                pathValues.add(parent + root.val);
            }
        }
    }

    public static void main(String[] args) {
        SumRootToLeaf sumRootToLeaf = new SumRootToLeaf();
        TreeNode root = sumRootToLeaf.initTree();
        sumRootToLeaf.sumRootToLeaf(root);
    }

//    private TreeNode initTree() {
//        TreeNode leve1 = new TreeNode(0);
//        TreeNode leve2 = new TreeNode(1);
//        TreeNode leve3 = new TreeNode(0);
//        TreeNode leve4 = new TreeNode(1);
//
//        TreeNode leve21 = new TreeNode(0, leve1, leve2);
//        TreeNode leve22 = new TreeNode(1, leve3, leve4);
//
//        TreeNode root = new TreeNode(1, leve21, leve22);
//        return root;
//    }

    private TreeNode initTree() {

        TreeNode leve22 = new TreeNode(1);

        TreeNode root = new TreeNode(1, leve22, null);
        return root;
    }
}
