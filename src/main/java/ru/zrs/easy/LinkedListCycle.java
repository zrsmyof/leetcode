package ru.zrs.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zrs
 */
public class LinkedListCycle {

    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        List<ListNode> list = new ArrayList<>();
        list.add(head);
        ListNode curNode = head;
        while (curNode.next != null) {
            if (list.contains(curNode.next)) {
                return true;
            }
            list.add(curNode.next);
            curNode = curNode.next;
        }
        return false;
    }

    public boolean hasCycleRace(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}
