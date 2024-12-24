package algorithms.easy;

import algorithms.util.TreeNode;

public class SameTree {

    /**
     * @param p binary tree node {@link TreeNode}
     * @param q binary tree node {@link TreeNode}
     */
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }

        if (p == null || q == null || p.val != q.val) {
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
