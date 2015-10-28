public class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        for (int i=0; i<nums.length-3; i++) {
            if (i>0 && nums[i]==nums[i-1]) continue;
            for (int j=i+1; j<nums.length-2; j++) {
                if (j>i+1 && nums[j]==nums[j-1]) continue;
                int a1 = nums[i] + nums[j];
                int p = j+1, q = nums.length-1;
                while (p < q) {
                    if (p>j+1 && nums[p]==nums[p-1]) {
                        p++;
                        continue;
                    }
                    if (q<nums.length-1 && nums[q]==nums[q+1]) {
                        q--;
                        continue;
                    }
                    int t = a1 + nums[p] + nums[q];
                    if (t == target) {
                        List<Integer> list = new ArrayList<Integer>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[p]);
                        list.add(nums[q]);
                        ret.add(list);
                        p++;
                    } else if (t < target) {
                        p++;
                    } else {
                        q--;
                    }
                }
            }
        }
        return ret;
    }
}
