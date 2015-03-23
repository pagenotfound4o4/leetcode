import java.util.*;

public class Solution {
    public int reverse(int x) {
        boolean isNeg = false;
        if (x < 0) {
            isNeg = true;
            x = -x;
        }
        int sum = 0;
        while (x > 0) {
            sum = sum * 10 + x % 10;
            if (sum%10 != x%10) return 0;
            x /= 10;
        }
        if (isNeg) {
            sum = -sum;
        }
        return sum;
    }
}
