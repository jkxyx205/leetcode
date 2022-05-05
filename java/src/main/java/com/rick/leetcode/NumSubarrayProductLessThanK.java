package com.rick.leetcode;


/**
 * @author Rick
 * @createdAt 2022-05-05 21:31:00
 */
public class NumSubarrayProductLessThanK {

//    public int numSubarrayProductLessThanK(int[] nums, int k) {
//        int count = 0;
//        int result = 1;
//        int start = 0;
//        for (int i = 0; i < nums.length || start < nums.length; i++) {
//            System.out.println("1111");
//            if (nums.length == i) {
//                count += (nums.length - start - 1) * (1 + (nums.length - start - 1) ) / 2;
//                break;
//            }
//
//            result *= nums[i];
//            if (result < k) {
//                count++;
//            } else {
//                result = 1;
//                i = ++start - 1;
//            }
//
//        }
//
//        return count;
//    }

    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k < 1) return 0;
        int len = nums.length;
        int left = 0, right = 0, res = 0, sum = 1;
        while (right < len) {
            sum *= nums[right];
            while (sum >= k && left <= right) {
                sum /= nums[left];
                left++;
            }
            res += right - left + 1;
            right++;
        }
        return res;
    }

}
