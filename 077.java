public class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> list = new ArrayList<Integer>();
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        dfs(n, k, 1, list, ret);
        return ret;
    }

    public void dfs(int n, int k, int cur, List<Integer> list, List<List<Integer>> ret) {
        if (list.size() == k) {
            ret.add(new ArrayList<Integer>(list));
            return;
        }
        if (cur > n || (n - cur + 1 + list.size() < k)) return;
        list.add(cur);
        dfs(n, k, cur+1, list, ret);
        list.remove(list.size() - 1);
        dfs(n, k, cur+1, list, ret);
    }
}
