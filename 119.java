import java.util.*;

public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i=0; i<=rowIndex; i++) {
            list.add(C(rowIndex, i));
        }
        return list;
    }

    public int C(int n, int m) {
        if (2 * m > n) m = n - m;
        long ans = 1;
        for (int i=1; i<=m; i++) {
            ans = ans * (n - i + 1) / i;
        }
        return (int)ans;
    }
}
