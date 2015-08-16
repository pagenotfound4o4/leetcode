public class Solution {
    public int maxProduct(int[] nums) {
        if (nums.length == 0) return 0;
        int[] minv = new int[nums.length];
        int[] maxv = new int[nums.length];
        minv[0] = maxv[0] = nums[0];
        for (int i=1; i<nums.length; i++) {
            minv[i] = Math.min(minv[i-1] * nums[i], Math.min(maxv[i-1] * nums[i], nums[i]));
            maxv[i] = Math.max(minv[i-1] * nums[i], Math.max(maxv[i-1] * nums[i], nums[i]));
        }
        int ret = maxv[0];
        for (int i=1; i<nums.length; i++) {
            ret = Math.max(ret, maxv[i]);
        }
        return ret;
    }
}
