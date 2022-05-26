package com.rick.leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Rick
 * @createdAt 2022-05-12 16:14:00
 */
public class LengthOfLastWordTest {

    private LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();

    @Test
    public void lengthOfLastWord() {
        Assert.assertEquals(5, lengthOfLastWord.lengthOfLastWord("Hello World"));
        Assert.assertEquals(4, lengthOfLastWord.lengthOfLastWord("   fly me   to   the moon  "));
        Assert.assertEquals(6, lengthOfLastWord.lengthOfLastWord("luffy is still joyboy"));
        Assert.assertEquals(1, lengthOfLastWord.lengthOfLastWord("s"));
        Assert.assertEquals(1, lengthOfLastWord.lengthOfLastWord("  s   "));
        Assert.assertEquals(2, lengthOfLastWord.lengthOfLastWord("sa"));
        Assert.assertEquals(2, lengthOfLastWord.lengthOfLastWord(" sa "));
    }
}