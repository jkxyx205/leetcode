package com.rick.leetcode;

/**
 * @author Rick
 * @createdAt 2022-06-07 11:00:00
 */
public class NumArray {
    private int[] nums;

    public NumArray(int[] nums) {
        this.nums = nums;
    }

    public int sumRange(int left, int right) {
        int sum = 0;
        for (int i = left; i <= right; i++) {
            sum += nums[i];
        }
        return sum;
    }
}
