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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ret = new ArrayList<>();
        if (root == null) return ret;
        dfs(ret, root, ""+root.val);
        return ret;
    }

    public void dfs(List<String> ret, TreeNode root, String cur) {
        if (root.left == null && root.right == null) {
            ret.add(cur);
            return;
        }
        if (root.left != null) dfs(ret, root.left, cur+"->"+root.left.val);
        if (root.right != null) dfs(ret, root.right, cur+"->"+root.right.val);
    }
}
