package com.rick.leetcode;

/**
 * 69. x 的平方根
 * @author Rick
 * @createdAt 2022-05-12 13:57:00
 */
public class MySqrt {

    public int mySqrt(int x) {
        if (x <= 1)
            return x;
        int min = 2;
        int max = x;
        while (max - min > 1) {
            int m = (max + min) / 2;
            if (x / m < m)
                max = m;
            else
                min = m;
        }
        return min;
    }
}
