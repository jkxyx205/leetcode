package com.rick.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Rick
 * @createdAt 2022-06-24 10:54:00
 */
public class MinCostToMoveChipsTest {

    private MinCostToMoveChips costToMoveChips = new MinCostToMoveChips();

    @Test
    public void minCostToMoveChips() {
        Assert.assertEquals(1, costToMoveChips.minCostToMoveChips(new int[]{1, 2, 3}));
        Assert.assertEquals(2, costToMoveChips.minCostToMoveChips(new int[]{2, 2, 2, 3, 3}));
        Assert.assertEquals(1, costToMoveChips.minCostToMoveChips(new int[]{1, 1000000000}));
    }
}