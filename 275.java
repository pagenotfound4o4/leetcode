public class Solution {
    public int hIndex(int[] citations) {
        if (citations.length == 0) return 0;
        int l = 0, r = citations.length - 1;
        while (l <= r) {
            int mid = (r - l) / 2 + l;
            int cnt = citations.length - mid;
            if (citations[mid] >= cnt) r = mid - 1;
            else l = mid + 1;
        }
        return citations.length - r - 1;
    }
}