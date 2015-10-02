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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) return list;
        Stack<TreeNode> stk1 = new Stack<>();
        Stack<TreeNode> stk2 = new Stack<>();
        stk1.push(root);
        while (!stk1.isEmpty()) {
            TreeNode cur = stk1.pop();
            stk2.push(cur);
            if (cur.left != null) stk1.push(cur.left);
            if (cur.right != null) stk1.push(cur.right);
        }
        while (!stk2.isEmpty()) {
            list.add(stk2.pop().val);
        }
        return list;
    }
}