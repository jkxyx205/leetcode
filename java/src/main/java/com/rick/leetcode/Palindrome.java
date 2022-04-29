package com.rick.leetcode;

/**
 * # 9
 * 给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
 *
 * 回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 *
 * 例如，121 是回文，而 123 不是。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/palindrome-number
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author Rick
 * @createdAt 2022-04-29 10:57:00
 */
public class Palindrome {

    public boolean isPalindrome(int x) {
        char[] chars = String.valueOf(x).toCharArray();

        int side = chars.length / 2;

        for (int i = 0; i < side; i++) {
            if (chars[i] != chars[chars.length - i - 1]) {
                return false;
            }
        }

        return true;
    }

    public boolean isPalindrome2(int x) {
        if (x < 0) {
            return false;
        }

        if (x < 10) {
            return true;
        }

        String value = String.valueOf(x);

        int side = value.length() / 2;

        for (int i = 0; i < side; i++) {
            if (value.charAt(i) != value.charAt(value.length() - i - 1)) {
                return false;
            }
        }

        return true;
    }

    public boolean isPalindrome3(int x) {
        if (x < 0) {
            return false;
        }

        if (x < 10) {
            return true;
        }

        int s = x;
        int d = 0;

        while (x > 0) {
            int n = x % 10;
            d = d * 10 + n;
            x /= 10;
        }

        return s == d;
    }
}
