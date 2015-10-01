public class Solution {
    public int nthUglyNumber(int n) {
        int[] arr = new int[n];
        int[] idx = new int[3];
        arr[0] = 1;
        for (int i=1; i<n; i++) {
            arr[i] = Math.min(Math.min(arr[idx[0]]*2, arr[idx[1]]*3), arr[idx[2]]*5);
            if (arr[i] == arr[idx[0]]*2) idx[0]++;
            if (arr[i] == arr[idx[1]]*3) idx[1]++;
            if (arr[i] == arr[idx[2]]*5) idx[2]++;
        }
        return arr[n-1];
    }
}
