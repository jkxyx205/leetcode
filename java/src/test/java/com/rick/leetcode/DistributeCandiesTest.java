package com.rick.leetcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Objects;

import static org.junit.Assert.*;

/**
 * @author Rick
 * @createdAt 2022-06-06 20:58:00
 */
public class DistributeCandiesTest {

    private DistributeCandies distributeCandies = new DistributeCandies();

    @Test
    public void distributeCandies() {
        Assert.assertEquals(true, Objects.deepEquals(new int[] {1,2,3,1}, distributeCandies.distributeCandies(7, 4)));
        Assert.assertEquals(true, Objects.deepEquals(new int[] {5,2,3}, distributeCandies.distributeCandies(10, 3)));
        Assert.assertEquals(true, Objects.deepEquals(new int[] {1,0}, distributeCandies.distributeCandies(1, 2)));
        Assert.assertEquals(true, Objects.deepEquals(new int[] {1,1}, distributeCandies.distributeCandies(2, 2)));
        Assert.assertEquals(true, Objects.deepEquals(new int[] {1,2}, distributeCandies.distributeCandies(3, 2)));
        Assert.assertEquals(true, Objects.deepEquals(new int[] {2,2}, distributeCandies.distributeCandies(4, 2)));
    }
}