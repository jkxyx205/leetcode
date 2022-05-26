package com.rick.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Rick
 * @createdAt 2022-05-23 22:05:00
 */
public class ContainsDuplicateTest {

    private ContainsDuplicate containsDuplicate = new ContainsDuplicate();

    @Test
    public void containsDuplicate() {
        Assert.assertEquals(true, containsDuplicate.containsDuplicate(new int[]{1, 2, 3, 1}));
        Assert.assertEquals(false, containsDuplicate.containsDuplicate(new int[]{1, 2, 3, 4}));
        Assert.assertEquals(true, containsDuplicate.containsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}));
        Assert.assertEquals(false, containsDuplicate.containsDuplicate(new int[]{-1}));
    }
}