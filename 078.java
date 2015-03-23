import java.util.*;

public class Solution {
    public List<List<Integer>> subsets(int[] S) {
        Arrays.sort(S);
        List<List<Integer>> ret = new LinkedList<List<Integer>>();
        int len = S.length;
        int n = 1 << len;
        for (int t=0; t<n; t++) {
            List<Integer> list = new LinkedList<Integer>();
            for (int i=0; i<len; i++) {
                if ((t & (1<<i)) != 0) {
                    list.add(S[i]);
                }
            }
            ret.add(list);
        }
        return ret;
    }
}
