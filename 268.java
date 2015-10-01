public class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        int len = nums.length;
        for (int i=0; i<len; i++) {
            sum ^= i ^ nums[i];
        }
        sum ^= len;
        return sum;
    }
}
