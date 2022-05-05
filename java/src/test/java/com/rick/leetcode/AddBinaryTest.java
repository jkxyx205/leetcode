package com.rick.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Rick
 * @createdAt 2022-05-03 21:20:00
 */
public class AddBinaryTest {

    private AddBinary addBinary = new AddBinary();

    @Test
    public void addBinary() {
//        Assert.assertEquals("100", addBinary.addBinary("1", "11"));
//        Assert.assertEquals("10", addBinary.addBinary("1", "1"));
        Assert.assertEquals("100", addBinary.addBinary("11", "1"));
        Assert.assertEquals("10101", addBinary.addBinary("1010","1011"));
    }
}