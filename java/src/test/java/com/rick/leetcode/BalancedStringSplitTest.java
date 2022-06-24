package com.rick.leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Rick
 * @createdAt 2022-06-24 10:32:00
 */
public class BalancedStringSplitTest {

    private BalancedStringSplit balancedStringSplit = new BalancedStringSplit();

    @Test
    public void balancedStringSplit() {
        Assert.assertEquals(4, balancedStringSplit.balancedStringSplit("RLRRLLRLRL"));
        Assert.assertEquals(3, balancedStringSplit.balancedStringSplit("RLLLLRRRLR"));
        Assert.assertEquals(1, balancedStringSplit.balancedStringSplit("LLLLRRRR"));
        Assert.assertEquals(2, balancedStringSplit.balancedStringSplit("RLRRRLLRLL"));
    }
}