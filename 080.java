import java.util.*;

public class Solution {
    public int removeDuplicates(int[] A) {
        if (A.length < 3) return A.length;
        int pos = 2;
        for (int i=2; i<A.length; i++) {
            if (A[i] != A[pos-2]) {
                A[pos++] = A[i];
            }
        }
        return pos;
    }
}
