import java.util.*;

public class Solution {
    public void connect(TreeLinkNode root) {
        if (root == null) return;
        traverse(root, root.left);
        traverse(root, root.right);
    }

    public void traverse(TreeLinkNode root, TreeLinkNode cur) {
        if (cur == null) return;
        if (cur == root.left) {
            cur.next = root.right;
        } else {
            if (root.next != null) {
                cur.next = root.next.left;
            }
        }
        traverse(cur, cur.left);
        traverse(cur, cur.right);
    }
}
