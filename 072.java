import java.util.*;

public class Solution {
    public int minDistance(String word1, String word2) {
        int[] dp = new int[word2.length()+1];
        for (int j=1; j<=word2.length(); j++) dp[j] = j;
        for (int i=1; i<=word1.length(); i++) {
            int prev = i;
            for (int j=1; j<=word2.length(); j++) {
                int t = Math.min(prev + 1, dp[j] + 1);
                if (word1.charAt(i-1) == word2.charAt(j-1)) {
                    t = Math.min(t, dp[j-1]);
                } else {
                    t = Math.min(t, dp[j-1] + 1);
                }
                dp[j-1] = prev;
                prev = t;
            }
            dp[word2.length()] = prev;
        }
        return dp[word2.length()];
    }
}
