package com.rick.leetcode;

/**
 * @author Rick
 * @createdAt 2022-04-29 16:05:00
 */
public class RemoveDuplicates {

    public int removeDuplicates(int[] nums) {
        if (nums.length <= 1) {
            return nums.length;
        }

        int length = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[length - 1]) {
                nums[length++] = nums[i];
            }
        }

        return length;
    }
}
