package ru.zrs.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MergeTwoSortedListsTest {

    static Stream<Arguments> mergeListsArguments() {
        ListNode node3 = new ListNode(4);
        ListNode node2 = new ListNode(3, node3);
        ListNode node1 = new ListNode(1, node2);

        ListNode node33 = new ListNode(4);
        ListNode node22 = new ListNode(2, node33);
        ListNode node11 = new ListNode(1, node22);

        ListNode result1 = new ListNode(4);
        ListNode result2 = new ListNode(4, result1);
        ListNode result3 = new ListNode(3, result2);
        ListNode result4 = new ListNode(2, result3);
        ListNode result5 = new ListNode(1, result4);
        ListNode result6 = new ListNode(1, result5);

        return Stream.of(
                arguments(node1, node11, result6),
                arguments(null, null, null),
                arguments(null, new ListNode(0), new ListNode(0))
        );
    }

    @ParameterizedTest
    @MethodSource("mergeListsArguments")
    public void mergeListsTest(ListNode list1, ListNode list2, ListNode resultNode) {
        ListNode result = MergeTwoSortedLists.mergeTwoLists(list1, list2);
        if (resultNode != null) {
            while (resultNode.next != null) {
                assertEquals(resultNode.val, result.val);
                result = result.next;
                resultNode = resultNode.next;
            }
        }else {
            assertEquals(resultNode, MergeTwoSortedLists.mergeTwoLists(list1, list2));
        }
    }

}
