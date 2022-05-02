package com.rick.leetcode;

/**
 * Definition for singly-linked list.
 *
 * @author Rick
 * @createdAt 2022-05-02 23:47:00
 */
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    static ListNode of(int... values) {
        if (values.length == 0) {
            return null;
        }

        ListNode root  = new ListNode(values[0]);
        ListNode current = root;

        for (int i = 1; i < values.length; i++) {
            ListNode listNode = new ListNode(values[i]);
            current.next = listNode;
            current = listNode;
        }
        return root;
    }

    void print() {
        ListNode current = this;

        while (current != null) {
            System.out.print(current.val);
            current = current.next;
        }
        System.out.println();
    }
}

