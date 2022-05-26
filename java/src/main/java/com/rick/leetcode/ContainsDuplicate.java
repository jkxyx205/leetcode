package com.rick.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Rick
 * @createdAt 2022-05-23 22:04:00
 */
public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }

            set.add(num);
        }

        return false;
    }
}
