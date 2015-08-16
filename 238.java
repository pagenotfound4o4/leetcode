public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] front = new int[nums.length];
        int[] end = new int[nums.length];
        front[0] = nums[0];
        for (int i=1; i<nums.length; i++) {
            front[i] = front[i-1] * nums[i];
        }
        end[nums.length-1] = nums[nums.length-1];
        for (int i=nums.length-2; i>=0; i--) {
            end[i] = end[i+1] * nums[i];
        }
        int[] ret = new int[nums.length];
        for (int i=0; i<ret.length; i++) {
            ret[i] = 1;
            if (i-1 >= 0) ret[i] *= front[i-1];
            if (i+1 < ret.length) ret[i] *= end[i+1];
        }
        return ret;
    }
}
