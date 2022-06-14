package com.rick.leetcode;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

/**
 * @author Rick
 * @createdAt 2022-06-07 11:15:00
 */
public class CountBits {
    public int[] countBits(int n) {
        int[] ret = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            ret[i] = calcCount(Integer.toBinaryString(i));
        }
        return ret;
    }

    private int calcCount(String binaryString) {
        char[] values = binaryString.toCharArray();
        int count = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] == '1') {
                count++;
            }
        }
        return count;
    }

}
