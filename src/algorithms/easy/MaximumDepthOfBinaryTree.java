package algorithms.easy;

import algorithms.util.TreeNode;

public class MaximumDepthOfBinaryTree {

    /**
     * @param root binary tree node {@link TreeNode}
     */
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        return left > right ? left + 1 : right + 1;
    }
}
