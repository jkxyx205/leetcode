package com.rick.leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Rick
 * @createdAt 2022-06-11 20:12:00
 */
public class CheckPerfectNumberTest {

    private CheckPerfectNumber checkPerfectNumber = new CheckPerfectNumber();

    @Test
    public void checkPerfectNumber() {
        Assert.assertEquals(true, checkPerfectNumber.checkPerfectNumber(28));
//        Assert.assertEquals(false, checkPerfectNumber.checkPerfectNumber(7));
//        Assert.assertEquals(false, checkPerfectNumber.checkPerfectNumber(1));
    }
}