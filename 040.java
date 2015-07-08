public class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        if (candidates.length == 0) return ret;
        Arrays.sort(candidates);
        dfs(candidates, target, -1, new ArrayList<Integer>(), ret);
        return ret;
    }

    public void dfs(int[] arr, int target, int cur, List<Integer> list, List<List<Integer>> ret) {
        if (target == 0) {
            ret.add(new ArrayList<Integer>(list));
            return;
        } else if (cur < arr.length) {
            for (int i=cur+1; i<arr.length && target-arr[i]>=0; i++) {
                if (i>cur+1 && arr[i]==arr[i-1]) continue;
                list.add(arr[i]);
                dfs(arr, target-arr[i], i, list, ret);
                list.remove(list.size() - 1);
            }
        }
    }
}
