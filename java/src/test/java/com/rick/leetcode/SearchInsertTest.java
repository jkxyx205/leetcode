package com.rick.leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Rick
 * @createdAt 2022-04-29 16:19:00
 */
public class SearchInsertTest {

    private SearchInsert searchInsert = new SearchInsert();

    @Test
    public void searchInsert() {
        Assert.assertEquals(2, searchInsert.searchInsert(new int[] {1,3,5,6}, 5));
        Assert.assertEquals(4, searchInsert.searchInsert(new int[] {1,3,5,6}, 7));
        Assert.assertEquals(1, searchInsert.searchInsert(new int[] {1,3,5,6}, 2));
        Assert.assertEquals(0, searchInsert.searchInsert(new int[] {1}, -1));

    }
}