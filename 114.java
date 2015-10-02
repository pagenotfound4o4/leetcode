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
    public void flatten(TreeNode root) {
        if (root == null) return;
        TreeNode last = null;
        dfs(root);
    }
    
    TreeNode dfs(TreeNode root) {
        TreeNode llast = null;
        if (root.left != null) {
            llast = dfs(root.left);
        }
        TreeNode rlast = null;
        if (root.right != null) {
            rlast = dfs(root.right);
        }
        if (llast != null) {
            llast.right = root.right;
            root.right = root.left;
            root.left = null;
        }
        if (rlast != null) return rlast;
        else if (llast != null) return llast;
        else return root;
    }
}