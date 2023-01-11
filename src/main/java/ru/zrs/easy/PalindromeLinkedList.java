package ru.zrs.easy;

import java.util.Stack;

/**
 * @author zrs
 */
public class PalindromeLinkedList {
    public boolean isPalindromeWithStack(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode current = head;
        int listLength = 0;
        while (current != null) {
            stack.add(current.val);
            listLength++;
            current = current.next;
        }
        current = head;
        for (int i = 0; i < listLength / 2; i++) {
            int stackNodeValue = stack.pop();
            if (current.val != stackNodeValue) {
                return false;
            }
            current = current.next;
        }
        return true;
    }
}
