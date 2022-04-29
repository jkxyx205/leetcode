package com.rick.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Rick
 * @createdAt 2022-04-29 16:09:00
 */
public class RemoveDuplicatesTest {

    private RemoveDuplicates removeDuplicates = new RemoveDuplicates();

    @Test
    public void removeDuplicates() {
//        int[] nums = new int[] {};
        int[] nums = new int[] {2};
//        int[] nums = new int[] {1,1,2};
//        int[] nums = new int[] {0,0,1,1,1,2,2,3,3,4};
        int length = removeDuplicates.removeDuplicates(nums);
        for (int i = 0; i <length; i++) {
            System.out.println(nums[i]);
        }
    }
}