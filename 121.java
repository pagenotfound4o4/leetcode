import java.util.*;

public class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length < 1) return 0;
        int minv = prices[0];
        int maxv = 0;
        for (int i=1; i<prices.length; i++) {
            minv = Math.min(minv, prices[i]);
            maxv = Math.max(maxv, prices[i]-minv);
        }
        return maxv;
    }
}
