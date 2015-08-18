public class Solution {
    public int[] singleNumber(int[] nums) {
        int n = 0;
        for (int i=0; i<nums.length; i++) n ^= nums[i];
        int mask = n & (n-1) ^ n;
        int[] ret = new int[2];
        for (int i=0; i<nums.length; i++) {
            if ((nums[i] & mask) > 0) {
                ret[1] ^= nums[i];
            } else {
                ret[0] ^= nums[i];
            }
        }
        return ret;
    }
}