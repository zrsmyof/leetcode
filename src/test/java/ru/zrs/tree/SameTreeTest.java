package ru.zrs.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author zrs
 */
class SameTreeTest {

    SameTree sameTree = new SameTree();

    @Test
    void isSameTree() {
        TreeNode tree1 = new TreeNode(1,
                new TreeNode(2, null, null),
                new TreeNode(3, null, null));
        TreeNode tree2 = new TreeNode(1,
                new TreeNode(2, null, null),
                new TreeNode(3, null, null));
        assertTrue(sameTree.isSameTree(tree1, tree2));
        assertTrue(sameTree.isSameWideTree(tree1, tree2));

        TreeNode tree3 = new TreeNode(1,
                new TreeNode(2, null, null),
                null);
        TreeNode tree4 = new TreeNode(1,
                null,
                new TreeNode(2, null, null));
        assertFalse(sameTree.isSameTree(tree3, tree4));
        assertFalse(sameTree.isSameWideTree(tree3, tree4));

        TreeNode tree5 = new TreeNode(1,
                new TreeNode(2, null, null),
                new TreeNode(1, null, null));
        TreeNode tree6 = new TreeNode(1,
                new TreeNode(1, null, null),
                new TreeNode(2, null, null));

        assertFalse(sameTree.isSameTree(tree5, tree6));
        assertFalse(sameTree.isSameWideTree(tree5, tree6));
    }
}