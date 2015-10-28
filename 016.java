public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int diff = 10000000, ret = 0;
        for (int i=0; i<nums.length-2; i++) {
            int p = i+1, q = nums.length-1;
            while (p < q) {
                int t = nums[i] + nums[p] + nums[q];
                int tt = Math.abs(t - target);
                if (tt < diff) {
                    diff = tt;
                    ret = t;
                }
                if (t == target) return target;
                else if (t < target) p++;
                else q--;
            }
        }
        return ret;
    }
}
