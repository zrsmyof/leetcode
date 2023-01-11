package ru.zrs.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author zrs
 */
public class SymmetricTree {

    public boolean isSymmetricRecursion(TreeNode root) {
        return root == null || checkSymmetric(root.left, root.right);
    }

    private boolean checkSymmetric(TreeNode left, TreeNode right) {
        if (left == null || right == null) {
            return left == right;
        }
        if (left.val != right.val) {
            return false;
        }
        return checkSymmetric(left.left, right.right) && checkSymmetric(left.right, right.left);
    }

    public boolean isSymmetric(TreeNode root) {
        if (root == null || root.left == null & root.right == null)
            return true;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root.left);
        queue.add(root.right);

        while (!queue.isEmpty()) {
            TreeNode left = queue.poll();
            TreeNode right = queue.poll();
            if (left == null && right == null) {
                continue;
            }
            if (left == null || right == null || left.val != right.val) {
                return false;
            }
            queue.add(left.left);
            queue.add(right.right);
            queue.add(left.right);
            queue.add(right.left);
        }
        return true;
    }

    public boolean isSymmetricDepth(TreeNode root) {
        if (root == null || root.left == null & root.right == null)
            return true;
        Stack<TreeNode> stack = new Stack<>();
        stack.add(root.left);
        stack.add(root.right);

        while (!stack.isEmpty()) {
            TreeNode left = stack.pop();
            TreeNode right = stack.pop();
            if (left == null && right == null) {
                continue;
            }
            if (left == null || right == null || left.val != right.val) {
                return false;
            }
            stack.add(left.left);
            stack.add(right.right);
            stack.add(left.right);
            stack.add(right.left);
        }
        return true;
    }
}
