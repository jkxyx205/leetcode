package com.rick.leetcode;

import org.junit.Assert;

/**
 * @author Rick
 * @createdAt 2022-04-29 10:58:00
 */
public class PalindromeTest {

    private Palindrome palindrome = new Palindrome();

    @org.junit.Test
    public void isPalindrome() {
        Assert.assertEquals(palindrome.isPalindrome(-1), false);
        Assert.assertEquals(palindrome.isPalindrome(0), true);
        Assert.assertEquals(palindrome.isPalindrome(44), true);
        Assert.assertEquals(palindrome.isPalindrome(443), false);
        Assert.assertEquals(palindrome.isPalindrome(3443), true);
        Assert.assertEquals(palindrome.isPalindrome(34432), false);
    }

    @org.junit.Test
    public void isPalindrome2() {
        Assert.assertEquals(palindrome.isPalindrome2(-1), false);
        Assert.assertEquals(palindrome.isPalindrome2(0), true);
        Assert.assertEquals(palindrome.isPalindrome2(44), true);
        Assert.assertEquals(palindrome.isPalindrome2(443), false);
        Assert.assertEquals(palindrome.isPalindrome2(3443), true);
        Assert.assertEquals(palindrome.isPalindrome2(34432), false);
    }

    @org.junit.Test
    public void isPalindrome3() {
        Assert.assertEquals(palindrome.isPalindrome3(-1), false);
        Assert.assertEquals(palindrome.isPalindrome3(0), true);
        Assert.assertEquals(palindrome.isPalindrome3(44), true);
        Assert.assertEquals(palindrome.isPalindrome3(443), false);
        Assert.assertEquals(palindrome.isPalindrome3(3443), true);
        Assert.assertEquals(palindrome.isPalindrome3(34432), false);
    }
}