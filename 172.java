import java.util.*;

public class Solution {
    public int trailingZeroes(int n) {
        int sum = 0;
        for (int i=n/5; i>0; i/=5) {
            sum += i;
        }
        return sum;
    }
}
