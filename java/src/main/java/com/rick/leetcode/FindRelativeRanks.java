package com.rick.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Rick
 * @createdAt 2022-06-11 20:22:00
 */
public class FindRelativeRanks {

    public String[] findRelativeRanks(int[] score) {
        int[] sortScore = new int[score.length];
        System.arraycopy(score, 0, sortScore, 0, score.length);
        Arrays.sort(sortScore);

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < sortScore.length; i++) {
            map.put(sortScore[i], i + 1);
        }
        String[] values = new String[score.length];

        for (int i = 0; i < score.length; i++) {
            values[i] = getValue(map.get(score[i]));
        }

        return values;
    }

    private String getValue(int index) {
        if (index == 1) {
            return "Gold Medal";
        } else if (index == 2) {
            return "Silver Medal";
        } else if(index == 3) {
            return "Bronze Medal";
        } else {
            return index + "";
        }
    }
}
