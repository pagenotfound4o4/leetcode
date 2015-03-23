import java.util.*;

public class Solution {
    public int singleNumber(int[] A) {
        int sum = 0;
        for (int item : A) {
            sum ^= item;
        }
        return sum;
    }
}
