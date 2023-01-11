package ru.zrs.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author zrs
 */
public class SameTree {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        if (p.val != q.val) return false;
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    public boolean isSameWideTree(TreeNode p, TreeNode q) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(p);
        queue.add(q);
        while (!queue.isEmpty()) {
            TreeNode p2 = queue.poll();
            TreeNode q2 = queue.poll();

            if (p2 == null && q2 == null) {
                continue;
            }
            if (p2 == null || q2 == null || p2.val != q2.val) {
                return false;
            }
            queue.add(p2.left);
            queue.add(q2.left);
            queue.add(p2.right);
            queue.add(q2.right);
        }
        return true;
    }
}
