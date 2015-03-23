import java.util.*;

public class Solution {
    public List<List<Integer>> threeSum(int[] num) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        Arrays.sort(num);
        for (int i=0; i<num.length-2; i++) {
            if (i>0 && num[i] == num[i-1]) continue;
            int p = i+1, q = num.length-1;
            while (q > p) {
                if (p > i+1 && num[p] == num[p-1]) {
                    p++;
                    continue;
                }
                if (q < num.length-1 && num[q] == num[q+1]) {
                    q--;
                    continue;
                }
                int t = -num[p] - num[q];
                if (t == num[i]) {
                    List<Integer> list = new ArrayList<Integer>();
                    list.add(num[i]);
                    list.add(num[p]);
                    list.add(num[q]);
                    ret.add(list);
                    q--;
                } else if (t < num[i]) {
                    q--;
                } else {
                    p++;
                }
            }
        }
        return ret;
    }
}
