package com.rick.leetcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Objects;

import static org.junit.Assert.*;

/**
 * @author Rick
 * @createdAt 2022-05-03 20:45:00
 */
public class PlusOneTest {

    private PlusOne plusOne = new PlusOne();

    @Test
    public void plusOne() {
        Assert.assertEquals(true, Objects.deepEquals(plusOne.plusOne(new int[] {1,2,3}), new int[] {1,2,4}));
        Assert.assertEquals(true, Objects.deepEquals(plusOne.plusOne(new int[] {9,9,9}), new int[] {1,0,0,0}));
        Assert.assertEquals(true, Objects.deepEquals(plusOne.plusOne(new int[] {8,9,9}), new int[] {9,0,0}));
        Assert.assertEquals(true, Objects.deepEquals(plusOne.plusOne(new int[] {1}), new int[] {2}));
        Assert.assertEquals(true, Objects.deepEquals(plusOne.plusOne(new int[] {9}), new int[] {1, 0}));
    }
}