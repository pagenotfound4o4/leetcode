import java.util.*;

public class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder == null || inorder.length < 1) return null;
        return build(inorder, 0, inorder.length-1, postorder, 0, postorder.length-1);
    }

    public TreeNode build(int[] inorder, int il, int ir, int[] postorder, int pl, int pr) {
        TreeNode root = new TreeNode(postorder[pr]);
        int pos = il;
        while (pos <= ir && inorder[pos] != postorder[pr]) {
            pos++;
        }
        if (pos > il) {
            root.left = build(inorder, il, pos-1, postorder, pl, pl+pos-il-1);
        }
        if (pos < ir) {
            root.right = build(inorder, pos+1, ir, postorder, pl+pos-il, pr-1);
        }
        return root;
    }
}
