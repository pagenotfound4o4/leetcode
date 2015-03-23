import java.util.*;

public class Solution {
    public int jump(int[] A) {
        if (A.length == 1) return 0;
        int end = 0, prev = 0;
        int pos = 0, step = 0;
        while (pos < A.length) {
            while (pos <= prev) {
                end = Math.max(end, pos+A[pos]);
                pos++;
            }
            prev = end;
            step++;
            if (end >= A.length-1)
                return step;
        }
        return 0;
    }
}
