package com.rick.leetcode;

/**
 * @author Rick
 * @createdAt 2022-05-12 16:13:00
 */
public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int count = 0;
        char[] chars = s.toCharArray();
        for (int i = chars.length - 1; i >=0; i--) {
            if (chars[i] == ' ' && count > 0) {
                return count;
            }

            if (chars[i] == ' ') {
                continue;
            }
            count++;
        }

        return count;
    }
}
