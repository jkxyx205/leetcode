package com.rick.leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Rick
 * @createdAt 2022-04-29 12:26:00
 */
public class RomanToIntTest {

    private RomanToInt romanToInt = new RomanToInt();

    @Test
    public void romanToInt() {
        Assert.assertEquals(3, romanToInt.romanToInt("III"));
        Assert.assertEquals(4, romanToInt.romanToInt("IV"));
        Assert.assertEquals(6, romanToInt.romanToInt("VI"));

        Assert.assertEquals(9, romanToInt.romanToInt("IX"));
        Assert.assertEquals(58, romanToInt.romanToInt("LVIII"));
        Assert.assertEquals(1994, romanToInt.romanToInt("MCMXCIV"));

    }
}