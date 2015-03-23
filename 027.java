import java.util.*;

public class Solution {
    public int removeElement(int[] A, int elem) {
        int pos = 0;
        for (int i=0; i<A.length; i++) {
            if (A[i] != elem) {
                A[pos++] = A[i];
            }
        }
        return pos;
    }
}
