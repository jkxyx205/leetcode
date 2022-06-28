package com.rick.leetcode;

/**
 * 1309. 解码字母到整数映射
 * @author Rick
 * @createdAt 2022-06-29 10:59:00
 */
public class FreqAlphabets {

    private static final char[] map = {' ',
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
            's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
    };

    public String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();
        boolean hasSharp = false;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '#') {
                hasSharp = true;
            } else if (hasSharp && s.charAt(i + 1) != '#') {
                sb.append(map[(s.charAt(i) - '0') * 10 + s.charAt(i + 1) - '0']);
                hasSharp = false;
            } else if(!hasSharp) {
                sb.append(map[(s.charAt(i) - '0')]);
            }
        }

        if (hasSharp) {
            sb.append(map[(s.charAt(0) - '0') * 10 + s.charAt(1) - '0']);
        }

        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        FreqAlphabets freqAlphabets = new FreqAlphabets();
        freqAlphabets.freqAlphabets("10#11#12");
    }
}
