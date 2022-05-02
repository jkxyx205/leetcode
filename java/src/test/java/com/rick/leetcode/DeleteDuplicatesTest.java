package com.rick.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Rick
 * @createdAt 2022-05-03 00:00:00
 */
public class DeleteDuplicatesTest {

    private DeleteDuplicates deleteDuplicates = new DeleteDuplicates();

    @Test
    public void deleteDuplicates() {
        ListNode listNode = deleteDuplicates.deleteDuplicates(ListNode.of(1, 1, 2, 3, 3));
        listNode.print();

        ListNode listNode2 = deleteDuplicates.deleteDuplicates(ListNode.of(1, 1));
        listNode2.print();

        ListNode listNode3 = deleteDuplicates.deleteDuplicates(ListNode.of(1));
        listNode3.print();

        ListNode listNode4 = deleteDuplicates.deleteDuplicates(ListNode.of(1, 1, 2));
        listNode4.print();

        ListNode listNode5 = deleteDuplicates.deleteDuplicates(ListNode.of(1, 1, 1));
        listNode5.print();
    }
}