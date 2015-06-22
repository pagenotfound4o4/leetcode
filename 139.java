public class Solution {
    public boolean wordBreak(String s, Set<String> wordDict) {
        boolean[] dp = new boolean[s.length()];
        for (int i=0; i<s.length(); i++) {
            dp[i] = wordDict.contains(s.substring(0, i+1));
            if (dp[i]) continue;
            for (int j=0; j<i; j++) {
                if (dp[j] && wordDict.contains(s.substring(j+1, i+1))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()-1];
    }
}
