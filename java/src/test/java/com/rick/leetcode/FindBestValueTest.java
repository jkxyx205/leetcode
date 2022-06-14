package com.rick.leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Rick
 * @createdAt 2022-05-26 22:01:00
 */
public class FindBestValueTest {

    private FindBestValue findBestValue = new FindBestValue();

    @Test
    public void findBestValue() {
        Assert.assertEquals(3, findBestValue.findBestValue(new int[]{4, 9, 3}, 10));
        Assert.assertEquals(5, findBestValue.findBestValue(new int[]{2,3,5}, 10));
        Assert.assertEquals(11361, findBestValue.findBestValue(new int[]{60864,25176,27249,21296,20204}, 56803));
    }
}