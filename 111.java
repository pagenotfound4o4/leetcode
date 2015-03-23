import java.util.*;

public class Solution {
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        List<TreeNode> prev = new ArrayList<TreeNode>();
        int level = 0;
        prev.add(root);
        while (!prev.isEmpty()) {
            level++;
            List<TreeNode> next = new ArrayList<TreeNode>();
            for (TreeNode node : prev) {
                if (node.left == null && node.right == null) return level;
                if (node.left != null) next.add(node.left);
                if (node.right != null) next.add(node.right);
            }
            prev = next;
        }
        return level;
    }
}
