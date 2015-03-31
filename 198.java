import java.util.*;

public class Solution {
    /**
     * dp[i][0] = max(dp[i-1][0], dp[i-1][1])
     * dp[i][1] = dp[i-1][0] + num[i]
     * */
    public int rob(int[] num) {
        if (num.length == 0) return 0;
        int[][] dp = new int[2][2];
        dp[0][0] = 0;
        dp[0][1] = num[0];
        for (int i=1; i<num.length; i++) {
            dp[1][0] = Math.max(dp[0][0], dp[0][1]);
            dp[1][1] = dp[0][0] + num[i];
            dp[0][0] = dp[1][0];
            dp[0][1] = dp[1][1];
        }
        return Math.max(dp[0][0], dp[0][1]);
    }
}
