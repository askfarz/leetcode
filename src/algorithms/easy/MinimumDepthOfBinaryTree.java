package algorithms.easy;

import algorithms.util.TreeNode;

public class MinimumDepthOfBinaryTree {

    /**
     * @param root binary tree node {@link TreeNode}
     */
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        if (root.left == null && root.right == null) {
            return 1;
        }

        if (root.left == null) {
            return 1 + minDepth(root.right);
        }

        if (root.right == null) {
            return 1 + minDepth(root.left);
        }

        int leftDeep = minDepth(root.left);
        int rightDeep = minDepth(root.right);

        return leftDeep < rightDeep ? leftDeep + 1 : rightDeep + 1;
    }
}
