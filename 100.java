import java.util.*;

public class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Stack<TreeNode> sp = new Stack<TreeNode>();
        Stack<TreeNode> sq = new Stack<TreeNode>();
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        sp.push(p);
        sq.push(q);
        while (!sp.empty()) {
            TreeNode curp = sp.pop();
            TreeNode curq = sq.pop();
            if (curp.val != curq.val) return false;
            if (curp.left != null && curq.left != null) {
                sp.push(curp.left);
                sq.push(curq.left);
            } else if (!(curp.left == null && curq.left == null)) {
                return false;
            }
            if (curp.right != null && curq.right != null) {
                sp.push(curp.right);
                sq.push(curq.right);
            } else if (!(curp.right == null && curq.right == null)){
                return false;
            }
        }
        return true;
    }
}
