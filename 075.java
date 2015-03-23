import java.util.*;

public class Solution {
    public void sortColors(int[] A) {
        int front = 0, back = A.length - 1;
        int pos = 0;
        while (pos <= back) {
            if (A[pos] == 0) {
                if (pos != front) {
                    int t = A[front];
                    A[front] = A[pos];
                    A[pos] = t;
                }
                pos++;
                front++;
            }
            else if (A[pos] == 1) {
                pos++;
            } else {
                while (back >= 0 && A[back] == 2) back--;
                if (back < 0 || pos > back) break;
                int t = A[back];
                A[back] = A[pos];
                A[pos] = t;
                back--;
            }
        }
    }
}
