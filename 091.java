public class Solution {
    /**
     * dp[i][0]表示到i个字符，只有一个数字进行decode的方案数
     * dp[i][1]表示到i个字符，前一个和当前数字进行decode的方案数
     * dp[i][0] = dp[i-1][0] + dp[i-1][1]
     * dp[i][1] = dp[i-1][0]
     * 注意当前字符和前一个字符为0的情况
     */
    public int numDecodings(String s) {
        if (s.length() == 0) return 0;
        int[][] dp = new int[2][2];
        if (s.charAt(0) == '0') return 0;
        else dp[0][0] = 1;
        for (int i=1; i<s.length(); i++) {
            if (s.charAt(i) != '0') {
                dp[i%2][0] = dp[(i-1)%2][0] + dp[(i-1)%2][1];
            } else {
                dp[i%2][0] = 0;
            }
            if (s.charAt(i-1) != '0') {
                int t = (s.charAt(i-1)-'0') * 10 + (s.charAt(i)-'0');
                if (t > 0 && t <= 26) {
                    dp[i%2][1] = dp[(i-1)%2][0];
                } else {
                    dp[i%2][1] = 0;
                }
            } else {
                dp[i%2][1] = 0;
            }
        }
        return dp[(s.length()-1)%2][0] + dp[(s.length()-1)%2][1];
    }
}
