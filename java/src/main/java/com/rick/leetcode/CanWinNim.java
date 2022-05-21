package com.rick.leetcode;

/**
 * @author Rick
 * @createdAt 2022-05-21 19:22:00
 */
public class CanWinNim {
    public boolean canWinNim(int n) {
        if (n <= 3) {
            return true;
        }

        for (int i = 1; i <=3; i++) {
            if ((n - i) % 4 == 0) {
                return true;
            }
        }

        return false;
    }
}
