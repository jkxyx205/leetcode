package com.rick.leetcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Objects;

import static org.junit.Assert.*;

/**
 * @author Rick
 * @createdAt 2022-05-23 22:15:00
 */
public class DivingBoardTest {

    private DivingBoard divingBoard = new DivingBoard();

    @Test
    public void divingBoard() {
        Assert.assertEquals(true, Objects.deepEquals(new int[] {3,4,5,6}, divingBoard.divingBoard(1, 2, 3)));
        Assert.assertEquals(true, Objects.deepEquals(new int[] {3}, divingBoard.divingBoard(1, 1, 3)));
    }
}