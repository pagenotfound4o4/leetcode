import java.util.*;

public class Solution {
    public boolean isHappy(int n) {
        if (n < 1) return false;
        Set<Integer> set = new HashSet<Integer>();
        while (!set.contains(n)) {
            if (n == 1) return true;
            set.add(n);
            int t = 0;
            while (n > 0) {
                int p = n % 10;
                n /= 10;
                t += p * p;
            }
            n = t;
        }
        return false;
    }
}
