package com.rick.leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Rick
 * @createdAt 2022-05-21 18:41:00
 */
public class WordPatternTest {

    private WordPattern wordPattern = new WordPattern();

    @Test
    public void wordPattern() {
//        Assert.assertEquals(true, wordPattern.wordPattern("abba", "dog cat cat dog"));
        Assert.assertEquals(false, wordPattern.wordPattern("abba", "dog cat cat fish"));
//        Assert.assertEquals(false, wordPattern.wordPattern("aaaa", "dog cat cat dog"));
//        Assert.assertEquals(false, wordPattern.wordPattern("aaaa", "dog"));
//        Assert.assertEquals(true, wordPattern.wordPattern("a", "dog"));
//        Assert.assertEquals(false, wordPattern.wordPattern("abba", "dog dog dog dog"));
    }
}