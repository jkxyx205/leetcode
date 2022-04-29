package com.rick.leetcode;

/**
 *
 * # 14. 最长公共前缀
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * 如果不存在公共前缀，返回空字符串 ""。
 * @author Rick
 * @createdAt 2022-04-29 13:36:00
 */
public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) {
            return strs[0];
        }

        String commonPrefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            commonPrefix = longestCommonPrefix(commonPrefix, strs[i]);
            if ("".equals(commonPrefix)) {
                return commonPrefix;
            }
        }

        return commonPrefix;
    }

    private String longestCommonPrefix(String s1, String s2) {
        int length = Math.min(s1.length(), s2.length());
        for (int i = 0; i < length; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return i > 0 ? s1.substring(0, i) : "";
            }
        }

        return s1.substring(0, length);
    }

}
