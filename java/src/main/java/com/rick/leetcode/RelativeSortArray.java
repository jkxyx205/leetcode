package com.rick.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Rick
 * @createdAt 2022-06-01 22:04:00
 */
public class RelativeSortArray {

    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);

        int[] sortArray = new int[arr1.length];
        int index = 0;
        List<Integer> includeIndex = new ArrayList<>(arr1.length);
        for (int i = 0; i < arr2.length; i++) {
            boolean start = false;
            for (int j = 0; j < arr1.length; j++) {
                if (arr2[i] == arr1[j]) {
                    includeIndex.add(j);
                    start = true;
                    sortArray[index++] = arr1[j];
                } else if (start) {
                    break;
                }
            }
        }

        // 其他
        for (int i = 0; i < arr1.length; i++) {
            if (!includeIndex.contains(i)) {
                sortArray[index++] = arr1[i];
            }
        }
        return sortArray;
    }

    public static void main(String[] args) {
        RelativeSortArray relativeSortArray = new RelativeSortArray();
        relativeSortArray.relativeSortArray(new int[]{2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19}, new int[]{2, 1, 4, 3, 9, 6});
    }
}
