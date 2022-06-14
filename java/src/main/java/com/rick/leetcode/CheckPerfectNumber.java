package com.rick.leetcode;

/**
 * @author Rick
 * @createdAt 2022-06-11 20:08:00
 */
public class CheckPerfectNumber {
    public boolean checkPerfectNumber(int num) {
        if (num==1) {
            return false;
        }
        int sqrt = (int) Math.sqrt(num);
        int sum = 1;
        for (int i = 2; i <= sqrt; i++) {
            if (num % i == 0) {
                sum += i;
                sum += (num / i);
            }
        }
        return sum == num;
    }
}
