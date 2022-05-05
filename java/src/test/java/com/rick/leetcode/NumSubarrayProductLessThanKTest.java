package com.rick.leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Rick
 * @createdAt 2022-05-05 21:31:00
 */
public class NumSubarrayProductLessThanKTest {

    private NumSubarrayProductLessThanK numSubarrayProductLessThanK = new NumSubarrayProductLessThanK();

    @Test
    public void numSubarrayProductLessThanK() {
        Assert.assertEquals(8, numSubarrayProductLessThanK.numSubarrayProductLessThanK(new int[] {10,5,2,6}, 100));
//        Assert.assertEquals(0, numSubarrayProductLessThanK.numSubarrayProductLessThanK(new int[] {1,2,3}, 0));
//        Assert.assertEquals(1, numSubarrayProductLessThanK.numSubarrayProductLessThanK(new int[] {1}, 2));
//        Assert.assertEquals(0, numSubarrayProductLessThanK.numSubarrayProductLessThanK(new int[] {2}, 1));
    }
}