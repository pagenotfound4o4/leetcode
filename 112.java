import java.util.*;

public class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) return false;
        if (root.left == null && root.right == null) return root.val == sum;
        if (root.left != null && root.right == null) return hasPathSum(root.left, sum - root.val);
        if (root.left == null && root.right != null) return hasPathSum(root.right, sum - root.val);
        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }
}
