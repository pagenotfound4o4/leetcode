public class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        if ((19-k)*k/2 < n) return ret; // 9+8+...+(10-k) should >= n
        dfs(ret, new ArrayList<Integer>(), 0, n, k);
        return ret;
    }
    
    void dfs(List<List<Integer>> ret, List<Integer> list, int cur, int rest, int cnt) {
        if (cnt>0 && rest<=cnt) return;
        if (rest==0 && cnt>0) return;
        if (rest==0 && cnt==0) {
            List<Integer> tlist = new ArrayList<>(list);
            ret.add(tlist);
        }
        
        for (int i=cur+1; i<=rest && i<10; i++) {
            list.add(i);
            dfs(ret, list, i, rest-i, cnt-1);
            list.remove(list.size()-1);
        }
    }
}