package com.rick.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * 234. 回文链表
 * @author Rick
 * @createdAt 2022-05-15 18:20:00
 */
public class IsPalindrome {

    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();

        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        int i = 0;
        int j = list.size() - 1;
        while (i < j) {
            if (!Objects.equals(list.get(i++), list.get(j--))) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        ListNode head = ListNode.of(1, 2, 2, 1);



    }
}
