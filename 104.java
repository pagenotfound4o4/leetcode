import java.util.*;

public class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return dfs(root, 1);
    }

    public int dfs(TreeNode root, int level) {
        int tl = level;
        if (root.left != null) {
            tl = dfs(root.left, level + 1);
        }
        int rl = level;
        if (root.right != null) {
            rl = dfs(root.right, level + 1);
        }
        return Math.max(tl, rl);
    }

}
