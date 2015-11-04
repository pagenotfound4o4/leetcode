public class Solution {
    public int maxProfit(int k, int[] prices) {
        if (prices == null || prices.length == 0 || k < 0) return 0;
        int day = prices.length;
        if (k > day/2) {
            int sum = 0;
            for (int i=1; i<day; i++) {
                int diff = prices[i] - prices[i-1];
                sum += Math.max(diff, 0);
            }
            return sum;
        }
        
        int[][] local = new int[day][k+1];
        int[][] global = new int[day][k+1];
        for (int i=1; i<day; i++) {
            int diff = prices[i] - prices[i-1];
            for (int j=1; j<=k; j++) {
                local[i][j] = Math.max(global[i-1][j-1], local[i-1][j]+diff);
                global[i][j] = Math.max(global[i-1][j], local[i][j]);
            }
        }
        return global[day-1][k];
    }
}
