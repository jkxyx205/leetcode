package com.rick.leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Rick
 * @createdAt 2022-04-29 13:37:00
 */
public class LongestCommonPrefixTest {

    private LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();

    @Test
    public void longestCommonPrefix() {
        Assert.assertEquals("fl", longestCommonPrefix.longestCommonPrefix(new String[]{"flower","flow","flight"}));
        Assert.assertEquals("", longestCommonPrefix.longestCommonPrefix(new String[]{"flower","flow","flight", ""}));
        Assert.assertEquals("", longestCommonPrefix.longestCommonPrefix(new String[]{"dog","racecar","car"}));
        Assert.assertEquals("", longestCommonPrefix.longestCommonPrefix(new String[]{"a","b","c"}));

    }
}