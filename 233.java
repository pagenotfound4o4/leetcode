public class Solution {
    public int countDigitOne(int n) {
        if (n <= 0) return 0;
        long cnt = 0;
        long factor = 1;
        while ((n/factor) > 0) {
            long low = n - n / factor * factor;
            long cur = n / factor % 10;
            long high = n / factor / 10;
            if (cur == 0) {
                cnt += high * factor;
            } else if (cur == 1) {
                cnt += high * factor + low + 1;
            } else {
                cnt += (high + 1) * factor;
            }
            factor *= 10;
        }
        return (int)cnt;
    }
}
