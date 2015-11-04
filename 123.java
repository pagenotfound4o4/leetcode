public class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) return 0;
        int n = prices.length;
        int[] first = new int[n];
        first[0] = 0;
        int minPrice = prices[0];
        for (int i=1; i<n; i++) {
            minPrice = Math.min(minPrice, prices[i]);
            first[i] = Math.max(first[i-1], prices[i]-minPrice);
        }
        int[] second = new int[n];
        second[n-1] = 0;
        int maxPrice = prices[n-1];
        for (int i=n-2; i>=0; i--) {
            maxPrice = Math.max(maxPrice, prices[i]);
            second[i] = Math.max(second[i+1], maxPrice-prices[i]);
        }
        int ans = first[n-1];
        for (int i=0; i<n-1; i++) {
            ans = Math.max(ans, first[i]+second[i+1]);
        }
        return ans;
    }
}
