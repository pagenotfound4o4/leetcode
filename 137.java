import java.util.*;

public class Solution {
    /**
     * 二进制模拟三进制
     * xthrees表示为3需要清零的那些位
     * */
    public int singleNumber(int[] A) {
        int ones = 0, twos = 0, xthrees = 0;
        for (int i=0; i<A.length; i++) {
            twos |= (ones & A[i]);
            ones ^= A[i];
            xthrees = ~(ones & twos); // mask
            ones &= xthrees; // reset
            twos &= xthrees; // reset
        }
        return ones;
    }
}
