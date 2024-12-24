package algorithms.easy;

import algorithms.util.TreeNode;

public class SymmetricTree {

    /**
     * @param root binary tree node {@link TreeNode}
     */
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }

        return isSymmetricTree(root.left, root.right);
    }

    private static boolean isSymmetricTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }

        if (p == null || q == null || p.val != q.val) {
            return false;
        }
        return isSymmetricTree(p.left, q.right) && isSymmetricTree(p.right, q.left);
    }
}
