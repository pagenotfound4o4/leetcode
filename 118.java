import java.util.*;

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ret = new LinkedList<List<Integer>>();
        if (numRows < 1) return ret;
        List<Integer> prev = new LinkedList<Integer>();
        prev.add(1);
        ret.add(prev);
        for (int i=1; i<numRows; i++) {
            List<Integer> next = new LinkedList<Integer>();
            next.add(1);
            for (int j=1; j<prev.size(); j++) {
                next.add(prev.get(j-1) + prev.get(j));
            }
            next.add(1);
            ret.add(next);
            prev = next;
        }
        return ret;
    }
}
