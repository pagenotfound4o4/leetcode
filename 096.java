import java.util.*;

public class Solution {
    int[][] dp;

    public int numTrees(int n) {
        if (n == 0) return 0;
        dp = new int[n+1][n+1];
        return count(0, n);
    }

    public int count(int l, int r) {
        if (r - l <= 1) return 1;
        if (dp[l][r] > 0) return dp[l][r];
        int sum = 0;
        for (int i=l; i<r; i++) {
            dp[l][i] = count(l, i);
            dp[i+1][r] = count(i+1, r);
            sum += dp[l][i] * dp[i+1][r];
        }
        return sum;
    }
}
