package com.rick.leetcode;

import java.util.Arrays;

/**
 * @author Rick
 * @createdAt 2022-05-26 21:22:00
 */
public class FindBestValue {

    public int findBestValue(int[] arr, int target) {
        int sum = Arrays.stream(arr).sum();
        int max = max(arr);
        if (sum <= target) {
            return max;
        }

        int diff = sum - target;

        int addDiff;
        if (diff % arr.length == 0) {
            addDiff = diff / arr.length;
        } else {
            addDiff = diff / arr.length + 1;
        }

        int value = max - addDiff;
        int prevDiff = diff;
        while (true) {
            int newSum = getNewSum(arr, value);
            int newDiff = newSum - target;

            if (newDiff == 0) {
                return value;
            }
            if (newDiff < 0) {
                if (Math.abs(prevDiff) >= Math.abs(newDiff)) {
                    return value;
                }

                return value + 1;
            }

            prevDiff = newDiff;
            value--;
        }
    }

    private int getNewSum(int[] arr, int value) {
        int sum = 0;
        for (int i : arr) {
            if (i > value) {
                sum += value;
            } else {
                sum += i;
            }
        }

        return sum;
    }

    private int max(int[] arr) {
        int max = arr[0];
        for (int i : arr) {
            max = max < i ? i :max;
        }
        return max;
    }

}
