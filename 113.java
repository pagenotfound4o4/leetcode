import java.util.*;

public class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        if (root == null) return ret;
        Queue<Deque<TreeNode>> queue = new LinkedList<Deque<TreeNode>>();
        Deque<TreeNode> deque = new ArrayDeque<TreeNode>();
        deque.addLast(root);
        queue.add(deque);
        while (!queue.isEmpty()) {
            deque = queue.poll();
            TreeNode cur = deque.getLast();
            if (cur.left == null && cur.right == null) {
                int num = 0;
                List<Integer> list = new ArrayList<Integer>();
                for (TreeNode node : deque) {
                    num += node.val;
                    list.add(node.val);
                }
                if (num == sum) {
                    ret.add(list);
                }
                continue;
            }
            if (cur.left != null) {
                Deque<TreeNode> ldeque = new ArrayDeque<TreeNode>(deque);
                ldeque.add(cur.left);
                queue.add(ldeque);
            }
            if (cur.right != null) {
                Deque<TreeNode> rdeque = new ArrayDeque<TreeNode>(deque);
                rdeque.add(cur.right);
                queue.add(rdeque);
            }
        }
        return ret;
    }
}
