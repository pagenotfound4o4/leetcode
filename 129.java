import java.util.*;

public class Solution {
    public int sumNumbers(TreeNode root) {
        return dfs(root, 0);
    }

    public int dfs(TreeNode root, int val) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) {
            return val * 10 + root.val;
        }
        return dfs(root.left, val*10+root.val) + dfs(root.right, val*10+root.val);
    }
}
