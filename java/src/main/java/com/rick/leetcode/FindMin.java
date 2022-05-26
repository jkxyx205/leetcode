package com.rick.leetcode;

import java.util.Arrays;

/**
 * @author Rick
 * @createdAt 2022-05-25 14:18:00
 */
public class FindMin {

    // [4,5,6,7,0,1,2]
    public int findMin(int[] nums) {
        int l = 0, r = nums.length - 1;
        while (l < r) {
            int mid = (r - l) / 2 + l;
            if (nums[mid] < nums[r]) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return nums[l];
    }
}
