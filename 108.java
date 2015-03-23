import java.util.*;

public class Solution {
    public TreeNode sortedArrayToBST(int[] num) {
        if (num.length == 0) return null;
        int mid = num.length / 2;
        TreeNode root = new TreeNode(num[mid]);
        root.left = createSubBST(num, 0, mid);
        root.right = createSubBST(num, mid+1, num.length);
        return root;
    }

    public TreeNode createSubBST(int[] num, int l, int r) {
        if (r - l < 1) return null;
        int mid = (l + r) >> 1;
        TreeNode root = new TreeNode(num[mid]);
        root.left = createSubBST(num, l, mid);
        root.right = createSubBST(num, mid+1, r);
        return root;
    }
}
