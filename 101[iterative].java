import java.util.*;

public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        Queue<TreeNode> q1 = new LinkedList<TreeNode>();
        Queue<TreeNode> q2 = new LinkedList<TreeNode>();
        q1.add(root);
        q2.add(root);
        while (!q1.isEmpty() && !q2.isEmpty()) {
            TreeNode cur1 = q1.poll();
            TreeNode cur2 = q2.poll();
            if (cur1.left != null) {
                if (cur2.right != null && cur1.left.val == cur2.right.val) {
                    q1.add(cur1.left);
                    q2.add(cur2.right);
                } else {
                    return false;
                }
            } else if (cur2.right != null){
                return false;
            }
            if (cur1.right != null) {
                if (cur2.left != null && cur1.right.val == cur2.left.val) {
                    q1.add(cur1.right);
                    q2.add(cur2.left);
                } else {
                    return false;
                }
            } else if (cur2.left != null) {
                return false;
            }
        }
        return q1.isEmpty() && q2.isEmpty();
    }
}
