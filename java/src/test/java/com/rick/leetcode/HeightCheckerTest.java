package com.rick.leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Rick
 * @createdAt 2022-06-01 15:38:00
 */
public class HeightCheckerTest {
    private HeightChecker heightChecker = new HeightChecker();

    @Test
    public void heightChecker() {
        Assert.assertEquals(3, heightChecker.heightChecker(new int[] {1,1,4,2,1,3}));
        Assert.assertEquals(5, heightChecker.heightChecker(new int[] {5,1,2,3,4}));
        Assert.assertEquals(0, heightChecker.heightChecker(new int[] {1,2,3,4,5}));
        Assert.assertEquals(0, heightChecker.heightChecker(new int[] {2}));
    }
}