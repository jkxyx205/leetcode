package com.rick.leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Rick
 * @createdAt 2022-04-30 21:29:00
 */
public class SmallestRangeITest {

    private SmallestRangeI smallestRangeI = new SmallestRangeI();

    @Test
    public void smallestRangeI() {
        Assert.assertEquals(0, smallestRangeI.smallestRangeI(new int[] {1}, 0));
        Assert.assertEquals(6, smallestRangeI.smallestRangeI(new int[] {0, 10}, 2));
        Assert.assertEquals(0, smallestRangeI.smallestRangeI(new int[] {1, 3, 6}, 3));
    }
}