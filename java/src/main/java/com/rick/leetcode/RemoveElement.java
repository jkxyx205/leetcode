package com.rick.leetcode;

import java.util.Arrays;

/**
 * @author Rick
 * @createdAt 2022-05-10 12:01:00
 */
public class RemoveElement {

    public int removeElement(int[] nums, int val) {
        int count = nums.length;
        Arrays.sort(nums);
        int firstIndex = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                count--;
            }

            if (nums[i] == val && firstIndex < 0) {
                firstIndex = i;
            } else if (val < nums[i] && firstIndex > -1) {
                // 移动后续原始
                nums[firstIndex++] = nums[i];
            }
        }

        return count;
    }
}
