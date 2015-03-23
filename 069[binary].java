import java.util.*;

public class Solution {
    public int sqrt(int x) {
        int l = 0, r = x;
        while (r >= l) {
            int mid = (l + r) >> 1;
            if (mid*mid == x) return mid;
            if (mid == 0) {
                l = mid + 1;
            } else {
                if (mid*mid / mid != mid || mid*mid > x) r = mid - 1;
                else l = mid + 1;
            }
        }
        return (l + r) >> 1;
    }
}
