import java.util.*;

public class Solution {
    public List<String[]> solveNQueens(int n) {
        int[] rows = new int[n];
        List<String[]> ret = new ArrayList<String[]>();
        dfs(ret, rows, 0);
        return ret;
    }

    public void dfs(List<String[]> solution, int[] rows, int pos) {
        // find the solution
        if (pos == rows.length) {
            String[] str = new String[rows.length];
            for (int i=0; i<str.length; i++) {
                str[i] = "";
                for (int j=0; j<rows.length; j++) {
                    if (j != rows[i]) str[i] = str[i] + '.';
                    else str[i] = str[i] + "Q";
                }
            }
            solution.add(str);
            return;
        }
        for (int i=0; i<rows.length; i++) {
            if (judge(rows, pos, i)) {
                rows[pos] = i;
                dfs(solution, rows, pos + 1);
                rows[pos] = 0;
            }
        }
    }

    public boolean judge(int[] rows, int pos, int x) {
        for (int i=0; i<pos; i++) {
            if (rows[i] == x) return false;
            if (Math.abs(pos - i) == Math.abs(x - rows[i])) return false;
        }
        return true;
    }
}
