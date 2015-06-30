public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        if (nums.length > 0) {
            dfs(nums, 0, ret);
        }
        return ret;
    }

    public void dfs(int[] nums, int pos, List<List<Integer>> ret) {
        if (pos == nums.length - 1) {
            List<Integer> list = new ArrayList<Integer>();
            for (int i=0; i<nums.length; i++) {
                list.add(nums[i]);
            }
            ret.add(list);
            return;
        }
        for (int i=pos; i<nums.length; i++) {
            swap(nums, pos, i);
            dfs(nums, pos+1, ret);
            swap(nums, pos, i);
        }
    }

    public void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}
