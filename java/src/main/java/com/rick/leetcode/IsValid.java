package com.rick.leetcode;

import java.util.Stack;

/**
 * 20. 有效的括号
 * 栈实现
 * @author Rick
 * @createdAt 2022-04-29 14:03:00
 */
public class IsValid {

    public boolean isValid(String s) {
        // 用数组模拟栈
        char[] stack = new char[s.length()];
        int size = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '{' || c == '[' || c == '(') {
                stack[size++] = c;
            } else {
                if (size == 0) {
                    return false;
                }
                char prev = stack[--size];
                if (!matches(prev, c)) {
                    return false;
                }
            }
        }

        return size == 0;
    }

    private boolean matches(char c1, char c2) {
        if ((c1 == '[' && c2 == ']')
                || (c1 == '(' && c2 == ')')
                || (c1 == '{' && c2 == '}')
        ) {
            return true;
        }
        return false;
    }
}
