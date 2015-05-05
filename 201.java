import java.util.*;

public class Solution {
    public int rangeBitwiseAnd(int m, int n) {
        int ret = 0;
        for (int i=0; i<32; i++) {
            if ((m & (1<<i)) > 0 && (n & (1<<i)) > 0) {
                if ((m / (1 << i)) == (n / (1 << i))) {
                    ret |= 1 << i;
                }
            }
        }
        return ret;
    }
}
