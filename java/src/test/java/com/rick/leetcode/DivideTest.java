package com.rick.leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Rick
 * @createdAt 2022-05-11 20:27:00
 */
public class DivideTest {

    private Divide divide = new Divide();

    @Test
    public void divide() {
        Assert.assertEquals(7, divide.divide(15, 2));
        Assert.assertEquals(-2, divide.divide(7, -3));
        Assert.assertEquals(0, divide.divide(0, 1));
        Assert.assertEquals(1, divide.divide(1, 1));
        Assert.assertEquals(2147483647, divide.divide(-2147483648, -1));
    }
}