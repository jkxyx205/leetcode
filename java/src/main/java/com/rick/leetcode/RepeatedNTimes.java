package com.rick.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Rick
 * @createdAt 2022-05-21 01:02:00
 */
public class RepeatedNTimes {

    public int repeatedNTimes(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>(nums.length);
        int n = nums.length / 2;
        for (int num : nums) {
            Integer count = countMap.get(num);
            if (count == null) {
                count = 0;
            }
            countMap.put(num, ++count);

            if (count > 1) { // 只有一个重复
                return num;
            }
        }

        return -1;
    }
}
