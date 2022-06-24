package com.rick.leetcode;

import java.util.Arrays;

/**
 * @author Rick
 * @createdAt 2022-06-24 10:52:00
 */
public class MinCostToMoveChips {
    public int minCostToMoveChips(int[] position) {
        Arrays.sort(position);
        int currentValue = 0;

        int minCost = Integer.MAX_VALUE;
        for (int i : position) {
            if (currentValue == i) {
                continue;
            }
            int currentCost = getCost(position, i);
            if (currentCost < minCost) {
                minCost = currentCost;
            }

            currentValue = i;
        }

        return minCost;
    }

    private int getCost(int[] position, int targetValue) {
        int totalCost = 0;
        for (int i = 0; i < position.length; i++) {
            if (Math.abs(position[i] - targetValue) % 2 == 1) {
                totalCost++;
            }
        }

        return totalCost;
    }
}
