package com.rick.leetcode;

import java.util.HashMap;

/**
 * @author Rick
 * @createdAt 2022-05-21 18:38:00
 */
public class WordPattern {

    public boolean wordPattern(String pattern, String str) {
        String[] words = str.split(" ");

        if (pattern.length() != words.length) {
            return false;
        }

        HashMap<String, Character> map = new HashMap(pattern.length());

        String[] temp = new String[128];

        for (int i = 0; i < words.length; i++) {
            Character p = map.get(words[i]);

            if (p == null) {
                map.put(words[i], pattern.charAt(i));
            } else if (!p.equals(pattern.charAt(i))) {
                return false;
            }

            if (temp[pattern.charAt(i)] == null) {
                temp[pattern.charAt(i)] = words[i];
            } else if (!temp[pattern.charAt(i)].equals(words[i])) {
                return false;
            }
        }
        return true;
    }
}
