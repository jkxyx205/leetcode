package com.rick.leetcode;

/**
 * @author Rick
 * @createdAt 2022-06-11 20:40:00
 */
public class ReverseWords {

    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                for (int j = i - 1; j >= 0; j--) {
                    if (s.charAt(j) == ' ') {
                        break;
                    }
                    sb.append(s.charAt(j));
                }
                sb.append(' ');
            }
        }

        for (int j = s.length() - 1; j >= 0; j--) {
            if (s.charAt(j) == ' ') {
                break;
            }
            sb.append(s.charAt(j));
        }

        return sb.toString();
    }
}

//        StringBuilder sb = new StringBuilder();
//        String[] words = s.split(" ");
//        for (int i = 0; i < words.length; i++) {
//            String word = words[i];
//
//            for (int j = 0; j < word.length(); j++) {
//                sb.append(word.charAt(word.length() - j - 1));
//            }
//
//            if (i < words.length - 1) {
//                sb.append(" ");
//            }
//        }
//
//        return sb.toString();
