package com.rick.leetcode;

import java.util.*;

/**
 * 442. 数组中重复的数据
 * @author Rick
 * @createdAt 2022-05-08 13:41:00
 */
public class FindDuplicates {

    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>(nums.length);
        int[] container = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (++container[nums[i] - 1] > 1) {
                list.add(nums[i]);
            }
        }
        return list;
    }
}
