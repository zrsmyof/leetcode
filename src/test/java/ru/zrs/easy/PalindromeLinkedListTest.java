package ru.zrs.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author zrs
 */
class PalindromeLinkedListTest {

    PalindromeLinkedList palindromeLinkedList = new PalindromeLinkedList();

    @Test
    void isPalindromeWithStack() {
        ListNode listNode4 = new ListNode(1);
        ListNode listNode3 = new ListNode(2, listNode4);
        ListNode listNode2 = new ListNode(2, listNode3);
        ListNode head = new ListNode(1, listNode2);

        assertTrue(palindromeLinkedList.isPalindromeWithStack(head));

        ListNode listNode = new ListNode(2);
        ListNode head2 = new ListNode(1, listNode);
        assertFalse(palindromeLinkedList.isPalindromeWithStack(head2));
    }
}