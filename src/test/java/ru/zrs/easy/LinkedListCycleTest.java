package ru.zrs.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author zrs
 */
class LinkedListCycleTest {

    LinkedListCycle linkedListCycle = new LinkedListCycle();

    @Test
    public void linkedListCycleTest() {
        ListNode node2 = new ListNode(2, null);
        System.out.println(node2.hashCode());
        ListNode node4 = new ListNode(-4, node2);
        ListNode node3 = new ListNode(0, node4);
        ListNode headNode = new ListNode(3, node2);
        node2.next = node3;
        assertTrue(linkedListCycle.hasCycle(headNode));
        assertTrue(linkedListCycle.hasCycleRace(headNode));

        node2 = new ListNode(2, headNode);
        headNode = new ListNode(1, node2);
        assertTrue(linkedListCycle.hasCycle(headNode));
        assertTrue(linkedListCycle.hasCycleRace(headNode));

        headNode = new ListNode(1, null);
        assertFalse(linkedListCycle.hasCycle(headNode));
        assertFalse(linkedListCycle.hasCycleRace(headNode));
    }

}