package com.rick.leetcode;

/**
 * @author Rick
 * @createdAt 2022-05-15 15:09:00
 */
public class BinarySearch {

    public int BinarySearch(int[] array, int element) {
        int minIndex = 0;
        int maxIndex = array.length - 1;
        while (minIndex <= maxIndex) {
            int midIndex = (minIndex + maxIndex) >>> 1;

            if (element > array[midIndex]) {
                minIndex = midIndex + 1;
            } else if (element < array[midIndex]) {
                maxIndex = midIndex - 1;
            } else {
                return midIndex;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        System.out.println(binarySearch.BinarySearch(new int[] {1, 2, 4,5}, 2)); // 1
        System.out.println(binarySearch.BinarySearch(new int[] {1, 2, 4,5}, 4)); // 2
        System.out.println(binarySearch.BinarySearch(new int[] {1, 2, 4,5,6}, 4)); // 2
        System.out.println(binarySearch.BinarySearch(new int[] {1, 2, 4,5,7}, 5)); // 3

        System.out.println(String.valueOf(Math.pow(2, 38)));
    }
}
