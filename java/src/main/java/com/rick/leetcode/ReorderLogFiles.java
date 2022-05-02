package com.rick.leetcode;

import java.util.Arrays;

/**
 * @author Rick
 * @createdAt 2022-05-03 00:17:00
 */
public class ReorderLogFiles {
    public String[] reorderLogFiles(String[] logs) {
        Arrays.sort(logs, (s1, s2) -> {
            int pos1 = s1.indexOf(" ") + 1;
            int pos2 = s2.indexOf(" ") + 1;
            char c1 = s1.charAt(pos1);
            char c2 = s2.charAt(pos2);
            boolean isDigit1 = Character.isDigit(c1);
            boolean isDigit2 = Character.isDigit(c2);

            if (isDigit1 && isDigit2) {
                return 0;
            }

            if (isDigit1 || isDigit2) {
                return c2 - c1;
            }

            String value1 = s1.substring(s1.indexOf(" "));
            String value2 = s2.substring(s2.indexOf(" "));
            return value1.equals(value2) ?
                    s1.substring(0, s1.indexOf(" ")).compareTo(s2.substring(0, s2.indexOf(" "))) : value1.compareTo(value2);
        });

        return logs;
    }

}
