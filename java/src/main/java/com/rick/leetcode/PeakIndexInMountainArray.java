package com.rick.leetcode;

/**
 * @author Rick
 * @createdAt 2022-06-30 09:30:00
 */
public class PeakIndexInMountainArray {
    public int peakIndexInMountainArray(int[] arr) {
        int value = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < value) {
                return i - 1;
            } else {
                value = arr[i];
            }
        }
        return 0;
    }
}
