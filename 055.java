import java.util.*;

public class Solution {
    public boolean canJump(int[] A) {
        int maxv = 0;
        for (int i=0; i<A.length; i++) {
            if (i > maxv) return false;
            maxv = Math.max(maxv, A[i] + i);
        }
        return true;
    }
}
