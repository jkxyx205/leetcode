package com.rick.leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 *
 * @autho
 * @createdAt 2022-04-29 14:04:00
 */
public class IsValidTest {

    private IsValid isValid = new IsValid();

    @Test
    public void isValid() {
        Assert.assertEquals(false, isValid.isValid("("));
        Assert.assertEquals(true, isValid.isValid("()"));
        Assert.assertEquals(true, isValid.isValid("()[]{}"));
        Assert.assertEquals(false, isValid.isValid("(]"));
        Assert.assertEquals(false, isValid.isValid("([)]"));
        Assert.assertEquals(true, isValid.isValid("{[]}"));

        Assert.assertEquals(true, isValid.isValid("({[]})"));
        Assert.assertEquals(false, isValid.isValid("{[])"));
        Assert.assertEquals(false, isValid.isValid("]"));
    }


}