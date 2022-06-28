package com.rick.leetcode;

/**
 * 1313. 解压缩编码列表
 * @author Rick
 * @createdAt 2022-06-29 11:36:00
 */
public class DecompressRLElist {

    public int[] decompressRLElist(int[] nums) {
        int len = 0;
        for (int i = 0; i < nums.length; i += 2) {
            len += nums[i];
        }

        int[] ans = new int[len];
        int k = 0;

        for (int i = 0; i < nums.length / 2; i++) {
            int index = i * 2;
            for (int j = 0; j < nums[index]; j++) {
                ans[k++] = nums[index + 1];
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        DecompressRLElist decompressRLElist = new DecompressRLElist();
        decompressRLElist.decompressRLElist(new int[] {1,2,3,4});
        decompressRLElist.decompressRLElist(new int[] {1,1,2,3});
        decompressRLElist.decompressRLElist(new int[] {1,1});
    }
}
