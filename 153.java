import java.util.*;

public class Solution {
    public int findMin(int[] num) {
        int l = 0, r = num.length-1;
        while (r > l) {
            if (num[l] < num[r]) return num[l];
            int mid = (l + r) >> 1;
            if (num[mid] < num[r]) r = mid;
            else l = mid + 1;
        }
        return num[(l+r)>>1];
    }
}
