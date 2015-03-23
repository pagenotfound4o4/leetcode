import java.util.*;

public class Solution {
    public int sqrt(int x) {
        final double EPS = 1e-5;
        double ans = x, t = x;
        while (Math.abs(ans*ans - t) > EPS) {
            ans = (ans + t / ans) / 2;
        }
        return (int)ans;
    }
}
