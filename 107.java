import java.util.*;

public class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ret = new LinkedList<List<Integer>>();
        if (root == null) return ret;
        Queue<TreeNode> prev = new LinkedList<TreeNode>();
        prev.add(root);
        while (!prev.isEmpty()) {
            List<Integer> list = new LinkedList<Integer>();
            Queue<TreeNode> next = new LinkedList<TreeNode>();
            while (!prev.isEmpty()) {
                TreeNode cur = prev.poll();
                list.add(cur.val);
                if (cur.left != null) {
                    next.add(cur.left);
                }
                if (cur.right != null) {
                    next.add(cur.right);
                }
            }
            ret.add(0, list);
            prev = next;
        }
        return ret;
    }
}
