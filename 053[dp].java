import java.util.*;

public class Solution {
    public int maxSubArray(int[] A) {
        int maxv = A[0], tmp = A[0];
        for (int i=1; i<A.length; i++) {
            tmp = Math.max(A[i], A[i]+tmp);
            maxv = Math.max(maxv, tmp);
        }
        return maxv;
    }
}
