import java.util.*;

public class Solution {
    public boolean isBalanced(TreeNode root) {
        return depth(root) != -1;
    }

    public int depth(TreeNode root) {
        if (root == null) return 0;
        int dl = depth(root.left);
        if (dl == -1) return -1;
        int dr = depth(root.right);
        if (dr == -1) return -1;
        if (Math.abs(dl - dr) > 1) return -1;
        return Math.max(dl, dr) + 1;
    }
}
