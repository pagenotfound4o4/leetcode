import java.util.*;

public class Solution {
    public int majorityElement(int[] num) {
        Arrays.sort(num);
        return num[num.length/2];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.test();
    }

    public void test() {
        System.out.println(majorityElement(new int[]{1,1,1,2,2,3,3,3,3,3}));
    }
}
