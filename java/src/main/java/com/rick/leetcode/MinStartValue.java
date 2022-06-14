package com.rick.leetcode;

/**
 * @author Rick
 * @createdAt 2022-06-06 21:47:00
 */
public class MinStartValue {

    public int minStartValue(int[] nums) {
        int startValue = nums[0] >= 0 ? 0 : -nums[0];

        while (true) {
            startValue++;
            int sum = startValue;
            boolean finished = true;
            for (int i = 0; i < nums.length; i++) {
                sum += nums[i];
                if (sum < 1) {
                    finished = false;
                    break;
                }
            }
            if (finished) {
                return startValue;
            }
        }
    }
}
