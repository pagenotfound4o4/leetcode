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
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        Queue<List<Integer>> qlist = new LinkedList<List<Integer>>();
        List<Integer> tmp = new ArrayList<>();
        tmp.add(root.val);
        qlist.add(tmp);
        while (!queue.isEmpty()) {
            List<Integer> clist = qlist.poll();
            TreeNode cur = queue.poll();
            if (cur.left == null && cur.right == null) {
                ret.add(listToString(clist));
                continue;
            }
            if (cur.left != null) {
                List<Integer> llist = new ArrayList<>(clist);
                llist.add(cur.left.val);
                qlist.add(llist);
                queue.add(cur.left);
            }
            if (cur.right != null) {
                List<Integer> rlist = new ArrayList<>(clist);
                rlist.add(cur.right.val);
                qlist.add(rlist);
                queue.add(cur.right);
            }
        }
        return ret;
    }

    public String listToString(List<Integer> list) {
        StringBuilder sb = new StringBuilder("");
        for (int i=0; i<list.size(); i++) {
            if (i > 0) sb.append("->");
            sb.append(list.get(i));
        }
        return sb.toString();
    }
}
