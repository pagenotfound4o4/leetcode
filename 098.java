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
    public boolean isValidBST(TreeNode root) {
        int prev = 0;
        boolean flag = false;
        TreeNode cur = root;
        Stack<TreeNode> stack = new Stack<>();
        while (cur!=null || !stack.isEmpty()) {
            if (cur != null) {
                stack.push(cur);
                cur = cur.left;
            } else {
                cur = stack.pop();
                if (flag) {
                    if (cur.val <= prev) return false;
                } else {
                    flag = true;
                }
                prev = cur.val;
                cur = cur.right;
            }
        }
        return true;
    }
}