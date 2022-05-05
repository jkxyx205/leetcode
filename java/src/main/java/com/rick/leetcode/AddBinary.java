package com.rick.leetcode;

/**
 * @author Rick
 * @createdAt 2022-05-03 21:19:00
 */
public class AddBinary {
//    public String addBinary(String a, String b) {
//        StringBuilder sb = new StringBuilder();
//        char[] ca = a.toCharArray();
//        char[] cb = b.toCharArray();
//
//        int addFlag = 0;
//        for (int i = Math.max(ca.length - 1, cb.length - 1); i >= 0 ; i--) {
//            int value = Integer.parseInt(ca.length >= cb.length ? ca[i] + "" : (ca.length + i - cb.length>= 0 ? ca[ca.length + i - cb.length] + "" : "0")) +
//                        Integer.parseInt(cb.length >= ca.length ? cb[i] + "" : (cb.length + i - ca.length >= 0 ? cb[cb.length + i - ca.length] + "" : "0"))
//                    + addFlag;
//            if (value >= 2) {
//                value = value - 2;
//                addFlag = 1;
//            } else {
//                addFlag = 0;
//            }
//            sb.append(value);
//        }
//
//        if (addFlag == 1) {
//            sb.append(1);
//        }
//
//        return sb.reverse().toString();
//
//    }

    public String addBinary(String a, String b) {
        // 二进制转换为十进制
        int number0 = Integer.parseInt(a, 2);
        int number1 = Integer.parseInt(b, 2);

        int sum = number0 + number1;
        return Integer.toBinaryString(sum);
    }
}
