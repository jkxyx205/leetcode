package com.rick.leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Rick
 * @createdAt 2022-05-10 12:01:00
 */
public class RemoveElementTest {

    private RemoveElement removeElement = new RemoveElement();

    @Test
    public void removeElement() {
        int[] nums2 = new int[] {3, 2, 2, 3};
        int i = removeElement.removeElement(nums2 , 2);
        Assert.assertEquals(2, i);
        Assert.assertEquals(nums2[0], 3);
        Assert.assertEquals(nums2[1], 3);

        int[] nums1 = new int[] {3, 2, 2, 3};
        int j = removeElement.removeElement(nums1 , 3);
        Assert.assertEquals(2, j);
        Assert.assertEquals(nums1[0], 2);
        Assert.assertEquals(nums1[1], 2);

        int[] nums3 = new int[] {3};
        int k = removeElement.removeElement(nums3 , 3);
        Assert.assertEquals(0, k);

        int[] nums4 = new int[] {3};
        int q = removeElement.removeElement(nums4 , 2);
        Assert.assertEquals(1, q);

        int[] nums5 = new int[] {0,1,2,2,3,0,4,2};
        int s = removeElement.removeElement(nums5 , 2);
        Assert.assertEquals(5, s);



    }
}