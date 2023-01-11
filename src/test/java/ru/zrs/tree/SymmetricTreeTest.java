package ru.zrs.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author zrs
 */
class SymmetricTreeTest {

    SymmetricTree symmetricTree = new SymmetricTree();

    @Test
    void isSymmetric() {
        TreeNode tree1 = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(3, null, null),
                        new TreeNode(4, null, null)),
                new TreeNode(2,
                        new TreeNode(4, null, null),
                        new TreeNode(3, null, null)));
        assertTrue(symmetricTree.isSymmetric(tree1));
        assertTrue(symmetricTree.isSymmetricDepth(tree1));
        assertTrue(symmetricTree.isSymmetricRecursion(tree1));

        TreeNode tree2 = new TreeNode(1,
                new TreeNode(2,
                        null,
                        new TreeNode(3, null, null)),
                new TreeNode(2,
                        null,
                        new TreeNode(3, null, null)));
        assertFalse(symmetricTree.isSymmetric(tree2));
        assertFalse(symmetricTree.isSymmetricDepth(tree2));
        assertFalse(symmetricTree.isSymmetricRecursion(tree2));
    }
}