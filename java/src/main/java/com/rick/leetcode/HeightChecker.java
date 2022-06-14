package com.rick.leetcode;

import java.util.Arrays;

/**
 * @author Rick
 * @createdAt 2022-06-01 15:31:00
 */
public class HeightChecker {
    public int heightChecker(int[] heights) {
        int[] sortHeight = new int[heights.length];
        System.arraycopy(heights, 0, sortHeight, 0, heights.length);

        Arrays.sort(sortHeight);

        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != sortHeight[i]) {
                count++;
            }
        }

        return count;
    }
}
