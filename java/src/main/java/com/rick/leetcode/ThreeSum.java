package com.rick.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 15. 三数之和
 * @author Rick
 * @createdAt 2022-05-08 14:43:00
 */
public class ThreeSum {
//    public List<List<Integer>> threeSum(int[] nums) {
//        List<List<Integer>> list = new ArrayList<>();
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                for (int k = j + 1; k < nums.length; k++) {
//                    if (nums[i] + nums[j] + nums[k] == 0) {
//                        Integer[] value = new Integer[] {nums[i], nums[j], nums[k]};
//                        Arrays.sort(value);
//                        List<Integer> integers = Arrays.asList(value);
//                        if (!list.contains(integers)) {
//                            list.add(integers);
//                        }
//                    }
//                }
//            }
//        }
//
//        return list;
//    }

//    public List<List<Integer>> threeSum(int[] nums) {
//        Arrays.sort(nums);
//        List<List<Integer>> list = new ArrayList<>();
//        for (int i = 0; i < nums.length - 2 && nums[i] <= 0; i++) {
//            if(i > 0 && nums[i] == nums[i - 1]) continue;
//            for (int j = i + 1; j < nums.length - 1; j++) {
//                for (int k = j + 1; k < nums.length; k++) {
//                    if (nums[k] < 0) {
//                        continue;
//                    }
//                    if (nums[i] + nums[j] + nums[k] == 0) {
//                        list.add(Arrays.asList(nums[i], nums[j], nums[k]));
//                    }
//                }
//            }
//        }
//
//        return list;
//    }

    public List<List<Integer>> threeSum(int[] nums) {
        //这题采用双指针
        //首先先进行排序
        Arrays.sort(nums);
        //定义一个结果集合
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        //这里的nums.length-2是为了保证最后还有两个数
        for(int k = 0; k < nums.length - 2; k++){
            //如果nums[k]>0的话那后面的值一定不会等于0，因为已经提前排好序了
            if(nums[k] > 0) break;
            //这里去重
            if(k > 0 && nums[k] == nums[k - 1]) continue;
            //定义双指针
            int i = k + 1, j = nums.length - 1;
            while(i < j){
                //三数相加
                int sum = nums[k] + nums[i] + nums[j];
                if(sum < 0) {
                    //如果相加的和小于0，左指针前进并去重
                    while(i < j && nums[i] == nums[++i]);
                }else if(sum > 0){
                    while(i < j && nums[j] == nums[--j]);
                }else{
                    res.add(new ArrayList<Integer>(Arrays.asList(nums[k],nums[i],nums[j])));
                    while(i < j && nums[i] == nums[++i]);
                    while(i < j && nums[j] == nums[--j]);
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {

        ThreeSum threeSum = new ThreeSum();
        threeSum.threeSum(new int[] {-1,0,1,2,-1,-4});
//        threeSum.threeSum(new int[] {-7,-10,-1,3,0,-7,-9,-1,10,8,-6,4,14,-8,9,-15,0,-4,-5,9,11,3,-5,-8,2,-6,-14,7,-14,10,5,-6,7,11,4,-7,11,11,7,7,-4,-14,-12,-13,-14,4,-13,1,-15,-2,-12,11,-14,-2,10,3,-1,11,-5,1,-2,7,2,-10,-5,-8,-10,14,10,13,-2,-9,6,-7,-7,7,12,-5,-14,4,0,-11,-8,2,-6,-13,12,0,5,-15,8,-12,-1,-4,-15,2,-5,-9,-7,12,11,6,10,-6,14,-12,9,3,-10,10,-8,-2,6,-9,7,7,-7,4,-8,5,-4,8,0,3,11,0,-10,-9});
//        threeSum.threeSum(new int[] {-2, -1, -3, 0, 1, 2, 3});
//        threeSum.threeSum(new int[] {-49,-6,55, 1, 0, -1});
//        threeSum.threeSum(new int[] {-1});
//        threeSum.threeSum(new int[] {});
    }
}
