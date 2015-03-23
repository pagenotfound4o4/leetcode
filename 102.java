import java.util.*;

public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ret = new LinkedList<List<Integer>>();
        if (root != null) {
            List<TreeNode> prev = new LinkedList<TreeNode>();
            prev.add(root);
            while (!prev.isEmpty()) {
                List<Integer> list = new LinkedList<Integer>();
                List<TreeNode> next = new LinkedList<TreeNode>();
                for (TreeNode item : prev) {
                    list.add(item.val);
                    if (item.left != null) next.add(item.left);
                    if (item.right != null) next.add(item.right);
                }
                ret.add(list);
                prev = next;
            }
        }
        return ret;
    }
}
