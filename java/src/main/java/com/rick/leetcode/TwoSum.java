package com.rick.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Rick
 * @createdAt 2022-05-06 10:13:00
 */
public class TwoSum {

//    public int[] twoSum(int[] nums, int target) {
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if ((nums[i] + nums[j]) == target) {
//                    return new int[] {i, j};
//                }
//            }
//        }
//
//        return null;
//    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(nums.length);
        map.put(nums[0], 0);
        for (int i = 1; i < nums.length; i++) {
            if (map.get(target - nums[i]) != null) {
                return new int[] {map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }

        return null;
    }
}
