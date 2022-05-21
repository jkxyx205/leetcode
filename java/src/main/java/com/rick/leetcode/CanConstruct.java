package com.rick.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Rick
 * @createdAt 2022-05-21 20:32:00
 */
public class CanConstruct {

    public boolean canConstruct(String ransomNote, String magazine) {
        if (magazine.length() < ransomNote.length()) {
            return false;
        }

        Map<Character, Integer> lastIndexMap = new HashMap<>(ransomNote.length());

        for (int i = 0; i < ransomNote.length(); i++) {
            Integer formIndex = lastIndexMap.get(ransomNote.charAt(i));
            if (formIndex == null) {
                formIndex = 0;
            }

            int index = magazine.indexOf(ransomNote.charAt(i), formIndex);
            if (index == -1) {
                return false;
            }

            lastIndexMap.put(ransomNote.charAt(i), ++index);
        }

        return true;
    }

    public static void main(String[] args) {
        new CanConstruct().canConstruct("aa", "aab");
    }
}
