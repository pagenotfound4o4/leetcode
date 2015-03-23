import java.util.*;

public class Solution {
    public int[] plusOne(int[] digits) {
        int t = 0;
        digits[digits.length-1]++;
        for (int i=digits.length-1; i>=0; i--) {
            digits[i] += t;
            t = digits[i] / 10;
            digits[i] %= 10;
        }
        int[] ret = new int[digits.length+t];
        for (int i=0,j=t; i<digits.length; i++,j++) {
            ret[j] = digits[i];
        }
        if (t > 0) ret[0] = 1;
        return ret;
    }
}
