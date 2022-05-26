package com.rick.leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Rick
 * @createdAt 2022-05-21 01:06:00
 */
public class RepeatedNTimesTest {

    private RepeatedNTimes repeatedNTimes = new RepeatedNTimes();

    @Test
    public void repeatedNTimes() {
        Assert.assertEquals(3, repeatedNTimes.repeatedNTimes(new int[] {1,2,3,3}));
        Assert.assertEquals(2, repeatedNTimes.repeatedNTimes(new int[] {2,1,2,5,3,2}));
        Assert.assertEquals(5, repeatedNTimes.repeatedNTimes(new int[] {5,1,5,2,5,3,5,4}));
    }
}