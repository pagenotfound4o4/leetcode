/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        if (root == null) return;
        Queue<TreeLinkNode> queue = new LinkedList<TreeLinkNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Queue<TreeLinkNode> nq = new LinkedList<TreeLinkNode>();
            while (!queue.isEmpty()) {
                TreeLinkNode cur = queue.poll();
                cur.next = queue.isEmpty() ? null : queue.peek();
                if (cur.left != null) nq.add(cur.left);
                if (cur.right != null) nq.add(cur.right);
            }
            queue = nq;
        }
    }
}
