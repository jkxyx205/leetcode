package com.rick.leetcode;

/**
 * 面试题 16.11. 跳水板
 * @author Rick
 * @createdAt 2022-05-23 22:15:00
 */
public class DivingBoard {

    public int[] divingBoard(int shorter, int longer, int k) {
        if (k == 0) {
            return new int[] {};
        }

        if (shorter == longer) {
            return new int[]{k * shorter};
        }

        int[] r = new int[k + 1];

        for (int i = k; i >= 0; i--) {
            // i 表示shorter木板
            r[k - i] = shorter * i + (k - i) * longer;
        }

        return r;
    }
}
