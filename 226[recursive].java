import java.util.*;

public class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        invert(root);
        return root;
    }
    
    public void invert(TreeNode root) {
        if (root == null) return;
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        invert(root.left);
        invert(root.right);
    }
}