package com.rick.leetcode;

/**
 * @author Rick
 * @createdAt 2022-06-14 14:47:00
 */
public class DayOfYear {

    public int dayOfYear(String date) {
        int day = (date.charAt(9)-'0') + (date.charAt(8)-'0')*10;
        int month = (date.charAt(6)-'0') + (date.charAt(5)-'0')*10;
        int year = (date.charAt(3)-'0') + (date.charAt(2)-'0')*10 + (date.charAt(1)-'0')*100 + (date.charAt(0)-'0')*1000;

        int[] DAYS_MAPPING = new int[] {
                31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
        };

        if (isLeap(year)) {
            DAYS_MAPPING[1] = 29;
        }

        int sum = 0;
        for (int i = 0; i < month - 1; i++) {
            sum += DAYS_MAPPING[i];
        }
        return sum + day;
    }

    boolean isLeap(int year) {
        return((((year) % 4) == 0 && ((year) % 100) != 0) || ((year) % 400) == 0);
    }

    public static void main(String[] args) {
        char d = '5';
        int a  = '5' - '0';
        System.out.println(a);
    }
}
