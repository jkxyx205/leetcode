package com.rick.leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Rick
 * @createdAt 2022-05-12 13:58:00
 */
public class MySqrtTest {

    private MySqrt mySqrt = new MySqrt();

    @Test
    public void mySqrt() {
        Assert.assertEquals(0, mySqrt.mySqrt(0));
        Assert.assertEquals(1, mySqrt.mySqrt(1));
        Assert.assertEquals(2, mySqrt.mySqrt(4));
        Assert.assertEquals(2, mySqrt.mySqrt(8));
        Assert.assertEquals(25, mySqrt.mySqrt(625));
        Assert.assertEquals(25, mySqrt.mySqrt(625));
        Assert.assertEquals(100, mySqrt.mySqrt(10002));
        Assert.assertEquals(46340, mySqrt.mySqrt(2147483647));
//        System.out.println(Math.sqrt(2147483647d));
    }
}