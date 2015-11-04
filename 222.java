/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public int countNodes(TreeNode root) {
        int left = leftDepth(root);
        int right = rightDepth(root);
        if (left == right) {
            return (1 << left) - 1;
        } else {
            return 1 + countNodes(root.left) + countNodes(root.right);
        }
    }

    int leftDepth(TreeNode root) {
        int ret = 0;
        while (root != null) {
            ret++;
            root = root.left;
        }
        return ret;
    }

    int rightDepth(TreeNode root) {
        int ret = 0;
        while (root != null) {
            ret++;
            root = root.right;
        }
        return ret;
    }
}
