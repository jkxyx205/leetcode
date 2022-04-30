package com.rick.leetcode;

/**
 * 88. 合并两个有序数组
 * @author Rick
 * @createdAt 2022-04-30 21:43:00
 */
public class Merge {

    public void merge2(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) {
            return;
        }

        int[] tmp = new int[m + n];

        if (m == 0) {
            tmp = nums2;
        } else {
            int index = 0;
            int i = 0;
            int j = 0;
            while (index < m + n) {
                if (j >= n || (i < m && nums1[i] <= nums2[j])) {
                    tmp[index++] = nums1[i++];
                } else {
                    tmp[index++] = nums2[j++];
                }
            }
        }

        for (int i = 0; i < m + n; i++) {
            nums1[i] = tmp[i];
        }

    }

    /**
     * 从nums1尾部开始放数据
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        while (n > 0) {
            if (m > 0) {
                if (nums1[m - 1] > nums2[n - 1]) {
                    nums1[n + m - 1] = nums1[m - 1];
                    m--;
                } else {
                    nums1[n + m - 1] = nums2[n - 1];
                    n--;
                }
            } else {
                nums1[n - 1] = nums2[n - 1];
                n--;
            }
        }

    }
}
