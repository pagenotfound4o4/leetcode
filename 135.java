import java.util.*;

public class Solution {
    public int candy(int[] ratings) {
        int[] num = new int[ratings.length];
        num[0] = 1;
        for (int i=1; i<num.length; i++) {
            num[i] = ratings[i] > ratings[i-1] ? num[i-1]+1 : 1;
        }
        int sum = 0;
        // num[i-1] depends on num[i]
        for (int i=num.length-1; i>0; i--) {
            if (ratings[i-1] > ratings[i])
                num[i-1] = Math.max(num[i] + 1, num[i-1]);
            sum += num[i];
        }
        sum += num[0];
        return sum;
    }
}
