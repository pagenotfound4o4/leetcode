import java.util.*;

public class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ret = new ArrayList<Integer>();
        if (root == null) return ret;
        List<TreeNode> curList = new ArrayList<TreeNode>();
        curList.add(root);
        while (!curList.isEmpty()) {
            List<TreeNode> nxtList = new ArrayList<TreeNode>();
            for (int i=0; i<curList.size(); i++) {
                TreeNode cur = curList.get(i);
                if (i == 0) {
                    ret.add(cur.val);
                }
                if (cur.right != null) {
                    nxtList.add(cur.right);
                }
                if (cur.left != null) {
                    nxtList.add(cur.left);
                }
            }
            curList = nxtList;
        }
        return ret;
    }
}
