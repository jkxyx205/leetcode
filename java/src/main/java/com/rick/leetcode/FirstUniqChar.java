package com.rick.leetcode;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author Rick
 * @createdAt 2022-05-21 21:03:00
 */
public class FirstUniqChar {

    public int firstUniqChar(String s) {
        int[] a = new int[128];

        for (int i = 0; i < s.length(); i++) {
            a[s.charAt(i)]++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (a[s.charAt(i)] == 1) {
                return s.indexOf(s.charAt(i));
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        new FirstUniqChar().firstUniqChar("leetcode");
    }
}
