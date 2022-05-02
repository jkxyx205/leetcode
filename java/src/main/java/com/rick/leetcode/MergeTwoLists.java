package com.rick.leetcode;

/**
 * @author Rick
 * @createdAt 2022-04-29 15:06:00
 */
public class MergeTwoLists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode root = new ListNode();
        ListNode current = root;
        while (list1 != null) {
            if (list2 != null && list2.val <= list1.val) {
                current = createNode(current, list2.val);
                list2 = list2.next;
            } else {
                current = createNode(current, list1.val);
                list1 = list1.next;
            }
        }

        while (list2 != null) {
            current = createNode(current, list2.val);
            list2 = list2.next;
        }

        return root.next;
    }

    private ListNode createNode(ListNode current, int value) {
        ListNode listNode = new ListNode(value);
        current.next = listNode;
        return listNode;
    }

}
