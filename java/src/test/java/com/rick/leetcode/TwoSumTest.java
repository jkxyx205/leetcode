package com.rick.leetcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Objects;

/**
 * @author Rick
 * @createdAt 2022-05-06 10:13:00
 */
public class TwoSumTest {

    private TwoSum twoSum = new TwoSum();

    @Test
    public void twoSum() {
        Assert.assertEquals(true, Objects.deepEquals(new int[]{0, 1}, twoSum.twoSum(new int[]{2, 7, 11, 15}, 9)));
        Assert.assertEquals(true, Objects.deepEquals(new int[]{1, 2}, twoSum.twoSum(new int[]{3,2,4}, 6)));
        Assert.assertEquals(true, Objects.deepEquals(new int[]{0, 1}, twoSum.twoSum(new int[]{3, 3}, 6)));
    }
}