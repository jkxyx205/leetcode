package com.rick.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Rick
 * @createdAt 2022-04-30 22:02:00
 */
public class MergeTest {

    private Merge merge = new Merge();

    @Test
    public void merge() {
//        merge.merge(new int[] {1,2,3,0,0,0}, 3, new int[] {-2,5,6}, 3);
//        merge.merge(new int[] {1,2,3,0,0,0}, 3, new int[] {2,5,6}, 3);
        merge.merge(new int[] {2,5, 6, 0, 0, 0}, 3, new int[] {1,2 ,3}, 3);
    }
}