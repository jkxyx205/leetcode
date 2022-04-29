package com.rick.leetcode;

/**
 * # 13. 罗马数字转整数
 * @author Rick
 * @createdAt 2022-04-29 12:23:00
 */
public class RomanToInt {
    int[] map = new int[89];

    {
        map['I'] = 1;
        map['V'] = 5;
        map['X'] = 10;
        map['L'] = 50;
        map['C'] = 100;
        map['D'] = 500;
        map['M'] = 1000;
    }

    public int romanToInt(String s) {
        char prev = s.charAt(0);
        int sum = map[prev];

        for (int i = 1; i < s.length(); i++) {
            sum += adjust(s.charAt(i), s.charAt(i - 1));
        }

        return sum;
    }

    private int adjust(char current, char prev) {
        if ((prev == 'I' && current == 'V')
            || (prev == 'I' && current == 'X')
            || (prev == 'X' && current == 'L')
            || (prev == 'X' && current == 'C')
            || (prev == 'C' && current == 'D')
         || (prev == 'C' && current == 'M')
        ) {
            return map[current] - 2 * map[prev];
        }

        return map[current];
    }
}
