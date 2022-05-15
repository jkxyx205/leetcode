package com.rick.leetcode;

/**
 * @author Rick
 * @createdAt 2022-05-11 20:27:00
 */
public class Divide {
    public int divide(int a, int b) {
        boolean isDiff = false;
        if ((a < 0 && b > 0) || (a > 0 && b < 0)) {
            isDiff = true;
        }

        // 处理溢出
        if ((a == -2147483648 && b == -1)) {
            return 2147483647;
        }

        if (b == 1) {
            return a;
        }

        long c = Math.abs((long)a);
        long d= Math.abs((long)b);

        long r = 0;
        while (c >= d) {
            c -= d;
            r++;
        }

        return (int) (isDiff ? 0 - r : r);
    }
}
