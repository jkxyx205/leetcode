package com.rick.leetcode;

/**
 * @author Rick
 * @createdAt 2022-05-25 12:47:00
 */
public class FirstBadVersion {

    public static void main(String[] args) {
        FirstBadVersion firstBadVersion = new FirstBadVersion();
        System.out.println(firstBadVersion.firstBadVersion(1));
    }

    public int firstBadVersion(int version) {
        int left = 1;
        int right = version;

        while (left <= right) {
            int mid = (left + right) >>> 1;
            boolean badVersion = isBadVersion(mid);
            if (!badVersion && mid < version && isBadVersion(mid + 1) == false) {
                left = mid + 1;
            } else if (badVersion) {
                right = mid - 1;
            } else {
                return mid + 1;
            }
        }
        return left;
    }


    boolean isBadVersion(int version) {
        if (version == 1) {
            return true;
        }
        return false;
    }
}
