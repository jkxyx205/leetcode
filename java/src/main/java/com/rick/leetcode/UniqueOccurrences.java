package com.rick.leetcode;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Rick
 * @createdAt 2022-06-18 20:45:00
 */
public class UniqueOccurrences {
    public boolean uniqueOccurrences(int[] arr) {
        int[] container = new int[2001];

        for (int i : arr) {
            container[i < 0 ? (2001 + i ) : i]++;
        }

        Set<Integer> set = new HashSet<>();
        for (int i : container) {
            if (i > 0) {
                if (set.contains(i)) {
                    return false;
                }

                set.add(i);
            }
        }


        return true;
    }

    public static void main(String[] args) {
        BigDecimal bigDecimal1 = BigDecimal.valueOf(2.3);
        BigDecimal bigDecimal2 = new BigDecimal(2.3);
        System.out.println(bigDecimal1);
        System.out.println(bigDecimal2);
        System.out.println(Double.valueOf(2.3));
    }
}
