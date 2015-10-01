public class Solution {
    public int hIndex(int[] citations) {
        if (citations.length == 0) return 0;
        Arrays.sort(citations);
        int cnt = 0;
        for (int i=citations.length-1; i>=0; i--) {
            cnt++;
            if (citations[i] < cnt) {
                cnt--;
                break;
            }
        }
        return cnt;
    }
}