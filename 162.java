import java.util.*;

public class Solution {
    public int findPeakElement(int[] num) {
        if (num.length <= 1) return 0;
        int l = 0, r = num.length-1;
        while (r > l) {
            int mid = (l + r) >> 1;
            if (num[mid] > num[mid+1]) r = mid;
            else if (num[mid] < num[mid+1]) l = mid + 1;
        }
        return l;
    }
}
