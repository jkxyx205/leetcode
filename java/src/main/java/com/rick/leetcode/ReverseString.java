package com.rick.leetcode;

/**
 * @author Rick
 * @createdAt 2022-06-07 11:06:00
 */
public class ReverseString {
    public void reverseString(char[] s) {
        for (int i = 0; i < s.length / 2; i++) {
            char t = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i - 1] = t;
        }
    }
}
