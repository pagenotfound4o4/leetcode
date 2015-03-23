import java.util.*;

public class Solution {
    public int searchInsert(int[] A, int target) {
        int l = 0, r = A.length;
        int mid = 0;
        while (r > l) {
            mid = (l + r) >> 1;
            if (A[mid] == target) return mid;
            if (A[mid] < target) l = mid + 1;
            else r = mid;
        }
        if (A[mid] < target) mid++;
        return mid;
    }
}
