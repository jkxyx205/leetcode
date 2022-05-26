package com.rick.leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Rick
 * @createdAt 2022-05-08 13:42:00
 */
public class FindDuplicatesTest {

    private FindDuplicates findDuplicates = new FindDuplicates();

    @Test
    public void findDuplicates() {
        Assert.assertArrayEquals(new Object[] {2, 3}, findDuplicates.findDuplicates(new int[] {4,3,2,7,8,2,3,1}).toArray());
        Assert.assertArrayEquals(new Object[] {1}, findDuplicates.findDuplicates(new int[] {1,1,2}).toArray());
        Assert.assertArrayEquals(new Object[] {}, findDuplicates.findDuplicates(new int[] {1}).toArray());
    }
}