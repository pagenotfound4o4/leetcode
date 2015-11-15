/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class BSTIterator {
    private TreeNode cur;
    private Stack<TreeNode> stack;

    public BSTIterator(TreeNode root) {
        cur = root;
        stack = new Stack<TreeNode>();
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !(cur==null && stack.isEmpty());
    }

    /** @return the next smallest number */
    public int next() {
        TreeNode ret = null;
        while (hasNext()) {
            if (cur != null) {
                stack.push(cur);
                cur = cur.left;
            } else {
                ret = stack.pop();
                cur = ret.right;
                return ret.val;
            }
        }
        return -1;
    }
}

/**
 * Your BSTIterator will be called like this:
 * BSTIterator i = new BSTIterator(root);
 * while (i.hasNext()) v[f()] = i.next();
 */
