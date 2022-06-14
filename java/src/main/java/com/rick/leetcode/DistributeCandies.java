package com.rick.leetcode;

/**
 * @author Rick
 * @createdAt 2022-06-06 20:49:00
 */
public class DistributeCandies {

    public int[] distributeCandies(int candies, int num_people) {
        int[] result = new int[num_people];

        int curCandies = 0;
        int sum = 0;

        while (sum < candies) {
            for (int i = 0; i < num_people; i++) {
                ++curCandies;

                if (curCandies >= candies - sum) {
                    result[i] += candies - sum;
                    sum += candies - sum;
                    break;
                }

                result[i] += curCandies;
                sum += curCandies;
            }
        }

        return result;
    }
}
