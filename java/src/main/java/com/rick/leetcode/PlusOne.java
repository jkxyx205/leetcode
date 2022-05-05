package com.rick.leetcode;

import java.util.Arrays;

/**
 * @author Rick
 * @createdAt 2022-05-03 20:45:00
 */
public class PlusOne {

//    public int[] plusOne(int[] digits) {
//        int[] result = new int[Arrays.stream(digits).allMatch(value -> value == 9) ? digits.length + 1 : digits.length];
//
//        int addFlag = 0;
//        for (int i = digits.length - 1; i >= 0; i--) {
//            int value;
//            if (i == digits.length - 1) {
//                value = digits[i] + 1;
//            } else {
//                value = digits[i] + addFlag;
//            }
//
//            if (value > 9) {
//                value = value - 10;
//                addFlag = 1;
//            } else {
//                addFlag = 0;
//            }
//
//            result[result.length + i - digits.length] = value;
//        }
//
//        if (addFlag == 1) {
//            result[0] = 1;
//        }
//        return result;
//    }
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        //跳出for循环，说明数字全部是9
        int[] temp = new int[digits.length + 1];
        temp[0] = 1;
        return temp;
    }
}
