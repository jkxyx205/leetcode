package com.rick.leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Rick
 * @createdAt 2022-05-08 14:00:00
 */
public class MaxSubArrayTest {

    private MaxSubArray maxSubArray = new MaxSubArray();

    @Test
    public void maxSubArray() {
        Assert.assertEquals(6, maxSubArray.maxSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,4}));
        Assert.assertEquals(23, maxSubArray.maxSubArray(new int[] {5,4,-1,7,8}));
        Assert.assertEquals(1, maxSubArray.maxSubArray(new int[] {1}));
    }
}