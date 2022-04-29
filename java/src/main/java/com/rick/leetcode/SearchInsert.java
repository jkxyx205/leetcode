package com.rick.leetcode;

/**
 * @author Rick
 * @createdAt 2022-04-29 16:19:00
 */
public class SearchInsert {

    // 1,3,5,6 2
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (target <= nums[i]) {
                return i < 0 ? 0 : i;
            }
        }
        return nums.length;
    }

}
