import java.util.*;

public class Solution {
    public double pow(double x, int n) {
        if (n == 0) return 1.0;
        boolean isNeg = false;
        if (n < 0) {
            isNeg = true;
            n = -n;
        }
        double ans = 1.0;
        while (n > 0) {
            if (n % 2 > 0) {
                ans *= x;
            }
            x *= x;
            n >>= 1;
        }
        return isNeg ? 1.0/ans : ans;
    }
}
