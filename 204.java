import java.util.*;

public class Solution {
    public int countPrimes(int n) {
        boolean[] flag = new boolean[n];
        int cnt = 0;
        for (int i=2; i<n; i++) {
            if (!flag[i]) {
                cnt++;
                for (int j=2; i*j<n; j++) {
                    flag[i*j] = true;
                }
            }
        }
        return cnt;
    }
}
