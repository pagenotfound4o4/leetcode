import java.util.*;

public class Solution {
    public int rob(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        return Math.max(rob(nums, 0, nums.length - 1), rob(nums, 1, nums.length));
    }

    public int rob(int[] nums, int l, int r) {
        int[][] dp = new int[2][2];
        dp[0][0] = 0;
        dp[0][1] = nums[l];
        for (int i=l+1; i<r; i++) {
            dp[1][0] = Math.max(dp[0][0], dp[0][1]);
            dp[1][1] = dp[0][0] + nums[i];
            dp[0][0] = dp[1][0];
            dp[0][1] = dp[1][1];
        }
        return Math.max(dp[0][0], dp[0][1]);
    }
}
