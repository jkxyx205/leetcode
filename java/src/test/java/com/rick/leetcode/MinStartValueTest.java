package com.rick.leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Rick
 * @createdAt 2022-06-06 22:00:00
 */
public class MinStartValueTest {
    private MinStartValue minStartValue = new MinStartValue();

    @Test
    public void minStartValue() {
        Assert.assertEquals(5, minStartValue.minStartValue(new int[] {-3,2,-3,4,2}));
        Assert.assertEquals(1, minStartValue.minStartValue(new int[] {1,2}));
        Assert.assertEquals(5, minStartValue.minStartValue(new int[] {1,-2,-3}));
        Assert.assertEquals(6, minStartValue.minStartValue(new int[] {-2,-3}));
        Assert.assertEquals(3, minStartValue.minStartValue(new int[] {-2}));
    }
}