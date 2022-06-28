package com.rick.leetcode;

/**
 * 1342. 将数字变成 0 的操作次数
 * @author Rick
 * @createdAt 2022-06-27 10:52:00
 */
public class NumberOfSteps {

    public int numberOfSteps(int num) {
        if (num == 0) {
            return 0;
        }

        int step = 0;
        while (num !=0) {
            step++;
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num--;
            }
        }
        return step;
    }
}
