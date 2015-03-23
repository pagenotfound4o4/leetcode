import java.util.*;

public class Solution {
    public int removeDuplicates(int[] A) {
        if (A.length == 0) return 0;
        int pos = 1;
        for (int i=1; i<A.length; i++) {
            if (A[i] != A[i-1]) {
                A[pos++] = A[i];
            }
        }
        return pos;
    }
}
