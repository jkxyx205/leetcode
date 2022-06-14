package com.rick.leetcode;

/**
 * @author Rick
 * @createdAt 2022-06-14 14:10:00
 */
public class BuddyStrings {
    public boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length() || s.length() <= 1) {
            return false;
        }

        char[] values = new char[256];
        if (s.equals(goal)) {
            // 是否有重复的字符串
            for (int i = 0; i < s.length(); i++) {
                if (values[s.charAt(i)] > 0) {
                    return true;
                }
                values[s.charAt(i)] = 1;
            }

            return false;
        }

        char t1 = 0, t2 = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != goal.charAt(i)) {
                if (t1 != 0) {
                    if (t1 == 1) {
                        return false;
                    }
                    if (t1 != goal.charAt(i) || t2 != s.charAt(i)) {
                        return false;
                    }

                    t1 = 1;
                } else {
                    t1 = s.charAt(i);
                    t2 =goal.charAt(i);
                }
            }
        }

        if (t1 > 1) {
            return false;
        }

        return true;
    }
}
