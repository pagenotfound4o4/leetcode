import java.util.*;

public class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ret = new LinkedList<List<Integer>>();
        if (root == null) return ret;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        boolean flag = true;
        while (!stack.isEmpty()) {
            Stack<TreeNode> nstack = new Stack<TreeNode>();
            List<Integer> list = new ArrayList<Integer>();
            while (!stack.isEmpty()) {
                TreeNode cur = stack.pop();
                list.add(cur.val);
                if (flag) {
                    if (cur.left != null) nstack.push(cur.left);
                    if (cur.right != null) nstack.push(cur.right);
                } else {
                    if (cur.right != null) nstack.push(cur.right);
                    if (cur.left != null) nstack.push(cur.left);
                }
            }
            ret.add(list);
            flag = !flag;
            stack = nstack;
        }
        return ret;
    }
}
