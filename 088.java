import java.util.*;

public class Solution {
    public void merge(int A[], int m, int B[], int n) {
        int p = m-1, q = n-1, pos = m+n-1;
        while (p>=0 && q>=0) {
            if (A[p] > B[q]) A[pos--] = A[p--];
            else A[pos--] = B[q--];
        }
        while (q >= 0) {
            A[pos--] = B[q--];
        }
    }
}
