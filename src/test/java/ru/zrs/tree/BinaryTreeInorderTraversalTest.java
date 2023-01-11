package ru.zrs.tree;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinaryTreeInorderTraversalTest {

    BinaryTreeInorderTraversal binaryTreeInorderTraversal = new BinaryTreeInorderTraversal();

    @Test
    void inorderTraversal() {

        assertEquals(Arrays.asList(1, 3, 2), binaryTreeInorderTraversal.inorderTraversal(new TreeNode(1,
                null,
                new TreeNode(2,
                        new TreeNode(3),
                        null))));

        assertEquals(Collections.emptyList(), binaryTreeInorderTraversal.inorderTraversal(null));
        assertEquals(List.of(1), binaryTreeInorderTraversal.inorderTraversal(new TreeNode(1)));
    }
}