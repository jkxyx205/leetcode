package com.rick.leetcode;

/**
 * @author Rick
 * @createdAt 2022-05-12 16:23:00
 */
public class ClimbStairs {

    public int climbStairs(int n) {
        int sum = 0;
        for (int i = 0; n - i * 2 >= 0 ; i++) {
            sum += factorial(i + (n - i * 2)) / (factorial(i) * factorial(n - i * 2));
        }

        return sum;

    }

    public int factorial(int i) {
        if (i <= 1) {
            return 1;
        }
        return factorial(i - 1) * i;
    }

}
