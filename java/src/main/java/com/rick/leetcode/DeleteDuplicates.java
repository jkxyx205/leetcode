package com.rick.leetcode;

/**
 * @author Rick
 * @createdAt 2022-05-02 23:30:00
 */
public class DeleteDuplicates {

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }

        int currentValue = head.val;
        ListNode currentNode = head;

        while (currentNode.next != null) {
            if (currentValue == currentNode.next.val) {
                if (currentNode.next.next != null) {
                    currentNode.next = currentNode.next.next;
                } else {
                    currentNode.next = null;
                    break;
                }
            } else {
                currentValue = currentNode.next.val;
                currentNode = currentNode.next;
            }
        }

        return head;
    }
}
