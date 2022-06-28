package com.rick.leetcode;

/**
 * 1346. 检查整数及其两倍数是否存在
 * @author Rick
 * @createdAt 2022-06-27 10:57:00
 */
public class CheckIfExist {
    public boolean checkIfExist(int[] arr) {
        int[] doubleArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            doubleArr[i] = arr[i] * 2;
        }

        for (int i = 0; i < doubleArr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (doubleArr[i] == arr[j] && i != j) {
                    return true;
                }
            }
        }

        return false;
    }
}
