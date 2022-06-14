package com.rick.leetcode;

/**
 * @author Rick
 * @createdAt 2022-06-11 20:32:00
 */
public class CheckRecord {
    public boolean checkRecord(String s) {
        int countAbsent = 0;
        int countLate = 0;
        for (int i = 0; i < s.length(); i++) {
            char v = s.charAt(i);
            if (v == 'A') {
                countAbsent++;
            }

            if (countAbsent >=2) {
                return false;
            }

            if (v == 'L') {
                countLate++;
            } else {
                countLate = 0;
            }

            if (countLate >=3) {
                return false;
            }
        }

        return true;
    }
}
