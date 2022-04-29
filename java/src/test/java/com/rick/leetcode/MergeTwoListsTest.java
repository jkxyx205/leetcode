package com.rick.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Rick
 * @createdAt 2022-04-29 15:26:00
 */
public class MergeTwoListsTest {

    private MergeTwoLists mergeTwoLists = new MergeTwoLists();

    @Test
    public void mergeTwoLists() {
        mergeTwoLists.mergeTwoLists(mergeTwoLists.getListNode(1, 3, 5, 8),
                mergeTwoLists.getListNode(2, 4, 6)
                );
//
//        mergeTwoLists.mergeTwoLists(mergeTwoLists.getListNode(12),
//                mergeTwoLists.getListNode(1)
//        );
//
//        mergeTwoLists.mergeTwoLists(mergeTwoLists.getListNode(),
//                mergeTwoLists.getListNode(1)
//        );
//
//        mergeTwoLists.mergeTwoLists(mergeTwoLists.getListNode(2,3),
//                mergeTwoLists.getListNode()
//        );

//        mergeTwoLists.mergeTwoLists(mergeTwoLists.getListNode(),
//                mergeTwoLists.getListNode()
//        );
    }
}