package com.rick.leetcode;

import java.util.Arrays;
import java.util.Objects;

/**
 * @author Rick
 * @createdAt 2022-06-07 10:52:00
 */
public class Anagram {
    public boolean isAnagram(String s, String t) {
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        Arrays.sort(sArr);
        Arrays.sort(tArr);
        return Objects.deepEquals(sArr, tArr);
    }
}
