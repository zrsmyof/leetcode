package ru.zrs.tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorderTraversal(root, result);
        System.out.println(result);
        return result;
    }

    private void inorderTraversal(TreeNode treeNode, List<Integer> result) {
        if (treeNode == null) {
            return;
        }
        inorderTraversal(treeNode.left, result);
        result.add(treeNode.val);
        inorderTraversal(treeNode.right, result);
    }
}
