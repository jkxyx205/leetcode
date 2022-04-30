package com.rick.leetcode;

/**
 * @author Rick
 * @createdAt 2022-04-30 21:11:00
 */
public class SmallestRangeI {

    public int smallestRangeI(int[] nums, int k) {
        int min = nums[0];
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (min > nums[i]) {
                min = nums[i];
            }

            if (max < nums[i]) {
                max = nums[i];
            }
        }

        if (max - min <= 2 * k) {
            return 0;
        }

        return max - min - 2 * k;
    }
}
