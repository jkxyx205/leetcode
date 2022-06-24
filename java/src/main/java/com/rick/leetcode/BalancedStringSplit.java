package com.rick.leetcode;

/**
 * @author Rick
 * @createdAt 2022-06-24 10:29:00
 */
public class BalancedStringSplit {
    public int balancedStringSplit(String s) {
        if (s.length() <= 2) {
            return 1;
        }
        int count = 0;
        int indicator = 0;
        for (int i = 0; i < s.length(); i++) {
            if ('L' == s.charAt(i)) {
                indicator--;
            } else if ('R' == s.charAt(i)) {
                indicator++;
            }

            if (indicator == 0) {
                count++;
            }
        }


        return count;
    }
}
